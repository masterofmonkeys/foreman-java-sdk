package net.munichconsulting.thirdparty.foreman;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.ext.ContextResolver;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonRootName;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.SslConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.net.ssl.SSLSession;

/**
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class Foreman {

	public static Client CLIENT;

	private static ObjectMapper DEFAULT_MAPPER;

	private static ObjectMapper WRAPPED_MAPPER;

	static {
		initialize();
	}

	private static void initialize() {

		try {
			CLIENT = ClientBuilder.newClient();

			SSLContext context = null;
			context = SSLContext.getInstance("SSL");
			/* to remove self certificate exception. */
			X509TrustManager tm = new X509TrustManager() {
				public void checkClientTrusted(X509Certificate[] xcs,
						String string) throws CertificateException {
				}

				public void checkServerTrusted(X509Certificate[] xcs,
						String string) throws CertificateException {
				}

				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}
			};

			/* to remove self certificate exception. */
			HostnameVerifier hv = new HostnameVerifier() {
				public boolean verify(String urlHostName, SSLSession session) {
					return true;
				}
			};

			context.init(null, new TrustManager[] { tm }, null);
			CLIENT.property(ClientProperties.SSL_CONFIG, new SslConfig(hv,
					context));

			DEFAULT_MAPPER = new ObjectMapper();

			DEFAULT_MAPPER.setSerializationInclusion(Inclusion.NON_NULL);
			DEFAULT_MAPPER.enable(SerializationConfig.Feature.INDENT_OUTPUT);
			DEFAULT_MAPPER
					.enable(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

			WRAPPED_MAPPER = new ObjectMapper();

			WRAPPED_MAPPER.setSerializationInclusion(Inclusion.NON_NULL);
			WRAPPED_MAPPER.enable(SerializationConfig.Feature.INDENT_OUTPUT);
			WRAPPED_MAPPER.enable(SerializationConfig.Feature.WRAP_ROOT_VALUE);
			WRAPPED_MAPPER
					.enable(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE);
			WRAPPED_MAPPER
					.enable(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

			CLIENT.register(new JacksonFeature()).register(
					new ContextResolver<ObjectMapper>() {

						public ObjectMapper getContext(Class<?> type) {
							return type.getAnnotation(JsonRootName.class) == null ? DEFAULT_MAPPER
									: WRAPPED_MAPPER;
						}

					});

			CLIENT.register(new ClientRequestFilter() {

				public void filter(ClientRequestContext requestContext)
						throws IOException {
					requestContext.getHeaders().remove("Content-Language");
					requestContext.getHeaders().remove("Content-Encoding");
				}
			});

		} catch (KeyManagementException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (NoSuchAlgorithmException ee) {
			throw new RuntimeException(ee.getMessage(), ee);
		}

	}

}
