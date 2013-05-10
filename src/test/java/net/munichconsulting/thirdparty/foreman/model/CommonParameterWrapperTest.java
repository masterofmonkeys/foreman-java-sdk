package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class CommonParameterWrapperTest {

	private CommonParameterWrapper entity;

	@Test
	public void testGetters() {
		entity = new CommonParameterWrapper();

		CommonParameter obj = new CommonParameter();
		assertNull(entity.getCommonParameter());
		entity.setCommonParameter(obj);
		assertEquals(entity.getCommonParameter(), obj);
		}
	
}
