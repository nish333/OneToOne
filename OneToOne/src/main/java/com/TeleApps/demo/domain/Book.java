package com.TeleApps.demo.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
@Table(name="book")
public class Book {
	
	@Id
	@GeneratedValue
	private int price;
	private String name;
	private int noOfPages;
	
	@ManyToMany(mappedBy = "book")
	private List<Library> library;
	
//	@OneToMany(mappedBy="book")
//	private List<Library> library;

}
