import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        double nota = 0;
        double soma = 0;
        double media = 0;
        int quantidade = 0;
        int acimaMedia = 0;
        int abaixoSete = 0;
        String ordemNormal = "";
        String ordemInversa = "";

        System.out.println("Digite as notas (-1 para encerrar):");
        nota = sc.nextDouble();

        while (nota != -1) {
            notas.add(nota);
            soma = soma + nota;

            nota = sc.nextDouble();
        }

        quantidade = notas.size();

        if (quantidade > 0) {
            media = soma / quantidade;

            for (int i = 0; i < quantidade; i++) {
                ordemNormal = ordemNormal + notas.get(i) + " ";

                if (notas.get(i) > media) {
                    acimaMedia++;
                }

                if (notas.get(i) < 7) {
                    abaixoSete++;
                }
            }

            for (int i = quantidade - 1; i >= 0; i--) {
                ordemInversa = ordemInversa
                    + notas.get(i) + "\n";
            }
        }

        System.out.println("\nQuantidade de valores: " + quantidade);
        System.out.println("Valores na ordem informada: " + ordemNormal);
        System.out.println("Valores na ordem inversa:\n" + ordemInversa);
        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);
        System.out.println("Valores acima da média: " + acimaMedia);
        System.out.println("Valores abaixo de sete: " + abaixoSete);
        System.out.println("Programa encerrado!");

        sc.close();
    }
}