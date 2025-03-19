package dclvs.moviehubui.entities.components;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "currencies")
public class CurrencyValueEntity {

    @Id
    @GeneratedValue()
    private Long id;

    private Long value;

    private String currency;

}
