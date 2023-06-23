import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota = 0;
        int loop = 0;

        while (loop==0){
            System.out.println("Informe sua matrícula: ");
            int mat = sc.nextInt();

            if (mat<0){
                System.exit(mat);
            }else{

            for(int count = 1; count <= 3; count++){

                if(count==1){
                    System.out.println("Digite a primeira nota: ");
                    int a = sc.nextInt();
                    nota = nota + a;
                }else if(count==2){
                    System.out.println("Digite a segunda nota");
                    int a = sc.nextInt();
                    nota = nota + a;
                }else if(count==3){
                    System.out.println("Digite a terceira nota: ");
                    int a = sc.nextInt();
                    nota = nota + a;
                }
            }
            int media = (nota/3);
            if (media>=70){
            System.out.printf("A media e de %d e voce foi aprovado\n-----------\n", media);
            }else if(media>=60 && media<70){
                System.out.printf("A media e de %d e voce fara exame\n-----------\n", media);
            }else if(media<60){
                System.out.printf("A media e de %d e voce foi reprovado\n-----------\n", media);
            }
        }
        }
        sc.close();
    }
}
