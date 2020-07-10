
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class bai7 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int f0=1,f1=1,fn; 
        int k; 
        System.out.println("Nhap vao so n");
        k = Integer.parseInt(input.nextLine().trim()); 
        
        for (int i = 0; i < k; i++) {
            if (i == 0 || i == 1) {
                System.out.printf("1\t");
            } else {
                fn = f0 + f1;
                System.out.printf("%d\t", fn);
                f0 = f1;
                f1 = fn;
            }

        
        
    }

       
       
        
    }
}
