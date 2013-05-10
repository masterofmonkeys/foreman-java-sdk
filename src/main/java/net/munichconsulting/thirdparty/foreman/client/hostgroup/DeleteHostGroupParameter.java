package net.munichconsulting.thirdparty.foreman.client.hostgroup;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.ParameterWrapper;


/**
 * Delete an hostgroup's parameter. (url: DELETE /api/hostgroups/:id/parameters/:paramId).
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class DeleteHostGroupParameter implements ForemanCommand<ParameterWrapper> {
	
	private String id;
	private String hostgroupId;
	
	public DeleteHostGroupParameter(String hostgroupId, String id) {
		this.id = id;
		this.hostgroupId = hostgroupId;
	}
	
	@Override
	public ParameterWrapper execute(WebTarget target) {
		return target.path("hostgroups").path(hostgroupId).path("parameters").path(id).request(MediaType.APPLICATION_JSON)
				.delete(ParameterWrapper.class);
	}

}
