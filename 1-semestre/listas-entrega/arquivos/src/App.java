import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = sc.nextInt();
        System.out.printf("Testejava");

        System.out.println("App.main");

        System.out.println("numero: "+a);
        
        sc.close();
    }
}
