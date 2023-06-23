import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float num = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        
        float dobro1 = 0, dobro2 = 0, dobro3 = 0, dobro4 = 0, dobro5 = 0;

        for (int i = 0; i < 5; i++) {
            switch(i){
                case 0:  
                System.out.print("Digite o primeiro numero: ");
                num = sc.nextFloat();
                dobro1 = num*2;
                break;
                case 1:  
                System.out.print("Digite o segundo numero: ");
                num2 = sc.nextFloat();
                dobro2 = num2*2;
                break;
                case 2:  
                System.out.print("Digite o terceiro numero: ");
                num3 = sc.nextFloat();
                dobro3 = num3*2; 
                break;
                case 3: 
                System.out.print("Digite o quarto numero: ");
                num4 = sc.nextFloat();
                dobro4 = num4*2;
                break;
                case 4:  
                System.out.print("Digite o quinto numero: ");
                num5 = sc.nextFloat();
                dobro5 = num5*2;
                break;
            }
        }
        System.out.printf("Dobro de %.2f: %.2f, \nDobro de %.2f: %.2f, \nDobro de %.2f: %.2f, \nDobro de %.2f: %.2f, \neDobro de %.2f: %.2f", num, dobro1, num2, dobro2, num3, dobro3, num4, dobro4, num5, dobro5);
        
        sc.close();
    }
    
}
