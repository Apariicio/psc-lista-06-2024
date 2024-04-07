package Lista6;

import java.util.Scanner;

/*Faça um Programa que leia um vetor de 5 números inteiros, 
mostre a soma, a multiplicação e os números. */

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] nums = new int[5];
        System.out.println("Insira 5 números inteiros: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int soma = 0;
        int mult = 1;
        for (int numero : nums) {
            soma += numero;
            mult *= numero;
        }
        
        System.out.print("Números digitados sao: ");
        for (int numero : nums) {
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.println("A soma é: " + soma);
        System.out.println("A multiplicação é: " + mult);

        scanner.close();
    }
}