package br.com.melqui.ui.controller;

import br.com.melqui.application.dto.SingerDto;
import br.com.melqui.application.service.SingerService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/singer")
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class SingerController {

    @Inject
    SingerService singerService;

    @GET
    public List<SingerDto> listAll() {
        return singerService.listAll();
    }
}
