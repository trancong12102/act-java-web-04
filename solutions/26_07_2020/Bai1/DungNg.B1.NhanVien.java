/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.Scanner;

/**
 *
 * @author Dung Ng
 */
public class NhanVien {
    
    private String name;
    private int age;
    private String address;
    private double inCome;
    private int totalTime;
    double extra;

   

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getInCome() {
        return inCome;
    }

    public void setInCome(double inCome) {
        this.inCome = inCome;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public NhanVien() {
    }

    public NhanVien(String name, int age, String address, double inCome, int totalTime, double extra) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.inCome = inCome;
        this.totalTime = totalTime;
        this.extra = extra;
    }

    
    
    Scanner sc = new Scanner(System.in);
    void inputInfo(){
        System.out.println("nhap thong tin nv > ");
        System.out.println("name? > ");
        this.name= sc.nextLine();
        System.out.println("age? > ");
         this.age = sc.nextInt();
         sc.nextLine();
        System.out.println("address? > "); 
          this.address = sc.nextLine();
        System.out.println("income? > ");
            this.inCome = sc.nextDouble();
        System.out.println("total time? > ");
                this.totalTime =sc.nextInt();
    }
    void printInfo(){
        System.out.println("thong tin nv vua nhap > ");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
        System.out.println(this.inCome);
        System.out.println(this.totalTime);
    }
    double tinhThuong(){
        
        if(this.totalTime >= 200){
            extra = inCome*20/100;
        }
        else if(this.totalTime >= 100 && this.totalTime < 200){
            extra =inCome*10/100;
        }
        else{
            extra = 0;
        }
//        System.out.println(extra);
        return extra;
        
    }
    
}
