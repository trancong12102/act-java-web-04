/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

import java.util.Scanner;

/**
 *
 * @author DaiPhongPC
 */
public class Nhanvien {

    private String name;
    private int age;
    private String address;
    private double pay;
    private int hours;
    double bonus; 

    public Nhanvien() {

    }

    public Nhanvien(String name, int age, String address, double pay, int total_hours) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.pay = pay;
        this.hours = total_hours;
    }

    public String getname() {
        return name;
    }

    public void setname() {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage() {
        this.age = age;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress() {
        this.address = address;
    }
     public double  getpay() {
        return pay;
    }

    public void setpay() {
        this.pay = pay;
    }
     public int gethours() {
        return hours;
    }

    public void sethours() {
        this.hours = hours;
    }
    public void inputInfor(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter infor:");
        System.out.println("Enter name:");
        this.name = sc.nextLine(); 
        System.out.println("Enter age: ");
        this.age = Integer.parseInt(sc.nextLine()); 
        System.out.println("Enter address:"); 
        this.address= sc.nextLine(); 
        System.out.println("Enter pay:");
        this.pay =Double.parseDouble(sc.nextLine()); 
        System.out.println("Enter hours:");
        this.hours = Integer.parseInt(sc.nextLine()); 
    }
    public void printInfor(){
        System.out.println("Name: "+this.name);
        System.out.println("age: " +this.age);
        System.out.println("Address: " +this.address);
        System.out.println("Pay: " +this.pay);
        System.out.println("Hours: " +this.hours);
        
   
    }
    public double calbonus(){
        if (hours>=200){
            bonus = pay *20/100;  
        }
        else if(hours <200 && hours>=100){
            bonus = pay * 10/100; 
        }
        else {
            bonus = 0; 
        }
        return bonus; 
    }
}
