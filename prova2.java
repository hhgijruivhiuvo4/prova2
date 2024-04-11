package logica;

import java.util.Scanner;

public class prova2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeJogadores;
        System.out.print("Digite a quantidade de jogadores: ");
        quantidadeJogadores = sc.nextInt();

        int idade, idadeTotal = 0, quantidadeMenores18 = 0;
        double peso, pesoTotal = 0, altura, alturaTotal = 0;
        int quantidadeMais80kg = 0;

        for (int i = 1; i <= quantidadeJogadores; i++) {
            System.out.println("\nJogador " + i + ":");
            
            System.out.print("Idade: ");
            idade = sc.nextInt();
            idadeTotal += idade;
            
            if (idade < 18) {
                quantidadeMenores18++;
            }

            System.out.print("Peso (em kg): ");
            peso = sc.nextDouble();
            pesoTotal += peso;

            if (peso > 80) {
                quantidadeMais80kg++;
            }

            System.out.print("Altura (em metros): ");
            altura = sc.nextDouble();
            alturaTotal += altura;
        }

        double mediaIdade = (double) idadeTotal / quantidadeJogadores;
        double mediaAltura = alturaTotal / quantidadeJogadores;
        double porcentagemMais80kg = (double) quantidadeMais80kg / quantidadeJogadores * 100;

        System.out.println("\nResultados:");
        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + quantidadeMenores18);
        System.out.println("Média das idades dos jogadores: " + mediaIdade);
        System.out.println("Média das alturas dos jogadores: " + mediaAltura + " metros");
        System.out.printf("Porcentagem de jogadores com mais de 80 kg: %.2f%%\n", porcentagemMais80kg);

        sc.close();
    }
}
