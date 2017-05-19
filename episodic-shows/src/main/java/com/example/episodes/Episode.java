package com.example.episodes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name="episodes")
@Getter
@Setter
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @JsonIgnore
    @Column(name="show_id")
    Long showId;

    @JsonProperty("seasonNumber")
    @Column(name="season_number")
    int seasonNumber;

    @JsonProperty("episodeNumber")
    @Column(name="episode_number")
    int episodeNumber;

    @Transient
    String title;

}
