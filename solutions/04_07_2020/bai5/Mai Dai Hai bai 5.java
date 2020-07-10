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
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.printf("nhập số nguyên n : ");
        float n= input.nextInt();
        float S=0;
        //tính cau 5.1
        for(float i=0;i<n;i++){
            S=S+1/(1+i);
        }
        System.out.println("Tổng S1= "  +S);
        //tính cau 5.2
        S=0;
        for(float i=1;i<=n;i++){
            S=S+i;
        }
        System.out.println("Tổng S2= "  +S);
        //tính cau 5.3
        S=0;
        for(float i=1;i<=n;i++){
            S=S+(i*i);
        }
        System.out.println("Tổng S3= "  +S);
        //tính cau 5.4
        S=0;
        for(float i=1;i<=n;i++){
            S=S+1/(2*i);
        }
        System.out.println("Tổng S4= "  +S);
        //tính cau 5.5
        S=1;
        for(float i=1;i<=n;i++){
            S=S+1/(2*i+1);
        }
        System.out.println("Tổng S5= "  +S);
        //tính cau 5.6
        S=0;
        for(float i=1;i<=n;i++){
            S=S+1/(i*(i+1));
        }
        System.out.println("Tổng S6= "  +S);
        //tính cau 5.7
        S=0;
        for(float i=0;i<=n;i++){
            S=S+(2*i+1)/(2*i+2);
        }
        System.out.println("Tổng S7= "  +S);
        //tính cau 5.8
        S=0;
        int l=1;
        for(int i=1;i<=n;i++){
            l=l*i;
            S=S+l;
        }
        System.out.println("Tổng S8= "  +S);
        //tính cau 5.9
        S=0;
        System.out.printf(" nhập giá trị x cần tính: ");
        int x= input.nextInt();
        int j;
        j=x;
        for(float i=1;i<=n;i++){
            S=S+j;
            j=j*x;
        }
        System.out.println("Tổng S9= "  +S);
        //tính cau 5.10
        S=0;
        j=1;
        for(float i=1;i<=n;i++){
           j=j*x*x;
           S=S+j;
        }
        System.out.println("Tổng S10= "  +S);
        //tính cau 5.11
        S=0;
        j=x;
        for(float i=0;i<=n;i++){
            S=S+j;
            j=j*x*x;
        }
        System.out.println("Tổng S11= "  +S);
        //tính cau 5.12
        S=0;
        float k=0;
        for(float i=1;i<=n;i++){
            k=k+i;
            S=S+1/k;
        }
        System.out.println("Tổng S12= "  +S);
        
       
    }
    
}
