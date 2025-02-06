package dclvs.moviehubui.entities;

import dclvs.moviehubui.dto.components.ExternalId;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue()
    private Long id;

    @Column(unique = true)
    private ExternalId externalId;

    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Integer year;





}
