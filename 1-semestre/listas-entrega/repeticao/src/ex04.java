import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int n = sc.nextInt();

        System.out.println("Numeros impares ate o numero informado: ");
        int count = 0;
        if (n%2 != 0){ //se o numero digitado for ímpar
            while (count<=n){
                if (count%2 != 0 && count < n) {
                    System.out.print(count +", ");
                } else if (count%2 != 0 && count == n) {
                    System.out.print(count +".");
                }
            count++;
        }
        }else if (n%2 == 0){ // se o numero digitado for par
            while (count<=n){
                if (count%2 != 0 && count + 1 != n) {
                    System.out.print(count +", ");
                } else if (count+1 == n){
                    System.out.print(count +".");
                }
            count++;
            }
        }

        sc.close();
    }
    
}
