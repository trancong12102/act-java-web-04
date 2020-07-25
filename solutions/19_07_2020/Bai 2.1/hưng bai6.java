/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;
import java.util.Scanner;


public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap=new Scanner(System.in);
       
        int matran[][]= new int[3][3];
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
            {System.out.printf("Nhap vao phan tu day[%d][%d]",i,j);
            matran[i][j]=nhap.nextInt();
            }
        for (int i=0;i<3;i++)
        { for (int j=0;j<3;j++)
            {System.out.printf("\t%d",matran[i][j]);
    }
        System.out.printf("\n");
    
}
        for (int i=0;i<3;i++)
        { 
            int s=0;
            {  for (int j=0;j<3;j++)
            s+=matran[i][j];
            
            }
            System.out.printf("\nTong hang thu %d la:%d",i+1,s);


    }for (int j=0;j<3;j++)
        { 
            int s=0;
            {  for (int i=0;i<3;i++)
            s+=matran[i][j];
            
            }
            System.out.printf("\nTong hang thu %d la:%d",i+1,s);

    }}}
