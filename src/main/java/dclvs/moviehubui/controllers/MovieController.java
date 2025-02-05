package dclvs.moviehubui.controllers;

import dclvs.moviehubui.clients.MovieHubAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieHubAPIClient movieHubAPIClient;

}
