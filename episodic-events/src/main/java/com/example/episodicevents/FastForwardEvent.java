package com.example.episodicevents;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@JsonTypeName("fastForwardEvent")
public class FastForwardEvent extends Event {

    private Data data;

    public FastForwardEvent(Long userId, Long showId, Long episodeId, Date createdAt) {

        super(userId, showId, episodeId, createdAt);
        this.data=data;
    }
}