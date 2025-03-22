package dclvs.moviehubui.repositories;

import dclvs.moviehubui.entities.Movie;
import dclvs.moviehubui.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
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

    @Query("select m from Movie m where m.user = :user")
    Optional<List<Movie>> findAllUserMovies(@Param("user") User user);

    void addMovie(Movie movie);

    void addUserMovie(Movie movie, User user);

    void deleteUserMovie(Long id, User user);

}
