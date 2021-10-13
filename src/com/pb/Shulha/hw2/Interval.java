package com.pb.Shulha.hw2;

import java.util.Scanner;

public class Interval {
    public static void main (String[] args){
        int proizv;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите произвольное целое число: ");
        proizv=in.nextInt();

        if (proizv  >= 0 & proizv <= 14){
            System.out.println("Вы попали в диапазон  [0 - 14]: ");
        } else  if (proizv >= 15 & proizv <= 35){
            System.out.println("Вы попали в диапазон [15 - 35]");
        } else  if (proizv >= 36 & proizv <= 50) {
            System.out.println("Вы попали в диапазон [36 - 50]");
        } else  if (proizv >= 51 & proizv <= 100) {
            System.out.println("Вы попали в диапазон [51 - 100]");
        } else {
            System.out.println("Мимо!");
        }
    }
}
