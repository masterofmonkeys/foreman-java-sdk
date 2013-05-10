package net.munichconsulting.thirdparty.foreman.model;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ArchitectureTest {

	private Architecture entity;

	@Test
	public void testGetters() {
		entity = new Architecture();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));
	
	
		assertNull(entity.getName());
		entity.setName("name");
		assertEquals(entity.getName(), "name");
		
		assertNull(entity.getUpdatedAt());
		entity.setUpdatedAt("updated_at");
		assertEquals(entity.getUpdatedAt(), "updated_at");

		assertNull(entity.getCreatedAt());
		entity.setCreatedAt("created_at");
		assertEquals(entity.getCreatedAt(), "created_at");
		
		List<Long> ids = new ArrayList<Long>();

		assertNull(entity.getOperatingsystemIds());
		entity.setOperatingsystemIds(ids);
		assertEquals(entity.getOperatingsystemIds(), ids);

	}
	
}
