package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {
    @JsonProperty
    private String city;

    public Search(String city) {
        this.city = city;
    }

    public Search() {
        // Default constructor for deserialization
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
