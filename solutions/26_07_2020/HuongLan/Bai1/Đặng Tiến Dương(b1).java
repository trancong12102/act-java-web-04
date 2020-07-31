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
public class NhanVien {
    private String Ten;
    private int Tuoi;
    private String Diachi;
    private double Tienluong;
    private int Tonggiolam;
public NhanVien(){
}
public NhanVien(String Ten,int Tuoi,String Diachi, double Tienluong,int Tonggiolam){
    this.Ten=Ten;
    this.Tuoi=Tuoi;
    this.Diachi=Diachi;
    this.Tienluong=Tienluong;
    this.Tonggiolam=Tonggiolam;
}

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public double getTienluong() {
        return Tienluong;
    }

    public void setTienluong(double Tienluong) {
        this.Tienluong = Tienluong;
    }

    public int getTonggiolam() {
        return Tonggiolam;
    }

    public void setTonggiolam(int Tonggiolam) {
        this.Tonggiolam = Tonggiolam;
    }

public void inputInfo(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhập Tên: ");
    Ten=sc.nextLine();
    System.out.println("Nhập Tuổi: ");
    Tuoi=Integer.parseInt(sc.nextLine());
    System.out.println("Nhập Địa chỉ: ");
    Diachi=sc.nextLine();
    System.out.println("Nhập Tiền Lương: ");
    Tienluong=Integer.parseInt(sc.nextLine());
    System.out.println("Nhập Tổng số giờ làm: ");
    Tonggiolam=Integer.parseInt(sc.nextLine());
}
public void printInfo(){
    System.out.println("Thông tin nhân viên");
    System.out.println("Tên > "+Ten);
    System.out.println("Tuoi > "+Tuoi);
    System.out.println("Địa chỉ > "+Diachi);
    System.out.println("Tiền Lương > "+Tienluong);
    System.out.println("Tổng số giờ làm > "+Tonggiolam );
    double tinhThuong;
    if(Tonggiolam>200){
        tinhThuong=Tienluong*0.2;
    }else if(Tonggiolam<200 && Tonggiolam>=100){
        tinhThuong=Tienluong*0.1;
    }else{
        tinhThuong=0;
    }
    System.out.println("Số tiền thưởng là: "+tinhThuong);
}


}
