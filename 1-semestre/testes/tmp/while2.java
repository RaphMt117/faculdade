import java.util.Scanner;

public class while2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float soma = 0;
    int count = 1;

    while (count<4){

      switch(count){
        case 1: System.out.println("Digite o primeiro numero: ");
        break;
        case 2: System.out.println("Digite o segundo numero: ");
        break;
        case 3: System.out.println("Digite o terceiro numero: ");
        break;
      }

      float a = sc.nextFloat();
      soma = soma+a;
      count ++;
    }

    System.out.printf("A soma dos 3 numeros e: %.2f", soma);

    sc.close();
  }
}
