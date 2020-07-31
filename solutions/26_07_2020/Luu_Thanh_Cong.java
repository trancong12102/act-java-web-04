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
public class Student {
    String maSinhVien;
    double diemTB;
    int tuoi;
    String lop;

    public Student() {
    }

    public Student(String maSinhVien, double diemTB, int tuoi, String lop) {
        this.maSinhVien = maSinhVien;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setMaSinhVien(String maSinhVien) {
        if(maSinhVien.length() == 8){
            this.maSinhVien = maSinhVien;
        }else{
            System.out.println("Nhap lai : ");
        }
    }

    public void setDiemTB(double diemTB) {
        if(diemTB > 0 && diemTB < 10){
            this.diemTB = diemTB;
        }else{
            System.out.println("Nhap lai : ");
        }
    }

    public void setTuoi(int tuoi) {
        if(tuoi > 18){
            this.tuoi = tuoi;
        }else{
            System.out.println("Nhap lai : ");
        }
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public void inputInfo(){
        Scanner s = new Scanner(System.in);
        System.out.println("nhap ma so : ");
        maSinhVien = s.nextLine();
        System.out.println("Nhap diem tb : ");
        diemTB = s.nextDouble();
        System.out.println("Nhap tuoi : ");
        tuoi = Integer.parseInt(s.nextLine());
        System.out.println("Nhap lop : ");
        lop = s.nextLine();
                
    }

    @Override
    public String toString() {
        return "Student{" + "maSinhVien=" + maSinhVien + ", diemTB=" + diemTB + ", tuoi=" + tuoi + ", lop=" + lop + '}';
    }
    
    public void showInfo(){
        System.out.println(toString());
    }
    
    public void hocBong(){
        if(diemTB > 8){
            System.out.println("duoc hoc bong");
        }else{
            System.out.println("khong duoc hoc bong");
        }
    }
}
