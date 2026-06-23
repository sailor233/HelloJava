package oop;
//构造方法
public class ConstructorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p = new Person2("xiaoming",12);
		System.out.println(p.getName());
        System.out.println(p.getAge());
        
        Person2 p2 = new Person2();
		System.out.println(p2.getName());
        System.out.println(p2.getAge());
        
        
        Person2 p3 = new Person2("zhangsna");
		System.out.println(p3.getName());
        System.out.println(p3.getAge());
        
	}

}

class Person2{
	private String name;
	private int age;
//	private String name = "Unamed";
//	private int age = 10;
//没有在构造方法中初始化字段时，引用类型的字段默认是null，
	//数值类型的字段用默认值，int类型默认值是0，布尔类型默认值是false：
	public Person2() {
		
	}
	public Person2(String name) {
		//调用其他构造方法
		this(name,18);
	}
	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
	
}
