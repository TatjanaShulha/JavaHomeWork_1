package com.pb.Shulha.hw3;
import java.util.Scanner;

public class Bingo {
    public static void main (String[] args){
        System.out.println("Угадайте число от 0 до 100. У Вас есть всего 5 попыток :) ");
        System.out.println("Для выхода из программы введите - exit.");

        final int MAX_ATTEMPT = 10;
        int attempt = 0;
        int selectNumber = 77;
        Scanner in = new Scanner (System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            String inputNumber = in.next();


            if (inputNumber.equals("exit") ){
                System.out.println("Жаль, что Вы сдались. До скорой встречи!");
                break;
            }
            int inputNumberInt = Integer.parseInt(inputNumber);
            if (inputNumberInt == selectNumber){
                System.out.println("Поздравляем, Вы угадали загаданное число с " + attempt + "-й попытки! ");
                break;
            }
            if (inputNumberInt > selectNumber & inputNumberInt > 100){
                System.out.println("Загаданное число ведь меньше 100 :)");
            }
            if (inputNumberInt > selectNumber){
                System.out.println("Вы ввели число больше задуманного");
            } else if (inputNumberInt < selectNumber & inputNumberInt < 0){
                System.out.println("Загаданное число ведь больше 0 :)");
            } else if (inputNumberInt < selectNumber){
                System.out.println("Вы ввели число меньше задуманного");
            }
        }

    }
}
