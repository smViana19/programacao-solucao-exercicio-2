package org.treinai;

import java.util.Scanner;

public class Exercicio13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String resposta;

    do {
      System.out.print("Digite o valor do investimento inicial (P): ");
      double P = scanner.nextDouble();

      System.out.print("Digite a taxa de juros anual: ");
      double r = scanner.nextDouble();

      System.out.print("Digite o período de investimento em anos (t): ");
      int t = scanner.nextInt();

      System.out.print("Escolha o tipo de capitalização (simples ou composta): ");
      String tipo = scanner.next();

      double M;

      if (tipo.equalsIgnoreCase("simples")) {
        M = P * (1 + (r / 100) * t);
      } else if (tipo.equalsIgnoreCase("composta")) {
        M = P * Math.pow(1 + (r / 100), t);
      } else {
        System.out.println("Tipo inválido. Será usado 'simples' como padrão.");
        M = P * (1 + (r / 100) * t);
      }

      System.out.printf("Montante final: R$ %.2f%n", M);

      System.out.print("Deseja fazer outro cálculo? (s/n): ");
      resposta = scanner.next();
    } while (resposta.equalsIgnoreCase("s"));

    System.out.println("Programa encerrado.");
    scanner.close();
  }
}
