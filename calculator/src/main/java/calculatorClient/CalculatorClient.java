package calculatorClient;

import calculator.Calculator;
import calculator.CalculatorSoap;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            // Instanciar el servicio y obtener el puerto
            Calculator calculatorService = new Calculator();
            CalculatorSoap port = calculatorService.getCalculatorSoap();

            // Llamar a las operaciones
        int a = 10;
        int b = 5;

        // Suma
        int sum = port.add(a, b);
        System.out.println("Suma: " + a + " + " + b + " = " + sum);

        // Resta
        int difference = port.subtract(a, b);
        System.out.println("Resta: " + a + " - " + b + " = " + difference);

        // Multiplicación
        int product = port.multiply(a, b);
        System.out.println("Multiplicación: " + a + " * " + b + " = " + product);

        // División
        int quotient = port.divide(a, b);
        System.out.println("División: " + a + " / " + b + " = " + quotient);
        } catch (Exception e) {
            System.err.println("Error al consumir el servicio: " + e.getMessage());
        }
    }
}
