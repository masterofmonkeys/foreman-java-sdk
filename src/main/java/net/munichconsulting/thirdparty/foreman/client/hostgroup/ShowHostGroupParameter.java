package net.munichconsulting.thirdparty.foreman.client.hostgroup;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.ParameterWrapper;

/**
 * Show an hostgroup's parameter. (url: GET /api/hostgroups/:id/parameters/:paramId).
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class ShowHostGroupParameter implements ForemanCommand<ParameterWrapper> {
	
	private String id;
	
	private String paramId;
	
	public ShowHostGroupParameter(String id, String paramId) {
		this.id = id;
		this.paramId = paramId;
	}
	
	@Override
	public ParameterWrapper execute(WebTarget target) {
		return target.path("hostgroups").path(id).path("parameters").path(paramId).request(MediaType.APPLICATION_JSON)
				.get(ParameterWrapper.class);
	}


}
