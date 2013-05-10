package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PuppetClassTest {

	private PuppetClass entity;

	@Test
	public void testGetters() {
		entity = new PuppetClass();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));
	
	
		assertNull(entity.getName());
		entity.setName("name");
		assertEquals(entity.getName(), "name");
		
		
		List<LookupKey> lookupKeys = new ArrayList<LookupKey>();
		
		assertNull(entity.getLookupKeys());
		entity.setLookupKeys(lookupKeys);
		assertEquals(entity.getLookupKeys(), lookupKeys);
	}
	
}
