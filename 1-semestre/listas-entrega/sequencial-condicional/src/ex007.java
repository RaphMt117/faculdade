package q7;
import java.util.Scanner;

public class ex007 {
    public static void main (String[] args){
        
        //declaracao de variaveis
        Scanner leitor=new Scanner(System.in);
        float p, h, imc;
        
        System.out.print("Digite seu peso: ");
        p=leitor.nextFloat();
        
        System.out.print("Digite sua altura: ");
        h=leitor.nextFloat();
        
        imc=p/(h*h);
        
        
        if (imc<20){
            System.out.printf("seu imc e de %.2f e voce esta abaixo do peso \n", imc);
        }
        
        if (imc>=20 && imc<25){
            System.out.printf("seu imc e de %.2f e voce esta com peso normal \n", imc);
        }
        
        if (imc>=25 && imc<30){
            System.out.printf("seu imc e de %.2f e voce esta com sobre peso \n", imc);
        }
        
        if (imc>=30 && imc<40){
            System.out.printf("seu imc e de %.2f e voce esta obeso \n", imc);
        }
        
        if (imc>=40){
            System.out.printf("seu imc e de %.2f e voce esta com obesidade morbida \n", imc);
        }
        
    }
     
}
