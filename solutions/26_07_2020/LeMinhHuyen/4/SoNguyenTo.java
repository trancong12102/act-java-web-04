/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass4;

import java.util.Scanner;

/**
 *
 * @author DaiPhongPC
 */
public class SoNguyenTo {

    private int a;

    SoNguyenTo() {

    }

    SoNguyenTo(int a) {
        this.a = a;

    }

    public void SoNguyenTo(int a) {
        if (isSoNguyenTo(a)) {
            this.a = a;
        }
    }

    public int getA() {
        if (a == 0) {
            System.out.println("Khong set");
        }
        return a;
    }

    public void setA(int a) {
        if (isSoNguyenTo(a)) {
            this.a = a;
        }
    }

    public boolean isSoNguyenTo(int x) {
        int count = 0;
        for (int i = 0; i < x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }

    }

    public int timSoNguyenToTiepTheo() {
        int c = this.a;
        while (!isSoNguyenTo(c)) {
            c++;
        }
        return c;
    }

}
