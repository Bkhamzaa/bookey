package com.example.book.book.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="books")
public class Book {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;
@Column(nullable = false)
private String Name;
@Column(nullable = false)
private String author;
@Column(nullable = false, unique = true)
private  String email ;


}
