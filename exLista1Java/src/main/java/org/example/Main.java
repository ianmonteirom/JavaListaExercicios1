package org.example;
import java.util.Scanner;

public class Main {

    public static ConversorMedidas conversorMedidas = new ConversorMedidas();
    public static ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
    public static OperadorMatematico calculador = new OperadorMatematico();
    public static CalculaGastosLoja calculaGastos = new CalculaGastosLoja();
    public static CalculadoraArea calculadoraArea = new CalculadoraArea();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();

    }

    public static void exercicio1() {

        System.out.print("Digite o valor em metros que deseja converter: ");
        double valorEmMetros = scanner.nextDouble();
        double valorEmCentimetros = conversorMedidas.converterParaCentimetros(valorEmMetros);
        double valorEmMilimetros = conversorMedidas.converterParaMilimetros(valorEmMetros);

        System.out.println("Valor em centímetros: " + valorEmCentimetros);
        System.out.println("Valor em milímetros: " + valorEmMilimetros);

    }

    public static void exercicio2() {

        System.out.print("Digite o valor em graus Fahrenheit: ");
        double valorFahrenheit = scanner.nextDouble();
        double valorEmCeusius = conversorTemperatura.fahrenheitParaCelsius(valorFahrenheit);

        System.out.println("Valor convertido para graus Celsius: " + valorEmCeusius);

    }

    public static void exercicio3() {

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o operador: ");
        String operador = scanner.next();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        double resultado = calculador.Calcula(valor1, operador, valor2);

        System.out.println("Valor da operação: " + resultado);

    }

    public static void exercicio4() {

        System.out.print("Total valor gasto pela loja: R$");
        double totalGasto = scanner.nextDouble();

        double totalAPagar = calculaGastos.pagarValor(totalGasto, calculaGastos.escolherOpcaoPagamento());

        System.out.println("Total a pagar: R$" + totalAPagar);

    }

    public static void exercicio5() {

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura do terreno: ");
        double largura = scanner.nextDouble();

        double area = calculadoraArea.calcularArea(comprimento, largura);

        System.out.println("Area: " + area);

    }

}
