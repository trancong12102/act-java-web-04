/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainstudent;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class Student {
    
    private  String masv;
    private double dtb;
    private int  age;
    private String lop;
    
    Student(){
        masv = "CT030259";
        dtb = 6.8;
        age = 20;
        lop = "CT3B";
    }
    Student(String masv, double dtb, int age, String lop){
        this.masv = masv;
        this.dtb = dtb;
        this.lop = lop;
        this.age = age;
        
    }
    String getMasv(){
        return masv;
        
    }
    void setMasv(String masv){
        this.masv = masv;
    }
    double getDtb(){
        return dtb;
    }
    void setDtb(double dtb){
        this.dtb=dtb;
    }
    
    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age= age;
    }
    String getLop(){
        return lop;
    }
    void setLop(String lop){
        this.lop= lop;
    }
    //phuong thuc input info()
    void inputInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap MSV:");
        masv= sc.nextLine();
        System.out.println("Nhap diem trung binh:");
        dtb=sc.nextDouble();
        sc.nextLine();
        System.out.println("Tuoi la:");
        age= Integer.parseInt(sc.nextLine());
        System.out.println("Lop la:");
        lop = sc.nextLine();
        
    }
    void showInfo(){
        System.out.println("--------Thong tin sinh vien--------");
        System.out.println("MSV \t\t:"+this.masv);
        System.out.println("DTB \t\t:"+this.dtb);
        System.out.println("Tuoi la \t:"+this.age);
        System.out.println("Lop la \t \t:"+this.lop);
        System.out.println(""+this.hocbong());
    }
    double hocbong(){
        if(dtb >= 8){
            System.out.println("Sinh vien co duoc hoc bong");
            
            
        }
        else{
            System.out.println("Sinh vien  khong duoc hoc bong");
        }
        return 0;
    }
   
    
}

