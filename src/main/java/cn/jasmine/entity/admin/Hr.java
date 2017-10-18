package cn.jasmine.entity.admin;

public class Hr {
  private Long id;
  private String hr_title;
  private Long hr_num;
  private String hr_body;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getHr_title() {
    return hr_title;
  }

  public void setHr_title(String hr_title) {
    this.hr_title = hr_title;
  }

  public Long getHr_num() {
    return hr_num;
  }

  public void setHr_num(Long hr_num) {
    this.hr_num = hr_num;
  }

  public String getHr_body() {
    return hr_body;
  }

  public void setHr_body(String hr_body) {
    this.hr_body = hr_body;
  }
}
