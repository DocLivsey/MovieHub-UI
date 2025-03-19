package dclvs.moviehubui.entities.components;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "seasons")
public class SeasonInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer number;

    @Column(name = "episodes_count")
    private Integer episodesCount;

}
