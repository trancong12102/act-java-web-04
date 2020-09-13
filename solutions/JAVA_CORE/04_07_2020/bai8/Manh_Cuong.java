/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap x: theo goc");
        float angle = sc.nextFloat();
        angle=(float) Math.toRadians(angle);
        float sin=0;
        int n=0;      
        float E=1; 
        
        double fact = 1;
        while(E>0.0001){
        int i=1;
        float x = 1;
        while(i<=2*n+1){
            fact *=i;
            x*=angle;
            i++;
        }
        E=(float) (Math.pow((-1),n)*(x/fact));
        sin+=E;
        n++;
        E=Math.abs(E);
        }
        System.out.println(""+sin);
    }
}
