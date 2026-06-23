package oop.Polymorphic;

import javax.xml.namespace.QName;

public class demo {
    public static void main(String[] args){
        Income[] incomes = new Income[] {
//                new Income(3500),
                new Salary(10000),
                new Royalty(6543)
        };
        double total = totalTax(incomes);
        System.out.println(total);


        Person p = new Person("Person");
        Student s = new Student("stu");
        System.out.println(p.hello());
        System.out.println(s.hello());




    }

    public static double totalTax(Income... incomes){
        double total = 0;
        for(Income income:incomes){
            total += income.getTax();
        }
        return total;
    }

}

class Income {
    protected double income;
    public Income(double income){
        this.income = income;
    }
    public double getTax() {
        return income * 0.1; // 税率10%
    }
}


class Salary extends Income{

    public Salary(double income){
        super(income);
    }

    @Override
    public double getTax(){
        if (income<=5000){
            return 0;
        }
        return (income-5000)*0.1;
    }
}


class StateCouncilSpecialAllowance extends Income{

    public StateCouncilSpecialAllowance(double income){
        super(income);
    }

    @Override
    public double getTax(){
        return 0;
    }
}

class Royalty extends Income{
    public Royalty(double income){
        super(income);
    }

    @Override
    public double getTax(){
        if( income <= 4000){
            return (income - 800) * 0.7* 0.2;
        }
        return income*(1.0-0.2)*0.7*0.2;
    }

}


class Person{
//    protected String name;
    public final String name;  //可以保障实例创建后，字段不可修改
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person:name" + name;
    }

    @Override
    public boolean equals(Object o){
        //当o类型为Person并且name相同认为相同
        if (o instanceof Person){
            Person p = (Person) o;
            return this.name.equals(p.name);
        }
        return false;
    }

    //hash计算
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
    //final 可以不允许子类覆写方法
    // 还可以通过标识类，不让子类继承
    //public final String hello(){
    public String hello(){
        return "hello, " + name;
    }

}
class Student extends Person{

    public Student(String name){
        super(name);
    }

    @Override
    public String hello(){
        return super.hello() + "!";
    }
}