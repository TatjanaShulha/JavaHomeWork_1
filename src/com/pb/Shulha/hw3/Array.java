package com.pb.Shulha.hw3;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        int[] array = new int[10];
        int sum = 0;
        int count = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите что-то: ");

        for (int i = 0; i< array.length; i++){
            System.out.println("Введите " + i + " элемент массива");
            array[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {

        }

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма элементов массива = " + sum );

        for (int i = 0; i < array.length; i++) {
           if (array[i] >= 0){
               count++;
           }
        }
        System.out.println("Кол-во положительных элементов массива " + count);

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));


    }
}
