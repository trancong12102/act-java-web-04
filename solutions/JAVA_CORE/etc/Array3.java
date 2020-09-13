/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

import java.util.Scanner;

/**
 *
 * @author A
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i,j;
    int[][] a = new int[3][3];
    int h1=0,h2=0,h3=0,c1=0,c2=0,c3=0,det1,ktb1=0;
        System.out.println("nhap mang thu nhat:");
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
            Scanner sc = new Scanner(System.in);
            a[i][j] = sc.nextInt();
            if(a[i][j]==0)
                ktb1=ktb1+1;
            if(i==0)
                h1=h1+a[i][j];
            if(i==1)
                h2=h2+a[i][j];
            if(i==2)
                h3=h3+a[i][j];
            if(j==0)
                c1=c1+a[i][j];
            if(j==1)
                c2=c2+a[i][j];
            if(j==2)
                c3=c3+a[i][j];
            
        }
    }
        System.out.println("Mảng 1 vừa nhập: ");
        det1=a[1][1]*a[2][2]-a[2][1]*a[1][2]+a[1][0]*a[2][2]-a[2][0]*a[1][2]+a[1][0]*a[2][1]-a[2][0]*a[1][1];
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            System.out.print(a[i][j] + "\t");
        }
       
        System.out.println("\n");   
    }
    
        System.out.println("tong moi hang cua ma tran thu nhat la:\nhang 1: "+h1+"\nhang 2: "+h2+"\nhang3 "+h3);
        System.out.println("tong moi cot cua ma tran thu nhat la:\ncot 1: "+c1+"\ncot 2: "+c2+"\ncot 3 "+c3);
        System.out.println("dinh thuc cua ma tran 1 = "+det1);
        if(ktb1==9)
                System.out.println("ma tran vua nhap la ma tran 0");
        if(ktb1!=9)
                System.out.println("ma tran vua nhap khong phai ma tran 0");
        if((a[0][0]*a[1][1]*a[2][2])==1)
                System.out.println("ma tran vua nhap la ma tran don vi");
        if((a[0][0]*a[1][1]*a[2][2])!=1)
                System.out.println("ma tran vua nhap khong la ma tran don vi");
        if(a[0][1]==a[1][0] && a[0][3]==a[3][0] && a[2][3]==a[2][3])
            System.out.println("ma tran vua nhap la ma tran doi xung");
        else
            System.out.println("ma tran vua nhap khong la ma tran doi xung");
        
    int[][] b = new int[3][3];
    int H1=0,H2=0,H3=0,C1=0,C2=0,C3=0,B1,B2,B3,det2,ktb2=0;
        System.out.println("nhap mang thu hai:");
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
            Scanner sc = new Scanner(System.in);
            b[i][j] = sc.nextInt();
            if(b[i][j]==0)
                ktb2=ktb2+1;
            if(i==0)
                H1=H1+b[i][j];
            if(i==1)
                H2=H2+b[i][j];
            if(i==2)
                H3=H3+b[i][j];
            if(j==0)
                C1=C1+b[i][j];
            if(j==1)
                C2=C2+b[i][j];
            if(j==2)
                C3=C3+b[i][j];
        }
    }
       
        System.out.println("Mảng 2 vừa nhập: ");
        det2=b[1][1]*b[2][2]-b[2][1]*b[1][2]+b[1][0]*b[2][2]-b[2][0]*b[1][2]+b[1][0]*b[2][1]-b[2][0]*b[1][1];
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            System.out.print(b[i][j] + "\t");
        }
       
        System.out.println("\n");   
    }
            System.out.println("tong moi hang cua ma tran thu hai la:\nhang 1: "+H1+"\nhang 2: "+H2+"\nhang3 "+H3);
            System.out.println("tong moi cot cua ma tran thu hai la:\ncot 1: "+C1+"\ncot 2: "+C2+"\ncot 3 "+C3);
            System.out.println("dinh thuc cua ma tran 2 = "+det2);
            if(ktb2==9)
                System.out.println("ma tran vua nhap la ma tran 0");
            if(ktb2!=9)
                System.out.println("ma tran vua nhap khong phai ma tran 0");
            if((b[0][0]*b[1][1]*b[2][2])==1)
                System.out.println("ma tran vua nhap la ma tran don vi");
            if((b[0][0]*b[1][1]*b[2][2])!=1)
                System.out.println("ma tran vua nhap khong la ma tran don vi");
            if(b[0][1]==b[1][0] && b[0][3]==b[3][0] && b[2][3]==b[2][3])
                System.out.println("ma tran vua nhap la ma tran doi xung");
            else
                System.out.println("ma tran vua nhap khong la ma tran doi xung");
    int[][] c = new int[3][3];
    int[][] d = new int[3][3];
        System.out.println("tong hai ma tran: ");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(c[i][j]+"\t");
        }
        System.out.println("\n");
    }
       System.out.println("tich hai ma tran: ");
       int r, sum=0;
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            for(r=0;r<3;r++){
                sum=sum + a[i][r]*b[r][j];
                d[i][j]=sum;
            }
            System.out.print(d[i][j]+"\t");
        }
        System.out.println("\n");
    }
}
}



