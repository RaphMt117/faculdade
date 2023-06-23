/*5) Faça um algoritmo/programa que imprima o dobro de um número 
*caso ele seja positivo e o seu triplo caso seja negativo, imprimindo 
*o resultado.*/
package q5;
import java.util.Scanner;
public class ex005 {
    public static void main(String[] args) {
        
        Scanner leitor=new Scanner(System.in);
        System.out.print("digite um numero:");
        int a = leitor.nextInt();
        
        if (a<0){
            a=a*3;
            System.out.println("o numero digitado e negativo e seu triplo e: "+a);
        }else{
            a=a*2;
            System.out.println("o numero digitado e positivo e seu dobro e: "+a);
        }
        
    }
}
