package com.cognizant.spring_learn.model;

/**
 * @author Aswin Senthilkumar
 *
 */
public class Country {

	String code;
	String name;
	
	public Country() {
		
	}
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", getCode()=" + getCode() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	/**
	 * @param code
	 * @param name
	 */
	public Country(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
	
	
	
}
