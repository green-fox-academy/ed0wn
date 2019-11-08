package ed0wn.redditproject.services;

import ed0wn.redditproject.models.Post;

import java.util.List;

public interface IPostService {
  List<Post> findAll();
  Post findById(long id);
  void save(Post post);
  void upVote(long id);
  void downVote(long id);
  List<Post> showMostVoted();
}
