/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Student {
    private String studentCode;
    private float mediumScore;
    private int age;
    private String clas;

    Scanner input = new Scanner(System.in);
    
    public Student(String studentCode, float mediumScore, int age, String clas) {
        this.studentCode = studentCode;
        this.mediumScore = mediumScore;
        this.age = age;
        this.clas = clas;
    }
    
    Student () {
    }
    
    public String getStudentCode() {
        return studentCode;
    }
    
    public void setStudentCode (String studentCode) {
        this.studentCode = studentCode;
    }
    
    public float getMediumScore() {
        return mediumScore;
    }
    
    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getClas() {
        return clas;
    }
    
    public void setClas(String clas){
        this.clas = clas;
    }
    
    void inputInfor() {
        System.out.println("--- Nhap thong tin sinh vien ---");
        do {
            System.out.print("Nhap ma so sinh vien: ");
            studentCode = input.nextLine();
            if (studentCode.length() != 8) {
                System.out.println("Ma so sinh vien nhap vao khong hop le ! Moi nhap lai !!");
            }
        } while(studentCode.length() != 8);
        do {
            System.out.print("Nhap diem trung binh: ");
            mediumScore = Float.parseFloat(input.nextLine());
            if (mediumScore < 0.0 || mediumScore > 10.0) {
                System.out.println("Diem trung binh nhap vao khong hop le ! Moi nhap lai !!");
            }
        }while (mediumScore < 0.0 || mediumScore > 10.0);
        do {
            System.out.print("Nhap tuoi: ");
            age = Integer.parseInt(input.nextLine());
            if (age < 18) {
                System.out.println("Tuoi nhap vao khong hop le ! Moi nhap lai !!");
            }
        } while (age < 18);
        do {
            System.out.print("Nhap lop: ");
            clas = input.nextLine();
            if (clas.charAt(0) != 'A' && clas.charAt(0) != 'C') {
                System.out.println("Lop nhap vao khong hop le ! Moi nhap lai !!");
            } 
        } while (clas.charAt(0) != 'A' && clas.charAt(0) != 'C' );
    }
    
    void showInfor() {
        System.out.println("Ma so sinh vien: " + this.studentCode);
        System.out.println("Diem trung binh: " + this.mediumScore);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Lop: " + this.clas);
        this.gainScholarship();
    }
    
    void gainScholarship() {
        if(this.mediumScore >= 8.0) {
            System.out.println("Sinh vien co duoc hong bong !");
        } else {
            System.out.println("Sinh vien khong duoc hong bong !");
        }
    }
}
