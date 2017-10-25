package com.concretepage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "test_dress")
public class Dress {
	@Id
	@Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name= "dress_category_id")
	private DressCategory dressCategory;
	
	
	public Dress() {
		
	}
	
	public Dress(String name, DressCategory category) {
		this.name = name;
		dressCategory = category;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public DressCategory getDressCategory() {
		return dressCategory;
	}

	public void setDressCategory(DressCategory dressCategory) {
		this.dressCategory = dressCategory;
	}
	
	
	

}
