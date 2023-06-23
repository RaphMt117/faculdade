// 5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor
// PAR e os números IMPARES no vetor impar. Imprima os três vetores.


import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 20;
        int numero[] = new int[n];
        int par[] = new int[n];
        int impar[] = new int[n];

        // TODO: trocar pra 20

        System.out.println("Digite 20 numeros: ");
        for (int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextInt();
        }

        for (int i = 0; i < numero.length; i++) {
            if (numero[i]%2 == 0){
                par[i] = numero[i];
            }else{
                impar[i] = numero[i];
            }
        }

        System.out.println("\n--------------------------");
        System.out.println("Numeros digitados: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("\n---[%d] %d", i, numero[i]);
        }

        System.out.println("\n--------------------------");
        System.out.println("Numeros pares: ");
        for (int i = 0; i < par.length; i++) {
            System.out.printf("\n---[%d]: %d", i, par[i]);
        }

        System.out.println("\n--------------------------");
        System.out.println("Numero impares: ");
        for (int i = 0; i < impar.length; i++) {
            System.out.printf("\n---[%d]: %d", i, impar[i]);
        }


        sc.close();
    }
}
