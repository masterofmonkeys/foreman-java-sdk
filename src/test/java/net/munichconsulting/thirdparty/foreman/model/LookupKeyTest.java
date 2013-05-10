package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LookupKeyTest {

	private LookupKey entity;

	@Test
	public void testGetters() {
		entity = new LookupKey();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));
		
		assertNull(entity.getDescription());
		entity.setDescription("description");
		assertEquals(entity.getDescription(), "description");

		assertNull(entity.getKey());
		entity.setKey("key");
		assertEquals(entity.getKey(), "key");
		
		assertNull(entity.getDefaultValue());
		entity.setDefaultValue("value");
		assertEquals(entity.getDefaultValue(), "value");
		
		assertNull(entity.getOverride());
		entity.setOverride(true);
		assertTrue(entity.getOverride());
		
		assertNull(entity.getParam());
		entity.setParam(true);
		assertTrue(entity.getParam());
		
		assertNull(entity.getRequired());
		entity.setRequired(true);
		assertTrue(entity.getRequired());
	}
	
}
