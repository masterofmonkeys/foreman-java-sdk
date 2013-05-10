package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ArchitectureWrapperTest {

	private ArchitectureWrapper entity;

	@Test
	public void testGetters() {
		entity = new ArchitectureWrapper();

		Architecture arc = new Architecture();
		assertNull(entity.getArchitecture());
		entity.setArchitecture(arc);
		assertEquals(entity.getArchitecture(), arc);
		}
	
}
