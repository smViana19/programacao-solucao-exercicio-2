package org.treinai;

import java.util.Scanner;

public class Exercicio9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero = 5;
    for(int i = 1; i <= 10; i++) {
      System.out.println("5 x " + i + " = " + numero * i);
    }
    scanner.close();
  }
}
