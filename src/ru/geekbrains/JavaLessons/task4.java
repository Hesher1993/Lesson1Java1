package ru.geekbrains.JavaLessons;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int range = 20;
        int number = (int)(Math.random() * range);
        int input_number = scanner.nextInt();
        if (input_number > 10){
            System.out.println("Число в пределах");
        } else {
            System.out.println("Число вне пределов");
        }

    }
}
