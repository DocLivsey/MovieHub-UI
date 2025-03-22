package dclvs.moviehubui.entities.components;

import dclvs.moviehubui.entities.Movie;
import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import jakarta.persistence.Entity;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "seasons")
public class SeasonInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    private Integer number;

    @Column(name = "episodes_count")
    private Integer episodesCount;

}
