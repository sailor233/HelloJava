package oop.Interface;

public class Main {
    public static void main(String[] args){
        Income[] incomes = new Income[] {
                new Salary(5000),
                new Royalty(15000)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income...incomes){
        double total = 0;
        for(Income income:incomes){
            total +=  income.getTax();
        }
        return total;
    }
}
//如果一个抽象类没有字段，所有方法全部都是抽象方法
// 可以将该类写为接口Interface
interface  Person{
    String getName();
    default void run(){
        System.out.println(getName()+"run");
    }

}

class Student implements Person{
    private String name;
    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


}

interface Income{
    double getTax();
}

class Salary implements Income{
    private double income;
    public Salary(double income){
        this.income = income;
    }
    public double getTax(){
        if(income<=5000){
            return 0;
        }
        return (income-5000)*0.2;
    }
}

class Royalty implements Income{
    private double income;
    public Royalty(double income){
        this.income = income;
    }
    public double getTax(){
        if( income <= 4000){
            return (income - 800) * 0.7* 0.2;
        }
        return income*(1.0-0.2)*0.7*0.2;
    }
}