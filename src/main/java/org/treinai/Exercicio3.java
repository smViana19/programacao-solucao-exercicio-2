package org.treinai;

import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int senha = 1234;
    System.out.println("Digite a senha: ");
    int senhaDigitada = scanner.nextInt();
    while (senhaDigitada != senha) {
      System.out.println("Senha incorreta, tente novamente.");
      senhaDigitada = scanner.nextInt();
    }
    System.out.println("Acesso concedido.");
    scanner.close();
  }
}
