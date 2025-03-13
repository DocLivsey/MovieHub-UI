package dclvs.moviehubui.dto.components;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class ItemName {

    private String name;

}
