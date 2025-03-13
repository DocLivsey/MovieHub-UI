package dclvs.moviehubui.entities.components;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class ItemNameEntity {

    private String name;

}
