/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b10_6;

import java.util.Scanner;

/**
 *
 * @author topmu
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("nhập số nguyên n lớn hơn 2: ");
        int n=input.nextInt();
        int j=1;
        int N;
        int k=1;
        System.out.printf("tất cả dãy fibonaci là: 1,1,");
        for(int i=1; i<=n-1;i++){
            N=j+k;
            System.out.printf(N+",");   
            j=k;
            k=N;
            
        }
    }
    
        
    }
    

