package br.com.melqui.infrasctrure.pssql.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String composer;
    private Boolean isHarp;
    private Date lastDayPlayed;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "singer_music",
            joinColumns = @JoinColumn(name = "singers_id"),
            inverseJoinColumns = @JoinColumn(name = "musics_id")
    )
    private List<Singer> singers;
}
