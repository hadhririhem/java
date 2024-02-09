package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer employeeID, String role) {
    	this.employeeID = employeeID;
    	this.role = role;
    	securityIncidents = new ArrayList<String>();
    }
    
    // TO DO: Implement HIPAACompliantUser!
    
	@Override
	public boolean assignPin(int pin) {
		if (pin > 99999 ) {
			return true; 
		}
		else {
			return false;
		}
	}
	
	@Override 
	public boolean accessAuthorized(Integer givenID) {
		if (this.employeeID == givenID ) {
			return true;
		}
		else {
			authIncident();
			return false;
		}
	}
    // TO DO: Implement HIPAACompliantAdmin!
	@Override
	public ArrayList<String> reportSecurityIncidents(){
		return securityIncidents;
	}
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
    public Integer getEmployeeId() {
    	return employeeID;
    }
    
    public String getRole() {
    	return role;
    }
    
    public ArrayList<String> getSecurityIncidents(){
    	return securityIncidents;
    }
    
    public void setEmployeeId(Integer id) {
    	this.employeeID = id;
    }
    public void setRole(String role) {
    	this.role = role;
    }
    public void setSecurityIncidents(ArrayList<String> securityIncidents ) {
    	this.securityIncidents = securityIncidents;
    }
}