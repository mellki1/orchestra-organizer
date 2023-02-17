package br.com.melqui.infrasctrure.pssql.impl;

import br.com.melqui.application.gateway.MusicGateway;
import br.com.melqui.infrasctrure.pssql.domain.Music;
import br.com.melqui.infrasctrure.pssql.repository.MusicRepository;
import io.quarkus.panache.common.Sort;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import java.util.List;

@ApplicationScoped
public class MusicGatewayImplementation implements MusicGateway {

    @Inject
    MusicRepository repository;

    @Override
    public List<Music> listALl() {
        return repository.listAll(Sort.descending("lastDayPlayed"));
    }

    @Override
    @Transactional
    public Music update(Long id, Music music) {
        findById(id);
        repository.getEntityManager().merge(music);
        return music;
    }

    @Override
    public Music findById(Long id) {
        return repository.findByIdOptional(id)
                .orElseThrow(() -> new NotFoundException("Musica não encontrada na base de dados."));
    }
}
