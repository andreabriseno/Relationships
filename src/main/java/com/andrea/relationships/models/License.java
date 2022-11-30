package com.andrea.relationships.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="licenses")
public class License {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String first_name;
 private String last_name;
 private int age;
 @Column(updatable=false)
 private Date createdAt;
 private Date updatedAt;
 @OneToOne(fetch=FetchType.LAZY)
 @JoinColumn(name="person_id")
 private Person person;
 public License() {
 }
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public Date getUpdatedAt() {
	return updatedAt;
}
public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}

}

