package dclvs.moviehubui.entities;

import dclvs.moviehubui.dto.components.*;
import dclvs.moviehubui.entities.components.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

// TODO: in future need to use jakarta's Entity

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue()
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(unique = true)
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "external_id")
    private ExternalIdEntity externalId;

    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Integer year;

    private String description;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "rating")
    private RatingEntity rating;

    @Column(name = "movie_length")
    private Integer movieLength;

    @Column(name = "rating_mpaa")
    private String ratingMpaa;

    @Column(name = "age_rating")
    private Integer ageRating;

    @Embedded
    @Column(nullable = false)
    private Logo logo;

    @Column(nullable = false)
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "poster")
    private ShortImageEntity poster;

    @Column(nullable = false)
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "backdrop")
    private ShortImageEntity backdrop;

    @ElementCollection
    @Column(nullable = false)
    @CollectionTable(
            name = "movie_genres",
            joinColumns = @JoinColumn(name = "movie_id"))
    private List<ItemName> genres;

    @ElementCollection
    @Column(nullable = false)
    @CollectionTable(
            name = "movie_countries",
            joinColumns = @JoinColumn(name = "movie_id"))
    private List<ItemName> countries;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "seasons_info", nullable = false)
    private List<SeasonInfoEntity> seasonsInfo;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "budget", nullable = false)
    private CurrencyValueEntity budget;

    @Column(nullable = false)
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fees")
    private FeesEntity fees;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "similar_movies")
    private List<LinkedMovieEntity> similarMovies;

}
