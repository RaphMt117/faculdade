// Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

import java.util.Scanner;

public class ex001 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int tamanho_vetor = 5;
    int v[] = new int[tamanho_vetor];

    for (int i = 0; i < tamanho_vetor; i++) {
      System.out.printf("Digite o %do numero: ", i+1);
      v[i] = sc.nextInt();
    }

    System.out.println("Os numeros digitados foram: ");

    for (int j = 0; j < tamanho_vetor; j++) {
      System.out.printf("---[%d]: %d\n", j, v[j]);
    }


    sc.close();
  }
}
