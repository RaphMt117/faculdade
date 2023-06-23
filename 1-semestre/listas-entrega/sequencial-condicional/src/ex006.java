/*6) Faça um algoritmo/programa  que receba (leia) 3 notas de um aluno, 
*calcule e mostre uma mensagem de acordo com sua média:*/
package q6;
import java.util.Scanner;
public class ex006 {
    public static void main(String[] args) {
        
        //entrada de dados
        Scanner leitor=new Scanner(System.in);
        
        System.out.print("Digite sua primeira nota: ");
        float a=leitor.nextFloat();
        
        System.out.print("Digite sua segunda nota: ");
        float b=leitor.nextFloat();
        
        System.out.println("Digite sua terceira nota: ");
        float c=leitor.nextFloat();
        
        float media;
        
        //processamento 
        media=(a+b+c)/3;
        
        //saida de dados
        
        if (media>=0 && media<3){
            System.out.println("sua media foi de: "+media);
            System.out.println("REPROVADO");
        }
        if (media>=3 && media<7){
            System.out.println("sua media foi de: "+media);
            System.out.println("EXAME");
        }
        if (media>=7 && media<=10){
            System.out.println("sua media foi de: "+media);
            System.out.println("APROVADO");
        }
        if (media>10){
            System.out.println("nota invalida");
        }
        
        
    }
    
}
