package dclvs.moviehubui.controllers;

import dclvs.moviehubui.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

}
