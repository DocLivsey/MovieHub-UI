package dclvs.moviehubui.entities.components;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "fees")
public class FeesEntity {

    @Id
    @GeneratedValue()
    private Long id;

    @OneToOne
    @JoinColumn(name = "id")
    private CurrencyValueEntity world;

    @OneToOne
    @JoinColumn(name = "id")
    private CurrencyValueEntity russia;

    @OneToOne
    @JoinColumn(name = "id")
    private CurrencyValueEntity usa;

}
