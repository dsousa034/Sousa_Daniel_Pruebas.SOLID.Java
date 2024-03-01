package PaquetePizzas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    private static final List<Pizza> menu = List.of(
            new Pizza("Margarita", 6.50),
            new Pizza("Barbacoa", 8.50),
            new Pizza("Atun", 9.50),
            new Pizza("Romana", 9.00),
            new Pizza("Carbonara", 7.50)
    );

    public static List<Pizza> seleccionarPizza(Scanner scanner) {
        List<Pizza> pedido = new ArrayList<>();
        boolean ordenar = true;

        while (ordenar) {
            System.out.println("\nMenú:");
            for (int i = 0; i < menu.size(); i++) {
                Pizza pizza = menu.get(i);
                System.out.println((i + 1) + ". " + pizza.getNombre() + " - €" + pizza.getPrecio());
            }

            System.out.print("Añada el numero de pizzas que quiera en su pedido (0 para salir): ");
            int eleccion = scanner.nextInt();
            scanner.nextLine();

            if (eleccion == 0) {
                ordenar = false;
            } else if (eleccion < 1 || eleccion > menu.size()) {
                System.out.println("Seleccione una pizza valida por favor.");
            } else {
                Pizza pizzaSeleccionada = menu.get(eleccion - 1);
                pedido.add(pizzaSeleccionada);
                System.out.println(pizzaSeleccionada.getNombre() + "Pizza agregada con exito.");
            }
        }
        return pedido;
    }

    public static double calcularTotal(List<Pizza> pedido) {
        double total = 0;
        for (Pizza pizza : pedido) {
            total += pizza.getPrecio();
        }
        return total;
    }

    public static void imprimirSumaPedido(List<Pizza> pedido, double total) {
        System.out.println("\nPedido realizado:");
        for (Pizza pizza : pedido) {
            System.out.println("- " + pizza.getNombre() + ": €" + pizza.getPrecio());
        }
        System.out.println("Total a pagar por su pedido: " + total + " €");
    }
}


