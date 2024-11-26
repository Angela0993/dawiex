package pe.edu.i202116063.cl1_jpa_data_quispe_angela.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@Entity
public class Countrylanguage {

   @Id
    private String Language;
    @ManyToOne
    @JoinColumn(name = "countryCode", referencedColumnName = "code") private Country country;
    private String CountryCode;
    private String IsOfficial;
    private Double Percentage;
}
