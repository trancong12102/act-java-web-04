/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.Scanner;

/**
 *
 * @author A
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] songuyen = new int[5];
         int[] ch3 = new int[5];
        int c=0,l=0,max=0,min=2^31-1,a;
        int i, j, t;
        System.out.println("nhap vao cac phan tu cua mang:");
                 for(i=0; i<songuyen.length; i++){
                     Scanner sc = new Scanner(System.in);
                    
                     songuyen[i] = sc.nextInt();
                     
                     
                     if(songuyen[i]%2==0){
                         c=c+songuyen[i];
                     }
                     if(songuyen[i]%2==1){
                         l=l+songuyen[i];   
                     }
                     if(songuyen[i]>max){
                         max=songuyen[i];
                     }
                     if(songuyen[i]<min){
                         min=songuyen[i];
                     }
                     if(songuyen[i]%3==0){
                         ch3[i]=songuyen[i];
                     }
                 }
         System.out.println("tong cac so chan la : "+c);
         System.out.println("tong cac so le la : "+l);
         System.out.println("phan tu lon nhat la: "+max);
         System.out.println("phan tu nho nhat la: "+min);
         System.out.println("nhung so chia het cho 3:" );
         for(i=0;i<ch3.length;i++){
             if(ch3[i]!=0)
             System.out.println(ch3[i]);
        }
         System.out.println("nhap vao so nguyen a: ");
         Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         for(t=0;t<songuyen.length;t++){
             if(songuyen[t]==a)
                 System.out.println("vi tri cua a la: "+t);
         }
        }
    }
