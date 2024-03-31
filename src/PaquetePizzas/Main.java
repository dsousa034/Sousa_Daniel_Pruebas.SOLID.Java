package PaquetePizzas;

import PaquetePizzas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            DataBase databManager = (DataBase) new DataBaseManager("jdbc:mysql://localhost:3306/pizzeria");
            Payment paymentProcessor = new PaymentProcessor();
            ImplementacionOrderManager orderManager = new ImplementacionOrderManager(databManager, scanner, paymentProcessor);

            orderManager.createOrder();
        } catch (Exception e) {
            System.out.println("Ha habido un error: " + e.getMessage());
        }
    }
    }