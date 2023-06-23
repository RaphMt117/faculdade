import java.util.Scanner;

public class fluxograma {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int soma = num1+num2;

    if ((soma>5)&&(soma<=10)){
      int result = soma + 5;
      System.out.println(result);
    }else{
      int result = soma - 3;
      System.out.println(result);
    }
    sc.close();
  }

}
