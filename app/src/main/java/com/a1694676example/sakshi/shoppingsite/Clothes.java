package com.a1694676example.sakshi.shoppingsite;

/**
 * Created by PEARL on 2017-10-13.
 */

public class Clothes {
    private String name;
    private String url;

    public Clothes(String url, String name) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

