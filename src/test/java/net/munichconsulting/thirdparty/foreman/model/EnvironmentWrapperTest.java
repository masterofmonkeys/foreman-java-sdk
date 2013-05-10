package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class EnvironmentWrapperTest {

	private EnvironmentWrapper entity;

	@Test
	public void testGetters() {
		entity = new EnvironmentWrapper();

		Environment obj = new Environment();
		assertNull(entity.getEnvironment());
		entity.setEnvironment(obj);
		assertEquals(entity.getEnvironment(), obj);
		}
	
}
