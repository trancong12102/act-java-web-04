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
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("Nhập 2 số nguyên a và b: ");
        int a=input.nextInt();
        int b= input.nextInt();
        int UCLN = 0 ;
        int BCNN=a*b;
        int i;
        if (a-b>=0){
           for(i=1;i<=b;i++){
               if(a%i==0&b%i==0){
                   UCLN=i;
               }
           } 
        }
        else{
            for(i=1;i<=a;i++){
               if(a%i==0&b%i==0){
                   UCLN=i;
                }
            }
    
        }
        
        for(i=1;i<=BCNN;i++){
            if(i%a==0&i%b==0){
                BCNN=i;
            }
        }
        System.out.println("ước chung lớn nhất là " +UCLN);
        System.out.println("bội chung nhỏ nhất là "+BCNN);

    }
}
