/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai31;
import java.util.Scanner;

public class Bai31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner nhap= new Scanner(System.in);
        System.out.print("Nhap vao so n");
        n = nhap.nextInt();
        if (n<4) {System.out.print("n la so nguyen to");
                }
        else for (int i = 2; i <=Math.sqrt(n); i++) 
            if (n%i==0){
                System.out.print("n khong phai la so nguyen to");
                break;
            }
            else {System.out.print("n la so nguyen to");}
    
    
}
}




