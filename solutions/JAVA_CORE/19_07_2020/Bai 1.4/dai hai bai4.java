/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt19_7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author topmu
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số các giá trị của Mảng: ");
        int n= input.nextInt();
        int A[] = new int[n];
        System.out.print("Chọn các giá trị của Mảng: ");  
        Random generator = new Random();
        int tg;
        for (int i=0;i<A.length;i++){
            A[i]=generator.nextInt();
           System.out.print("___"+A[i]); 
        }
        int m=0;
        int k=0;
        System.out.println("\nThứ tự Mảng tăng dần: ");
        // giảm dần dần
        for (int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if (A[i]>A[j]){
                    tg=A[i];
                    A[i]=A[j];
                    A[j]=tg;
                }
            }   
        }
        for (int i=0;i<A.length;i++){
            System.out.println(+A[i]);
        }
        System.out.println("\nThứ tự Mảng giảm dần: ");
        // Tăng dần
        for (int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if (A[i]<A[j]){
                    tg=A[i];
                    A[i]=A[j];
                    A[j]=tg;
                }
            }   
        }
        for (int i=0;i<A.length;i++){
            System.out.println(+A[i]);
        }
        // Đếm số chẵn số lẻ
        for (int i=0;i<A.length;i++){
            if (A[i]%2==0){
                m=m+1;    
            }
            else{k=k+1;
            }
        }
        System.out.println("Số số lẻ trong mảng là: "+k);
        System.out.println("Số số chẵn trong mảng là: "+m);
        
    }
    
}
