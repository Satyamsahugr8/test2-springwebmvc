package com.test.model;

//import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
	@Size(min = 1, message = "first name is a required field")
	@Pattern(regexp = "[a-zA-Z]{4,10}", message = "should have atleast 4 characters")
//	@Min(value=4)
	private String firstName;
	
	@Size(min = 1, message = "last name is a required field")
	@Pattern(regexp = "[a-zA-Z]{4,10}", message = "should have atleast 4 characters")
//	@Min(value=4)
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
	}

	public Employee() {
		super();		
	}
}
