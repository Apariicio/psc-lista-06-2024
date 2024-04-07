package Lista6;

import java.util.Scanner;
/*Faça um Programa que leia 20 números inteiros e 
armazene-os num vetor. 
Armazene os números pares no vetor PAR e os 
números IMPARES no vetor ímpar. Imprima os três vetores. */

public class ExercicioCinco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);        

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contPar = 0;
        int contImpar = 0;
        
        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[contPar++] = numeros[i];
            } else {
                impares[contImpar++] = numeros[i];
            }
        }
       
        System.out.println("Os números digitados foram: :");
        imprimirVetor(numeros);
        System.out.println("Os números pares sao: ");
        imprimirVetor(pares, contPar);
        System.out.println("Os números ímpares sao: ");
        imprimirVetor(impares, contImpar);

        scanner.close();
    }

    public static void imprimirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
    
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
    }
}