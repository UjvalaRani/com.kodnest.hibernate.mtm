package com.kodnest.com.kodnest.hibernate.mtm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {

	@Id
	int p_id;
	String p_name;
	@ManyToMany
	List<Language> language;

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public void setLanguage(List<Language> language) {
		this.language = language;
	}

	public Person(int p_id, String p_name, List<Language> language) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.language = language;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
