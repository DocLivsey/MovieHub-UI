package dclvs.moviehubui.entities;

import dclvs.moviehubui.dto.components.*;
import dclvs.moviehubui.entities.components.ExternalIdEntity;
import dclvs.moviehubui.entities.components.SeasonInfoEntity;
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
    private Rating rating;

    private Integer movieLength;

    private String ratingMpaa;

    private  Integer ageRating;

    @Column(nullable = false)
    private Logo logo;

    @Column(nullable = false)
    private ShortImage poster;

    @Column(nullable = false)
    private ShortImage backdrop;

    @Embedded
    @Column(nullable = false)
    private List<ItemName> genres;

    @Embedded
    @Column(nullable = false)
    private List<ItemName> countries;

    @Column(nullable = false)
    private List<SeasonInfoEntity> seasonsInfo;

    @Column(nullable = false)
    private CurrencyValue budget;

    @Column(nullable = false)
    private Fees fees;

    private List<LinkedMovie> similarMovies;

}
