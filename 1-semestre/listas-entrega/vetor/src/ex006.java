//Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, imprima o
//número de alunos com média maior ou igual a 7.0.


import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //todo: trocar pra 10
        int qtdalunos = 5;
        int qtdnotas = 4;
        float notas[] = new float[qtdnotas];
        float medias[] = new float[qtdalunos];

        for (int i = 0; i < qtdalunos; i++) {

            System.out.printf("Digite as notas do %do aluno: \n", i+1);
            for (int j = 0; j < qtdnotas; j++) {

                switch (i){
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    default:
                        break;
                }

            }
        }
        sc.close();
    }
}
