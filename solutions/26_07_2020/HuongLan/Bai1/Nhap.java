/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Nhap {
    Thongtin t = new Thongtin();

    public void input() {
        System.out.print("1.la` hoc vien cua khoa HDSE(y/n):>");
        t.setHocvien(new Scanner(System.in).nextLine());
        System.out.print("2.so diem tong ket:>");
        t.setDiem(new Scanner(System.in).nextInt());
        System.out.print("3.so lan vi pham noi quy:>");
        t.setVipham(new Scanner(System.in).nextInt());
        System.out.print("4.so lan thi lai:>");
        t.setSolanthi(new Scanner(System.in).nextInt());
    }

    public void getHocbong() {
        boolean temp = false;
        System.out.println("la hoc vien :" + t.getHocvien());
        System.out.println("so diem tong ket:" + t.getDiem());
        System.out.println("so lan vi pham:" + t.getVipham());
        System.out.println("so lan thi lai:" + t.getSolanthi());
        if (t.getHocvien().compareTo("y") == 0 && t.getDiem() >= 75 && t.getVipham() == 0 && t.getSolanthi() == 0) {
            temp = true;
        }
        if (temp == true) {
            System.out.println("đã dành đc học bổng");
        }
        if (temp == false) {
            System.out.println("khong dành đc học bổng");
        }
    }
}
