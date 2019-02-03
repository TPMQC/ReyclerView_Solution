package com.example.recyclerviewdemo.model;

public class Reminder {
    private String tittle;
    private String priority;
    private String time;

    public Reminder() {
    }

    public Reminder(String tittle, String priority, String remindDate) {
        this.tittle = tittle;
        this.priority = priority;
        this.time = remindDate;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTitle(String tittle) {
        this.tittle = tittle;
    }

    public String getpriority() {
        return priority;
    }

    public void setpriority(String priority) {
        this.priority = priority;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
