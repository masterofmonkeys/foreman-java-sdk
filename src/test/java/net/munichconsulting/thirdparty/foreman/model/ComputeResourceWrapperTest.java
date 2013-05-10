package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ComputeResourceWrapperTest {

	private ComputeResourceWrapper entity;

	@Test
	public void testGetters() {
		entity = new ComputeResourceWrapper();

		ComputeResource obj = new ComputeResource();
		assertNull(entity.getComputeResource());
		entity.setComputeResource(obj);
		assertEquals(entity.getComputeResource(), obj);
		}
	
}
