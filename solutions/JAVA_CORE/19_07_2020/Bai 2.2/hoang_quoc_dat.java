/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dinh dang cua ma tran A:");
        System.out.println("So hang : ");
        int rowA = sc.nextInt();
        System.out.println("So cot : ");
        int columnA = sc.nextInt();
        System.out.println("Nhap dinh dang cua ma tran B:");
        System.out.println("So hang : ");
        int rowB = sc.nextInt();
        System.out.println("So cot : ");
        int columnB = sc.nextInt();
        int[][] matranA = new int[rowA][columnA];
        int[][] matranB = new int[rowB][columnB];
        for(int i = 0 ; i < rowA; i++)
            {
                for(int j=0;j < columnA;j++)
                {
                    System.out.printf("Nhap phan tu hang %d cot %d cua ma tran A : \n",i+1,j+1);
                    matranA[i][j] = sc.nextInt();
                }
            }
            
            for(int i = 0 ; i < rowB; i++)
            {
                for(int j=0;j < columnB;j++)
                {
                    System.out.printf("Nhap phan tu hang %d cot %d cua ma tran B : \n",i+1,j+1);
                    matranB[i][j] = sc.nextInt();
                }
            }
        // tinh tong 2 ma tran
        if(rowA == rowB && columnA== columnB)
        {
            int[][] matranD = new int[rowA][columnA];
            for(int i = 0 ; i < rowA; i++)
            {
                for(int j=0;j < columnA;j++)
                {
                    matranD[i][j]=0;
                }
            }
            for(int i = 0 ; i < rowA; i++)
            {
                for(int j=0;j < columnB;j++)
                {
                    matranD[i][j] = matranA[i][j]+matranB[i][j];
                }
            }
            //hien thi
            System.out.println("Tong cua hai 2 ma tran A va B la : ");
            for(int i = 0 ; i < rowA; i++)
            {
                for(int j=0;j < columnB;j++)
                {
                    System.out.printf("%d ",matranD[i][j]);
                }
                System.out.println("");
            }
        }
        else
            System.out.println("2 ma tran A va B khong cong duoc voi nhau.");
        if(columnA == rowB)
        {
            // nhan 2 ma tran
            int[][] matranC= new int[rowA][columnB];
            for(int i = 0 ; i < rowA; i++)
            {
                for(int j=0;j < columnB;j++)
                {
                    matranC[i][j]=0;
                }
            }
            for(int i=0; i< rowA;i++ )
            {
                for(int j=0;j<columnB;j++)
                {
                    for(int k=0;k<rowB;k++)
                    {
                        matranC[i][j] = matranC[i][j] + matranA[i][k]*matranB[k][j];
                    }
                }
            }
            //hien thi
            System.out.println("Tich cua 2 ma tran a va B la : ");
            for(int i = 0 ; i < rowB; i++)
            {
                for(int j=0;j < columnB;j++)
                {
                    System.out.printf(" %d ",matranC[i][j]);
                }
                System.out.println("");
            }
        }
        else
            System.out.println("2 ma tran nay khong nhan duoc voi nhau.");
        // tinh dinh thuc cua 2 ma tran bac 3
        if(columnA == columnB && columnA == 3 && rowA == rowB && rowA == 3 )
        {
            int A11 = (int)Math.pow(-1, 1 + 1) * ( matranA[2][2]*matranA[3][3]+matranA[3][2]*matranA[2][3]);
            int A12 = (int)Math.pow(-1, 1 + 2) * ( matranA[2][3]*matranA[3][1]+matranA[3][3]*matranA[2][1]);
            int A13 = (int)Math.pow(-1, 1 + 3) * ( matranA[2][1]*matranA[3][2]+matranA[3][1]*matranA[2][2]);
            int detA = A11+A12+A13;

            int B11 = (int)Math.pow(-1, 1 + 1) * ( matranB[2][2]*matranB[3][3]+matranB[3][2]*matranB[2][3]);
            int B12 = (int)Math.pow(-1, 1 + 2) * ( matranB[2][3]*matranB[3][1]+matranB[3][3]*matranB[2][1]);
            int B13 = (int)Math.pow(-1, 1 + 3) * ( matranB[2][1]*matranB[3][2]+matranB[3][1]*matranB[2][2]);
            int detB = A11+A12+A13;
            System.out.printf("Dinh thuc cua ma tran A : %d \n",detA);
            
            System.out.printf("Dinh thuc cua ma tran B : %d \n",detB);
        }
        else
            System.out.println("");
    }
    
}
