/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {
    private String Masinhvien;
    private double Diemtrungbinh;
    private int Tuoi;
    private String Lop;
public Student(){
}
public Student(String Masinhvien,double Diemtrungbinh, int Tuoi, String Lop){
    this.Masinhvien=Masinhvien;
    this.Diemtrungbinh=Diemtrungbinh;
    this.Tuoi=Tuoi;
    this.Lop=Lop;
}
public void setMasinhvien(String Masinhvien){
    this.Masinhvien=Masinhvien;
}
public String getMasinhvien(){
    return Masinhvien;
}
public void setDiemtrungbinh(double Diemtrungbinh){
    this.Diemtrungbinh=Diemtrungbinh;
}
public double getDiemtrungbinh(){
    return Diemtrungbinh;
}
public void setTuoi(int Tuoi){
    this.Tuoi=Tuoi;
}
public int getTuoi(){
    return Tuoi;
}
public void setLop(String Lop){ 
    this.Lop=Lop;
}
public String getLop(){
    return Lop;
}
public void inputInfo(){
    Scanner sc=new Scanner(System.in);
    do{
        System.out.println("Nhập Mã sinh vien(8 kí tự): ");
        Masinhvien=sc.nextLine();
    }while(this.Masinhvien.length() !=8);
    do{
        System.out.println("Nhập điểm trung bình( từ 0.0 - 10.0): ");
        Diemtrungbinh=sc.nextDouble();
    }while(this.Diemtrungbinh>10.0 || this.Diemtrungbinh<0.0);
    do{
        System.out.println("Nhập Tuổi (>= 18) ");
        Tuoi=sc.nextInt();
    }while(this.Tuoi<18);
    sc.nextLine();
    do{   
        System.out.println("Nhập Lớp (kí tự đầu là A hoặc C): ");
        this.Lop=sc.nextLine();
    }while(this.Lop.charAt(0)!= 'A' && this.Lop.charAt(0) != 'C');
     
}
public void showInfo(){
    System.out.println("-------------------");
    System.out.println("Thông tin sinh viên");
    System.out.println("Mã sinh viên > "+Masinhvien);
    System.out.println("Điểm trung bình > "+Diemtrungbinh);
    System.out.println("Tuổi > "+Tuoi);
    System.out.println("Lớp > "+ Lop);
}
public void Hocbong(){
    if(Diemtrungbinh>8.0){
        System.out.println("Được học bổng");
    }else{
        System.out.println("Không được học bổng");
    }
}
}
