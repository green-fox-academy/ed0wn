package ed0wn.redditproject.models;

import sun.util.calendar.BaseCalendar;
import sun.util.calendar.LocalGregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int votes = 0;
  private String title;
  private String url;
  private String date = formatDate();

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  private String formatDate() {
    String strDateFormat = "yyyy.MM.dd HH:mm";
    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
    String formattedDate = dateFormat.format(new Date());
    return formattedDate;
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getVotes() {
    return votes;
  }

  public void setVotes(int votes) {
    this.votes = votes;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Post() {
  }

  public Post(long id, int votes, String title, String url) {
    this.id = id;
    this.votes = votes;
    this.title = title;
    this.url = url;
  }
}
