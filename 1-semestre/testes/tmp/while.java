import java.util.Scanner;

public class While {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("numeros de 0 a 100: ");
    int a = 1;
    while (a<=100){
      if((a%2)==0){
        System.out.print(a+",");
      }
      a++;
    }

    if(a==99){
      System.out.println("100.");
    }
  }
}

