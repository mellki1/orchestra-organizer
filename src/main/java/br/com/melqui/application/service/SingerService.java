package br.com.melqui.application.service;


import br.com.melqui.application.dto.SingerDto;
import br.com.melqui.application.gateway.SingerGateway;
import br.com.melqui.application.mapper.SingerMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class SingerService {

    @Inject
    SingerMapper singerMapper;

    @Inject
    SingerGateway singerGateway;


    public List<SingerDto> listAll() {
        var musics = singerGateway.listALl();
        return singerMapper.toSingerDtoList(musics);
    }
}
