// 3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = 4;
        float v[] = new float [t];
        
        System.out.println("Digite 4 notas: ");
        for (int i = 0; i < 4; i++) {
            v[i] = sc.nextFloat();
        }
        
        
        System.out.println("As notas digitadas foram:");
        for (int i = 0; i < t; i++) {
            System.out.printf("nota %d: %f\n", i+1, v[i]);
        }

        System.out.println("-------------------\nA media das notas foi de: ");

        float media = 0;
        for (int i = 0; i < 4; i++) {
            media = media + v[i];
        }

        System.out.println(media/4);

        sc.close();
    }
}
