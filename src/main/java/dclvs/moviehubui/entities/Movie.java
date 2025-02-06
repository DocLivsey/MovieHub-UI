package dclvs.moviehubui.entities;

import dclvs.moviehubui.dto.components.ExternalId;
import dclvs.moviehubui.dto.components.Logo;
import dclvs.moviehubui.dto.components.Rating;
import dclvs.moviehubui.dto.components.ShortImage;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue()
    private Long id;

    @Column(unique = true)
    private ExternalId externalId;

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

}
