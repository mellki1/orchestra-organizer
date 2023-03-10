package br.com.melqui.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MusicDto {
    private Long id;
    private String name;
    private String composer;
    private Boolean isHarp;
    private String lastDayPlayed;
    private List<SingerDto> singers;
}
