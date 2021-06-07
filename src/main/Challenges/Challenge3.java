package Challenges;/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
import javax.swing.*;

public class Challenge3 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Greetings, " + name + "!");
    }
}