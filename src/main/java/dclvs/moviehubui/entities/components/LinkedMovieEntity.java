package dclvs.moviehubui.entities.components;

import dclvs.moviehubui.entities.Movie;
import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import jakarta.persistence.Entity;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "similar_movies")
public class LinkedMovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    private String name;

    @Column(name = "en_name")
    private String enName;

    @Column(name = "alternative_name")
    private String alternativeName;

    private String type;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "poster")
    private ShortImageEntity poster;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "rating")
    private RatingEntity rating;

    private Integer year;

}
