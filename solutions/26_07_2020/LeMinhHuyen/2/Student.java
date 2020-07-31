/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaut;

import java.util.Scanner;

/**
 *
 * @author DaiPhongPC
 */
public class Student {

    private String StudentID;
    private float mediumscore;
    private int age;
    private String Class1;

    public Student() {

    }

    public Student(String StudentID, float mediumscore, int age, String Class) {
        this.StudentID = StudentID;
        this.mediumscore = mediumscore;
        this.age = age;
        this.Class1 = Class1;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID() {
        this.StudentID = StudentID;
    }

    public float getmediumscore() {
        return mediumscore;
    }

    public void setmediumscore() {
        this.mediumscore = mediumscore;
    }

    public int getage() {
        return age;
    }

    public void setage() {
        this.age = age;
    }

    public String getClass1() {
        return Class1;
    }

    public void setClass1() {
        this.Class1 = Class1;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter the StudentID:");
            this.StudentID = input.nextLine();
        } while (this.StudentID.length() != 8);

        do {
            System.out.println("Enter the MediumScore: ");
            this.mediumscore = Float.parseFloat(input.nextLine());
        } while (this.mediumscore < 0.0 || this.mediumscore > 10.0);

        do {
            System.out.println("Enter the age:");
            this.age = Integer.parseInt(input.nextLine());
        } while (this.age < 18);

        do {
            System.out.println("Enter the Class:");
            this.Class1 = input.nextLine();
        } while (this.Class1.charAt(0) != 'A' && this.Class1.charAt(0) != 'C');
    }

    public void printInfo() {
        System.out.println("========================================");
        System.out.println("Student Information: ");

        System.out.println("StudentID: " + this.StudentID);

        System.out.println("Medium Score: " + this.mediumscore);

        System.out.println("Age: " + this.age);

        System.out.println("Enter again");

        System.out.println("Class: " + Class1);

        System.out.println("========================================");
    }

    public void Scholarship() {
        if (this.mediumscore > 8.0) {
            System.out.println("This Student  have Scholarship");
        } else {
            System.out.println("This Student have Scholarship");
        }
    }

}
