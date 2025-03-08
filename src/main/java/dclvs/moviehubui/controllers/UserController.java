package dclvs.moviehubui.controllers;

import dclvs.moviehubui.repositories.UserRepository;
import dclvs.moviehubui.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/all/")
    public ResponseEntity<?> listAllUsers() {
        return userService.listAllUsers();
    }

}
