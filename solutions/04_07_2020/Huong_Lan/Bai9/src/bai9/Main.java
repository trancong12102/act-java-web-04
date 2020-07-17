/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.util.Scanner;

/**
 * Lập chương trình tính cos(x) với độ chính xác 0.0001 theo công thức
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static int giaithua(int n) {
        int gt = 1;
        for (int i = 1; i <= n; i++) {
            gt = gt * i;
        }
        return gt;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float do_chinh_xac = (float) 0.0001, cosx, sinx;
        System.out.println("Nhap x:");
        float x = input.nextFloat();
        // doi tu do sang radian
        x = x * (float) (3.142 / 180.0);
        int i = 1;
        cosx = 1;
        float e;// do chinh xac
        do {
            e = (float) Math.pow(-1, i) * (float) Math.pow(x, 2 * i) / (float) giaithua(2 * i);
            cosx = cosx + e;
            i++;
        } while (do_chinh_xac <= Math.abs(e));
        //System.out.print(cosx);
        sinx = (float) Math.sqrt(1 - cosx * cosx);
        System.out.print(sinx);
    }

}
