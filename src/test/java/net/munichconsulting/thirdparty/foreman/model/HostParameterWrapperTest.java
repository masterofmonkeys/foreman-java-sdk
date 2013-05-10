package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class HostParameterWrapperTest {

	private HostParameterWrapper entity;

	@Test
	public void testGetters() {
		entity = new HostParameterWrapper();

		HostParameter obj = new HostParameter();
		assertNull(entity.getHostParameter());
		entity.setHostParameter(obj);
		assertEquals(entity.getHostParameter(), obj);
		}
	
}
