package cn.jasmine.entity;

public class HrAdminEntity {
    private Integer id;

    private String hrTitle;

    private Integer hrNum;

    private String hrBody;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHrTitle() {
        return hrTitle;
    }

    public void setHrTitle(String hrTitle) {
        this.hrTitle = hrTitle == null ? null : hrTitle.trim();
    }

    public Integer getHrNum() {
        return hrNum;
    }

    public void setHrNum(Integer hrNum) {
        this.hrNum = hrNum;
    }

    public String getHrBody() {
        return hrBody;
    }

    public void setHrBody(String hrBody) {
        this.hrBody = hrBody == null ? null : hrBody.trim();
    }
}