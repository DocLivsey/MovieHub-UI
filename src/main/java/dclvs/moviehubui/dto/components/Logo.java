package dclvs.moviehubui.dto.components;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Logo {

    private String url;

}
