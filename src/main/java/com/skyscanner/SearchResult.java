package com.skyscanner;

public class SearchResult {

    private String city;

    private String title;

    private String kind;

    public SearchResult(String city, String title, String kind) {
        this.city = city;
        this.title = title;
        this.kind = kind;
    }

    public SearchResult() {

    }

    public String getCity() {
        return city;
    }

    public String getTitle() {
        return title;
    }

    public String getKind() {
        return kind;
    }

}
