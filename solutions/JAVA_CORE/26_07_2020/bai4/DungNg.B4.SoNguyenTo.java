/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt4;

import java.util.Scanner;

/**
 *
 * @author Dung Ng
 */
public class SoNguyenTo {
     private int a;

    Scanner input = new Scanner(System.in);

    public SoNguyenTo(int a) {
        this.a = a;
    }

    SoNguyenTo() {
    }

    public int SoNguyenTo(int x) {
        if (this.isSoNguyenTo(x)) {
            this.a = x;
        } else {
            System.out.println(x+" khong phai la so nguyen to, khong luu tru");
        }
        return x;
    }

    boolean isSoNguyenTo(int x) {
        if (x < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(x);
        for (int i = 2; i <= squareRoot; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    int timSoNguyenToTiepTheo() {
        if (this.isSoNguyenTo(a)) {
            for (int i = (a + 1); i < Integer.MAX_VALUE; i++) {
                if (this.isSoNguyenTo(i)) {
                    System.out.println("so nguyen to lien ke sau a la: "+i);
                    break;
                }
            }
        }
        return a;
    }

    public int getSoNguyenTo() {
        return this.a = a;
    }

    public void setSoNguyenTo(int a) {
        if (isSoNguyenTo(a)) {
            this.a = a;
        } else {
            System.out.println("khong set");
        }
    }
}
