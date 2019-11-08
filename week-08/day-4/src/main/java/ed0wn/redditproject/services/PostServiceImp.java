package ed0wn.redditproject.services;

import ed0wn.redditproject.models.Post;
import ed0wn.redditproject.repositories.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImp implements IPostService {
   private IPostRepository repository;

   @Autowired
   public PostServiceImp (IPostRepository repository){
     this.repository=repository;
   }

  @Override
  public List<Post> findAll() {
     List<Post> posts = new ArrayList<>();
     repository.findAll().forEach(posts::add);
    return posts;
  }

  @Override
  public Post findById(long id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public void save(Post post) {
  repository.save(post);
  }


  @Override
  public void upVote(long id) {
    Post upvoted =repository.findById(id).orElse(null);
    upvoted.setVotes(upvoted.getVotes()+1);
    repository.save(upvoted);
  }

  @Override
  public void downVote(long id) {
    Post downvoted =repository.findById(id).orElse(null);
    downvoted.setVotes(downvoted.getVotes()-1);
    repository.save(downvoted);;
  }

  @Override
  public List<Post> showMostVoted() {
    List<Post> posts = new ArrayList<>();
    repository.findAll().forEach(posts::add);
    return posts.stream().limit(10).sorted(Comparator.comparingInt(Post::getVotes).reversed()).collect(Collectors.toList());
  }
}
