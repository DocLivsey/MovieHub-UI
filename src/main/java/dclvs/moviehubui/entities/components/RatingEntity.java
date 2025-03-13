package dclvs.moviehubui.entities.components;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "ratings")
public class RatingEntity {

    private Double kp;

    private Double imdb;

    private Double tmdb;

    private Double filmCritics;

    private Double russianFilmCritics;

    private Double await;

}
