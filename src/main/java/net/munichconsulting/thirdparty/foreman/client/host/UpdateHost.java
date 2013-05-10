package net.munichconsulting.thirdparty.foreman.client.host;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.HostWrapper;


/**
 * Update an host. (url: PUT /api/hosts/:id).
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class UpdateHost implements ForemanCommand<HostWrapper> {
	
	private HostWrapper wrapper;

	public UpdateHost(HostWrapper wrapper) {
		this.wrapper = wrapper;
	}	
	
	@Override
	public HostWrapper execute(WebTarget target) {
		return target.path("hosts").path(wrapper.getHost().getId().toString()).request(MediaType.APPLICATION_JSON)
				.put(Entity.json(wrapper), HostWrapper.class);
	}

}
