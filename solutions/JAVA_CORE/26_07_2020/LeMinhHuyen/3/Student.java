/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass3;

import java.util.Scanner;

/**
 *
 * @author DaiPhongPC
 */
public class Student {

    private boolean registerHDSE;
    private float totalscore;
    private boolean ViolationofRules;
    private int examtimes;

    public Student() {

    }

    public Student(boolean registerHDSE, float totalscore, boolean ViolationofRules, int examtimes) {
        this.registerHDSE = registerHDSE;
        this.totalscore = totalscore;
        this.ViolationofRules = ViolationofRules;
        this.examtimes = examtimes;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Do the student register HDSE?\n Yes-true\n No-false \n ");
        this.registerHDSE = Boolean.parseBoolean(input.nextLine());
        System.out.println("Enter total score:");
        this.totalscore = Float.parseFloat(input.nextLine());
        System.out.printf("Do students violate regulations?\n Yes-true\nNo-false\n");
        this.ViolationofRules = Boolean.parseBoolean(input.nextLine());
        System.out.println("How many times does a student take the exam?");
        this.examtimes = Integer.parseInt(input.nextLine());

    }

    public void scholarship() {
        if (this.registerHDSE == false && this.totalscore < 75 && this.ViolationofRules == true && this.examtimes != 1) {
            System.out.println("The student don't have scholarship");
        } else {
            System.out.println("The student have scholarship");

        }
    }

}
