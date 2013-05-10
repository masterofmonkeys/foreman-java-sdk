package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class HostGroupWrapperTest {

	private HostGroupWrapper entity;

	@Test
	public void testGetters() {
		entity = new HostGroupWrapper();

		HostGroup obj = new HostGroup();
		assertNull(entity.getHostGroup());
		entity.setHostGroup(obj);
		assertEquals(entity.getHostGroup(), obj);
		}
	
}
