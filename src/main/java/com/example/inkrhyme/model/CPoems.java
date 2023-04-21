package com.example.inkrhyme.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "poems")
public class CPoems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private long id;
    @Column (name = "title", nullable = false)
    private String title;
    @Column (name = "genre", nullable = false)
    private String genre;
    @Column (name = "poem", nullable = false)
    private String poem;
    @Column (name = "author", nullable = false)
    private String author;
    @Column (name = "url", nullable = false)
    private String url;

}