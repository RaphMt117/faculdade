import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num = 0;
        float nmaior = 0;
        float nmenor = 0;

        System.out.println("Digite a 1a nota: ");
        num = sc.nextFloat();

        nmaior = num;
        nmenor = num;

        for (int i = 2; i < 6; i++) {
            
            System.out.printf("Digite a %da nota: ", i);
            num = sc.nextFloat();

            if(num>nmaior){
                nmaior = num;
            }else if(num<nmenor){
                nmenor = num;
            }
        }

        System.out.println("O maior numero digitado e: "+nmaior);
        System.out.println("O menor numero digitado e: "+nmenor);

        sc.close();
    }
}
