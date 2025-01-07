package dclvs.moviehubui.dto;

import dclvs.moviehubui.dto.components.*;

import java.util.List;

public class MovieResponse {

    private Long id;

    private ExternalId externalId;

    private String name;

    private String alternativeName;

    private String enName;

    private String type;

    private Integer year;

    private String description;

    private String shortDescription;

    private String status;

    private Rating rating;

    private Integer movieLength;

    private String ratingMpaa;

    private Integer ageRating;

    private Logo logo;

    private ShortImage poster;

    private ShortImage backdrop;

    private List<ItemName> genres;

    private List<ItemName> countries;

    private List<SeasonInfo> seasonsInfo;

    private CurrencyValue budget;

    private Fees fees;

    private List<LinkedMovie> similarMovies;

}
