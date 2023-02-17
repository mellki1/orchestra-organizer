package br.com.melqui.ui.controller;


import br.com.melqui.application.dto.MusicDto;
import br.com.melqui.application.service.MusicService;
import io.quarkus.logging.Log;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/music")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class MusicController {

    @Inject
    MusicService musicService;

    @GET
    public List<MusicDto> listAll() {
        Log.info("Buscando todas musicas");
        return musicService.listAll();
    }

    @GET
    @Path("/{id}")
    public MusicDto findById(@PathParam(value = "id") Long id) {
        Log.info("Buscando musica pelo id");
        return musicService.findById(id);
    }

    @PUT
    @Path("/{id}")
    public MusicDto update(@PathParam(value = "id") Long id, MusicDto musicDto) {
        Log.info("Atualizando musica");
        return musicService.update(id, musicDto);
    }
}
