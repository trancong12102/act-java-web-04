/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Bai9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap x: theo goc");
        float angle = sc.nextFloat();
        angle=(float) Math.toRadians(angle);
        float cos=1;
        int n=1;      
        float E=1; 
        
        double fact = 1;
        while(Math.abs(E)>0.0001){
        int i=1;
        float x = 1;
        while(i<=2*n){
            fact *=i;
            x*=angle;
            i++;
        }
        E=(float) (Math.pow((-1),n)*(x/fact));
        cos+=E;
        n++;
        }
        System.out.println(""+(Math.abs(Math.sqrt(cos))));
    }
    
}
