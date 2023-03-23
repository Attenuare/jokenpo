/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jokenpostrategy;

import jokenpostrategy.strategys.JokenpoSubstitution;
import jokenpostrategy.strategys.Algorithm;
import jokenpostrategy.strategys.Lizard;
import jokenpostrategy.strategys.Paper;
import jokenpostrategy.strategys.Scissors;
import jokenpostrategy.strategys.Spock;
import jokenpostrategy.strategys.Stone;
import jokenpostrategy.strategys.Type;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Leandro Alves
 */
public class JokenpoStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var jokenposub = new JokenpoSubstitution();

        System.out.println("Choose a option:\n");
        System.out.println("\t1-Paper\n\t2-Scissors\n\t3-Stone\n\t4-Lizard\n\t5-Spock\nChoice: \n");
                
        int play = sc.nextInt();
        int computer = new Random().nextInt(5) + 1;
        System.out.println("The computer chose: " + Type.getInstance(computer));

        var algoritmo = getAlgorithm(play);

        jokenposub.setAlgorithm(algoritmo);
        Type tipoJogadaComputador = Type.getInstance(computer);

        jokenposub.jogar(tipoJogadaComputador);

        sc.close();

    }
    private static Algorithm getAlgorithm(Integer pId) {
        Algorithm algorithm;
        switch (pId) {
            case 1 -> algorithm = new Paper();
            case 2 -> algorithm = new Scissors();
            case 3 -> algorithm = new Stone();
            case 4 -> algorithm = new Lizard();
            case 5 -> algorithm = new Spock();
            default -> throw new IllegalStateException("Unexpected value: " + pId);
        }
        return algorithm;
    }
    
}
