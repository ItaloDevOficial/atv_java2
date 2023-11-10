package atvjava2;
import java.util.Scanner;

public class AtvJava1 {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Quantos anos você tem ?");
        int anos = valor.nextInt();

        anos = anos * 365;

        System.out.println("Quantos meses você tem ?");
        int meses = valor.nextInt();

        meses = meses * 30;

        System.out.println("Quantos dias você tem ?");
        int dias = valor.nextInt();

        int total = anos + meses + dias;

        System.out.println("O total é de " + total + " Dias ");

    }
}
