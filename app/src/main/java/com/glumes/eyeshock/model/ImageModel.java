package com.glumes.eyeshock.model;

/**
 * Created by zhaoying on 2017/9/22.
 */

public class ImageModel {

    public String url ;

    public String content;


    public ImageModel() {
    }

    public ImageModel(String url, String content) {
        this.url = url;
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
