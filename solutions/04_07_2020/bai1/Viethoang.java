/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docso;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Docso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so:");
        number=sc.nextInt();
        readNumber(number);
    }
    public static String read(int n) {
        switch(n) {
            case 1:
                return "mot";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bon";
            case 5:
                return "nam";
            case 6:
                return "sau";
            case 7:
                return "bay";
            case 8:
                return "tam";
            default:return "chin";
        }
    }
    public static void readNumber(int number) {
      int number1=number/10;
      int number2=number%10;
        if (number2==0) {
            if (number1==1) {
                System.out.println("muoi");
            }
            else {
                System.out.println(read(number1)+" muoi");
            }
        }
        else {
            if (number1!=1) {
                System.out.println(read(number1)+" muoi "+read(number2));
            }
            else {
                System.out.println("muoi"+" "+read(number2));
            }
            
        }
       
    }
    
}
