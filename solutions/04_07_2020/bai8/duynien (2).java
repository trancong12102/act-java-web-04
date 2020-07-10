/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;
import java.util.*;
/**
 *
 * @author oOOo
 */
public class bai8 {
    public static void main(String[] args) {
        double tu1,tu2,tu3,tutong;
        double s = 0;
        int mau=1;
        System.out.println("nhap n:");
        int n=new Scanner(System.in).nextInt();
        System.out.println("nhap x:");
        int x=new Scanner(System.in).nextInt();
        for(int i=1;i<=n;i++){
            tu1= (double) -Math.pow(1,i);
            tu2= 2*i;
            tu3=tu2+1;
            for(int j=1;j<=tu3;j++){
              mau*=j;
            }
            tutong=tu1*Math.pow(x,tu3);
            s+=tutong/mau;
        }
        System.out.println(s);
    }
}
