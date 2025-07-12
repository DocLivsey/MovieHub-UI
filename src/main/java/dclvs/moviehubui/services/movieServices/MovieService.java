package dclvs.moviehubui.services.movieServices;

import dclvs.moviehubui.clients.MovieHubAPIClient;
import dclvs.moviehubui.entities.Movie;
import dclvs.moviehubui.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Slf4j
@Service
@AllArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    private MovieHubAPIClient movieHubAPIClientImpl;

    public ResponseEntity<?> allMovies() {
        List<Movie> movies = movieRepository.findAll();
        return movies.isEmpty()
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(movies);
    }

    public ResponseEntity<?> movieByKinopoiskId(Long id) {
        AtomicReference<ResponseEntity<?>> responseEntity = new AtomicReference<>();
        movieRepository
                .findMovieByKinopoiskId(id)
                .ifPresentOrElse(
                    movie ->
                            responseEntity
                            .set(
                                ResponseEntity
                                    .ok(movie)
                            ),
                    () ->
                            responseEntity
                            .set(
                                ResponseEntity
                                    .notFound()
                                    .build()
                            )
                );
        return responseEntity.get();
    }

}
