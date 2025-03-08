package dclvs.moviehubui.services;

import dclvs.moviehubui.entities.User;
import dclvs.moviehubui.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Slf4j
@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // TODO: in future, create an overloaded method for searching by Id, Email, Phone and etc and make it private
    public ResponseEntity<?> findUserBy(Long Id) {
        if (Id == null)
            return ResponseEntity
                    .unprocessableEntity()
                    .build();

        User user = userRepository
                .findById(Id)
                .orElseThrow(
                        () -> new HttpClientErrorException(HttpStatus.NOT_FOUND)
                );

        return ResponseEntity.ok(user);
    }

}
