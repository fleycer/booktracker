package com.booktracker.entitites;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="books")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="bookName")
    private String bookName;

    @Column(name="author")
    private String author;

    @Column(name="genre")
    private String genre;

    @Column(name="yearOfPublishing")
    private int yearOfPublishing;
}
