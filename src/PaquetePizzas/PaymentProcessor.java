package PaquetePizzas;

public class PaymentProcessor implements Payment{
    public void processPayment(double importe) {
        System.out.println("haciendo pago de " + importe + " €" + ". El pago se ha hecho correctamente.");
    }
}
