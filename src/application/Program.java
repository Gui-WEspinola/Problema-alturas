package application;

import entities.Pessoa;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int qntPessoa = scanner.nextInt();

        Pessoa[] pessoas = new Pessoa[qntPessoa];
        ArrayList<String> menorDe16 = new ArrayList<>();

        double mediaAltura = 0;
        int cont = 1;

        for (Pessoa ps : pessoas) {
            System.out.printf("Dados da %da pessoa: %n", cont++);
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            Integer idade = scanner.nextInt();

            System.out.print("Altura: ");
            Double altura = scanner.nextDouble();

            Pessoa p = new Pessoa(nome, idade, altura);

            mediaAltura += p.getAltura();

            if (p.getIdade() < 16){
                menorDe16.add(p.getNome());
            }
        }

        System.out.printf("\nAltura média: %.2f%n" , mediaAltura / qntPessoa);
        System.out.println("Pessoas com menos de 16 anos: " + menorDe16.size() * 100 / qntPessoa + "%");

        for (String s : menorDe16) {
            if (s != null)
                System.out.println(s);
        }
    }
}
