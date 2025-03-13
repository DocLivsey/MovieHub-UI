package dclvs.moviehubui.entities.components;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "short_images")
public class ShortImageEntity {

    private String url;

    private String previewUrl;

}
