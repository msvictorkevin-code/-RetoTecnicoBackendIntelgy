package com.intely.test.webrest.usuarios.demo.entity.builder;

import com.intely.test.webrest.usuarios.demo.entity.SoporteRequest;

public class SoporteBuilder {

    private String url;

    private String text;


    public SoporteBuilder setUrl(String url) {
        this.url = url;
        return this;
    }


    public SoporteBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public SoporteRequest build() {
        return new SoporteRequest(url, text);
    }
}
