package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class PuppetClassWrapperTest {

	private PuppetClassWrapper entity;

	@Test
	public void testGetters() {
		entity = new PuppetClassWrapper();

		PuppetClass obj = new PuppetClass();
		assertNull(entity.getPuppetClass());
		entity.setPuppetClass(obj);
		assertEquals(entity.getPuppetClass(), obj);
		}
	
}
