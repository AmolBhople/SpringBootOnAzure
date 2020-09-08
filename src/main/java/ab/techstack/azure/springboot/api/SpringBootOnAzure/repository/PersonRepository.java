package ab.techstack.azure.springboot.api.SpringBootOnAzure.repository;

import ab.techstack.azure.springboot.api.SpringBootOnAzure.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
