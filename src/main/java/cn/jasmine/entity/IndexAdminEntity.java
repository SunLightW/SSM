package cn.jasmine.entity;

public class IndexAdminEntity {
    private Integer id;

    private String picLocation;

    private String picName;

    private String vLocation;

    private String vName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicLocation() {
        return picLocation;
    }

    public void setPicLocation(String picLocation) {
        this.picLocation = picLocation == null ? null : picLocation.trim();
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    public String getvLocation() {
        return vLocation;
    }

    public void setvLocation(String vLocation) {
        this.vLocation = vLocation == null ? null : vLocation.trim();
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }
}