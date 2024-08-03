package dclvs.moviehubui.repositories;

import dclvs.moviehubui.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {

    Optional<User> findUserById(int id);

    List<User> findAllUsers();

}
