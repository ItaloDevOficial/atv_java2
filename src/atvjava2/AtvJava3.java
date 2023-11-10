package atvjava2;
import java.util.Scanner;
public class AtvJava3 {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Insira seu saldo");

        double saldoInicial = valor.nextDouble();

        double saldoAtualizado = saldoInicial * 1.01; // Reajuste de 1%

        System.out.println("Saldo atualizado: " + saldoAtualizado);

    }
}
