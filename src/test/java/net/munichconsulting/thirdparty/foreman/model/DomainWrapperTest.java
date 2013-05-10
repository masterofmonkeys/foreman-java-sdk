package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DomainWrapperTest {

	private DomainWrapper entity;

	@Test
	public void testGetters() {
		entity = new DomainWrapper();

		Domain obj = new Domain();
		assertNull(entity.getDomain());
		entity.setDomain(obj);
		assertEquals(entity.getDomain(), obj);
		}
	
}
