package dclvs.moviehubui.entities.components;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "externalId")
public class ExternalIdEntity {

    @Id
    @GeneratedValue()
    private Long id;

    private String kpHD;

    private String imdb;

    private Long tmdb;

}
