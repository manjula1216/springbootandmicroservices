package com.vlm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "USER_TBL")
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userId;
	private String name;
	private int age;
	private String email;
	private String mobileno;
	private String gender;
	private String city;
	
	

}
