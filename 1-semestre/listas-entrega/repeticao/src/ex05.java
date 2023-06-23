import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor das temperaturas coletadas nos 10 primeiros dias do mês de janeiro de 2021");

        float media = 0;
        for (int i = 0; i < 10; i++) {
            float temp = sc.nextFloat();
            media = media + temp;
        }

        System.out.printf("A media das temperaturas digitadas foi de: %.2f", media/10);

        sc.close();
    }
}
