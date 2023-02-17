package br.com.melqui.application.mapper;

import br.com.melqui.application.dto.SingerDto;
import br.com.melqui.infrasctrure.pssql.domain.Singer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface SingerMapper {
    List<SingerDto> toSingerDtoList(List<Singer> singerList);

    SingerDto toSingerDto(Singer singer);
}
