package dclvs.moviehubui;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "${application.api.name}", url = "${application.api.host}")
public interface MovieHubAPIClient {
}
