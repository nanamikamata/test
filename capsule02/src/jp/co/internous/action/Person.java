package jp.co.internous.action;

public class Person {
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	private String name=null;
	private int age=0;
	
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}

}
