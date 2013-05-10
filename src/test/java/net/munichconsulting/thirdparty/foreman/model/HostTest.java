package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HostTest {

	private Host entity;

	@Test
	public void testGetters() {
		entity = new Host();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));

		assertNull(entity.getName());
		entity.setName("name");
		assertEquals(entity.getName(), "name");


		assertNull(entity.getOperatingSystemId());
		entity.setOperatingSystemId(1L);
		assertEquals(entity.getOperatingSystemId(), Long.valueOf(1L));

		assertNull(entity.getHostGroupId());
		entity.setHostGroupId(1L);
		assertEquals(entity.getHostGroupId(), Long.valueOf(1L));



		List<HostParameterWrapper> hostParameters = new ArrayList<HostParameterWrapper>();
		assertNull(entity.getHostParameters());
		entity.setHostParameters(hostParameters);
		assertEquals(entity.getHostParameters(), hostParameters);
		

		assertNull(entity.getInstalledAt());
		entity.setInstalledAt("installedAt");
		assertEquals(entity.getInstalledAt(), "installedAt");
		
		assertNull(entity.getUpdatedAt());
		entity.setUpdatedAt("updatedAt");
		assertEquals(entity.getUpdatedAt(), "updatedAt");
	
		assertNull(entity.getCreatedAt());
		entity.setCreatedAt("createdAt");
		assertEquals(entity.getCreatedAt(), "createdAt");

		assertNull(entity.getImageFile());
		entity.setImageFile("imageFile");
		assertEquals(entity.getImageFile(), "imageFile");
	
		assertNull(entity.getSpIp());
		entity.setSpIp("spIp");
		assertEquals(entity.getSpIp(), "spIp");
	
		assertNull(entity.getSpName());
		entity.setSpName("SpName");
		assertEquals(entity.getSpName(), "SpName");
	
		assertNull(entity.getLastReport());
		entity.setLastReport("getLastReport");
		assertEquals(entity.getLastReport(), "getLastReport");
			
		assertNull(entity.getSpMac());
		entity.setSpMac("SpMac");
		assertEquals(entity.getSpMac(), "SpMac");
		
		assertNull(entity.getIp());
		entity.setIp("ip");
		assertEquals(entity.getIp(), "ip");
	
		assertNull(entity.getComment());
		entity.setComment("comment");
		assertEquals(entity.getComment(), "comment");
		
		assertNull(entity.getMac());
		entity.setMac("Mac");
		assertEquals(entity.getMac(), "Mac");
		
		
		assertNull(entity.getUuid());
		entity.setUuid("uuid");
		assertEquals(entity.getUuid(), "uuid");
		
		
		assertNull(entity.getDisk());
		entity.setDisk("disk");
		assertEquals(entity.getDisk(), "disk");
		
		assertNull(entity.getOwnerType());
		entity.setOwnerType("ownerType");
		assertEquals(entity.getOwnerType(), "ownerType");
		
		assertNull(entity.getCertName());
		entity.setCertName("certName");
		assertEquals(entity.getCertName(), "certName");
		
	
		assertNull(entity.getBuild());
		entity.setBuild(true);
		assertTrue(entity.getBuild());

		assertNull(entity.getManaged());
		entity.setManaged(true);
		assertTrue(entity.getManaged());

		assertNull(entity.getEnabled());
		entity.setEnabled(true);
		assertTrue(entity.getEnabled());


		assertNull(entity.getPuppetcaProxyId());
		entity.setPuppetcaProxyId(1L);
		assertEquals(entity.getPuppetcaProxyId(), Long.valueOf(1L));

		assertNull(entity.getMediumId());
		entity.setMediumId(1L);
		assertEquals(entity.getMediumId(), Long.valueOf(1L));

		assertNull(entity.getModelId());
		entity.setModelId(1L);
		assertEquals(entity.getModelId(), Long.valueOf(1L));
		
		assertNull(entity.getEnvironmentId());
		entity.setEnvironmentId(1L);
		assertEquals(entity.getEnvironmentId(), Long.valueOf(1L));

		assertNull(entity.getUseImage());
		entity.setUseImage(1L);
		assertEquals(entity.getUseImage(), Long.valueOf(1L));
		
		assertNull(entity.getOwnerId());
		entity.setOwnerId(1L);
		assertEquals(entity.getOwnerId(), Long.valueOf(1L));
		
		assertNull(entity.getSubnetId());
		entity.setSubnetId(1L);
		assertEquals(entity.getSubnetId(), Long.valueOf(1L));
		
		assertNull(entity.getDomainId());
		entity.setDomainId(1L);
		assertEquals(entity.getDomainId(), Long.valueOf(1L));
		

		assertNull(entity.getSpSubnetId());
		entity.setSpSubnetId(1L);
		assertEquals(entity.getSpSubnetId(), Long.valueOf(1L));
		
		assertNull(entity.getPuppetProxyId());
		entity.setPuppetProxyId(1L);
		assertEquals(entity.getPuppetProxyId(), Long.valueOf(1L));
		
		assertNull(entity.getPtableId());
		entity.setPtableId(1L);
		assertEquals(entity.getPtableId(), Long.valueOf(1L));
		
		assertNull(entity.getArchitectureId());
		entity.setArchitectureId(1L);
		assertEquals(entity.getArchitectureId(), Long.valueOf(1L));
		
		assertNull(entity.getImageId());
		entity.setImageId(1L);
		assertEquals(entity.getImageId(), Long.valueOf(1L));
		
		assertNull(entity.getComputeResourceId());
		entity.setComputeResourceId(1L);
		assertEquals(entity.getComputeResourceId(), Long.valueOf(1L));


		EnvironmentWrapper enviromnent = new EnvironmentWrapper();
		
		assertNull(entity.getEnvironment());
		entity.setEnvironment(enviromnent);
		assertEquals(entity.getEnvironment(), enviromnent);
		

		

		
		
	}

}
