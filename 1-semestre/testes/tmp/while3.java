import java.util.Scanner;

public class while3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, x = 0, soma;
    soma = 0;

    while(x<3){
      System.out.println("Digite um numero: ");
      a = sc.nextInt();
      soma = soma+a;
  x++;
}
System.out.println("soma: "+soma);

sc.close();

}
}
