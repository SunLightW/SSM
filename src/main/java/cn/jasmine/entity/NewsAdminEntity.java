package cn.jasmine.entity;

public class NewsAdminEntity {
    private Integer id;

    private String newsTitle;

    private String newsDate;

    private String newsBody;

    private String newsPic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate == null ? null : newsDate.trim();
    }

    public String getNewsBody() {
        return newsBody;
    }

    public void setNewsBody(String newsBody) {
        this.newsBody = newsBody == null ? null : newsBody.trim();
    }

    public String getNewsPic() {
        return newsPic;
    }

    public void setNewsPic(String newsPic) {
        this.newsPic = newsPic == null ? null : newsPic.trim();
    }
}