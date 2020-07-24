/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1_2 {
    public static void main(String[] args) {
        int[] mangSonguyen=new int[5];
        Scanner input = new Scanner(System.in);
        int max=mangSonguyen[0];
        int min=mangSonguyen[0];
        int chiahet3=mangSonguyen[0];
        for(int i=0;i<mangSonguyen.length;i++){
            System.out.println("Phần tử trong mảng là: ");
            mangSonguyen [i] =input.nextInt();
            if(max<mangSonguyen[i]){
                max = mangSonguyen[i];
            }if(min > mangSonguyen[i]){
                min = mangSonguyen[i];
            }if(mangSonguyen[i]%3==0){
                chiahet3=mangSonguyen[i];
            }
        }
        
        System.out.println("Số lớn nhất là:"+max);
        System.out.println("Số nhỏ nhất là:"+min);
        System.out.println("Số chia hết cho 3 là:"+chiahet3);
    }
    
}
