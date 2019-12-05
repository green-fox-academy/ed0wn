package ed0wn.examtemp.dots;

public class BreakingBadCharactersDTO {

  private Long char_id;
  private String name;
  private String birthday;
//  private ArrayList<OccupationDTO> occupation;
  private String img;
  private String status;
  private String nickname;
//  private ArrayList<AppearancesDTO> appearance;
  private String portrayed;
//  private ArrayList<CategoryDTO> category;


  public BreakingBadCharactersDTO(Long id, String name, String birthday, String img, String status, String nickname, String portrayed) {
    this.char_id = id;
    this.name = name;
    this.birthday = birthday;
    this.img = img;
    this.status = status;
    this.nickname = nickname;
    this.portrayed = portrayed;
  }

  public Long getChar_id() {
    return char_id;
  }

  public void setChar_id(Long char_id) {
    this.char_id = char_id;
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

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
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
