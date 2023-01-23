package br.com.melqui.infrasctrure.pssql.impl;

import br.com.melqui.application.gateway.MusicGateway;
import br.com.melqui.infrasctrure.pssql.domain.Music;
import br.com.melqui.infrasctrure.pssql.repository.MusicRepository;
import io.quarkus.panache.common.Sort;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class MusicGatewayImplementation implements MusicGateway  {

    @Inject
    MusicRepository repository;

    @Override
    public List<Music> listALl() {
        return repository.listAll(Sort.descending("lastDayPlayed"));
    }
}
