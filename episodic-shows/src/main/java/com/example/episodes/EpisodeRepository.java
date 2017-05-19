package com.example.episodes;

import org.springframework.data.repository.CrudRepository;

public interface EpisodeRepository extends CrudRepository<Episode, Long> {
    Episode findByShowId(Long showId);
}
