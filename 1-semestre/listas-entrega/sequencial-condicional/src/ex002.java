/* 2. Faca um algoritmo/programa para receber um número qualquer e 
*informar na tela se é par ou impar. */
package q2;
import java.util.Scanner;

public class ex002 {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        
        int a=leitor.nextInt();
        
        if (a % 2 == 0){
            System.out.println("o numero digitado e par.");   
        }else{
            System.out.println("o numero digitado e impar.");
        }
        
    }
    
}
