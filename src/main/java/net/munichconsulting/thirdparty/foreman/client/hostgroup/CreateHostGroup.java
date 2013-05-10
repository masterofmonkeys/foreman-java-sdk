package net.munichconsulting.thirdparty.foreman.client.hostgroup;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.HostGroupWrapper;

/**
 * Creates an hostgroup. (url: POST /api/hostgroups).
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class CreateHostGroup implements ForemanCommand<HostGroupWrapper> {
	
	private HostGroupWrapper wrapper;

	public CreateHostGroup(HostGroupWrapper wrapper) {
		this.wrapper = wrapper;
	}	
	
	@Override
	public HostGroupWrapper execute(WebTarget target) {
		return target.path("hostgroups").request(MediaType.APPLICATION_JSON)
				.post(Entity.json(wrapper), HostGroupWrapper.class);
	}

}
