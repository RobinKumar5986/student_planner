package com.example.studentplanner.Models;

public class uploadPDFs {
    public String name,url;

    public uploadPDFs(){}

    public uploadPDFs(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
