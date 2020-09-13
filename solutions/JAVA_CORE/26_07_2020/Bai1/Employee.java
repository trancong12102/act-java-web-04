package Object.Bai1;

import java.util.Scanner;

public class Employee {

    private String name;
    private int age;
    private String address;
    private double salary;
    private int workhour;
    
    public Employee(){}

    public Employee(String name, int age, String address, double salary, int workhour) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.workhour = workhour;
    }
    String getname(){
        return name;
    }
    void setname(String name){
        this.name = name;
    }
    int getage(){
        return age;
    }
    void setage(int age){
        this.age = age;
    }
    String getaddress(){
        return address;
    }
    void setaddress(String address){
        this.address = address;
    }
    double getsalary(){
        return salary;
    }
    void setname(double salary){
        this.salary = salary;
    }
    int getworkhour(){
        return workhour;
    }
    void setname(int workhour){
        this.workhour = workhour;
    }
    void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tên nhân viên: ");
        name = input.nextLine();
        System.out.print("Tuổi nhân viên: ");
        age = input.nextInt();
        input.nextLine();
        System.out.print("Địa chỉ nhân viên: ");
        address = input.nextLine();
        System.out.print("Lương nhân viên: ");
        salary = input.nextDouble();
        System.out.print("Tổng số giờ làm của nhân viên: ");
        workhour  = input.nextInt();
    }
    void printInfo(){
        System.out.println("Thông tin nhân viên:");
        System.out.println(" - Tên: "+name);
        System.out.println(" - Tuổi: "+age);
        System.out.println(" - Địa chỉ: "+address);
        System.out.println(" - Lương: "+salary);
        System.out.println(" - Số giờ làm: "+workhour);
        System.out.println(" - Tiền thưởng: "+bonuses());
    }
    double bonuses(){
        double bonus;
        if (workhour >= 200)
            bonus = salary*0.2;
        else if (workhour < 200 && workhour >= 100)
            bonus = salary*0.1;
        else
            bonus = 0;
        return bonus;
    }
}