/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Student {

    private String StudentCode;
    private float OverallScore;
    private int Age;
    private String Class;

    Student() {
    }

    public Student(String StudentCode, float OverallScore, int Age, String Class) {
        this.StudentCode = StudentCode;
        this.OverallScore = OverallScore;
        this.Class = Class;
        this.Age = Age;
    }

    public String getStudentCode() {
        return this.StudentCode;
    }

    public String setStudentCode(String StudentCode) {
        this.StudentCode = StudentCode;
        return StudentCode;
    }

    public float getOverallScore() {
        return this.OverallScore;
    }

    public float setOverallScore(float OverallScore) {
        this.OverallScore = OverallScore;
        return OverallScore;
    }

    public int getAge() {
        return this.Age;
    }

    public int setAge(int Age) {
        this.Age = Age;
        return Age;
    }

    public String getClass1() {
        return this.Class;
    }

    public String setClass1(String Class) {
        this.Class = Class;
        return Class;
    }

    void inputInfo() {
        System.out.println("Please Enter (include Student Code, Overall Score, Age, Class");
        System.out.println("If you enter the wrong information, that requires below, you have to enter again");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please Enter Student Code: ");
            System.out.println("Student Code includes 8 character");
            this.StudentCode = sc.nextLine();
        } while (this.StudentCode.length() != 8);
        do {
            System.out.println("Please Enter Overall Score: ");
            System.out.println("Overall Score if from 0.0 to 10.0");
            this.OverallScore = Float.parseFloat(sc.nextLine());
        } while (this.OverallScore > 10.0 || this.OverallScore < 0.0);
        do {
            System.out.println("Please Enter Age: ");
            System.out.println("Age starts from 18");
            this.Age = Integer.parseInt(sc.nextLine());
        } while (this.Age < 18);
        do {
            System.out.println("Please Enter Class");
            System.out.println("Class must be started with 'A' or 'C'");
            this.Class = sc.nextLine();
        } while (this.Class.charAt(0) != 'A' && this.Class.charAt(0) != 'C');
        System.out.println("Finished.");
        System.out.println("::::::::::::::::::::::::::::::::::::");
        System.out.println("\n");

    }

    void outputInfo() {
        System.out.println("Student Information:");
        System.out.println("....................................");
        System.out.println("Student Code: " + this.StudentCode);
        System.out.println("Overall Score: " + this.OverallScore);
        System.out.println("Age: " + this.Age);
        System.out.println("Class: " + this.Class);
        System.out.println("Scholarship: " + Scholarship(OverallScore));
    }

    String Scholarship(float OverallScore) {
        String ans = "Yes";
        String ans1 = "No";
        if (OverallScore > 8.0) {
            return ans;
        } else {
            return ans1;
        }
    }

}
