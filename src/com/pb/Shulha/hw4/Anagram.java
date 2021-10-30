package com.pb.Shulha.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение 1: ");
        String text1 = in.nextLine();

        System.out.println("Введите предложение 2: ");
        String text2 = in.nextLine();


        System.out.print("Является ли текст анаграммой? - " + isAnagram(text1,text2));



    }

    public static boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.replaceAll("[\\s]", "").replaceAll("[^a-zA-Z]", "").toCharArray();
        char[] word2 = secondWord.replaceAll("[\\s]", "").replaceAll("[^a-zA-Z]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);

    }
}