package dclvs.moviehubui.entities.components;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "ratings")
public class RatingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double kp;

    private Double imdb;

    private Double tmdb;

    @Column(name = "film_critics")
    private Double filmCritics;

    @Column(name = "russian_film_critics")
    private Double russianFilmCritics;

    private Double await;

}
