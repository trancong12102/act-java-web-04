/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lession5;

import java.util.Scanner;

/**
 *
 * @author luuthanhcong
 */
public class Employee {
    String name;
    int age;
    String address;
    double salary;
    int hours;

    public Employee() {
    }

    public Employee(String name, int age, String address, double salary, int hours) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public int getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void inputInfo(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten : ");
        name = s.nextLine();
        System.out.println("Nhap tuoi : ");
        age = Integer.parseInt(s.nextLine());
        System.out.println("Nhap dia chi : ");
        address = s.nextLine();
        System.out.println("Nhap tien luong : ");
        salary = s.nextDouble();
        System.out.println("Nhap tong gio lam : ");
        hours = s.nextInt();
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", address=" + address + ", salary=" + salary + ", hours=" + hours + '}';
    }
    
    public void printInfo(){
        System.out.println(toString());
    }
    
    public double tinhthuong(){
        if(this.hours >= 200){
            return this.salary * 0.2;
        }else if(this.hours < 100){
            return 0;
        }else{
            return this.salary * 0.1;
        }
    }    
     
}
