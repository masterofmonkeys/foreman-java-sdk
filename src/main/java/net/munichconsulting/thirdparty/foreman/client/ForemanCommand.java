package net.munichconsulting.thirdparty.foreman.client;

import javax.ws.rs.client.WebTarget;

/**
 * Generic Foreman Command definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public interface ForemanCommand<R> {
	R execute(WebTarget endpoint);
}
