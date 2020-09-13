/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luyentapdocfile;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Student implements Serializable {
    private String rollnumber;
    private String name;
    private String dob;
    private String email;
    
    public Student(){}

    public Student(String rollnumber, String name, String dob, String email) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "rollnumber=" + rollnumber + ", name=" + name + ", dob=" + dob + ", email=" + email + '}';
    }
}
