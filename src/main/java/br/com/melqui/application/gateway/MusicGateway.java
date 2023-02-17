package br.com.melqui.application.gateway;

import br.com.melqui.infrasctrure.pssql.domain.Music;

import java.util.List;

public interface MusicGateway {

    List<Music> listALl();
    Music update(Long id, Music music);

    Music findById(Long id);
}
