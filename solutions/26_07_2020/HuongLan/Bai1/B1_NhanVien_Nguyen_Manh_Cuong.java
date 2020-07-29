/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day26072020;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class NhanVien {

    private String ten;
    private int tuoi;
    private String diachi;
    private double luong;
    private int giolam;

    public NhanVien() {

    }

    public NhanVien(String ten, int tuoi, String diachi, double luong, int giolam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
        this.diachi = diachi;
        this.giolam = giolam;
    }

    public String getten() {
        return this.ten;
    }

    public String setten(String ten) {
        this.ten = ten;
        return ten;
    }

    public int gettuoi() {
        return this.tuoi;
    }

    public int setten(int tuoi) {
        this.tuoi = tuoi;
        return tuoi;
    }

    public double getluong() {
        return this.luong;
    }

    public double setluong(double luong) {
        this.luong = luong;
        return luong;
    }

    public String getdiachi() {
        return this.diachi;
    }

    public String setdiachi(String diachi) {
        this.diachi = diachi;
        return diachi;
    }

    public int getgiolam() {
        return this.giolam;
    }

    public int setgiolam(int giolam) {
        this.giolam = giolam;
        return giolam;
    }

    void InputInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        this.ten = sc.nextLine();
        System.out.println("Nhap tuoi");
        this.tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dia chi");
        this.diachi = sc.nextLine();
        System.out.println("Nhap luong");
        this.luong = sc.nextDouble();
        System.out.println("Nhap gio lam");
        this.giolam = sc.nextInt();
    }

    void OutputInfor() {
        double tinhThuong = 0;
        System.out.println("Ten NV: " + this.ten);
        System.out.println("Tuoi: " + this.tuoi);
        System.out.println("Dia chi: " + this.diachi);
        System.out.println("Gio lam: " + this.giolam);
        System.out.println("Luong: " + this.luong);
        System.out.println("Tien Thuong: " + tinhThuong(this.luong, this.giolam));
    }

    double tinhThuong(double luong, int giolam) {
        if (giolam >= 200) {
            return this.luong * 0.2;
        } else if (giolam < 200 && giolam >= 100) {
            return this.luong * 0.1;
        } else {
            return 0;
        }

    }

}
