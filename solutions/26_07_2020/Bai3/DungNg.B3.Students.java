/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.util.Scanner;

/**
 *
 * @author Dung Ng
 */
public class Students {
    private String id;
    private String name;
    private String course;
    private float avg;
    private String rules;
    private int tests;

    public Students() {
    }

    public Students(String id, String name, String course, float avg, String rules, int tests) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.avg = avg;
        this.rules = rules;
        this.tests = tests;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public int getTests() {
        return tests;
    }

    public void setTests(int tests) {
        this.tests = tests;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID? >");
        this.id = sc.nextLine();
         System.out.println("Name? >");
        this.name = sc.nextLine();
         System.out.println("Course? >");
        this.course = sc.nextLine();
         System.out.println("Avg Point? >");
        this.avg = sc.nextInt();
         System.out.println("bad behiv? (yes / no ) >");
        this.rules = sc.nextLine();
         System.out.println("tests? >");
        this.tests = sc.nextInt();
        
        }
    public void extraBonus(){
        if( "HDSE".equals(this.course) && this.avg >= 7.5 && "yes".equals(this.rules) && this.tests==1)  {
            System.out.println("hoc vien dat hoc bong");
        } 
        else{
            System.out.println("hoc vien ko dat hoc bong");
        }
            
        
    }
}
