package com.intely.test.webrest.usuarios.demo.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SoporteRequest {

    private String url;

    private String text;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SoporteRequest(String url, String text) {
        this.url = url;
        this.text = text;
    }

    @Override
    public String toString() {
        return "url='" + url + '\'' + ", text='" + text + '\'';
    }
}
