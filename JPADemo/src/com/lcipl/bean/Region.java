package com.lcipl.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the REGIONS database table.
 * 
 */
@Entity
@Table(name = "REGIONS")
@NamedQuery(name = "Region.findAll", query = "SELECT r FROM Region r")
public class Region implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "REGION_ID")
	private int regionId;

	@Column(name = "REGION_NAME")
	private String regionName;

	public Region() {
	}

	public Region(int regionId, String regionName) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
	}

	public int getRegionId() {
		return this.regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}