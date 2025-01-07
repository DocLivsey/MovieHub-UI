package dclvs.moviehubui.dto.components;

import lombok.Data;

@Data
public class LinkedMovie {

    private Integer id;

    private String name;

    private String enName;

    private String alternativeName;

    private String type;

    private ShortImage poster;

    private Rating rating;

    private Integer year;

}
