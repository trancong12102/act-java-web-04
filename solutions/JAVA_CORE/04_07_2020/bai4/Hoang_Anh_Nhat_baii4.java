/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai33;
import java.util.Scanner;


public class Bai33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO cvode application logic here
        int n,i,j;
        int max,min;
        int[] arr= new int[50];
        Scanner nhap= new Scanner(System.in);
        for ( i=0; i<100; i++)
        {System.out.println("Nhap :");
        arr[i]= nhap.nextInt();
        if (arr[i]==0)
        break;
          
        }
        max=arr[0];
         for (j=1; j<i ;j++)
         {if (max<arr[j])
          max= arr[j];
         
    }
     System.out.print("So lon nhat la: "+max);
        min=arr[0];
        for (j=1;j<i;j++)
        {if (min>arr[j])
            min=arr[j];
            }
        System.out.print("So nho nhat la: "+min);
        
}

}










































