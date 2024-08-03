package dclvs.moviehubui.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.Calendar;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue()
    private Long id;

    private String firstname;

    private String lastname;

    private String phone;

    private String email;

    @Temporal(TemporalType.DATE)
    private Calendar birthdate;

    @Column(name = "favorite_director")
    private String favoriteDirector;

    @Column(name = "favorite_scenarist")
    private String favoriteScenarist;

    @Column(name = "favorite_actors")
    private String favoriteActors;

    @Column(name = "last_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar lastLogin;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "is_blocked")
    private boolean isBlocked;

    @Column(name = "is_admin")
    private boolean isAdmin;

}
