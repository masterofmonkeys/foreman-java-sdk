package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ParameterWrapperTest {

	private ParameterWrapper entity;

	@Test
	public void testGetters() {
		entity = new ParameterWrapper();

		Parameter obj = new Parameter();
		assertNull(entity.getParameter());
		entity.setParameter(obj);
		assertEquals(entity.getParameter(), obj);
		}
	
}
