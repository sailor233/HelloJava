package oop.StaticFieldMethod;

public class Main {
    public static void main(String[] args){
        Person ming = new Person("xiaoming",12);
        Person hong = new Person("hong",15);

        Person.number = 88;
        System.out.println(Person.number);
        hong.number = 99;
        System.out.println(ming.number);
        System.out.println(Person.number);
        System.out.println(Person.getCount());



    }
}
class Person{
    public String name;
    public int age;
    public static int number;
    public static int count;

    public static int getCount(){
        return count;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
        count ++ ;
        System.out.println("count:"+getCount());
    }

    public static void setNumber(int value){
        number = value;
    }

}

