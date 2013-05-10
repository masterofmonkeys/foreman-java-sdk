package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AuditWrapperTest {

	private AuditWrapper entity;

	@Test
	public void testGetters() {
		entity = new AuditWrapper();

		Audit obj = new Audit();
		assertNull(entity.getAudit());
		entity.setAudit(obj);
		assertEquals(entity.getAudit(), obj);
		}
	
}
