package oop.AnonymousClass;
// 匿名内部类
//匿名内部类：没有类名，一次性临时实现接口 / 抽象类，用完不再复用；
//匿名内部类必须继承某个类或实现某个接口，
public class Main {
    public static void main(String[] args){
//        Outer outer = new Outer("张三");
//        outer.asyncHello();
        new Outer().testAnonymousClass();
    }
}

//class Outer{
//    private String name;
//    Outer(String name){
//        this.name = name;
//    }
//
//    //在方法中定义一个匿名内部类
//    void asyncHello(){
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello, " + Outer.this.name);
//            }
//        };
//        new Thread(r).start();
//    }
//}

//定义一个接口
interface MyInterface{
    //声明一个函数
    void show(String name,int age);
}


class Outer{
    private String message = "Outer的私有方法";

    private void showPrivateMessage(){
        System.out.println("Outer的私有方法");
    }

    public void testAnonymousClass(){
        MyInterface myInterface = new MyInterface() {
            @Override
            public void show(String name, int age) {
                System.out.println(name + "@" + age);
                System.out.println(Outer.this.message); // 访问Outer的私有字段
                showPrivateMessage();
            }
        };
        myInterface.show("张三",56);
    }

}