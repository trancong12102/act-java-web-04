/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.lesson.pkg4;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so phan tu muon nhap");
        int n = sc.nextInt();
        System.out.println("Nhap a= ");
        int a = sc.nextInt();
        int[] intArr = new int [n];
        for (int i=0;i<intArr.length;i++){
            System.out.printf("Nhap phan tu thu %d: ", i+1);
            intArr[i]=sc.nextInt();
        }
        for (int i=0;i<intArr.length;i++)
        {
            if(intArr[i]==a)
            {
                System.out.println("So ma ban muon tim o vi tri thu: "+(i+1));
            }      
        }  
    }  
}
