package org.example;

public class OperadorMatematico {

    public double Calcula(double valor1, String operador, double valor2) {
        switch (operador) {
            case "+":
                return valor1 + valor2;
            case "-":
                return valor1 - valor2;
            case "*":
                return valor1 * valor2;
            case "/":
                return valor1 / valor2;
        }
        return 0;
    }

}
