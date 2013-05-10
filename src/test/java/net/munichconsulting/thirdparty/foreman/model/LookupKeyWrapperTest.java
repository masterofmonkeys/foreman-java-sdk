package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class LookupKeyWrapperTest {

	private LookupKeyWrapper entity;

	@Test
	public void testGetters() {
		entity = new LookupKeyWrapper();

		LookupKey obj = new LookupKey();
		assertNull(entity.getLookupKey());
		entity.setLookupKey(obj);
		assertEquals(entity.getLookupKey(), obj);
		}
	
}
