package cn.jasmine.entity.admin;

public class Honor {
  private Long id;
  private String honor_pic;
  private String honor_title;
  private String honor_body;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getHonor_pic() {
    return honor_pic;
  }

  public void setHonor_pic(String honor_pic) {
    this.honor_pic = honor_pic;
  }

  public String getHonor_title() {
    return honor_title;
  }

  public void setHonor_title(String honor_title) {
    this.honor_title = honor_title;
  }

  public String getHonor_body() {
    return honor_body;
  }

  public void setHonor_body(String honor_body) {
    this.honor_body = honor_body;
  }
}
