package com.modernjava.functionalprogramming;

import java.util.List;
/**
 * 
 * @author VADI
 * Example
 */
public class Instructor {

	private String name;
	private int experience;
	private String title;
	String gender;
	boolean onlineCourses;
	List<String> courses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isOnlineCourses() {
		return onlineCourses;
	}
	public void setOnlineCourses(boolean onlineCourses) {
		this.onlineCourses = onlineCourses;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	public Instructor(String name, int experience, String title, String gender, boolean onlineCourses,
			List<String> courses) {
		super();
		this.name = name;
		this.experience = experience;
		this.title = title;
		this.gender = gender;
		this.onlineCourses = onlineCourses;
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Instructor [name=" + name + ", experience=" + experience + ", title=" + title + ", gender=" + gender
				+ ", onlineCourses=" + onlineCourses + ", courses=" + courses + "]";
	}
	
	
	
	
}
