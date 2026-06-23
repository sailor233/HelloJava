package oop;
import  java.util.Arrays;

public class Method {
	public static void main(String[] args) {
		Person0 ming = new Person0();
//		ming.private = "小明";
		ming.setName("小明");
//		ming.age = 18;
		ming.setAge(10);
		ming.birth = 1997;
		System.out.println(ming.getName()+ming.getAge());
		
		ming.setNames("小明","小红");
		System.out.println(ming.getNames());
		
	}
}
class Person0{
	private String name;
	private int age;
	public int birth;
	private String[] names;
	
	public void setName(String name) {
		if(name ==null || name.isBlank()) {
			throw new IllegalArgumentException("invalid name");
		}
		this.name = name;
	}
	
	public void setNames(String... names) {
		this.names = names;
	}
	
	public void setNames2(String[] names) {
		this.names = names;
	}
	
	
	public String getNames() {
		return Arrays.toString(names);
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age<0 || age > 150) {
			throw new IllegalArgumentException("invalid age value:"+ age);
		}
		this.age = age;
	}
	
	public int getAge() {
//		return age;
		return this.calcAge(2026);
	}
	
	
	//private方法的理由是内部方法是可以调用private方法
	private int calcAge(int currentYear) {
		return currentYear - this.birth;
		
	}
}