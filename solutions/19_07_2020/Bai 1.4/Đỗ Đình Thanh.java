package demo;
import java.util.Random;
public class bai4{ 
    
   public static void main(String[] args){
        System.out.println("Bai 4: Ramdom mảng + xắp sếp tăng-giảm + đếm chẵn-lẻ");
        Random ngauNhien = new Random();
        int[] array = new int[15];
        int dem_chan =0;
        int dem_le = 0;
        for(int i=0; i<array.length ; i++){
            array[i] = ngauNhien.nextInt(10);
        }
        System.out.println("Mảng Ngẫu NHiên: ");
        for(int i=0; i<array.length ; i++){
            System.out.printf("Array[%d] = %d\n", i, array[i]);
            if(array[i]%2==0)
                dem_chan += 1;
            else 
                dem_le += 1;
        }
        System.out.println("Sap xep tang dan:");
        for(int i=0; i<array.length -1 ; i++){
           for(int j =i;j<array.length;j++){
              if(array[i] > array[j] ){
                int a = array[i];
                array[i] = array[j];
                array[j] = a;
              }
           }
        }
        for(int i=0; i<array.length ; i++){
            System.out.printf(" %d\t",array[i]);
        }
        
        System.out.println("\nSap xep giam dan: ");
        for(int i=0; i<array.length -1 ; i++){
           for(int j =i;j<array.length;j++){
              if(array[i] < array[j] ){
                int a = array[i];
                array[i] = array[j];
                array[j] = a;
              }
           }
        }
        for(int i=0; i<array.length ; i++){
            System.out.printf(" %d\t",array[i]);
        }
        System.out.printf("\nTrong mảng có %d số chẵn và %d số lẻ\n", dem_chan,dem_le);
   }  
}

