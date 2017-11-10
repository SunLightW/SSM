package cn.jasmine.entity;

import cn.jasmine.base.BaseEntity;

import java.io.Serializable;

/**
 * 荣耀Entity
 */
public class HonorAdminEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 8423648953606420576L;

    private Integer id;//id
    private String honorPic;//照片
    private String honorTitle;//标题
    private String honorBody;//内容


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