package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class PTableWrapperTest {

	private PTableWrapper entity;

	@Test
	public void testGetters() {
		entity = new PTableWrapper();

		PTable obj = new PTable();
		assertNull(entity.getPTable());
		entity.setPTable(obj);
		assertEquals(entity.getPTable(), obj);
		}
	
}
