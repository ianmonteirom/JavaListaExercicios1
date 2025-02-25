package org.example;
import java.util.Scanner;

public class CalculaGastosLoja {

    public static Scanner scanner = new Scanner(System.in);

    public String escolherOpcaoPagamento() {
        System.out.println("Escolha a opção de pagamento: \n" +
                "1) À vista com 10% de desconto\n" +
                "2) Em duas vezes sem juros");

        int opc = scanner.nextInt();

        return switch (opc) {
            case 1 -> "a vista";
            case 2 -> "parcelado";
            default -> "";
        };

    }

    public double pagarValor(double valor, String opcao) {

        return switch (opcao) {
            case "a vista" -> valor - (valor * 0.1);
            case "parcelado" -> valor / 2;
            default -> valor;

        };

    }

}
