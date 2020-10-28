package com.example.wechat;

public class messages {

    private String userName;
    private Object images;


    public messages (String userName,Object images){
        this.userName=userName;
        this.images=images;

    }
    public String getUserName() {
        return userName;
    }
    public Object getImages() {
        return images;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setImages(Object images) {
        this.images = images;
    }


}

