/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_10;

/**
 *
 * @author Admin
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class bai_10 {
       public static void main(String[] args) {
         
        int n;
        boolean res;
        Scanner sc = new Scanner(System.in);;
        do {
            System.out.print("nhap n = ");
           
            n = sc.nextInt();
        }while(n <= 0);
         
        res = kiemTraDoiXung(n);
        if(res) {
            System.out.println(n + " la so doi xung");
        }
        else {
            System.out.println(n + " khong la so doi xung");
        }
         
        sc.close();
    }
     
    public static boolean kiemTraDoiXung(int n) {
        int res = 0, temp = n;
        while(temp > 0) {
            res = res*10 + temp % 10;
            temp /= 10;
        }
        if(res == n) {
            return true;
        }
        else {
            return false;
        }
    }
    
}

