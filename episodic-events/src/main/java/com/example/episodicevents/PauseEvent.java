package com.example.episodicevents;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@JsonTypeName("pause")
@Getter
@Setter
@NoArgsConstructor
public class PauseEvent extends Event {

    private Data data;

    public PauseEvent(Long userId, Long showId, Long episodeId, Date createdAt, Data data) {

        super(userId, showId, episodeId, createdAt);
        this.data=data;
    }
}
