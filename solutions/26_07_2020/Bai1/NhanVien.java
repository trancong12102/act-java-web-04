/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nhan.vien;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVien {

   private String name;
    private int age, hour;
    private String address;
    private double tien;

    NhanVien() {
      
    }

    NhanVien(String name, int age, int hour, String address) {
       

        this.age = age;
        this.hour = hour;
        this.address = address;
        this.name = name;
    }

    void inputInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten:");
        name=sc.nextLine();
        System.out.print("nhap tuoi:");
        age=sc.nextInt();
        sc.nextLine();
        System.out.print("nhap dia chi:");
        address = sc.nextLine();
              System.out.print("nhap so gio lam:");
        hour = sc.nextInt();
    while(hour<0)
    {
              System.out.print("nhap so gio lam:");
        hour = sc.nextInt();
    }

        
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHour() {
        return hour;
    }

    public double getTien() {
        return tien;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    void printInfo() {
        System.out.println("Ten nhan vien : " + name);
        System.out.println("Tuoi Nhan vien : " + age);
        System.out.println("Dia Chi : " + address);
        System.out.println("Gio lam : " + hour);        
      
         
       

        System.out.println("luong : " + tien); 
        
  
    }

    double tinhluong() {
        if (hour < 0) {
            tien = 0;
        }
        if (hour < 100) {
            tien = 20000 * hour;
        }
        if (hour < 200) {
            tien = 20000 * hour * 1.1;
        }
        if (hour >= 200) {
            tien = (20000 * hour * 1.2);
        }
        return tien;

    }

}
