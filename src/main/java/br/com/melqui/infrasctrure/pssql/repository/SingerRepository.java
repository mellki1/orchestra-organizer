package br.com.melqui.infrasctrure.pssql.repository;

import br.com.melqui.infrasctrure.pssql.domain.Singer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SingerRepository implements PanacheRepository<Singer> {
}
