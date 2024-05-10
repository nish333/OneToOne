package com.TeleApps.demo.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="library")
public class Library {
	
	@Id
	@GeneratedValue
	private int id;
	private String bookName;
	private String bookAuthor;
	private int yearOfPublished;
	

	@ManyToMany
	@JoinTable(
		name="library_book",
		joinColumns = @JoinColumn(name="library_id"),
		inverseJoinColumns = @JoinColumn(name="book_id")
			)
	
	private List<Book> book;


}
