package it.cmd.backend.repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import it.cmd.backend.model.Geometry;

@Repository
public class GeometryRepository {

	private EntityManager entityManger;

	public Geometry getById(Long id) {
		return entityManger.createQuery("select * from geometry", Geometry.class).getResultList().get(0);
	}

	public void save(Geometry geom) {
		entityManger.persist(geom);
//		return entityManger.createQuery("select g from geometry g", Geometry.class).getResultList();
	}

}
