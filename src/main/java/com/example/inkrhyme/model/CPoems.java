package com.example.inkrhyme.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "poems")
public class CPoems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private long id;
    @Column (name = "tittle", nullable = false)
    private String tittle;
    @Column (name = "genre", nullable = false)
    private String genre;
    @Column (name = "poem", nullable = false)
    private String poem;
    @Column (name = "author", nullable = false)
    private String author;
    @Column (name = "url", nullable = false)
    private String url;



}
