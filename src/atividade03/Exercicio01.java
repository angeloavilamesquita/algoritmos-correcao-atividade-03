package atividade03;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Em uma papelaria, até 100 folhas, a cópia custa R$ 0,25, 
 * e acima de 100 folhas custa R$ 0,20. 
 * Dado o total de cópias, informe o total a ser pago
 */
public class Exercicio01 {
    
    public static final int COPY_NUMBER_FOR_PROMOTION = 100;
    public static final double COST_DEFAULT = 0.25;
    public static final double COST_PROMOTION = 0.20;
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o numero de folhas: ");
        int numberOfPages = read.nextInt();
        double costPerPage = COST_DEFAULT;
        if (numberOfPages > COPY_NUMBER_FOR_PROMOTION) {
            costPerPage = COST_PROMOTION;
        }
        double totalToBePaid = numberOfPages * costPerPage;
        DecimalFormat format = new DecimalFormat("#.##");
        totalToBePaid = Double.valueOf(format.format(totalToBePaid));
        System.out.println("Total a ser pago: " + totalToBePaid);
    }
    
}
