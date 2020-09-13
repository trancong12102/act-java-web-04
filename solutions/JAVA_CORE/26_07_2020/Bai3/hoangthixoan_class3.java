/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main311;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class Hocbong {

    private boolean dk;
    private double diemtk;
    private int noiquy;
    private int test;

    public Hocbong() {
    }

    public Hocbong(boolean dk, double diemtk, int noiquy, int test) {
        this.dk = dk;
        this.diemtk = diemtk;
        this.noiquy = noiquy;
        this.test = test;
    }

    public boolean isDk() {
        return dk;
    }

    public void setDk(boolean dk) {
        this.dk = dk;
    }

    public double getDiemtk() {
        return diemtk;
    }

    public void setDiemtk(double diemtk) {
        this.diemtk = diemtk;
    }

    public int getNoiquy() {
        return noiquy;
    }

    public void setNoiquy(int noiquy) {
        this.noiquy = noiquy;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sinh vien co dang ki khoa HDSE:");
        dk = sc.nextBoolean();
        System.out.print("Diem tong ket cua sinh vien la:");
        diemtk = sc.nextDouble();
        sc.nextLine();
        System.out.print("So lan vi pham noi quy:");
        noiquy = Integer.parseInt(sc.nextLine());
        System.out.print("So lan thi la:");
        test = sc.nextInt();

    }

    public void Kiemtra() {
        if (dk == true && diemtk >= 7.5 && noiquy == 0 && test == 1) {
            System.out.println("Sinh vien co dat hoc bong ");
        } else {
            System.out.println("Sinh vien khong dat hoc bong ");
        }

    }

}
