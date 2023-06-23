import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salt = 0;
        int filt = 0;

        int count = 0;

        while (salt>=0){
            System.out.println("Digite o salário: ");
            float sal = sc.nextFloat();

            if (sal<0){
                break;
            }
            
            salt = salt + sal;

            System.out.println("Digite o numero de filhos: ");
            int fil = sc.nextInt();
            filt = filt + fil;


            count++;
        }

        float msal = salt/count;
        float mfil = (Math.round(filt/count));

        System.out.println("A media de salarios e: "+msal);
        System.out.println("A media de filhos e: "+mfil);


        sc.close();
    }
    
}
