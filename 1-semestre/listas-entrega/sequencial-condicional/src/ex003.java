/*3) Faça um algoritmo/programa que leia dois valores inteiros A e B 
*se os valores forem iguais deverá se somar os dois, caso contrário 
*multiplique A por B. Ao final de qualquer um dos cálculos deve-se 
*atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.*/

package q3;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {

    Scanner leitor=new Scanner(System.in);
    
    int a,b,c;
    
    System.out.println("digite um numero: ");
    a = leitor.nextInt();
    System.out.println("digite outro numero: ");
    b = leitor.nextInt();
    
    if (a==b){
        c=a+b;
        System.out.println("sao iguais e a soma dos numeros e: "+c);
    }else{
        c=a*b;
        System.out.println("sao diferentes e a multiplicacao dos numeros e: "+c);
    }
    
}
}
