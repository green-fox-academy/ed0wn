package ed0wn.exampleexam.services;

import ed0wn.exampleexam.models.Link;
import ed0wn.exampleexam.repositories.ILinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class LinkServiceImp implements ILinkService {

  private ILinkRepository repository;

  @Autowired
  LinkServiceImp(ILinkRepository repository) {
    this.repository = repository;
  }

  @Override
  public void save(Link link) {
    link.generateSecretCode();
    repository.save(link);
  }

  @Override
  public Link findByAlias(String alias) {
    return repository.findByAlias(alias);
  }

  @Override
  public void incrementHitCount(Link link) {
    link.setHitCount(link.getHitCount()+1);
  }
}
