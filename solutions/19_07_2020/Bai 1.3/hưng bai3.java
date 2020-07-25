/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.util.Scanner;


public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
         Scanner nhap= new Scanner(System.in);
         System.out.println("Nhap vao so nguyen a");
         a=nhap.nextInt();
        int[] day= new int[5];
        for (int i = 0; i <5; i++) {
            System.out.printf("Nhap vao phan tu thu %d: ",i);
            day[i]=nhap.nextInt();
        }
        for (int i = 0; i <5; i++){
            if (day[i]==a){
                System.out.printf("So nguyen a xuat hien o vi tri:%d",i);
                continue;
            }
            
        }
        
    }
    
}


