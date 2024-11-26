package pe.edu.i202116063.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {
    @Id
    private String language;

    private Boolean isOfficial;
    private Float percentage;

    @ManyToOne
    @JoinColumn(name = "countryCode", referencedColumnName = "code")
    private Country country;

    public CountryLanguage() {
    }

    public CountryLanguage(String language, Boolean isOfficial, Float percentage, Country country) {
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(Boolean isOfficial) {
        this.isOfficial = isOfficial;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}

