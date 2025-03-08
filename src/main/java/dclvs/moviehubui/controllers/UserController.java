package dclvs.moviehubui.controllers;

import dclvs.moviehubui.repositories.UserRepository;
import dclvs.moviehubui.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

}
