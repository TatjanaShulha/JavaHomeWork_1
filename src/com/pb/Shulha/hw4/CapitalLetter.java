package com.pb.Shulha.hw4;

import java.util.Locale;
import java.util.Scanner;

public class CapitalLetter {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String text = in.nextLine();

        String[] words = text.split("\\s+");
        String newText = "";

        for( int i = 0; i <= words.length - 1; i++)
        {
            newText = newText + words[i].substring(0,1).toUpperCase() + words[i].substring(1) + " ";
        }
        newText = newText.trim();
        System.out.print(newText);




    }




}
