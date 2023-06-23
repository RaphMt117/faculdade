// 2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v[] = new int [10];

        System.out.println("Digite 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextInt();
        }

        System.out.println("Os numeros digitados na ordem inversa sao:");
        for (int i = 10; i > 0; i--) {
            System.out.printf("---[%d] = %d\n", i-1, v[i-1]);
        }

        sc.close();
    }
}
