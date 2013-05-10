package net.munichconsulting.thirdparty.foreman.client.hostgroup;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.ParameterWrapper;

/**
 * Creates an hostgroup. (url: POST /api/hostgroups/:id/parameters/).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class CreateHostGroupParameter implements ForemanCommand<ParameterWrapper> {
	
	private ParameterWrapper wrapper;
	private String hostgroupId;

	public CreateHostGroupParameter(String hostgroupId, ParameterWrapper wrapper) {
		this.wrapper = wrapper;
		this.hostgroupId = hostgroupId;
	}	
	
	@Override
	public ParameterWrapper execute(WebTarget target) {
		return target.path("hostgroups").path(hostgroupId).path("parameters").request(MediaType.APPLICATION_JSON)
				.post(Entity.json(wrapper), ParameterWrapper.class);
	}

}
