/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {
    private String MaSV;
    private double DTB;
    private int Age;
    private String Lop;

    public Student() {
    }

    public Student(String MaSV, double DTB, int Age, String Lop) {
        this.MaSV = MaSV;
        this.DTB = DTB;
        this.Age = Age;
        this.Lop = Lop;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public double getDTB() {
        return DTB;
    }

    public void setDTB(double DTB) {
        this.DTB = DTB;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("Nhap Ma SV: ");
            MaSV = sc.nextLine();
            if(MaSV.length() < 8 || MaSV.length() > 8){
                System.out.println("Ban nhap sai, phai nhap Ma SV du 8 ky tu.");
            }
            else
                break;
        } while (true);
        do {            
            System.out.println("Nhap Diem TB: ");
            DTB = Double.parseDouble(sc.nextLine());
            if(DTB < 0 || DTB > 10){
                System.out.println("Ban nhap sai, phai nhap diem TB tu 0 - 10.");
            }
            else
                break;
        } while (true);
        do {            
            System.out.println("Nhap Tuoi: ");
            Age = Integer.parseInt(sc.nextLine());
            if(Age < 18){
                System.out.println("Ban nhap sai, phai nhap tuoi >= 18.");
            }
            else
                break;
        } while (true);
        do {            
            System.out.println("Nhap Lop: ");
            Lop = sc.nextLine();
            if(Lop.charAt(0) != 'A' && Lop.charAt(0) != 'C'){
                System.out.println("Ban nhap sai, phai nhap Lop bat dau ban A hoac C.");
            }
            else
                break;
        } while (true);
    }
    
    public void showInfo(){
        System.out.println(MaSV+"\t\t"+DTB+"\t"+Age+"\t"+Lop);
    }
    
    public void HBong(){
        if(getDTB() >= 8){
            System.out.println("Sinh vien " +getMaSV() +" Duoc hoc bong");
        }
        else
            System.out.println("Sinh vien " +getMaSV() +" Khong duoc hoc bong");

    }
}
