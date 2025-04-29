package org.treinai;

import java.util.Scanner;

public class Exercicio6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
      System.out.println("\nMenu:");
      System.out.println("1 - Adicionar");
      System.out.println("2 - Remover");
      System.out.println("3 - Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();

      if (opcao == 1) {
        System.out.println("Item adicionado!");
      } else if (opcao == 2) {
        System.out.println("Item removido!");
      } else if (opcao != 3) {
        System.out.println("Opção inválida, tente novamente.");
      }
    } while (opcao != 3);

    System.out.println("Programa encerrado.");
    scanner.close();
  }
}
