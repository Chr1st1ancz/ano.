package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo");
        int a = sc.nextInt();
        System.out.println("Zadej druhy cislo");
        int b = sc.nextInt();
        switch (args[0]){
            case "s":
                System.out.println(a+b);
                break;
            case "o":
                System.out.println(a-b);
                break;
            default:
                System.out.println("jsi kokot");
                break;
        }

    }
}
