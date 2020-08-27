package ru.geekbrains.JavaLessons;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int input_number = scanner.nextInt();
        if (input_number < 0){
            System.out.println("Число меньше нуля");
        } else{
            System.out.println("Число больше нуля");
        }
    }
}


