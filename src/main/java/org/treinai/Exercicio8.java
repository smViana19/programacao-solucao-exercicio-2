package org.treinai;

import java.util.Scanner;

public class Exercicio8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int cont = 0;
    double soma = 0;
    String rsp = "";
    do {
      System.out.println("Digite uma nota de 0 a 10");
      double nota = scanner.nextDouble();
      if(nota >= 0 && nota <= 10) {
        soma += nota;
        cont++;
      } else {
        System.out.println("Nota invalida, digite uma nota entre 0 a 10");
      }
      System.out.print("Deseja inserir outra nota? (s/n): ");
      rsp = scanner.nextLine();
    } while (rsp.equalsIgnoreCase("s"));

    if(cont > 0) {
      double media = soma / cont;
      System.out.println("Média: " + media);
    } else {
      System.out.println("Nenhuma nota e valida");
    }
    scanner.close();
  }
}
