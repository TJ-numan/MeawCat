package com.tjnuman.meaw.firstAid;

public class FirstAidModel {
    private String title;
    private String des;


    public FirstAidModel(String title, String des) {

        this.title = title;
        this.des = des;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
