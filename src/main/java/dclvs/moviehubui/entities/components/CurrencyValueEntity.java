package dclvs.moviehubui.entities.components;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "currency")
public class CurrencyValueEntity {

    @Id
    @GeneratedValue()
    private Long id;

    private Long value;

    private String currency;

}
