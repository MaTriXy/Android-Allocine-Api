package com.github.florent37.allocineapi.model;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.io.Serializable;

public class Trivium implements Serializable {

    @Expose
    private Integer code;
    @Expose
    private Publication publication;
    @Expose
    private String title;
    @Expose
    private String body;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Trivium{" +
                "code=" + code +
                ", publication=" + publication +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
