/*1. Faça um algoritmo/programa que leia os valores A, B, C e imprima na tela se
*a soma de A + B é menor que C.*/
package ex01;
import java.util.Scanner;
        
public class Ex01 {
    public static void main(String[] args) {
        
        //entrada de dados
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int a = leitor.nextInt();
        System.out.println("Digite outro número");
        int b = leitor.nextInt();
        System.out.println("Digite outro número:");
        int c = leitor.nextInt();
        
        //saída de dados
        if(a+b<c){
            System.out.println("a soma dos dois primeiros números é menor que o terceiro");
        }else{
            System.out.println("a soma dos dois primeiros números é maior que o terceiro");
        }
    }
    
}