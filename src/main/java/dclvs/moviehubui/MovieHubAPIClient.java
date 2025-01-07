package dclvs.moviehubui;

import dclvs.moviehubui.dto.MovieResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "${application.api.name}", url = "${application.api.host}")
public interface MovieHubAPIClient {

    @GetMapping("${application.api.path.base}${application.api.version}${application.api.path.movies}/{id}")
    Optional<MovieResponse> findMovieById(@PathVariable("id") String id);

    @GetMapping("${}")
    Optional<List<MovieResponse>> searchMovieByTitle(@RequestParam("title") String title,
                                                     @RequestParam(value = "page", required = false) Integer page,
                                                     @RequestParam(value = "limit", required = false) Integer limit);

}
