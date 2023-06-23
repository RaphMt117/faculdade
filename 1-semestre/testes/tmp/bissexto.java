//codigo para saber se um ano foi bissexto

import java.util.Scanner;

public class bissexto{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano%400 == 0){
            System.out.printf("O ano %d e bissexto", ano);
        }else if(ano%100 != 0 && ano%4 == 0){
            System.out.printf("O ano %d e bissexto", ano);
        }else{
            System.out.printf("O ano %d não é bissexto", ano);
        }
        sc.close();
  }
}
