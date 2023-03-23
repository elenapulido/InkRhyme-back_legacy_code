package com.example.inkrhyme.model;
import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
@Table(name = "poems")
public class CPoems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String title;
    private String genre;
    private String author;
    private String url;



    private String poem;

    public CPoems(){
    }
    public CPoems(int id,String title,String genre, String author, String url, String poem) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.url = url;
        this.poem = poem;
    }



    public String getPoem() {
        return poem;
    }
    public void setPoem(String poem) {
        this.poem = poem;
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
