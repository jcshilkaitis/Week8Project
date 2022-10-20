package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Joe Shilkaitis - jshilkaitis
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */
@Entity
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String fname;
	private String lname;
	private int age;
	private String beltRank;
	
	
	public Student() {
		super();
	}


	public Student(String fname, String lname, int age, String rank) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.beltRank = rank;
	}


	public Student(int id, String fname, String lname, int age, String rank) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.beltRank = rank;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getBeltRank() {
		return beltRank;
	}


	public void setBeltRank(String rank) {
		this.beltRank = rank;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", rank=" + beltRank + "]";
	}
	
	
	
}
