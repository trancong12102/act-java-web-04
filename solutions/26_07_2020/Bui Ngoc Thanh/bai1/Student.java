/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Student {
Scanner sc = new Scanner(System.in);
    public String name;
    public int age;
    public String form;
    public double salary;
    public int sumHours;

    public Student(String name, int age, String form, double salary, int sumHours) {
        this.name = name;
        this.age = age;
        this.form = form;
        this.salary = salary;
        this.sumHours = sumHours;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSumHours() {
        return sumHours;
    }

    public void setSumHours(int sumHours) {
        this.sumHours = sumHours;
    }
    public void inputInfo(){
        System.out.println("Nhap ten: ");
        setName(sc.nextLine());
        System.out.println("Nhap tuoi: ");
        setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap dia dia: ");
        setForm(sc.nextLine());
        System.out.println("Nhap luong: ");
        setSalary(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap tong so gio lam: ");
        setSumHours(Integer.parseInt(sc.nextLine()));
    }

    public void printInfo() {
        System.out.println("______INFO sinh vien________");
        System.out.println("Ten: " + getName());
        System.out.println("Tuoi: " + getAge());
        System.out.println("Dia chi: " + getForm());
        System.out.println("Luong co ban: " + getSalary());
        System.out.println("Tong so gio lam: " + getSumHours());
        System.out.println("Luong va thuong la: "+(getSalary() + thuong()));
    }
    public double thuong(){
        double thuong = 0;
        if(getSumHours() >= 200){
            thuong = getSalary()*0.2;
        }
        else if(getSumHours()>100 && getSumHours() <200 ){
            thuong = getSalary()*0.1;
        }
        return thuong;
    }
}
