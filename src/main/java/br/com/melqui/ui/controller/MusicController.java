package br.com.melqui.ui.controller;


import br.com.melqui.application.dto.MusicDto;
import br.com.melqui.application.service.MusicService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/music")
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class MusicController {

    @Inject
    MusicService musicService;

    @GET
    public List<MusicDto> listAll() {
        return musicService.listAll();
    }
}
