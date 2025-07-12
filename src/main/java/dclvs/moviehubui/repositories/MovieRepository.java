package dclvs.moviehubui.repositories;

import dclvs.moviehubui.entities.Movie;
import dclvs.moviehubui.entities.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query("select m from Movie m where m.id = :id and m.user = :user")
    Optional<Movie> findUserMovieById(@Param("id") Long id,
                                       @Param("user") User user);

    Optional<Movie> findMovieByKinopoiskId(Long id);

    @Query("select m from Movie m where m.user = :user")
    Optional<List<Movie>> findAllUserMovies(@Param("user") User user);

}
