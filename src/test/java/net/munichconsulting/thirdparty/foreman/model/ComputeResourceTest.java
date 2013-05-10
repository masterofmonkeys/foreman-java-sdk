package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ComputeResourceTest {

	private ComputeResource entity;

	@Test
	public void testGetters() {
		entity = new ComputeResource();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));
	
		assertNull(entity.getUrl());
		entity.setUrl("url");
		assertEquals(entity.getUrl(), "url");

		assertNull(entity.getUser());
		entity.setUser("user");
		assertEquals(entity.getUser(), "user");	
		
		assertNull(entity.getProvider());
		entity.setProvider("provider");
		assertEquals(entity.getProvider(), "provider");	
		
		assertNull(entity.getName());
		entity.setName("name");
		assertEquals(entity.getName(), "name");
		
		assertNull(entity.getUpdatedAt());
		entity.setUpdatedAt("updated_at");
		assertEquals(entity.getUpdatedAt(), "updated_at");

		assertNull(entity.getCreatedAt());
		entity.setCreatedAt("created_at");
		assertEquals(entity.getCreatedAt(), "created_at");
		
		assertNull(entity.getDescription());
		entity.setDescription("description");
		assertEquals(entity.getDescription(), "description");	
	}
	
}
