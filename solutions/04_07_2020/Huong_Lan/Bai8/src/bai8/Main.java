/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float do_chinh_xac = (float) 0.0001, sinx, mau_so, tinh_sin;
        System.out.println("Nhap n:");
        float n = input.nextFloat();
        // doi tu do sang radian
        n = n * (float) (3.142 / 180.0);
        //Gia tri dung cua sin x
        tinh_sin = (float) Math.sin(n);
        int i = 1;
        sinx = n;
        float x1 = n;
        do {
            mau_so = 2 * i * (2 * i + 1);
            x1 = -x1 * n * n / mau_so;
            sinx = sinx + x1;
        } while (do_chinh_xac <= tinh_sin - sinx);
        System.out.print(sinx);
    }

}
