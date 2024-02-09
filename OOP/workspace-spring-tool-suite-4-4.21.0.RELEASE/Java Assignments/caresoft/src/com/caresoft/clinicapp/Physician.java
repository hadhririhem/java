package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	// TO DO: Constructor that takes an IDcopy
	public Physician(int IDcopy){
		super.setId(IDcopy);
	}
	
    // TO DO: Implement HIPAACompliantUser!
	
	@Override
	public boolean assignPin(int pin) {
		if (pin > 999 && pin < 10000 ) {
			return true; 
		}
		else {
			return false;
		}
	}
	
	@Override 
	public boolean accessAuthorized(Integer givenID) {
		if (this.id == givenID ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters
	public ArrayList<String> getPatientNotes() {
		return this.patientNotes;
	}
	
	public void setPatientNots(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
}
