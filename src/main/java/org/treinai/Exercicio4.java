package org.treinai;

public class Exercicio4 {
  public static void main(String[] args) {
    int contador = 0;
    int a = 0;
    int b = 1;

    while (contador < 10) {
      System.out.print(a);

      if (contador < 9) {
        System.out.print(", ");
      }

      int proximo = a + b;
      a = b;
      b = proximo;

      contador++;
    }
  }
}
