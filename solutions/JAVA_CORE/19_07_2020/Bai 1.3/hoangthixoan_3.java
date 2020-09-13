/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n=Integer.parseInt(sc.nextLine());
        
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("gia tri phan tu cua mang: " );
            b[i]=sc.nextInt();
             }
        System.out.print("Nhap so nguyen tu ban phim: ");
        int a = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(b[i]==a){
                System.out.print("vi tri cua no trong mang la: "+i);
            }else{
                System.out.print("khong xuat hien trong mang");
            }
            
        }
        
        
    }
    
}
