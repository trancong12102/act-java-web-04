/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author green
 */
public final class SoNguyenTo {

    private int a;

    public SoNguyenTo() {
    }

    public SoNguyenTo(int x) {
        if (isSoNguyenTo(x) == true) {
            this.a = x;
        } else {
            System.out.println("X khong phai so nguyen to, khong luu tru");
        }
    }

    int timSNTTiep() {
        int next= this.a-1;
        for (int i = next; i >= 2; i--) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i%j==0) {
                    count++;
                }
            }
            if(count==1){
                System.out.println("So nguyen to tiep theo a la: "+i);
                break;
            }
        }
        return 0;
    }

    boolean isSoNguyenTo(int x) {
        int count = 0;
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
       if (count == 1) {
            return true;
        } else {
            return false;
        }

    }
    public int geta(){
        return this.a;
    }
    public int seta(int a){
        if(isSoNguyenTo(a)==true){
            System.out.println(""+a);
            this.a =a;
            return a;
        }else{
            System.out.println("Khong gan");
            return 0;
        }
    }
}
