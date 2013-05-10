package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class HostWrapperTest {

	private HostWrapper entity;

	@Test
	public void testGetters() {
		entity = new HostWrapper();

		Host obj = new Host();
		assertNull(entity.getHost());
		entity.setHost(obj);
		assertEquals(entity.getHost(), obj);
		}
	
}
