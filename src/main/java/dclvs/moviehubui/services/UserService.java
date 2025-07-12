package dclvs.moviehubui.services;

import dclvs.moviehubui.entities.Movie;
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

    public ResponseEntity<?> listAllUsers() {
        return ResponseEntity.ok(userRepository.allUsers());
    }

    // TODO: in future, create an overloaded method for searching by Id, Email, Phone and etc and make it private
    public ResponseEntity<?> findUserBy(Long Id) {
        if (Id == null)
            return ResponseEntity
                    .unprocessableEntity()
                    .build();

        User user = userRepository
                .findById(Id)
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));

        return ResponseEntity.ok(user);
    }

    public ResponseEntity<?> addToLikedMovies(User user, Movie movie) {
        try {
            user.getFavoriteMovies().add(movie);
            userRepository.save(user);
        } catch (RuntimeException exception) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(exception.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<?> removeFromLikedMovies(User user, Movie movie) {
        try {
            user.getFavoriteMovies().remove(movie);
            userRepository.save(user);
        } catch (RuntimeException exception) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(exception.getMessage());
        }
        return ResponseEntity.ok().build();
    }

}
