package ed0wn.examtemp.repositories;

import ed0wn.examtemp.models.BBCharacter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BBRepository extends CrudRepository<BBCharacter, Long> {
}
