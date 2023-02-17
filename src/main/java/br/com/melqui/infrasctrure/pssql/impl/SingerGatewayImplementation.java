package br.com.melqui.infrasctrure.pssql.impl;

import br.com.melqui.application.gateway.SingerGateway;
import br.com.melqui.infrasctrure.pssql.domain.Singer;
import br.com.melqui.infrasctrure.pssql.repository.SingerRepository;
import io.quarkus.panache.common.Sort;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class SingerGatewayImplementation implements SingerGateway {

    @Inject
    SingerRepository repository;

    @Override
    public List<Singer> listALl() {
        return repository.listAll(Sort.descending("name"));
    }
}
