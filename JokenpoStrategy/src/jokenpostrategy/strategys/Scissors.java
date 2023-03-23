/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jokenpostrategy.strategys;
import java.util.Map;

/**
 *
 * @author Leandro Alves
 */
public class Scissors extends Algorithm {
    
    @Override
    public Map<String, String> execute(Type pType) {
        switch (pType) {
            case PAPER -> value = "Win! Scissors cuts Papers!";
            case SCISSORS -> value = "Draw! Scissors draws with Scissors!";
            case STONE -> value = "Lost! Stone crushes Scissors!";
            case LIZARD -> value = "Win! Scissors decapitates Lizard!";
            case SPOCK -> value = "Loast! Spock smashes Scissors!";
            default -> value = "Invalid option!";
        }

        result.put(key, value);
        return result;
    }
}
