package br.com.melqui.application.mapper;

import br.com.melqui.application.dto.MusicDto;
import br.com.melqui.infrasctrure.pssql.domain.Music;
import br.com.melqui.infrasctrure.pssql.domain.Singer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "cdi")
public interface MusicMapper {
    List<MusicDto> toMusicDtoList(List<Music> musicList);

    @Mapping(source = "singers", target = "singers")
    @Mapping(target = "lastDayPlayed", dateFormat = "yyyy-MM-dd")
    MusicDto toMusicDto(Music musicList);

    default String singerMap(List<Singer> singers) {
        return singers.stream().map(Singer::getName).collect(Collectors.joining(","));
    }
}
