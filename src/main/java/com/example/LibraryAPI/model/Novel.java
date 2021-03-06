package com.example.LibraryAPI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "novel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Novel extends Book {
    private String storySummary;

    public Novel(String title, float price, int totalUnitsSold, Date publicationDate, int nbPages, Category category, Author author, Library library, String storySummary) {
        super(title, price, totalUnitsSold, publicationDate, nbPages, category, author, library);
        this.storySummary = storySummary;
    }
}