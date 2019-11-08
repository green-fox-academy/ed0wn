package ed0wn.redditproject.repositories;

import ed0wn.redditproject.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPostRepository extends CrudRepository<Post, Long> {

}
