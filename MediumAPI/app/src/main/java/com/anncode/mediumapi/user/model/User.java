package com.anncode.mediumapi.user.model;

/**
 * Created by anahisalgado on 20/06/17.
 */

public class User {
    private String id;
    private String name;
    private String userName;
    private String url;
    private String imageUrl;

    public User(String id, String name, String userName, String url, String imageUrl) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.url = url;
        this.imageUrl = imageUrl;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
