/*
2. Nhập vào mảng số Nguyên 5 phần tử. Tìm
a. Phần tử lớn nhất trong mảng
b. Phần tử nhỏ nhất trong mảng
c. Tất cả phần tử chia hết cho 3.
 */
package bai4;


import java.util.Scanner;
public class bai4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] A = new int[5];
        int max =0;
        int min =0;
        for(int i=0;i<5;i++){
                System.out.printf("Nhap A[%d]= ",i);
                A[i] = input.nextInt();
                max= A[0];
                min= A[0];
                if (A[i]>max){
                    max= A[i];
                }
                if(A[i]<min){
                    min= A[i];
                }
                if(A[i]%3==0){
                    System.out.println("Phan tu chia het cho 3: "+A[i]);
                }   
            }
                System.out.println("so lon nhat: "+max);
                System.out.println("so be nhat: "+min);
       }
}