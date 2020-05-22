package com.example.trainingdesign.Models;

public class NoticationModel
{
    String title;
    String time;
    String details;

    public NoticationModel(String title, String time, String details) {
        this.title = title;
        this.time = time;
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
