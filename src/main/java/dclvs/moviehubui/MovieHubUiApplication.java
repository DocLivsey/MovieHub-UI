package dclvs.moviehubui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "dclvs.moviehubui.clients")
public class MovieHubUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieHubUiApplication.class, args);
    }

}
