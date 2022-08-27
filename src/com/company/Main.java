package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much is your item?");
        double price = keyboard.nextDouble();
        double total = price * 1.05;
        System.out.println("Your total is: " + total);
    }
}
