package com.concretepage.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "test_dress_category")
public class DressCategory {
	private int id;
	private String name;
    private Set<Dress> dresses;
	
	public DressCategory(){
		
	}
	
	public DressCategory(String name) {
		this.name = name;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
	
	 @OneToMany(mappedBy = "dressCategory", cascade = CascadeType.ALL)
	    public Set<Dress> getDresses() {
	        return dresses;
	    }

	    public void setDresses(Set<Dress> dresses) {
	        this.dresses = dresses;
	    }
	
	
}
