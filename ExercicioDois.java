package Lista6;

import java.util.Scanner;

/*Faça um Programa que leia um vetor 
de 10 números reais e mostre-os na 
ordem inversa.*/

public class ExercicioDois {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Por favor, insira dez numeros reais: ");
        
        for (int i=0; i<=9; i++){
            nums[i] = scanner.nextInt();   
        } System.out.print(" Os dez numeros reais invertidos do vetor sao: ");
        for (int i=9; i>=0; i--){
            System.out.print(nums[i] + " ");
        }       

    scanner.close();
    }    
}