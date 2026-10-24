import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> perguntas = new ArrayList<>();
        ArrayList<String> respostas = new ArrayList<>();

        int positivas = 0;
        String resposta = "";
        String classificacao = "";

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println(perguntas.get(i) + " (s/n)");
            resposta = sc.next().toLowerCase();

            respostas.add(resposta);

            if (resposta.equals("s")) {
                positivas++;
            }
        }

        if (positivas == 2) {
            classificacao = "Suspeita";
        } else if (positivas == 3 || positivas == 4) {
            classificacao = "Cúmplice";
        } else if (positivas == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("\nQuantidade de respostas positivas: "
            + positivas);
        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}