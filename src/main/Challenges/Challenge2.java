package Challenges;/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name?");
        System.out.println("Salutations, " + in.nextLine() + "!");
        System.out.print("What is your name?");
        System.out.println("Greetins, " + in.nextLine() + "!");
        System.out.print("What is your name?");
        System.out.println("Gutentag, " + in.nextLine() + "!");
    }
}