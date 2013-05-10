package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AuthSourceLdapWrapperTest {

	private AuthSourceLdapWrapper entity;

	@Test
	public void testGetters() {
		entity = new AuthSourceLdapWrapper();

		AuthSourceLdap obj = new AuthSourceLdap();
		assertNull(entity.getAuthSourceLdap());
		entity.setAuthSourceLdap(obj);
		assertEquals(entity.getAuthSourceLdap(), obj);
		}
	
}
