package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class OperatingSystemWrapperTest {

	private OperatingSystemWrapper entity;

	@Test
	public void testGetters() {
		entity = new OperatingSystemWrapper();

		OperatingSystem obj = new OperatingSystem();
		assertNull(entity.getOperatingSystem());
		entity.setOperatingSystem(obj);
		assertEquals(entity.getOperatingSystem(), obj);
		}
	
}
