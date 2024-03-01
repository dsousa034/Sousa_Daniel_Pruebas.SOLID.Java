package PaquetePizzas;

import java.util.List;
import java.util.Scanner;

public class ImplementacionOrderManager {
    private DataBase databManager;
    private Scanner scanner;
    private Payment procesadorPago;

    public ImplementacionOrderManager(DataBase dbManager, Scanner scanner, Payment paymentProcessor) {
        this.databManager = dbManager;
        this.scanner = scanner;
        this.procesadorPago = paymentProcessor;
    }
    public void createOrder() {
        List<Pizza> pedido = Usuario.seleccionarPizza(scanner);
        if (!pedido.isEmpty()) {
            double total = Usuario.calcularTotal(pedido);
            Usuario.imprimirSumaPedido(pedido, total);
            procesadorPago.processPayment(total);
            databManager.procesarConsulta("INSERT INTO pedidos (pizzas, total) VALUES ('" + pedido + "', " + total + ")");
        } else {
            System.out.println("No se ha agregado ninguna pizza al pedido.");
        }
    }
}
