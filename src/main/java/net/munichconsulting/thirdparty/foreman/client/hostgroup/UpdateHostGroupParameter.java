package net.munichconsulting.thirdparty.foreman.client.hostgroup;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.ParameterWrapper;

/**
 * Update an hostgroup's parameter. (url: PUT
 * /api/hostgroups/:id/parameters/:paramId).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class UpdateHostGroupParameter implements
		ForemanCommand<ParameterWrapper> {

	private ParameterWrapper wrapper;

	private String hostgroupId;

	public UpdateHostGroupParameter(String hostgroupId, ParameterWrapper wrapper) {
		this.hostgroupId = hostgroupId;
		this.wrapper = wrapper;
	}

	@Override
	public ParameterWrapper execute(WebTarget target) {
		return target.path("hostgroups").path(hostgroupId).path("parameters")
				.path(wrapper.getParameter().getId().toString())
				.request(MediaType.APPLICATION_JSON)
				.put(Entity.json(wrapper), ParameterWrapper.class);
	}

}
