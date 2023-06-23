import java.util.Scanner;

public class seidor{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = leitor.nextInt();


        //condições para erro do código
        if ((n1<=0 ) || (n2<=0)){
            System.out.println("erro");
            System.exit(1);
        }else if(n1>n2){
            System.out.println("erro");
            System.exit(1);
        }else if((n2-n1)<5){
            System.out.println("erro");
            System.exit(1);
        }else{

            //lista 1 - crescente;
            System.out.println("// Lista 1: ");
            int l1=n1;
            while(l1<=n2){
                System.out.print(l1);
                l1++;
                if(l1<=n2){
                    System.out.print(",");
                }else{
                    System.out.print(".\n");
                }
            }

            // lista 2 - decrescente;
            System.out.println("// Lista 2: ");
            int l2 = n2;
            while(l2>=n1){
                System.out.print(l2);
                l2--;
                if(l2>=n1){
                    System.out.print(",");
                }else{
                    System.out.print(".\n");
                }
            }

            //soma dos numeros da lista;
            int soma = 0;
            int s1 = n1;
            while(s1<=n2){
                soma = soma + s1;
                s1++;
            }
            System.out.println("// Soma dos itens da lista: "+soma);

            // media aritmedica dos numeros da lista;
            int m1=n1;
            int count = 0;
            while(m1<=n2){
                m1++;
                count++;
            }
            int media = soma/count;
            System.out.println("// Media aritmedica dos itens da lista: "+media);

            // produto da multiplicação do item 3 da lista crescente e do item
            // 5 da lista decrescente;
            int count1 = 1, count2 =1;
            int f1 = 0;
            int f2 = 0;

            int h1 = n1;
            int h2 = n2;

            while(h1<=n2){
                if (count1==3){
                    f1 = h1;
                }
                h1++;
                count1++;
            }
            while(h2>=n1){
                if (count2==5){
                    f2 = h2;
                }
                h2--;
                count2++;
            }
            System.out.println("\n// O produto do item 3 da lista crescente \ne do item 5 da lista decrescente: "+(f1*f2));
        }
        leitor.close();
    }
}
