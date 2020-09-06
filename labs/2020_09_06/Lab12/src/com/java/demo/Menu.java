/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Menu {

    private HashMap<String, String> menu;
    private String fileEn = "menu-en.locale";
    private String fileVi = "menu-vi.locale";
    private String fileZh = "menu-zh.locale";
    private String fileJp = "menu-jp.locale";
    private Scanner sc;
    private StudentManager manager;

    public Menu(StudentManager manager) {
        this.manager = manager;
        this.sc = new Scanner(System.in);
        this.menu = new HashMap<>();
        this.loadMenu(fileEn);
    }
    
    private String getFileName(String lang) {
        return "menu-" + lang + ".locale";
    }

    public void loadMenu(String file) {
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file)));
            String line = reader.readLine();
            while (line != null) {
                String[] split = line.split("=");
                this.menu.put(split[0], split[1]);
                line = reader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void show() {
        System.out.printf("------%s-------", this.menu.get("menu"));
        System.out.printf("\n1. %s", this.menu.get("add"));
        System.out.printf("\n2. %s", this.menu.get("search"));
        System.out.printf("\n3. %s", this.menu.get("update"));
        System.out.printf("\n4. %s", this.menu.get("del"));
        System.out.printf("\n5. %s", this.menu.get("lang"));
        System.out.printf("\n6. %s", this.menu.get("save"));
        System.out.printf("\n7. %s \n", this.menu.get("exit"));
        System.out.print("> ");
        int c = Integer.parseInt(this.sc.nextLine());
        switch (c) {
            case 1:
                this.manager.add();
                break;
//            case 2:
//            case 3:
//            case 4:
            case 5:
                System.out.print("Lang > ");
                String lang = this.sc.nextLine();
                this.loadMenu(this.getFileName(lang));
                break;
//            case 6:
            case 7:
                System.exit(0);
            default:
                System.out.println("Invalid!");
        }
        
        this.show();
    }
}
