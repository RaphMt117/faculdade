import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdm = 0;
        int qtdf = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite seu sexo: use 'm' para masculino e 'f' para feminino.");
            String sexo = sc.next();
            System.out.println("Digite seu peso: ");
            float peso = sc.nextFloat();

            switch (sexo){
                case "m": if (peso>=60 && peso<=80){
                    qtdm++;
                }
                break;
                case "f": if (peso>=50 && peso<=70){
                    qtdf++;
                }
                break;
                default: System.out.println("Sexo invalido, use 'm' ou 'f'. Tente novamente");
                System.exit(0);
                break;
            }
        }
        System.out.println("A quantidade de homens com peso entre 60 e 80 e de: "+qtdm+ " homens");
        System.out.println("A quantidade de mulheres com peso entre 50 e 70 e de: "+qtdf+ " mulheres");

        sc.close();
    }
}
