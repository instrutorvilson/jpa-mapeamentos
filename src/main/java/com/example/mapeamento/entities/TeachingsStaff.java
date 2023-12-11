package com.example.mapeamento.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue( value="TS" )
public class TeachingsStaff extends Staff {
	private String qualification;
	private String subjectexpertise;
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSubjectexpertise() {
		return subjectexpertise;
	}
	public void setSubjectexpertise(String subjectexpertise) {
		this.subjectexpertise = subjectexpertise;
	}
}
