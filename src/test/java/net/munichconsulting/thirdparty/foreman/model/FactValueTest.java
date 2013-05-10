package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class FactValueTest {

	private FactValue entity;

	@Test
	public void testGetters() {
		entity = new FactValue();

		assertNull(entity.getKernelVersion());
		entity.setKernelVersion("kernelVersion");
		assertEquals(entity.getKernelVersion(), "kernelVersion");
	
		assertNull(entity.getIpAddress());
		entity.setIpAddress("ipAddress");
		assertEquals(entity.getIpAddress(), "ipAddress");

	}
	
}
