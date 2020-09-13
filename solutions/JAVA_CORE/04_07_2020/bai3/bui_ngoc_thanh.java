/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("NHap so can kiem tra la so nguyen to: ");
        int a = sc.nextInt();
        if(check(a))
        {
            System.out.println(a+" la so nguyen to");
        }
        else
        {
            System.out.println(a+" khong la so nguyen to");
        }
    }

 public static boolean check(int n)
{
    if (n < 2){
        return false;
    }       
     
    for (int i = 2; i < (n - 1); i++){
        if (n % i == 0){
            return false;
        }   
    }
     
    return true;
}

}
