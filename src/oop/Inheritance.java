package oop;

public class Inheritance {

	public static void main(String[] args) {
		Person p = new Person("小明", 12);
		Student s = new Student("小红", 20, 99);
		// TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
		Student ps = new PrimaryStudent("小军", 9, 100, 5);
		System.out.println(ps.getScore());
	}

}

//class Person4{
////	protected关键字可以把字段和方法的访问权限控制在继承树内部，一个protected字段和方法可以被其子类，以及子类的子类所访问
//	protected String name;
//	protected int age;
//
//	public Person4() {
//		
//	}
//	
//	public Person4(String name,int age){
//		this.name = name;
//		this.age = age;
//	}
//	
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    
//    public int getAge() {
//        return this.age;
//    }
//	public void setAge(int age) {
//		if(age<0 || age > 150) {
//			throw new IllegalArgumentException("invalid age value:"+ age);
//		}
//		this.age = age;
//	}
//
//}
//
//class Student extends Person4{
//	private int score;
//	
//	public Student() {
//		
//	}
//	
//	public Student(String name,int age,int score) {
//		//如果父类没有默认的构造方法，子类就必须显式调用super()并给出参数以便让编译器定位到父类的一个合适的构造方法
//		//即子类不会继承任何父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的。
//		super(name, age); // 调用父类的构造方法Person(String, int)
//		this.score = score;
//	}
//	
//	public int getScore() {
//		return this.score;
//	}
//	
//	public void setSCore(int score) {
//		this.score = score;
//	}
//	
//	public String hello() {
//		// 子类无法访问父类的private属性
//		//return "hello, "+name;   // 直接访问会报错
//		// 可以将父类的属性改为protectde
//		return "hello, "+name +" age:"+super.age;  
//	}
//	
//}

class Person {
	protected String name;
	protected int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Student extends Person {
	protected int score;

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	public int getScore() {
		return score;
	}
}

class PrimaryStudent extends Student{
	private int grade;
	// TODO
	public PrimaryStudent(String name,int age,int score,int grade) {
		super(name,age,score);
		this.grade = grade;
		
	}
}