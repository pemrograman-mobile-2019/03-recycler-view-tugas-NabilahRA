package com.example.recyclerviewtugas.models;

public class Contact {
    private String id;
    private String name;
    private String desc;
    private String img;
    private int img_local;

    public Contact(String id, String name, String desc, String img) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.img = img;
    }

    public Contact(String id, String name, String desc, int img_local) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.img_local = img_local;
    }


    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getImg() {

        return img;
    }

    public void setImg(String img) {

        this.img = img;
    }

    public int getImg_local() {

        return img_local;
    }

    public void setImg_local(int img_local) {

        this.img_local = img_local;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {

        this.desc = desc;
    }
}

