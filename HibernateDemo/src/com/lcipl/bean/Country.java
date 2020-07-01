package com.lcipl.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {

	@Id
	@Column(name = "country_id")
	
	private String id;
	@Column(name = "country_name")
	private String name;
	@Column(name = "region_id")
	private int region;

	public Country() {
		super();
	}

	public Country(String id, String name, int region) {
		super();
		this.id = id;
		this.name = name;
		this.region = region;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region = region;
	}

}
