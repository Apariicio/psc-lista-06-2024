package Lista6;
import java.util.Scanner;
/*Faça um Programa que leia um vetor de 10 caracteres, e diga quantas 
consoantes foram lidas. Imprima as consoantes. */

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] caracteres = new char[10];
        System.out.print("Por favor, insira 10 caracteres: ");        
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = scanner.next().charAt(0);
        }
        int qntConsoante = 0;
        System.out.print("Consoantes lidas: ");
        for (char c : caracteres){
            if (Character.isLetter(c) && !"aeiouAEIOU".contains(String.valueOf(c))){
                qntConsoante++;
                System.out.print(c +" - ");
            }
        }
        System.out.println("\nTotoal de consoantes e: " + qntConsoante);
                
    scanner.close();
    
    }
}