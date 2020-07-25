/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baijava1;
import java.util.Scanner;


public class Baijava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Tong=0, Tongle=0, Tongchan=0;
        Scanner nhap= new Scanner(System.in);
        int[] day= new int[5];
        for (int i = 0; i <5; i++) {
            System.out.printf("Nhap vao phan tu thu %d: ",i);
            day[i]=nhap.nextInt();
        }
        for (int i=0; i<5; i++){
            System.out.printf("\nPhan tu thu %d =%d",i,day[i]);
                    Tong+=day[i];
                    if (day[i]%2==0)
                        Tongchan+=day[i];
                    else Tongle+=day[i];
        }
        System.out.printf("\nTong cac so trong day la:%d\nTong cac so chan trong day la:%d\nTong cac so le trong day la:%d",Tong,Tongchan,Tongle);
    }
    
}










