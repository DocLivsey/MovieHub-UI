package dclvs.moviehubui.repositories;

import dclvs.moviehubui.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserById(Long id);

    List<User> findAllUsers();

}
