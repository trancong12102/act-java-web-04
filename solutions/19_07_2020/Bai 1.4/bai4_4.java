/*
4. Sử dụng Lớp Random để tạo ra mảng số Nguyên ngẫu nhiên 15 phần tử. In ra mảng vừa
tạo và
a. Sắp xếp mảng theo thứ tự tăng dần.
b. Sắp xếp mảng theo thứ tự giảm dần.
c. Đếm xem trong mảng có bao nhiêu số chẵn
d. Đếm xem trong mảng có bao nhiêu số lẻ.
 */
package bai4;

import java.util.Random;

/**
 *
 * @author King Midas
 */
public class bai4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random input = new Random();
        int[] A = new int[15];

        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt(100);
            System.out.printf(" %d ",A[i]);
        }
        System.out.printf("\n");

        int hv = 0, chan = 0, le = 0; 
        System.out.println("Tang dan");
        for (int i = 0; i < (A.length - 1); i++) {
            for (int j = (i+1); j < A.length; j++) {
                if(A[i] > A[j]){
                    hv = A[i];
                    A[i] = A[j];
                    A[j] = hv;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.printf(" %d ",A[i]);
        }
        System.out.printf("\n");


        System.out.println("Giam dan");
        for (int i = 0; i < (A.length - 1); i++) {
            for (int j = (i+1); j < A.length; j++) {
                if(A[i] < A[j]){
                    hv = A[i];
                    A[i] = A[j];
                    A[j] = hv;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.printf(" %d ",A[i]);
        }
        System.out.printf("\n");

        for (int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0){
                chan += 1;
            } else {
                le += 1;
            }
        }
        System.out.printf("Trong mang co %d so chan \n",chan);
        System.out.printf("Trong mang co %d so le \n",le);
    }
}
