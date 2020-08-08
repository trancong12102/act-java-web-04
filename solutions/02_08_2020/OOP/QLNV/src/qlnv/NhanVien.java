/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnv;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private int Age;
    private String Name;
    private String DChi;
    private Double TL;
    private int STime;

    public NhanVien() {
    }

    public NhanVien(int Age, String Name, String DChi, Double TL, int STime) {
        this.Age = Age;
        this.Name = Name;
        this.DChi = DChi;
        this.TL = TL;
        this.STime = STime;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDChi() {
        return DChi;
    }

    public void setDChi(String DChi) {
        this.DChi = DChi;
    }

    public Double getTL() {
        return TL;
    }

    public void setTL(Double TL) {
        this.TL = TL;
    }

    public int getSTime() {
        return STime;
    }

    public void setSTime(int STime) {
        this.STime = STime;
    }
    
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);        
        System.out.println("Nhap ten: ");
        Name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Dia chi: ");
        DChi = sc.nextLine();
        System.out.println("Nhap Tien luong: ");
        TL = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap tong so gio lam: ");
        STime = Integer.parseInt(sc.nextLine());
        
    }
    
    public void printInfo(){
        System.out.println(Name+"\t"+Age+"\t"+DChi+"\t"+TL+"\t\t"+STime);
    }
    
    public double tinhThuong(){
        double thuong = 0;
        if(this.getSTime() >= 200){
            thuong = TL*20/100;
        }
        else if(this.getSTime() < 200 && this.getSTime() >= 100){
            thuong = TL*20/100;
        }
        else if(this.getSTime() < 100){
            thuong = 0;
        }
        return thuong;
    }
    
}
