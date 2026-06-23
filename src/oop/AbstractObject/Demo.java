package oop.AbstractObject;

public class Demo {
    public static void main(String[] args){
        Person s = new Student();
        Person t = new Teacher();
        s.run();
        t.run();
        Income[] incomes = new Income[]{
                new Salary(6000),
        };
        double total = totalTax(incomes);
        System.out.println(total);

//         Person p = new Student("小明");
//         p.run();
    }

    public static double totalTax(Income... incomes){
        double total = 0;
        for(Income income:incomes){
            total += income.getTax();
        }
        return total;
    }
}

abstract class Person{
    public abstract void run();
}

class Student extends Person{
    @Override
    public void run(){
        System.out.println("stu running");
    }
}
class  Teacher extends Person{
    @Override
    public void run(){
        System.out.println("teacher running");
    }
}



abstract class Income{
    protected double income;
    public Income(double income){
        this.income = income;
    }
    abstract double getTax();
}

class Salary extends Income{
    public Salary(double income){
        super(income);
    }

    public double getTax(){
        if (income<=5000){
            return 0;
        }
        return (income-5000)*0.2;
    }
}