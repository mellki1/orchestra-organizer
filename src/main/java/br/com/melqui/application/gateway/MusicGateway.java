package br.com.melqui.application.gateway;

import br.com.melqui.infrasctrure.pssql.domain.Music;

import java.util.List;

public interface MusicGateway {

    List<Music> listALl();
}
