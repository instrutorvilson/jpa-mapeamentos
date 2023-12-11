package com.example.mapeamento.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue( value = "NS" )
public class NonTeachingStaff extends Staff {
	 private String areaexpertise;

	public String getAreaexpertise() {
		return areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}
	 
}
