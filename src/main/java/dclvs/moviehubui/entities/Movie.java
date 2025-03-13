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

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue()
    private Long id;

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

    private String shortDescription;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private RatingEntity rating;

    private Integer movieLength;

    private String ratingMpaa;

    private Integer ageRating;

    @Embedded
    @Column(nullable = false)
    private Logo logo;

    @Column(nullable = false)
    private ShortImageEntity poster;

    @Column(nullable = false)
    private ShortImageEntity backdrop;

    @Embedded
    @Column(nullable = false)
    private List<ItemName> genres;

    @Embedded
    @Column(nullable = false)
    private List<ItemName> countries;

    @Column(nullable = false)
    private List<SeasonInfoEntity> seasonsInfo;

    @Column(nullable = false)
    private CurrencyValueEntity budget;

    @Column(nullable = false)
    private FeesEntity fees;

    private List<LinkedMovieEntity> similarMovies;

}
