package org.treinai;

public class Exercicio11 {
  public static void main(String[] args) {

    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int soma = 0;

    for(int i = 0; i < nums.length; i++) {
      soma += nums[i];
    }
    System.out.println("Soma dos elements: " + soma);
  }
}
