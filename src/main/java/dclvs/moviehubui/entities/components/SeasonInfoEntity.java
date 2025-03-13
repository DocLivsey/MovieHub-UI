package dclvs.moviehubui.entities.components;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "seasons")
public class SeasonInfoEntity {

    private Integer number;

    private Integer episodesCount;

}
