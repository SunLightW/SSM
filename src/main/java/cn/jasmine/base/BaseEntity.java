package cn.jasmine.base;

import java.io.Serializable;

/**
 * 基本Entity，被实体类继承
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -8007701371591381750L;

    protected String S1;//创建时间
    protected String S2;//更新时间
    protected String S3;//是否删除


    public String getS1() {

        return S1;
    }

    public void setS1(String s1) {
        S1 = s1;
    }

    public String getS2() {
        return S2;
    }

    public void setS2(String s2) {
        S2 = s2;
    }

    public String getS3() {
        return S3;
    }

    public void setS3(String s3) {
        S3 = s3;
    }


}
