package net.munichconsulting.thirdparty.foreman.client.hostgroup;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.ParameterWrapper;

/**
 * List all parameters for a given hostgroup. (url: GET
 * /api/hostgroups/:id/parameters).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class ListHostGroupParameters implements
		ForemanCommand<ParameterWrapper[]> {

	private String id;

	public ListHostGroupParameters(String id) {
		this.id = id;
	}

	@Override
	public ParameterWrapper[] execute(WebTarget target) {
		return target.path("hostgroups").path(id).path("parameters")
				.request(MediaType.APPLICATION_JSON)
				.get(ParameterWrapper[].class);
	}

}
