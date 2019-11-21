package ed0wn.exampleexam.models;


import javax.persistence.*;
import java.util.Random;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"secretCode"})})
public class Link {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String url;
  private String alias;
  private String secretCode;
  private int hitCount;

  public Link(String url, String alias) {
    Random random = new Random();
    this.url = url;
    this.alias = alias;
    this.secretCode = String.format("%04d%n",random.nextInt(10000));
    this.hitCount = 0;
  }

  public Link() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public String getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(String secretCode) {
    this.secretCode = secretCode;
  }

  public int getHitCount() {
    return hitCount;
  }

  public void setHitCount(int hitCount) {
    this.hitCount = hitCount;
  }

  public void generateSecretCode() {
    Random random= new Random();
    this.secretCode = String.format("%04d%n",random.nextInt(10000));
  }
}
