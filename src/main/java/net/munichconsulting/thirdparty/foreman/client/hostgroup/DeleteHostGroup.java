package net.munichconsulting.thirdparty.foreman.client.hostgroup;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.HostGroupWrapper;


/**
 * Delete an hostgroup. (url: DELETE /api/hostgroups/:id).
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class DeleteHostGroup implements ForemanCommand<HostGroupWrapper> {
	
	private String id;
	
	public DeleteHostGroup(String id) {
		this.id = id;
	}
	
	@Override
	public HostGroupWrapper execute(WebTarget target) {
		return target.path("hostgroups").path(id).request(MediaType.APPLICATION_JSON)
				.delete(HostGroupWrapper.class);
	}

}
