package Lista6;

import java.util.Scanner;
public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int NUM_ALUNOS = 10;
        double[] medias = new double[NUM_ALUNOS];
        
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            double somaNotas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                somaNotas += scanner.nextDouble();
            }
            medias[i] = somaNotas / 4;
        }
        
        int contadorAprovados = 0;
        for (int i = 0; i < NUM_ALUNOS; i++) {
            if (medias[i] >= 7.0) {
                contadorAprovados++;
            }
        }
        
        System.out.println("Número de alunos com média maior ou igual a 7.0: " + contadorAprovados);

        scanner.close();
    }
}