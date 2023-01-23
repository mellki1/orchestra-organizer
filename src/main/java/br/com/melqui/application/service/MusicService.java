package br.com.melqui.application.service;

import br.com.melqui.application.dto.MusicDto;
import br.com.melqui.application.gateway.MusicGateway;
import br.com.melqui.application.mapper.MusicMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class MusicService {

    @Inject
    MusicMapper musicMapper;

    @Inject
    MusicGateway musicGateway;

    public List<MusicDto> listAll() {
        var musics = musicGateway.listALl();
        return musicMapper.toMusicDtoList(musics);
    }
}
