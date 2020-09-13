/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;
import java.util.Random;


public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int j;
        float tam;
        float[] day=new float[15];
        int i;
        Random ran=new Random();
        for ( i = 0; i < 15; i++) {
            day[i]=ran.nextFloat();
           System.out.printf("\t%f",day[i]);
        }
        for (i=0; i<14; i++)
            for (j=i+1; j<15; j++)
         if (day[j] < day[i])
            {
            tam = day[i];
            day[i] = day[j];
            day[j] = tam;
}
        System.out.print("\nDay sau khi duoc sap xep la:");
        for(i=0;i<15;i++)
        {System.out.printf("\t%f",day[i]);
    }
    
}
}

