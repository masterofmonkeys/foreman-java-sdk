package net.munichconsulting.thirdparty.foreman.client;

import java.io.IOException;
import java.util.logging.Logger;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.internal.util.Base64;

import net.munichconsulting.thirdparty.foreman.Foreman;

/**
 * Default client communicating with Foreman API.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class ForemanClient {

	private String endpointURL; 
	
	private String authorizationToken;

	protected ClientRequestFilter tokenFilter = new ClientRequestFilter() {

		public void filter(ClientRequestContext requestContext) throws IOException {
			requestContext.getHeaders().putSingle("Authorization", "Basic " + authorizationToken);
			requestContext.getHeaders().putSingle("accept", "application/json,version=2");
		}
	};
	
	protected LoggingFilter loggingFilter;

	/**
	 * Internal class used to transform request.
	 */
	public static class ForemanRequest {

		private Builder builder;

		private ForemanRequest(Builder builder) {
			this.builder = builder;
		}

		public <ResponseType> ResponseType execute(String method,
				Class<ResponseType> type) {
			return builder.method(method, type);
		}

		public <RequestType, ResponseType> ResponseType execute(String method,
				Entity<RequestType> data, Class<ResponseType> type) {
			return builder.method(method, data, type);
		}

		public void execute(String method) {
			builder.method(method);
		}

		public <RequestType> void execute(String method,
				Entity<RequestType> data) {
			builder.method(method, data, Void.class);
		}

		public <ResponseType> ResponseType get(Class<ResponseType> type) {
			return execute("GET", type);
		}

		public <ResponseType> ResponseType postJson(Object data,
				Class<ResponseType> type) {
			return execute("POST", Entity.json(data), type);
		}

		public <ResponseType> ResponseType putJson(Object data,
				Class<ResponseType> type) {
			return execute("PUT", Entity.json(data), type);
		}

		public <ResponseType> ResponseType patchJson(Object data,
				Class<ResponseType> type) {
			return execute("PATCH", Entity.json(data), type);
		}

		public void delete() {
			execute("DELETE", Void.class);
		}
	}

	public ForemanClient(String endpointURL, String authorizationToken) {
		this.endpointURL = endpointURL;
		this.authorizationToken = authorizationToken;
	}
	
	public ForemanClient(String endpointURL, String userName, String password) {
		this.endpointURL = endpointURL;
		String authstring = userName + ":" + password;
		this.authorizationToken = Base64.encodeAsString(authstring.getBytes());
	}

	public <R> R execute(ForemanCommand<R> command) {
		return command.execute(create(endpointURL));
	}

	
	public ForemanRequest request(String uri, String... mediaTypes) {
		WebTarget endpoint = Foreman.CLIENT.target(endpointURL);
		endpoint.register(tokenFilter);
		
		return new ForemanRequest(endpoint.path(uri).request(mediaTypes));
	}

	public ForemanRequest request(String uri) {
		return request(uri, MediaType.APPLICATION_JSON);
	}

	protected WebTarget create(String endpoint) {
		WebTarget target = Foreman.CLIENT.target(endpoint);
		if (loggingFilter != null) {
			target.register(loggingFilter);
		}
		target.register(tokenFilter);
		return target;
	}

	public void enableLogging(Logger logger, int entitySize) {
		loggingFilter = new LoggingFilter(logger, entitySize);
	}

	public void disableLogging() {
		loggingFilter = null;
	}
}
