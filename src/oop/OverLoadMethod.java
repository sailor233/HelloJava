package oop;
// 方法重载
//一系列方法，它们的功能都是类似的，只有参数有所不同，那么，可以把这一组方法名做成同名方法
public class OverLoadMethod {
	public static void main(String[] args) {
		Person3 ming = new Person3();
		Person3 hong = new Person3();
        ming.setName("Xiao Ming");
        // TODO: 给Person增加重载方法setName(String, String):
        hong.setName("Xiao", "Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}


class Person3 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setName(String name1,String name2) {
        this.name = name1+" "+name2;
    }
}