/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int temp = 0;
        int[] mang = new int[15];
        for (int i = 0; i < mang.length; i++) {
            mang[i] = r.nextInt();
        }
        System.out.println("Cac phan tu trong mang: ");
        for (int m1 : mang) {
            System.out.println(" " +m1);
        }
        System.out.println("Sap xep tang dan: ");
        for (int i = 0; i < mang.length-1; i++) {
            for (int j = i+1; j < mang.length; j++) {
                temp = mang[0];
                if(mang[i] > mang[j]){
                temp = mang[j];
                mang[j] = mang[i];
                mang[i] = temp;
                }
            }
        }
        for (int m1 : mang) {
            System.out.println(" " +m1);
        }
        
    }
    
}
