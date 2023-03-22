package com.example.inkrhyme.model;


import jakarta.persistence.*;

@Entity
@Table(name = "poems")
public class CPoems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String title;
    private String genre;
    private String author;
    private String url;

    public CPoems(){
    }
    public CPoems(int id,String title,String genre, String author, String url) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.url = url;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
