package dclvs.moviehubui.entities.components;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "similar_movies")
public class LinkedMovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String enName;

    private String alternativeName;

    private String type;

    private ShortImageEntity poster;

    private RatingEntity rating;

    private Integer year;

}
