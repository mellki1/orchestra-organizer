package br.com.melqui.infrasctrure.pssql.repository;

import br.com.melqui.infrasctrure.pssql.domain.Music;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MusicRepository implements PanacheRepository<Music> {
}
