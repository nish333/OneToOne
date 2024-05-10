package com.TeleApps.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue
	private String id;
	private String name;
	private Integer phoneNumber;
	private String departement;
	
//	@OneToOne
//	@JoinColumn(name="address_id")
//	private Address address;
//	
	
//	@ManyToOne
//	@JoinColumn(name="library_id")
//	private Library library;

}
