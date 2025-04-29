package org.treinai;

import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int numAleatorio = random.nextInt(20) + 1;
    int palpite;
    int tentativas = 0;

    System.out.println("Adivinhe o número (entre 1 e 20)!");

    do {
      System.out.print("Digite seu palpite: ");
      palpite = scanner.nextInt();
      tentativas++;

      if (palpite < numAleatorio) {
        System.out.println("O número é maior!");
      } else if (palpite > numAleatorio) {
        System.out.println("O número é menor!");
      }
    } while (palpite != numAleatorio);

    System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s)!");
    scanner.close();
  }
}
