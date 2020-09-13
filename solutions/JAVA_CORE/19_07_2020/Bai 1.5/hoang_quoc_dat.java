/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] vectoA = new int[3];
        int[] vectoB = new int[3];
        System.out.println("Nhap toa do vecto A : ");
        System.out.println("xA = : ");
        vectoA[0] = sc.nextInt();
        System.out.println("yA = : ");
        vectoA[1] = sc.nextInt();
        System.out.println("zA = : ");
        vectoA[2] = sc.nextInt();
        System.out.println("Nhap toa do vecto B : ");
        System.out.println("xB = : ");
        vectoB[0] = sc.nextInt();
        System.out.println("yB = : ");
        vectoB[1] = sc.nextInt();
        System.out.println("zB = : ");
        vectoB[2] = sc.nextInt();
        //Tong 2 vecto la :
        int[] vectoC = new int[3];
        System.out.println("Tinh tong cua 2 vecto :");
        for(int i=0;i<3;i++)
        {
            vectoC[i]=vectoA[i]+vectoB[i];
        }
        System.out.printf("vecto C la tong cua 2 vec to la : ( %d, %d, %d)\n",vectoC[0],vectoC[1],vectoC[2]);
        //tinh tich vo huong cua 2 vecto A va B
        int tich=0;
        for(int i=0; i<3 ; i++)
            tich+= vectoA[i]*vectoB[i];
        System.out.printf("Tich vo huong cua 2 vecto = %d\n",tich);

    }
    
}
