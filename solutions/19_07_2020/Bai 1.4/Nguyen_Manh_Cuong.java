/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.lesson.pkg4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author green
 */
//Hint bài 4: Ý tưởng dành cho mảng random
//Thay vì dùng Scanner thì chúng ta sẽ thay bằng Random và thực hiện như bình thường 
public class ex4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int change;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap n= ");
        int n= sc.nextInt();
        int [] Arr= new int [n];
        for(int i=0;i<Arr.length;i++){
            Arr[i] = rd.nextInt();
        }
        for(int i=0;i<Arr.length-1;i++){
            for(int j=i+1;j<Arr.length;j++){
                if(Arr[i]>Arr[j]){
                    change = Arr[i];
                    Arr[i]=Arr[j];
                    Arr[j]=change;
                }
            }
                
        }
        System.out.println("Chuoi sap xep theo thu tu tang dan la");
        for(int i= 0;i<Arr.length;i++){
            System.out.printf("%d\t",Arr[i]);
        } 
        System.out.println("");
        System.out.println("Chuoi sap xep theo thu tu giam dan la");
        //dung ham for in nguoc lai ham tang dan ta se co ham giam dan. That thong minh. Haha
        for(int i=Arr.length-1;i>=0;i--){
            System.out.printf("%d\t",Arr[i]);
        }
    }
}
