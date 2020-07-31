/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;



/**
 *
 * @author vieth
 */
public class SoNguyenTo {
    private int a;

    public SoNguyenTo() {
    }

    public SoNguyenTo(int a) {
        boolean key=true;
        for (int i = 2; i<=Math.sqrt(a) ; i++) {
            if (a % i==0) {
            key=false;
            break;
        }   
        }
        if (key) {
            this.a=a;
        }
        else
        {
            System.out.println(a+"ko phai so nguyen to");
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
       if(isSoNguyenTo(a)) {
           this.a = a;
       } 
       else
       {
           System.out.println("Ko set");
       }
    }
    public boolean isSoNguyenTo(int x) {
        if (x<2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i==0) {
                return false;
                
            }
            
        }
        return true;
    }
    public int timSoNguyenToTiepTheo() {
        int dem=this.a+1;
        while(!isSoNguyenTo(dem)) {
            dem++;
        }
        return dem;
    }
}
