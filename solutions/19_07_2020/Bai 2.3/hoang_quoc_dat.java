/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] matranA = new int[3][3];
        for(int i = 0 ; i < 3; i++)
        {
            for(int j=0;j < 3;j++)
            {
                System.out.printf("Nhap phan tu hang %d cot %d cua ma tran A : \n",i+1,j+1);
                matranA[i][j] = sc.nextInt();
            }
        }
        boolean rs=true;
        for(int i=0; i<3 ;i++)
        {
            for(int j=0;j<3;j++)
            {
                if((i!=j && matranA[i][j]!=0) || (i == j && matranA[i][j] != 1))
                {
                    rs=false;
                    System.out.println("Ma tran A khong phai ma tran don vi");
                    break;
                }
                if(!rs)
                    break;
            }
        }
        if(rs)
            System.out.println("Ma tran A la ma tran don vi.");
        rs=true;
        for(int i=0; i<3 ;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(matranA[i][j]!=0)
                {
                    rs=false;
                    System.out.println("Ma tran A khong phai ma tran 0");
                    break;
                }
                if(!rs)
                    break;
            }
        }
        if(rs)
            System.out.println("Ma tran A la ma tran 0.");
        rs=true;
        int[][] matranB = new int[3][3];
        for(int i=0; i<3 ;i++)
        {
            for(int j=0;j<3;j++)
            {
                matranB[i][j]=matranA[j][i];
            }
            
        }
        for(int i=0; i<3 ;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(matranA[i][j]!=matranB[i][j])
                {
                    rs = false;
                    System.out.println("Ma tran A khong phai ma tran doi xung.");
                    break;
                }
                if(!rs)
                    break;
            }
        }
        if(rs)
            System.out.println("Ma tran A la ma tran doi xung");

    }
    
}
