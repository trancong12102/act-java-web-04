/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Bai2 {
    public static void main(String[] args) {
        Student student= new Student();
        inputInfo(student);
        printInfo(student);
        if (student.kt()) {
            System.out.println("Sinh vien dat hoc bong:");
        } 
        else {
            System.out.println("Ko dat hoc bong");
            
        }
    }
    public static void inputInfo(Student st) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id:");
        st.setId(sc.nextLine());
        System.out.println("Nhap tuoi:");
        st.setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap lop:");
        st.setLop(sc.nextLine());
        System.out.println("Nhap diem:");
        st.setDiemTB(sc.nextDouble());
    }
    public static void printInfo(Student st) {
        System.out.println(st.getId()+" "+st.getTuoi()+" "+st.getLop()+" "+st.getDiemTB());
    }
}
