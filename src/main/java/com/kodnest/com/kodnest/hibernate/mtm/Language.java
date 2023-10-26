package com.kodnest.com.kodnest.hibernate.mtm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Language {

	@Id
	int l_id;
	String l_name;
	@ManyToMany
	List<Person> person;

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	
	public Language(int l_id, String l_name, List<Person> person) {
		super();
		this.l_id = l_id;
		this.l_name = l_name;
		this.person = person;
	}

	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
