package pe.edu.i202116063.cl1_jpa_data_quispe_angela.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202116063.cl1_jpa_data_quispe_angela.entity.Country;

public interface CountryRepository extends CrudRepository<Country, String> {
}
