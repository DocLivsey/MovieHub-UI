package dclvs.moviehubui.services;

import dclvs.moviehubui.clients.MovieHubAPIClient;
import dclvs.moviehubui.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    private MovieHubAPIClient movieHubAPIClientImpl;

}
