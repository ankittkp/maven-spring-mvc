package com.schoolmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Table(name="students")
@Entity(name="Studensts")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//@Column(name="name")
	private String name;
	
	//@Column(name="age")
	private Integer age;
	
	//@Column(name="gender")
	private String gender;
	
	//@Column(name="grade")
	private String grade;
	
	//@Column(name="section")
	private String section;
	
	//@Column(name="rollno")
	private Integer rollNo;
	
	//@Column(name="photourl")
	private String photoUrl;
	
	protected Students() {
		
	}
	
	public Students(Integer id, String name, Integer age, String gender, String grade, String section, Integer rollNo,
			String photoUrl) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.grade = grade;
		this.section = section;
		this.rollNo = rollNo;
		this.photoUrl = photoUrl;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
 
	
}
