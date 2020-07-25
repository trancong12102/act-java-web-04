/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.util.Scanner;


public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner nhap= new Scanner(System.in);
        int[] day= new int[5];
        for (int i = 0; i <5; i++) {
            System.out.printf("Nhap vao phan tu thu %d: ",i);
            day[i]=nhap.nextInt();
        }
        int max=0, min=day[0];
        for (int i = 0; i <5; i++){
            if(day[i]>max) max=day[i];
        }
        for (int i=1;i<5;i++){
            if (day[i]<min) min=day[i];
        }
        System.out.printf("\nSo lon nhat day la:%d\nSo be nhat day la:%d\nCac so chia het cho 3 trong day la:",max,min);
        
        for (int i = 0; i <5; i++)
        {if (day[i]%3==0) {System.out.printf("\t "+day[i]);
        
    }
    
    
}


    }
}
