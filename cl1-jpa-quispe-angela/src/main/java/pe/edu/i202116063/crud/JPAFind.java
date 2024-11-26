package pe.edu.i202116063.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202116063.entity.Country;
import pe.edu.i202116063.entity.City;

import java.util.List;

public class JPAFind {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();


        Country peru = em.find(Country.class, "PER");

        if (peru != null) {
            // Filtrar y imprimir ciudades peruanas con población > 700,000
            List<City> cities = peru.getCities();
            cities.stream()
                    .filter(city -> city.getPopulation() > 700000)
                    .forEach(city -> System.out.println(city.getName()));
        }

        em.close();
        emf.close();
    }
}

