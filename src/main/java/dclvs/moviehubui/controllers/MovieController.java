package dclvs.moviehubui.controllers;

import dclvs.moviehubui.clients.MovieHubAPIClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MovieController {

    private MovieHubAPIClient movieHubAPIClientImpl;

}
