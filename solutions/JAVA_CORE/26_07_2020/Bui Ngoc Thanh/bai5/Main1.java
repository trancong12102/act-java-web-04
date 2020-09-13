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
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        TamGiac tg = new TamGiac();

        tg.testTamGiac();

        do {
            System.out.println("________TAM GIAC__________");
            System.out.println("1.Nhap canh tam giac");
            System.out.println("2.Kiem tra tam giac");
            System.out.println("3.Tinh dien tich tam giac");
            System.out.println("4.Tinh chu vi tam giac");
            System.out.println("5.Ket thuc");
            System.out.println("___________________________");
            System.out.println("");
            System.out.println("NHap lua chon");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    System.out.println("NHap cac canh cua tam giac.");
                    tg.input();
                    break;
                }
                case 2: {
                    tg.testTamGiac();
                    break;
                }
                case 3:{
                    tg.dienTich();
                }
                case 4:{
                    tg.chuVi();
                }
            }
        } while (chon != 5);
    }
}
