package pe.edu.i202116063.cl1_jpa_data_quispe_angela.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@Entity
public class City {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer ID;
    private  String Name;
    //private  String CountryCode;
    private  String District;
    private  Integer Population;



    @ManyToOne
    @JoinColumn(name = "countryCode", referencedColumnName = "code")
    private Country country;
}
