package ru.netology.lipenko;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import model.Customer;
import model.Operation;
import repository.CustomerRepository;
import repository.OperationRepository;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {


        CustomerRepository customerRepository = new CustomerRepository();
        OperationRepository operationRepository = new OperationRepository();
        Customer customer;
        Operation operation;


        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("""
                Выберете операцию:
                1. Добавить клиента
                2. Перевод
                3. Список операций по клиенту
                4. Список клиентов
                5. Список транзакций
                6. Выход
                """);

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Введите Имя получателя: ");
                    String firstName = scanner.next();
                    System.out.println("Введите Фамилию получателя: ");
                    String secondName = scanner.next();
                    System.out.println("Введите возраст получателя: ");
                    int age = scanner.nextInt();
                    customer = new Customer(firstName,secondName,age);
                    customerRepository.addCustomer(customer);
                    break;
                case 2:
                    System.out.println("Введите сумму: ");
                    double amount = scanner.nextDouble();
                    System.out.println("Введите дату: ");
                    int date = scanner.nextInt();
                    System.out.println("Введите имя получателя");
                    String name = scanner.next();
                    int customerId = customerRepository.findCustomerRepo(name);
                    if(customerId == 404){
                        System.out.println("Повторите попытку.");
                    } else {
                        operation = new Operation(amount, date);
                        operationRepository.addOperation(operation, customerId);
                    }
                    break;
                case 3:
                    System.out.println("Введите имя получателя: ");
                    String nameCustomer = scanner.next();
                    int nameId = customerRepository.findCustomerRepo(nameCustomer);
                    Operation[] operationsCustomer = OperationRepository.getOperations(nameId);
                    operationRepository.printOperation(operationsCustomer);
                    break;
                case 4:
                    System.out.println("Список клиентов: ");
                    customerRepository.print();
                    break;
                case 5:
                    System.out.println("Список транзакций: ");
                    operationRepository.print();
                    break;
                case 6:
                    System.out.println("Спасибо и до свидания");
                    b = false;
                    break;
                default:
                    System.out.println("Ошибка");
                    break;
            }
        }
    }
}