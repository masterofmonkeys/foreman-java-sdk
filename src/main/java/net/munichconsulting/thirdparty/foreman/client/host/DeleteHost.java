package net.munichconsulting.thirdparty.foreman.client.host;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.HostWrapper;


/**
 * Delete an host. (url: DELETE /api/hosts/:id).
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class DeleteHost implements ForemanCommand<HostWrapper> {
	
	private String id;
	
	public DeleteHost(String id) {
		this.id = id;
	}
	
	@Override
	public HostWrapper execute(WebTarget target) {
		return target.path("hosts").path(id).request(MediaType.APPLICATION_JSON)
				.delete(HostWrapper.class);
	}

}
