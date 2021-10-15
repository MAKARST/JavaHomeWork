package com.pb.makarenko.hw2;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        int result;
        char symbol;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение 1: ");
        operand1 = scan.nextInt();
        System.out.println("\nВеедите арифметический знак из примера (+, -, *, /): ");
        symbol = scan.next().charAt(0);
        System.out.print("Введите значение 2: ");
        operand2 = scan.nextInt();
        switch(symbol) {
            case '+': result =operand1 + operand2;
                System.out.println("\nРезультат операции:\n");
                System.out.println(operand1 + " " + symbol + " " + operand2 + " = " + result);
                break;
            case '-': result =operand1 - operand2;
                System.out.println("\nРезультат операции:\n");
                System.out.println(operand1 + " " + symbol + " " + operand2 + " = " + result);
                break;
            case '*': result =operand1 * operand2;
                System.out.println("\nРезультат операции:\n");
                System.out.println(operand1 + " " + symbol + " " + operand2 + " = " + result);
                break;
            case '/':  if (operand2==0) {
                System.out.println("Ошибка, деление на ноль - недопустимо");}
               else if (operand2>0) {
                   result =operand1 / operand2;
                System.out.println("\nРезультат операции:\n");
                System.out.println(operand1 + " " + symbol + " " + operand2 + " = " + result);
               }
                break;
            default:  System.out.println("Ошибка! Выберите арифметический знак из примера(+, -, *, /):");
                return;
        }
    }
}
