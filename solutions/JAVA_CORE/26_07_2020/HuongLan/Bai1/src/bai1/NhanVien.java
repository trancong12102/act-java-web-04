/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class NhanVien {
//Khai bao cac thuoc tinh cua class SinhVien

    private String name;
    private int age;
    private String address;
    private double luong;
    private int giolamviec;
// Hàm tạo k tham số

    NhanVien() {
        name = "LanHuong";
        age = 18;
        address = "Tran Phu";
        luong = 7.8;
        giolamviec = 20;
    }
// Hàm tạo đầy đủ tham số

    NhanVien(String name,
            int age,
            String address,
            double luong,
            int giolamviec) {
        this.name = name;
        this.age = age;
        this.giolamviec = giolamviec;
        this.luong = luong;
    }
// Cac ham get/set

    String getTen() {
        return name;
    }

    void setTen() {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge() {
        this.age = age;
    }

    String getAddress() {
        return address;
    }

    void setAddress() {
        this.address = address;
    }

    double getLuong() {
        return luong;
    }

    void setLuong() {
        this.luong = luong;
    }

    int getGiolamviec() {
        return giolamviec;
    }

    void setGiolamviec() {
        this.giolamviec = giolamviec;
    }

    void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        name = sc.nextLine();
        System.out.println("Nhap tuoi:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi:");
        address = sc.nextLine();
        System.out.println("Nhap luong:");
        luong = sc.nextFloat();
        System.out.println("Nhap gio lam viec:");
        giolamviec = sc.nextInt();
    }

    void printInfo() {
        System.out.println("==========Thong tin nhan vien======");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi :" + address);
        System.out.println("Luong :" + luong);
        System.out.println("Gio lam viec: " + giolamviec);
        System.out.println("Thuong: " + tinhThuong());
        System.out.println("Tong luong la: " + (tinhThuong() + luong));
    }

    double tinhThuong() {
        double thuong;
        if (giolamviec >= 200) {
            thuong = luong * 20 / 100;
        } else if (giolamviec >= 100) {
            thuong = luong * 0.1;
        } else {
            thuong = 0;
        }
        return thuong;
    }
}
