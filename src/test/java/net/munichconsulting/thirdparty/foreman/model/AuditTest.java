package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AuditTest {

	private Audit entity;

	@Test
	public void testGetters() {
		entity = new Audit();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));
	
		assertNull(entity.getAssociatedId());
		entity.setAssociatedId(1L);
		assertEquals(entity.getAssociatedId(), Long.valueOf(1L));
		
		assertNull(entity.getAssociatedName());
		entity.setAssociatedName("associatedName");
		assertEquals(entity.getAssociatedName(), "associatedName");

		assertNull(entity.getAssociatedType());
		entity.setAssociatedType("associatedType");
		assertEquals(entity.getAssociatedType(), "associatedType");	
		
		assertNull(entity.getVersion());
		entity.setVersion(1L);
		assertEquals(entity.getVersion(), Long.valueOf(1L));
		
		assertNull(entity.getAuditableId());
		entity.setAuditableId(1L);
		assertEquals(entity.getAuditableId(), Long.valueOf(1L));
		
		
		assertNull(entity.getAuditableName());
		entity.setAuditableName("auditableName");
		assertEquals(entity.getAuditableName(), "auditableName");

		assertNull(entity.getAuditableType());
		entity.setAuditableType("auditableType");
		assertEquals(entity.getAuditableType(), "auditableType");	
		
		assertNull(entity.getAction());
		entity.setAction("action");
		assertEquals(entity.getAction(), "action");
		
		assertNull(entity.getComment());
		entity.setComment("comment");
		assertEquals(entity.getComment(), "comment");
		
		assertNull(entity.getRemoteAddress());
		entity.setRemoteAddress("remoteAddress");
		assertEquals(entity.getRemoteAddress(), "remoteAddress");		
		
		assertNull(entity.getUserId());
		entity.setUserId("userId");
		assertEquals(entity.getUserId(), "userId");	
	
		assertNull(entity.getUserType());
		entity.setUserType("userType");
		assertEquals(entity.getUserType(), "userType");	
		
		assertNull(entity.getCreatedAt());
		entity.setCreatedAt("created_at");
		assertEquals(entity.getCreatedAt(), "created_at");
		
		Audit.AuditedChanges changes = new Audit.AuditedChanges();
		assertNull(entity.getAuditedChanges());
		entity.setAuditedChanges(changes);
		assertEquals(entity.getAuditedChanges(), changes);

		
		assertNull(entity.getAuditedChanges().getArchitectureId());
		List<Long> ids = new ArrayList<Long>();
		entity.getAuditedChanges().setArchitectureId(ids);
		assertEquals(entity.getAuditedChanges().getArchitectureId(), ids);
	}
	
}
