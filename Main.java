package ru.netology.lipenko;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
/*
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

 */

                ArrayList<Integer> transactionIdList = new ArrayList<>();
                ArrayList<String> fioList = new ArrayList<>();
                ArrayList<Double> sumList = new ArrayList<>();
                ArrayList<String> dateList = new ArrayList<>();

                Scanner scanner = new Scanner(System.in);

                while (transactionIdList.size() < 5) {
                    System.out.print("Номер транзакции: ");
                    int id = scanner.nextInt();

                    transactionIdList.add(id);

                    scanner.nextLine(); // Считываем и пропускаем символ новой строки

                    System.out.print("ФИО клиента: ");
                    String fio = scanner.nextLine();

                    fioList.add(fio);

                    System.out.print("Сумма в рублях: ");
                    double sum = scanner.nextDouble();

                    sumList.add(sum);

                    scanner.nextLine(); // Считываем и пропускаем символ новой строки

                    System.out.print("Дата операции (в формате дд.мм.гггг): ");
                    String date = scanner.nextLine();

                    dateList.add(date);

                    scanner.nextLine(); // Считываем и пропускаем символ новой строки
                }

                System.out.println("Список транзакций:");

                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                    Date startDate = dateFormat.parse("01.01.2022");
                    Date endDate = dateFormat.parse("31.12.2022");

                    for (int i = 0; i < transactionIdList.size(); i++) {
                        Date transactionDate = dateFormat.parse(dateList.get(i));
                        if (transactionDate.after(startDate) && transactionDate.before(endDate)) {
                            System.out.println("Номер транзакции: " + transactionIdList.get(i));
                            System.out.println("ФИО клиента: " + fioList.get(i));
                            System.out.println("Сумма в рублях: " + sumList.get(i));
                            System.out.println("Дата операции: " + dateList.get(i));
                            System.out.println();
                        }
                    }
                } catch (ParseException e) {
                    System.out.println("Ошибка при парсинге даты.");
                }
            }
        }