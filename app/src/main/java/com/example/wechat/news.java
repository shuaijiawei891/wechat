package com.example.wechat;

public class news {

    private String userName;
    private String time;
    private String news;
    private int images1;

    public news(String userName,String time,String news,int images1){
        this.userName=userName;
        this.time=time;
        this.news=news;
        this.images1=images1;
    }

    public String getUserName() {
        return userName;
    }
    public String getTime() {
        return time;
    }
    public String getNews() {
        return news;
    }
    public int getImages1() {
        return images1;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setNews(String news) {
        this.news = news;
    }
    public void setImages1(int images1) {
        this.images1 = images1;
    }


}

