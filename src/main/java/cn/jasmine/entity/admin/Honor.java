package cn.jasmine.entity.admin;

public class Honor {
    private Integer id;

    private String honorPic;

    private String honorTitle;

    private String honorBody;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHonorPic() {
        return honorPic;
    }

    public void setHonorPic(String honorPic) {
        this.honorPic = honorPic == null ? null : honorPic.trim();
    }

    public String getHonorTitle() {
        return honorTitle;
    }

    public void setHonorTitle(String honorTitle) {
        this.honorTitle = honorTitle == null ? null : honorTitle.trim();
    }

    public String getHonorBody() {
        return honorBody;
    }

    public void setHonorBody(String honorBody) {
        this.honorBody = honorBody == null ? null : honorBody.trim();
    }
}