package com.example.episodicevents;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@JsonTypeName("scrub")
@Getter
@Setter
@NoArgsConstructor
public class ScrubEvent extends Event {

    private Data data;

    public ScrubEvent(Long userId, Long showId, Long episodeId, LocalDateTime createdAt, Data data) {

        super(userId, showId, episodeId, createdAt);
        this.data = data;
    }
}
