/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;
import static java.lang.Math.pow;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Bai8 {

    private static double sin;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so x: ");
        double x = sc.nextDouble();
        System.out.println("nhap so n: ");
        int n = sc.nextInt(); while (Math.abs(sin-Math.sin(x))>0.0001)
        {
            double i = 0;
            sin=sin+Math.pow(-1, i)*Math.pow(x, 2*i+1)/gt(2*i+1);
            i++;
        }
        System.out.printf("Ket qua la:%08.4f\n",sin);
    }
        // TODO code application logic here

    private static double gt(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
