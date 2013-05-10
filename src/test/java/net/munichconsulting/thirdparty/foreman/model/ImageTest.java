package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ImageTest {

	private Image entity;

	@Test
	public void testGetters() {
		entity = new Image();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));

		assertNull(entity.getArchitectureId());
		entity.setArchitectureId(1L);
		assertEquals(entity.getArchitectureId(), Long.valueOf(1L));	

		assertNull(entity.getComputeResourceId());
		entity.setComputeResourceId(1L);
		assertEquals(entity.getComputeResourceId(), Long.valueOf(1L));	
		

		assertNull(entity.getOperatingSystemId());
		entity.setOperatingSystemId(1L);
		assertEquals(entity.getOperatingSystemId(), Long.valueOf(1L));	
		
		assertNull(entity.getName());
		entity.setName("name");
		assertEquals(entity.getName(), "name");
		
		
		assertNull(entity.getUsername());
		entity.setUsername("username");
		assertEquals(entity.getUsername(), "username");
		
		assertNull(entity.getUuid());
		entity.setUuid("uuid");
		assertEquals(entity.getUuid(), "uuid");
		
		assertNull(entity.getUpdatedAt());
		entity.setUpdatedAt("updated_at");
		assertEquals(entity.getUpdatedAt(), "updated_at");

		assertNull(entity.getCreatedAt());
		entity.setCreatedAt("created_at");
		assertEquals(entity.getCreatedAt(), "created_at");
		

	}
	
}
