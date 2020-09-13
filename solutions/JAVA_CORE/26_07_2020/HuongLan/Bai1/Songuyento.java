/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapclass4;

import static java.lang.Math.sqrt;

/**
 *
 * @author Dell
 */
public class Songuyento {
    private int a;

    public Songuyento() {

    }

    public Songuyento(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void Songuyento(int x) {
        if (isSonguyento(x)) {
            a = x;
            System.out.printf("%d la so nguyen to", a);
        } else {
            System.out.println("x khong phai so nguyen to");
        }
    }

    public void timsoNguyentotieptheo() {
        int i = 1;
        int next = 0;
        while (isSonguyento(a)) {
            next = a + i;
            if (isSonguyento(next)) {
                System.out.println("  ");
                System.out.printf("%d la so nguyen to tiep theo", next);
                break;
            }
            i++;
        }

    }

    public boolean isSonguyento(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i < sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;

    }
}
    
