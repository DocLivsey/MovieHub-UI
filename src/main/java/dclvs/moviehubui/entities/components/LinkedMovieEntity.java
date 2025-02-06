package dclvs.moviehubui.entities.components;

import lombok.Data;

@Data
public class LinkedMovieEntity {

    private Integer id;

    private String name;

    private String enName;

    private String alternativeName;

    private String type;

    private ShortImageEntity poster;

    private RatingEntity rating;

    private Integer year;

}
