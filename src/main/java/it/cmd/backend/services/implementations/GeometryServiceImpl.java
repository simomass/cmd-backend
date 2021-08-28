package it.cmd.backend.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.cmd.backend.model.Geometry;
import it.cmd.backend.repository.GeometryRepository;
import it.cmd.backend.services.GeometryService;

@Service
public class GeometryServiceImpl implements GeometryService {

	@Autowired
	GeometryRepository repo;
	
    @Override
    public String getHelloMessage() {
        return "{\"message\" : \"Signori teste di cazzo, ecco vostro backend\"}";
    }

	@Override
	public String getGeom(Long id) {
		return repo.getById(id).getCoordinates();
	}
	
	@Override
	public void addGeometry(Geometry geom) {
		repo.save(geom);
	}
}
