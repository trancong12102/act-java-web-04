/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapclass;


import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Nhap {

    Student s=new Student();
    public void inputInfo() {
        System.out.print("nhap ten:  >>");
        s.setTen(new Scanner(System.in).nextLine());
        System.out.print("nhap tuoi  >>");
        s.setTuoi(new Scanner(System.in).nextInt());
        while(s.getTuoi()<18){
            System.out.print("nhap lai tuoi :   >>");
            s.setTuoi(new Scanner(System.in).nextInt());
        }
        
        System.out.print("nhap LOP(ki tu bat dau A or C):   >>");
        s.setLop(new Scanner(System.in).nextLine());
        System.out.print("nhap diem (0.0--10.0) :   >>");
        s.setDiemtb(new Scanner(System.in).nextDouble());
        while((s.getDiemtb()<0||s.getDiemtb()>10)){
            System.out.print("nhap diem (0.0--10.0) :   >>");
            s.setDiemtb(new Scanner(System.in).nextDouble());
        }
        System.out.print("nhap ma sinh vien (length==8):   >>");
        s.setMasv( new Scanner(System.in).nextLine());
        while(s.getMasv().length()!=8){
            System.out.print("nhap ma :   >>");
            s.setDiemtb(new Scanner(System.in).nextDouble());
        }
        }
    
    public void printInfo(){
        System.out.println("ten:"+s.getTen());
        System.out.println("tuoi:"+s.getTuoi());
        System.out.println("ma sinh vien:"+s.getMasv());
        System.out.println("Lop:"+s.getLop());
        System.out.println("diem:"+s.getDiemtb());
    }
    public void hocbong(){
        
        if(s.getDiemtb()>8)
            System.out.println("đã dành đc học bổng");
        else System.out.println("không dành đc học bổng");
        
    }
}