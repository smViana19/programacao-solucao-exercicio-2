package org.treinai;

import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int soma = 0;

    System.out.println("Digite um numero inteiro positivo: ");

    int numero = scanner.nextInt();
    while (numero >= 0) {
      soma+=numero;
      System.out.println("Digite outro numero");
      numero = scanner.nextInt();
    }

    System.out.println("Soma total: " + soma);
    scanner.close();
  }
}
