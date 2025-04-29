package org.treinai;

import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = 0;
    do {
      System.out.println("Digite um numero");
      n = scanner.nextInt();

    } while (n > 100);
      System.out.println("Esta dentro dos 100");
      scanner.close();
  }
}
