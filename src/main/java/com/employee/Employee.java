package com.employee;

public class Employee {

	private String empid;
    private String fname;
    private String lname;
    private String dob;
    private String contact;
    private String role;
    private String salary;
    private String bonus;
    private String annual_salary;

    public Employee(String empid, String fname, String lname, String dob, String contact, String role, String salary, String bonus){
        this.empid = empid;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.contact = contact;
        this.role = role;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getEmpid() { return empid; }
    public String getFname() { return fname; }
    public String getLname() { return lname; }
    public String getDOB() { return dob; }
    public String getContact() { return contact; }
    public String getRole() { return role; }
    public String getSalary() { return salary; }
    public String getBonus() { return bonus; }
    public String getAnnualSalary() { 
    	
    	int sal = Integer.parseInt(salary);
    	int annual_sal = sal * 12 + Integer.parseInt(bonus);
    	annual_salary = "" + annual_sal;
    	
    	return annual_salary; 
    	
    }
	
}
