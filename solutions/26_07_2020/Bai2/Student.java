
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Student {

    private String MSV;
    private float DTB;
    private int age;
    private String lop;

    public Student() {
    }

    public Student(String MSV, float DTB, int age, String lop) {
        this.MSV = MSV;
        this.DTB = DTB;
        this.age = age;
        this.lop = lop;
    }

    public String getMSV() {
        return MSV;
    }

    public float getDTB() {
        return DTB;
    }

    public int getAge() {
        return age;
    }

    public String getLop() {
        return lop;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public void setDTB(float DTB) {
        this.DTB = DTB;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void inforINPUT() {
        Scanner ip = new Scanner(System.in);
        char a;
        do {
            System.out.print("nhap Ma Sinh vien=>");
            this.MSV=ip.nextLine();
        }while(MSV.length()!=8);
        do
        {
            System.out.print("nhap diem trung binh=>");
            this.DTB=ip.nextFloat();
            ip.nextLine();
        }while(this.DTB<0||this.DTB>10);
        do
        {
            System.out.print("nhap tuoi=>");
            this.age=ip.nextInt();
            ip.nextLine();
        }while(this.age<18);
        do
        {
            System.out.print("nhap ten lop hoc=>");
            this.lop=ip.nextLine();
            a=lop.charAt(0);
            
        }while(a!='C' ||  a!='A');
    }
    public void showINFOR()
{
    System.out.println("Ma sinh vien: "+this.MSV);
    System.out.println("Lop: "+this.lop);
    System.out.println("Diem trung binh: "+this.DTB);
    System.out.println("Tuoi: "+this.age);

}
    public void kiemtraHB()
    {
        if(this.DTB>=8)
        {
            System.out.println("co hoc bong");
        }
        else
        {
            System.out.println("khong co hoc bong");
        }
    }

}

