package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;

@SpringBootApplication
@Controller
public class DemoApplication {
    public static String a[][] = new String[10][10];


    @RequestMapping("home")
    public String home() {
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        return "home.jsp";
    }

    public static void display() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = ".";
            }
        }

        display();
        System.out.println("enter the boxes to be coloured");

        Scanner s = new Scanner(System.in);

       /* int k1 = s.nextInt();
        int k2 = s.nextInt();*/

        int k1 = 5;
        int k2 = 8;

        a[k1][k2] = "*";
        display();
    }

}
