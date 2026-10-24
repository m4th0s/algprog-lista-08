import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> temperaturas = new ArrayList<>();

        String[] meses = {
            "Janeiro", "Fevereiro", "Março",
            "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro",
            "Outubro", "Novembro", "Dezembro"
        };

        double temperatura = 0;
        double soma = 0;
        double media = 0;
        String resultado = "";

        for (int i = 0; i < 12; i++) {
            System.out.println("Digite a temperatura de " + meses[i] + ":");
            temperatura = sc.nextDouble();

            temperaturas.add(temperatura);
            soma = soma + temperatura;
        }

        media = soma / 12;

        resultado = "Temperaturas acima da média anual:\n";

        for (int i = 0; i < 12; i++) {
            if (temperaturas.get(i) > media) {
                resultado = resultado + meses[i] + ": "
                    + temperaturas.get(i) + "\n";
            }
        }

        System.out.println("\nMédia anual: " + media);
        System.out.println(resultado);

        sc.close();
    }
}