package it.cmd.backend.services.implementations;

import it.cmd.backend.services.GeometryService;
import org.springframework.stereotype.Service;

@Service
public class GeometryServiceImpl implements GeometryService {

    @Override
    public String getGeom() {
        return "{\"message\" : \"Signori teste di cazzo, ecco vostro backend\"}";
    }
}
