import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> vendas = new ArrayList<>();
        int[] contadores = new int[9];

        int quantidade = 0;
        int faixa = 0;
        double venda = 0;
        double salario = 0;
        String resultado = "";

        System.out.println("Digite a quantidade de vendedores:");
        quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite as vendas brutas do vendedor "
                + (i + 1) + ":");

            venda = sc.nextDouble();
            vendas.add(venda);
        }

        for (int i = 0; i < vendas.size(); i++) {
            salario = 200 + (vendas.get(i) * 0.09);

            faixa = (int) salario / 100 - 2;

            if (faixa < 0) {
                faixa = 0;
            }

            if (faixa > 8) {
                faixa = 8;
            }

            contadores[faixa]++;
        }

        resultado = "Quantidade de vendedores por faixa salarial:\n";
        resultado = resultado + "R$ 200 a R$ 299: "
            + contadores[0] + "\n";
        resultado = resultado + "R$ 300 a R$ 399: "
            + contadores[1] + "\n";
        resultado = resultado + "R$ 400 a R$ 499: "
            + contadores[2] + "\n";
        resultado = resultado + "R$ 500 a R$ 599: "
            + contadores[3] + "\n";
        resultado = resultado + "R$ 600 a R$ 699: "
            + contadores[4] + "\n";
        resultado = resultado + "R$ 700 a R$ 799: "
            + contadores[5] + "\n";
        resultado = resultado + "R$ 800 a R$ 899: "
            + contadores[6] + "\n";
        resultado = resultado + "R$ 900 a R$ 999: "
            + contadores[7] + "\n";
        resultado = resultado + "R$ 1000 em diante: "
            + contadores[8];

        System.out.println("\n" + resultado);

        sc.close();
    }
}