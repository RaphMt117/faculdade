// 4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as
// consoantes.

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = 10;
        String v[] = new String[t];
        
        System.out.println("Digite 10 caracteres minusculos: ");
        for (int i = 0; i < t; i++) {
            v[i] = sc.next();
            v[i] = v[i].toLowerCase();
        }
        
        String consoante [] = new String[t];
        
        int qtdconsoante = 10;
        for (int i = 0; i < v.length; i++) {
            switch (v[i]) {
                case "a":
                qtdconsoante --;
                break;
                
                case "e":
                qtdconsoante --;
                break;
                
                case "i":
                qtdconsoante --;
                break;
                
                case "o":
                qtdconsoante --;
                break;
                
                case "u":
                qtdconsoante --;
                break;
                
                default:
                consoante[i] = v[i];
                
                break;
            }
        }
        
        System.out.println("--------------------------------");
        System.out.printf("Foram digitadas %d consoantes.\n", qtdconsoante);
        System.out.println("--------------------------------");

        System.out.println("Lista de consoantes: ");
        for (int i = 0; i < v.length; i++) {
            if (consoante[i] != null){
                System.out.print(consoante[i]+" ");
            }
        }
       
        sc.close();
    }
}
