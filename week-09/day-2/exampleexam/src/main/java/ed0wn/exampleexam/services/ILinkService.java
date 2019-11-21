package ed0wn.exampleexam.services;

import ed0wn.exampleexam.models.Link;
import org.springframework.stereotype.Service;

public interface ILinkService {
  void save(Link link);
  Link findByAlias(String alias);
  void incrementHitCount (Link link);
}
