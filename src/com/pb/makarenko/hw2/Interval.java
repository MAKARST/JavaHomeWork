package com.pb.makarenko.hw2;

import java.util.Scanner;

public class Interval {

    private static Scanner in;

    public static void main(String[] args) {

        int a = 0, b = 14, d = 15, e = 35, f = 36, g = 50, h = 51, j = 100;

        System.out.print("Проверка попадания числа в интервал от 0 до 100" + "\n" + "Введите число: ");

        in = new Scanner(System.in);
        int i = in.nextInt();

        if (a <= i && i <= b) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + a + " до " + b + "\n");
        } else if (d <= i && i <= e) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + d + " до " + e + "\n");
        } else if (f <= i && i <= g) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + f + " до " + g + "\n");
        } else if (h <= i && i <= j) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + h + " до " + j + "\n");
        }
         else if (j <= i) {
            System.out.print("Ваше число " + i + " не попадает ни в один интервал");
        } else if (a <= -i && -i <= j) {
            System.out.print("Ваше число " + i + " является отрицательным");
        }
    }
}