import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idtotal = 0;
        int qtdpeso = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite sua idade: ");
            int id = sc.nextInt();
            idtotal = idtotal + id;

            System.out.print("Digite seu peso em kg: ");
            float p = sc.nextFloat();
            if (p>90){
                qtdpeso++;
            }

        }
        System.out.println("------------------------------------------");
        System.out.println("Quantidade de pessoas com mais de 90kg: "+qtdpeso);
        System.out.println("Média das idades: "+(idtotal/7));
        System.out.println("------------------------------------------");
        sc.close();
    }
}
