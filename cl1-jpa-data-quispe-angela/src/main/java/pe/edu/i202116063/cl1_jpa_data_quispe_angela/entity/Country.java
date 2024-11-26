package pe.edu.i202116063.cl1_jpa_data_quispe_angela.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@Entity
public class Country {
    @Id
   private String Code;
   private String Name;
    private String Continent;
    private String  Region;
    private Double SurfaceArea;
    private Integer IndepYear;
    private Integer Population;
    private Double LifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private Integer Capital;
    private String Code2;

 @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
 private List<City> cities;
}
