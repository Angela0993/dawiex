package pe.edu.i202116063.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String   Name;
    private String CountryCode;
    private  String  District;
    private Integer Population;

    @ManyToOne @JoinColumn(name = "countryCode", referencedColumnName = "code", insertable = false, updatable = false)
    private Country country;

    public City() {
    }

    public City(Integer ID, String name, String countryCode, String district, Integer population) {
        this.ID = ID;
        Name = name;
        CountryCode = countryCode;
        District = district;
        Population = population;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public Integer getPopulation() {
        return Population;
    }

    public void setPopulation(Integer population) {
        Population = population;
    }
}
