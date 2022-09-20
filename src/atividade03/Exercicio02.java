package atividade03;

import java.util.Scanner;

/**
 * Dada uma letra (S, C, D ou V), 
 * informe o estado civil correspondente por extenso 
 * (Solteiro, Casado, Divorciado ou Viúvo).
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite seu estado civil (S, C, D ou V): ");
        char civilStatus = read.next().charAt(0);
        switch (civilStatus) {
            case 'S' -> System.out.println("S - Solteiro");
            case 'C' -> System.out.println("C - Casado");
            case 'D' -> System.out.println("D - Divorciado");
            case 'V' -> System.out.println("V - Viuvo");
            default -> System.out.println("Opcao Invalida");
        }
    }
    
}
