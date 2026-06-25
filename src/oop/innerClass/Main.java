package oop.innerClass;

public class Main {
    public static void main(String[] args){
        Outer outer=  new Outer("Nested");
        Outer.Inner inner = outer.new Inner();
        inner.hello();
    }
}
class Outer{
    private String name;
    Outer(String name){
        this.name = name;
    }
    class Inner{
        void hello(){
            //可以访问Outer的私有字段
            System.out.println("Hello " + Outer.this.name);
        }
    }
}