package br.com.melqui.application.mapper;

import br.com.melqui.application.dto.MusicDto;
import br.com.melqui.infrasctrure.pssql.domain.Music;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface MusicMapper {
    List<MusicDto> toMusicDtoList(List<Music> musicList);

    @Mapping(source = "singers", target = "singers")
    @Mapping(target = "lastDayPlayed", dateFormat = "yyyy-MM-dd")
    MusicDto toMusicDto(Music music);


    @Mapping(target = "lastDayPlayed", dateFormat = "yyyy-MM-dd")
    Music toMusic(MusicDto musicDto);
}
