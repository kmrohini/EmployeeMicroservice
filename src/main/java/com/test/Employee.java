package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {	
	public Employee(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public Employee() {
		super();
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(nullable=false)
    private String firstName;
    private String lastName;
    @Column(nullable=false)
    public String email; 
    
}
