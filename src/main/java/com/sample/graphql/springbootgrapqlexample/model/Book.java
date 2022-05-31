package com.sample.graphql.springbootgrapqlexample.model;
//Sample project 
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table
@Entity
public class Book {

  //  public Book(String string, String string2, String string3, String[] strings, String string4) {
		// TODO Auto-generated constructor stub
//	}
	@Id
    private String isn;
    private String title;
    private String publisher;
    private String[] authors;
    private String publishedDate;

}
