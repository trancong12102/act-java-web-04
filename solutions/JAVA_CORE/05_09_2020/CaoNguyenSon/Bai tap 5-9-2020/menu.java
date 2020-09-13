/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luyentapdocfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class menu {

    public static String PATH_VN = "src\\Luyentapdocfile\\menu-vi.locale";
    public static String PATH_ENG = "src\\Luyentapdocfile\\menu-eng.locale";
    Map<String, String> map = new HashMap<>();
    List<Student> list = new ArrayList<>();
    

    void Xulyfile(String file) {
        try {
            BufferedReader bfr = new BufferedReader(new FileReader(file));
            String line = bfr.readLine();
            while (line != null) {
                String[] split = line.split("=");
                map.put(split[0], split[1]);
                line = bfr.readLine();
            }
            bfr.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    void Hienthi(String file) {
        Xulyfile(file);
        System.out.printf("+++++ %s", map.get("menu") + " +++++\n");
        System.out.printf("1. %s\n", map.get("add"));
        System.out.printf("2. %s\n", map.get("search"));
        System.out.printf("3. %s\n", map.get("update"));
        System.out.printf("4. %s\n", map.get("delete"));
        System.out.printf("5. %s\n", map.get("save"));
        System.out.printf("6. %s\n", map.get("language"));
        System.out.printf("7. %s\n", map.get("exit"));
    }

    void Xulymenu() {
        Hienthi(PATH_VN);
        int luachon;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ban lua chon MENU: ");
            luachon = Integer.parseInt(input.nextLine());
            if (luachon == 1) {
                Student student = new Student();
                Nhap(student);
                System.out.println("Show Result: ");
                Show();
            } else if (luachon == 2) {
                System.out.println("Insert Name > ");
                String s = input.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if(list.get(i).getName().contains(s)){
                        System.out.println("Rollnumber > " + list.get(i).getRollnumber() 
                                + "Date of Birth > " + list.get(i).getDob() + 
                                "Email > " + list.get(i).getEmail());
                    }
                    System.out.println("Searching!!!");
                }
            } else if (luachon == 3) {
                System.out.println("Update Information!!!");
                int i = Search();
                System.out.println("Index: " + i);
                if(i>=0){
                    System.out.println("Searching Successfull!!!");
                    System.out.println("+++++ Update +++++\n" + "\n1. Rollnumber\n"
                            + "\n2. Name\n" + "\n3. Date of Birth\n" + "\n4. Email\n"
                            + "\n5. Exit");
                    int c;
                    do {
                        System.out.println("Your Choose: ");
                        c = Integer.parseInt(input.nextLine());
                        if (c == 1) {
                            System.out.println("Insert new value(Rollnumber) > ");
                            String roll = input.nextLine();
                            list.get(i).setRollnumber(roll);
                        } else if (c == 2) {
                            System.out.println("Insert new value(Name) > ");
                            String name = input.nextLine();
                            list.get(i).setName(name);
                        } else if (c == 3) {
                            System.out.println("Insert new value(Date of Birth) >");
                            String dob = input.nextLine();
                            list.get(i).setDob(dob);
                        } else if (c == 4) {
                            System.out.println("Insert new value(Email) > ");
                            String email = input.nextLine();
                            list.get(i).setEmail(email);
                        }
                    } while (c != 5);
                    System.out.println("Update Successfull!!!");
                }else{
                    System.out.println("Invalid Value!!!");   
                }
            } else if (luachon == 4) {
                int c = Search();
                if(c>=0){
                    System.out.println("Deleting...!!");
                    list.remove(c);
                    System.out.println("Delete Succeessful!!!");
                }else{
                    System.out.println("Object not Found!!!");
                }
            } else if (luachon == 5) {
                Save();
            } else if (luachon == 6) {
                Hienthi(PATH_ENG);
            }
        } while (luachon != 7);
    }

    void Nhap(Student student) {
        Scanner input = new Scanner(System.in);
        System.out.println("Add Information!!!");
        System.out.println("Rollnumber(Ma so) > ");
        student.setRollnumber(input.nextLine());
        System.out.println("Name(Ho va Ten) > ");
        student.setName(input.nextLine());
        System.out.println("Date of Birth(Ngay sinh) > ");
        student.setDob(input.nextLine());
        System.out.println("Email > ");
        student.setEmail(input.nextLine());
        list.add(student);
    }

    int Search() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert Rollnumber: ");
        String s = input.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRollnumber().contains(s)) {
                return i;
            }
        }
        return -1;
    }
    
    void Save(){
        try {
            File file = new File("C:\\Users\\Admin\\Desktop\\Save.txt");
            if(file.createNewFile()){
                System.out.println("Created new File!!!");
            }else{
                System.out.println("File already Exist!!!");
            }
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Save.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();
            oos.close();
            fos.close();
            Load();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    void Load(){
        try {
            List<Student> obj = null;
            FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Save.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (List<Student>) ois.readObject();
            list = obj;
            ois.close();
            fis.close();
            for (Student i: list) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    void Show(){
        for (Student i: list) {
            System.out.println(i);
        }
    }
}
