package ru.netology.lipenko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println ("Hello, Marina");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Номер транзакции: ");
        int id = scanner.nextInt();

        scanner.nextLine(); // Считываем и пропускаем символ новой строки

        System.out.print("ФИО клиента: ");
        String fio = scanner.nextLine();

        System.out.print("Сумма в рублях: ");
        double sum = scanner.nextDouble();

                System.out.println("Номер транзакции: " + id + ", Клиент: " + fio + ", Сумма в рублях:  " + sum);

       }
}