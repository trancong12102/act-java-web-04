/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Aptech {

    private int Regist;
    private float Point;
    private int Breakk;
    private int CertTest;

    public Aptech() {

    }

    void inputInfo() {
        System.out.println("Fill in the information include Regist(1 or 0), Point(from 0 to 100), Break the rules(1 or 0), Certificate Test (1 or 0)");
        System.out.println("Please notice that: Yes=1,No=0");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Did you regist HDSE ?");
            System.out.println("Yes: 1");
            System.out.println("No: 0");
            System.out.print("Answer > ");
            this.Regist = sc.nextInt();
        } while (this.Regist != 0 && this.Regist != 1);
        do {
            System.out.println("How many points do you have? ");
            System.out.println("Point is from 0 to 100");
            System.out.print("Answer > ");
            this.Point = sc.nextFloat();
        } while (this.Point < 0 || this.Point > 100);
        do {
            System.out.println("Did you break the rules?");
            System.out.println("Yes: 1");
            System.out.println("No: 0");
            System.out.print("Answer > ");
            this.Breakk = sc.nextInt();
        } while (this.Breakk != 0 && this.Breakk != 1);
        do {
            System.out.println("Did you pass all the certificate tests?");
            System.out.println("Yes: 1");
            System.out.println("No: 0");
            System.out.print("Answer > ");
            this.CertTest = sc.nextInt();
        } while (this.CertTest != 0 && this.CertTest != 1);
    }

    String Scholarship(int Regist, float Point, int Break, int CertTest) {
        String n;
        if (this.Breakk == 0 && this.CertTest == 1 && this.Regist == 1 && this.Point >= 75) {
            n = "You got scholarship";
        } else {
            n = "You did'nt get scholaship";
        }
        return n;
    }

    void outputScholarship() {
        System.out.println("" + Scholarship(this.Regist, this.Point, this.Breakk, this.CertTest));
    }
}
