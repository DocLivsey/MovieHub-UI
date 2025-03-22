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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "world")
    private CurrencyValueEntity world;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "russia")
    private CurrencyValueEntity russia;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usa")
    private CurrencyValueEntity usa;

}
