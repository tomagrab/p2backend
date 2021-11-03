package com.revature.p2BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@Entity
@Table(name = "customer")
@AllArgsConstructor
public class Customer {
		@Id
		@GeneratedValue
		private int id;
		private String name;
		private String email;
		private String mobile;
		private String password;
		@Column(name = "is_active")
		private boolean isActive;
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
