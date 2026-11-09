package com.campusconecta.demo.model;

public class Post {
    private String author;
    private String content;
    private String category;
    private String date;
    private String badgeClass;

    public Post(String author, String content, String category, String date, String badgeClass) {
        this.author = author;
        this.content = content;
        this.category = category;
        this.date = date;
        this.badgeClass = badgeClass;
    }

    // Getters y Setters
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getBadgeClass() { return badgeClass; }
    public void setBadgeClass(String badgeClass) { this.badgeClass = badgeClass; }
}