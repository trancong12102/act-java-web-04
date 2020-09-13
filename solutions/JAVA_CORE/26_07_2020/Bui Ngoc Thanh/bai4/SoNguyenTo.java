/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author Admin
 */
public class SoNguyenTo {

    private int soNguyenTo;

    public SoNguyenTo() {
    }

    public SoNguyenTo(int x) {
        if (isSoNguyenTo(x)) {
            this.soNguyenTo = x;
        } else {
            System.out.println("x không phải là số nguyên tố, không lưu trữ. ");
        }
    }

    public int getSoNguyenTo() {
        return soNguyenTo;
    }

    public void setSoNguyenTo(int x) {
        if (isSoNguyenTo(x)) {
            this.soNguyenTo = x;
        } else {
            System.out.println("khong set");
        }
    }

    boolean isSoNguyenTo(int x) {
        if (x < 2) {
            return false;
        }
        int sque = (int) Math.sqrt(x);
        for (int i = 2; i <= sque; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    int timSoNguyenToTiepTheo() {
        int x = soNguyenTo + 1 ;
            while (!isSoNguyenTo(x)) {
            x++;
        }
        return x;
    }
}
