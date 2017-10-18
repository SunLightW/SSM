package cn.jasmine.entity.admin;

public class News {
  private Long id;
  private String news_title;
  private String news_date;
  private String news_body;
  private String news_pic;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNews_title() {
    return news_title;
  }

  public void setNews_title(String news_title) {
    this.news_title = news_title;
  }

  public String getNews_date() {
    return news_date;
  }

  public void setNews_date(String news_date) {
    this.news_date = news_date;
  }

  public String getNews_body() {
    return news_body;
  }

  public void setNews_body(String news_body) {
    this.news_body = news_body;
  }

  public String getNews_pic() {
    return news_pic;
  }

  public void setNews_pic(String news_pic) {
    this.news_pic = news_pic;
  }
}
