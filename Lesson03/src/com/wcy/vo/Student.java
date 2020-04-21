package com.wcy.vo;
/**
 * 
* @Title: Student.java
* @Package com.wcy.vo
* @author 晨阳 
* @date 2020年3月30日 下午3:37:53
* @Description: 
* @version V1.0
 */
public class Student {
	private String name;
	private Integer age;
	private String major;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", major=" + major + "]";
	}
	public Student() {
	}
	public Student(String name, Integer age, String major) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
