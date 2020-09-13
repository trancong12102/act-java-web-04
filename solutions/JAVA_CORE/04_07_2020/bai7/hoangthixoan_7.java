/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjava6;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class newjava_7 {
    public static void main(String[] args) {
        Scanner fbnc = new Scanner(System.in);
        System.out.print("Nhap n>>");
        int n = fbnc.nextInt();
        System.out.printf("so dau tien cua day la %d", n);
        for(int i=0; i < n;i++){
            System.out.print(fibnc(i)+"");
        }
    } 
    public static int fibnc(int n){
        int f0=1;
        int f1=1;
        int fn=1;
        if(n >=1){
            if(n == 0||n ==1){
                return n;
            } else{
                for(int i=2;i<n;i++){
                    f0=f1;
                    f1=fn;
                    fn=f1+f0;
                }
            }
        } else 
            return 1;
       return fn; 
    }
}
