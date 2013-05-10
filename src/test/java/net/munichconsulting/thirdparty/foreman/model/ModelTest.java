package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ModelTest {

	private Model entity;

	@Test
	public void testGetters() {
		entity = new Model();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));
	
		assertNull(entity.getHardwareModel());
		entity.setHardwareModel("hardware");
		assertEquals(entity.getHardwareModel(), "hardware");
		
		assertNull(entity.getVendorClass());
		entity.setVendorClass("vendorClass");
		assertEquals(entity.getVendorClass(), "vendorClass");	
		
		assertNull(entity.getName());
		entity.setName("name");
		assertEquals(entity.getName(), "name");
		
		assertNull(entity.getInfo());
		entity.setInfo("info");
		assertEquals(entity.getInfo(), "info");
		
		assertNull(entity.getUpdatedAt());
		entity.setUpdatedAt("updated_at");
		assertEquals(entity.getUpdatedAt(), "updated_at");

		assertNull(entity.getCreatedAt());
		entity.setCreatedAt("created_at");
		assertEquals(entity.getCreatedAt(), "created_at");
		

	}
	
}
