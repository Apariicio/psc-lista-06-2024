package Lista6;

import java.util.Scanner;

/*Faça um Programa que leia um vetor 
de 5 números inteiros e mostre-os. */

public class ExercicioUm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5};

        System.out.print("Por favor, insira cinco numeros inteiros: ");
        
        for (int i=0; i<5; i++){
             nums[i] = scanner.nextInt();               
        }System.out.print(" Os cinco numeros inteiros do vetor sao: ");
        for (int i=0; i<5; i++){
            System.out.print(nums[i] + " ");
        }      

    scanner.close();
    }    
}