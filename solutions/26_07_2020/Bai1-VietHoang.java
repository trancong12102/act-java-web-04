/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nhanVien= new NhanVien();
        inputInfo(nhanVien);
        printInfo(nhanVien);
        System.out.printf("%8.3f",nhanVien.tinhThuong());
    }
    public static void inputInfo(NhanVien nhanVien) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        nhanVien.setTen(sc.nextLine());
        System.out.println("Nhap dia chi:");
        nhanVien.setDiaChi(sc.nextLine());
        System.out.println("Nhap tuoi:");
        nhanVien.setTuoi(sc.nextInt());
        System.out.println("Nhap luong:");
        nhanVien.setTienLuong(sc.nextDouble());
        System.out.println("Nhap so gio lam:");
        nhanVien.setTongSoGioLam(sc.nextInt());
        
        
    }
    public static void printInfo(NhanVien nv) {
        System.out.println("Thong tin nhan vien:");
        System.out.printf("|%30s|%5s|%10s|%20s|%20s\n","ten","tuoi","dia chi","luong","so gio lam");
        System.out.printf("|%30s|%5d|%10s|%20f|%20d\n",nv.getTen(),nv.getTuoi(),nv.getDiaChi(),nv.getTienLuong(),nv.getTongSoGioLam());
    }
}
