package ed0wn.exampleexam.repositories;

import ed0wn.exampleexam.models.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILinkRepository extends CrudRepository<Link, Long> {

  Link findByAlias (String alias);
}
