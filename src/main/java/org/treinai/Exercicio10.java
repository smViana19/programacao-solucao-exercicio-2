package org.treinai;

import java.util.Scanner;

public class Exercicio10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero inteiro: ");
    int numero = scanner.nextInt();
    int fatorial = 1;

    for(int i = 1; i <= numero; i++) {
      fatorial *=i;
    }
    System.out.println("Fatorial de " + numero + " é: " + fatorial);
  }
}
