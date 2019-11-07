package ed0wn.connectionwithmysql.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;
  @ManyToOne( cascade = CascadeType.ALL)
  private Assignee assignee;

  public ToDo(String title){
    this.title=title;
  }

  @Override
  public String toString() {
    return this.title;
  }
}
