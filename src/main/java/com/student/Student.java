package com.student;

public class Student {
	
    private String uname;
    private String fname;
    private String lname;
    private String dob;
    private String email;

    public Student(String uname, String fname, String lname, String dob, String email){
        this.uname = uname;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.email = email;
    }
    // Setter Methods to set table data to be
    // displayed
    public String getUname() { return uname; }
    public String getFname() { return fname; }
    public String getLname() { return lname; }
    public String getDOB() { return dob; }
    public String getEmail() { return email; }
}
