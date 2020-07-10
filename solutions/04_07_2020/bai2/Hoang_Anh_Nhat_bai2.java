/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.util.Scanner;


public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,GT=1;
        Scanner nhap= new Scanner(System.in);
        System.out.print("Nhap vao so nguyen N:");
        n = nhap.nextInt();
        for (int i = 1; i <= n; i++) {
            GT*=i;
        }
        System.out.print("GT="+GT);
    }
    
}



