/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import java.util.Random;

/**
 *
 * @author A
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,c=0,l=0;
        Random rd = new Random();
        int[] mangrandom = new int[15];
        System.out.println("mảng gồm 15 số nguyên ngẫu nhiên");
        for (i = 0; i < mangrandom.length ; i++) {
            System.out.println(rd.nextInt());
            mangrandom[i]=rd.nextInt();
        }
        int a = mangrandom[0];
        for (i = 0 ; i < mangrandom.length - 1; i++) {
            for (j = i + 1; j < mangrandom.length; j++) {
                if (mangrandom[i] > mangrandom[j]) {
                    a = mangrandom[j];
                    mangrandom[j] = mangrandom[i];
                    mangrandom[i] = a;
                }
            }
        }
        System.out.println("sap xep tang dan");
        for (i = 0; i < mangrandom.length; i++) {
            System.out.println(mangrandom[i] + " ");
            if(mangrandom[i]%2==0)
                c=c+1;
            if(mangrandom[2]%2!=0)
                l=l+1;
        }
        System.out.println("so so chan= "+c);
        System.out.println("so so le= "+l);
    }
}