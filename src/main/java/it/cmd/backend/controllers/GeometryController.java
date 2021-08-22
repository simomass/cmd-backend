package it.cmd.backend.controllers;

import it.cmd.backend.services.GeometryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Controller
@RequestMapping("geometry")
public class GeometryController {

    @Autowired
    GeometryService service;

    private final NativeWebRequest request;

    @Autowired
    public GeometryController(NativeWebRequest request) {
        this.request = request;
    }

    public Optional<NativeWebRequest> getRequest(){

        return Optional.ofNullable(request);

    }

    @GetMapping(produces = "application/json")
    public @ResponseBody String getGeom(){

        return service.getGeom();

    }


}
