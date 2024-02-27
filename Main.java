package ru.netology.lipenko;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        ArrayList<Object[]> transactions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (transactions.size() == 5)
                break;
            else {
            System.out.print("Номер транзакции: ");
            int id = scanner.nextInt();

            scanner.nextLine(); // Считываем и пропускаем символ новой строки

            System.out.print("ФИО клиента: ");
            String fio = scanner.nextLine();

            System.out.print("Сумма в рублях: ");
            double sum = scanner.nextDouble();

                Object[] transactionDetails = {id, fio, sum};
                transactions.add(transactionDetails);
            }
        }

        // Вывод результата
        for (Object[] transaction : transactions) {
            for (Object detail : transaction) {
                System.out.print(detail + " ");
            }
            System.out.println();
        }
    }
}