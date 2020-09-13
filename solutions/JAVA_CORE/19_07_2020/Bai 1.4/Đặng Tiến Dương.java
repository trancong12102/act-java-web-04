/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Bai1_4 {
    public static void main(String[] args) {
    int[] array = new int[15];
    Random rand = new Random();
    int sumchan=0;
    int sumle=0;
    System.out.println("Các phần tử ngẫu nhiên là: ");
    for (int i = 0; i < array.length; i++){
        array[i] = rand.nextInt(100) + 1;
    System.out.printf(+array[i]+ " ");
    }
    Arrays.sort(array);
    System.out.println();
    System.out.println("Sắp xếp từ thấp đến cao:");
    for (int i = 0; i < array.length ; i++)
    System.out.print(array[i] + " ");
    System.out.println();
// in reverse order
    System.out.println("Sắp xếp từ cao đến thấp:");
    for (int i = array.length - 1; i >= 0; i--)
    System.out.print(array[i] + " ");
    System.out.println();
    for (int i = 0; i < array.length; i++){
        array[i] = rand.nextInt(100) + 1;
        if(array[i]%2==0){
            sumchan+=array[i];
        }else{
            sumle+=array[i];
        }
    }System.out.println("Tổng số chẵn là: "+sumchan);
     System.out.println("Tổng số lẻ là: "+sumle);
        
    }
    
}
