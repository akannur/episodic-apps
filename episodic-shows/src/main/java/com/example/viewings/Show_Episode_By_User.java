package com.example.viewings;

import com.example.episodes.Episode;
import com.example.shows.Show;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Show_Episode_By_User {

    Show show;
    Episode episode;
    Date updatedAt;
    int timecode;

}
