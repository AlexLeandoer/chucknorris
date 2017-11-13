package com.alexcontreras.chucknorris;

/**
 * Created by alexh on 9/11/2017.
 */

public class Chistacos {
    private String category;
    private String iconUrl;
    private String id;
    private String url;
    private String value;

    public Chistacos() {
    }


    public Chistacos(String category, String iconUrl, String id, String url, String value) {
        this.category = category;
        this.iconUrl = iconUrl;
        this.id = id;
        this.url = url;
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
