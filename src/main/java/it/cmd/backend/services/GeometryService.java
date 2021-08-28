package it.cmd.backend.services;

import it.cmd.backend.model.Geometry;

public interface GeometryService {

    public String getGeom(Long id);

	String getHelloMessage();

	void addGeometry(Geometry geom);

}
