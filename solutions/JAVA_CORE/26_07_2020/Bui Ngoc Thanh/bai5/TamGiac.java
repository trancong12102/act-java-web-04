/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author PANDA
 */
public class TamGiac {

    Scanner sc = new Scanner(System.in);
    private int canh_1, canh_2, canh_3;

    public TamGiac() {
    }

    public TamGiac(int canh_1, int canh_2, int canh_3) {
        this.canh_1 = canh_1;
        this.canh_2 = canh_2;
        this.canh_3 = canh_3;
    }

    public int getCanh_1() {
        return canh_1;
    }

    public void setCanh_1(int canh_1) {
        this.canh_1 = canh_1;
    }

    public int getCanh_2() {
        return canh_2;
    }

    public void setCanh_2(int canh_2) {
        this.canh_2 = canh_2;
    }

    public int getCanh_3() {
        return canh_3;
    }

    public void setCanh_3(int canh_3) {
        this.canh_3 = canh_3;
    }

    public void input() {

        System.out.println("Nhap canh 1:");
        this.canh_1 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap canh 2:");
        this.canh_2 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap canh 3:");
        this.canh_3 = Integer.parseInt(sc.nextLine());

        while (!(((canh_1 + canh_2) > canh_3) && ((canh_1 + canh_3) > canh_2) && ((canh_3 + canh_2) > canh_1))) {
            System.out.println("Nhap lai tam giac!");
            System.out.println("Nhap canh 1:");
            this.canh_1 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap canh 2:");
            this.canh_2 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap canh 3:");
            this.canh_3 = Integer.parseInt(sc.nextLine());
        }
    }

    public void testTamGiac() {
        if (canh_1 == canh_2 && canh_1 == canh_3) {
            System.out.println("Day la tam giac deu.");
        } else if (canh_1 == canh_2 || canh_3 == canh_2 || canh_3 == canh_1) {
            if (canh_1 * canh_1 == canh_2 * canh_2 + canh_3 * canh_3 || canh_2 * canh_2 == canh_1 * canh_1 + canh_3 * canh_3 || canh_3 * canh_3 == canh_2 * canh_2 + canh_1 * canh_1) {
                System.out.println("Day la tam giac vuong can");
            } else {
                System.out.println("Day la tam giac can");
            }
        } else {
            if (canh_1 * canh_1 == canh_2 * canh_2 + canh_3 * canh_3 || canh_2 * canh_2 == canh_1 * canh_1 + canh_3 * canh_3 || canh_3 * canh_3 == canh_2 * canh_2 + canh_1 * canh_1) {
                System.out.println("day la tam giac vuong");
            } else {
                System.out.println("Day la tam giac thuong");
            }
        }
    }
    public void chuVi(){
        System.out.println("Chu vi tam giac la: "+(canh_1+canh_2+canh_3));
    }
    public void dienTich(){
        double p =(canh_1+canh_2+canh_3)*0.5;
        System.out.println("Dien tich tam giac S = "+(Math.sqrt(p*(p-canh_1)*(p-canh_2)*(p-canh_3))));
        
    }
}
