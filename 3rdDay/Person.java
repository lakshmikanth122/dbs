package com.capgemini.day3Java8;

public class Person {
	
	private String name;
	private String email;
	private int age;
	private Gender gender;
	public Person(String name, String email, int age, Gender gender) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
