package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class CommonParameterTest {

	private CommonParameter entity;

	@Test
	public void testGetters() {
		entity = new CommonParameter();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));
	
	
		assertNull(entity.getName());
		entity.setName("name");
		assertEquals(entity.getName(), "name");
		
		assertNull(entity.getValue());
		entity.setValue("value");
		assertEquals(entity.getValue(), "value");		
		
	}
	
}
