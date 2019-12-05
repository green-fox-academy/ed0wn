package ed0wn.examtemp.models;

import javax.persistence.*;

@Entity
public class BBCharacter {

  @Id
  private Long id;
  private String name;
  private String birthday;
//  @Column(columnDefinition = "TEXT")
//  private String img;
  private String status;
  private String nickname;
  private String portrayed;

  public BBCharacter() {
  }

  public BBCharacter(Long id, String name,
                     String birthDay,
//                     String img,
                     String status,
                     String nickname,
                     String portrayed) {
    this.id = id;
    this.name = name;
//    this.img = img;
    this.birthday = birthDay;
    this.status = status;
    this.nickname = nickname;
    this.portrayed = portrayed;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getPortrayed() {
    return portrayed;
  }

  public void setPortrayed(String portrayed) {
    this.portrayed = portrayed;
  }
}
