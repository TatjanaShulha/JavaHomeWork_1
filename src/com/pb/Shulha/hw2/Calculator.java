package com.pb.Shulha.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){
        int operand1;
        int operand2;
        String sign;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите значение operand1: ");
        operand1=in.nextInt();

        System.out.print("Введите значение operand2: ");
        operand2=in.nextInt();

        System.out.print("Введите знак арифметической операции: ");
        sign=in.next();

        switch (sign){
            case "+":
                System.out.print("Результат сложения = ");
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.print("Результат вычитания = ");
                System.out.println(operand1-operand2);
                break;
            case "*":
                System.out.print("Результат умножения = ");
                System.out.println(operand1*operand2);
                break;
            case "/":
                if (operand2 == 0){
                    System.out.println("На 0 делить нельзя!");
                }
                else {
                System.out.print("Результат деления = ");
                System.out.println(operand1/operand2);
                }
        }


    }
}
