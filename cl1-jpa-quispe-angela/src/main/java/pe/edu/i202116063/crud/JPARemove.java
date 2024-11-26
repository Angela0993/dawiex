package pe.edu.i202116063.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202116063.entity.Country;

public class JPARemove {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();


        Country country = em.find(Country.class, "IMG");

        if (country != null) {

            em.remove(country);
        }


        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}

