package it.cmd.backend.test;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import it.cmd.backend.model.Geometry;
import it.cmd.backend.services.implementations.GeometryServiceImpl;

@Transactional
class BackendApplicationTests extends AbstractTest{

	@Autowired
	GeometryServiceImpl geometryService;
	
	@Test
	void contextLoads() {
	}

	
	@Test
	void testDb() {
		var geom = new Geometry(10000l, "TestSave", "TestSave");
		geom.setUpdatedAt(LocalDateTime.now());
		geom.setCreatedAt(LocalDateTime.now());
		geometryService.addGeometry(geom);
		
	}
	
}
