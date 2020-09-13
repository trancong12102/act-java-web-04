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
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int S = 1;
        System.out.println("nhập số nguyên dương n");
        int n = input.nextInt();
        int i;
        for (i=1;i<=n;i++)
        {
            S*=i;
        }
        System.out.println(n+"!="+S);
    }
    
}
