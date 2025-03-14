package dclvs.moviehubui.entities.components;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "short_images")
public class ShortImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @Column(name = "preview_url")
    private String previewUrl;

}
