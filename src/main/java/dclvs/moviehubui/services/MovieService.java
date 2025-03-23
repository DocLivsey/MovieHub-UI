package dclvs.moviehubui.services;

import dclvs.moviehubui.clients.MovieHubAPIClient;
import dclvs.moviehubui.entities.Movie;
import dclvs.moviehubui.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
