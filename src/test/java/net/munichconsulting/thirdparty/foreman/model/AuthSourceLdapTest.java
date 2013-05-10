package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AuthSourceLdapTest {

	private AuthSourceLdap entity;

	@Test
	public void testGetters() {
		entity = new AuthSourceLdap();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));

		assertNull(entity.getPort());
		entity.setPort(1L);
		assertEquals(entity.getPort(), Long.valueOf(1L));

		assertNull(entity.getName());
		entity.setName("name");
		assertEquals(entity.getName(), "name");

		assertNull(entity.getAccount());
		entity.setAccount("account");
		assertEquals(entity.getAccount(), "account");

		assertNull(entity.getAttrFirstname());
		entity.setAttrFirstname("firstname");
		assertEquals(entity.getAttrFirstname(), "firstname");

		assertNull(entity.getAttrLastname());
		entity.setAttrLastname("lastname");
		assertEquals(entity.getAttrLastname(), "lastname");

		assertNull(entity.getAttrLogin());
		entity.setAttrLogin("login");
		assertEquals(entity.getAttrLogin(), "login");

		assertNull(entity.getAttrMail());
		entity.setAttrMail("mail");
		assertEquals(entity.getAttrMail(), "mail");

		assertNull(entity.getBaseDn());
		entity.setBaseDn("bdn");
		assertEquals(entity.getBaseDn(), "bdn");

		assertNull(entity.getHost());
		entity.setHost("host");
		assertEquals(entity.getHost(), "host");

		assertNull(entity.getType());
		entity.setType("type");
		assertEquals(entity.getType(), "type");

		assertNull(entity.isOntheflyRegister());
		entity.setOntheflyRegister(true);
		assertTrue(entity.isOntheflyRegister());

		assertNull(entity.isTls());
		entity.setTls(true);
		assertTrue(entity.isTls());

		assertNull(entity.getUpdatedAt());
		entity.setUpdatedAt("updated_at");
		assertEquals(entity.getUpdatedAt(), "updated_at");

		assertNull(entity.getCreatedAt());
		entity.setCreatedAt("created_at");
		assertEquals(entity.getCreatedAt(), "created_at");

	}

}
