package Lista6;
import java.util.Scanner;
/*Faça um Programa que leia 4 notas, 
mostre as notas e a média na tela.  */

public class ExercicioTres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];

        System.out.print("Por favor, insira as 4 notas do aluno: ");
        for(int i=0; i<4; i++){
            notas[i] = scanner.nextDouble();
        }

        double soma = notas[0] + notas[1] + notas[2] + notas[3];
        double media = soma/4;

        System.out.println("Notas inseridas foram:");
        for (int i=0; i<4; i++){
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }
        System.out.println("A media foi: " + media);


        scanner.close();
    }
    
}
