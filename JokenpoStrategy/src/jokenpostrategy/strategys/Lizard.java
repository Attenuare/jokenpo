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
public class Lizard extends Algorithm{
    
    @Override
    public Map<String, String> execute(Type pType) {
        switch (pType) {
            case PAPER -> value = "Win. Lizard eats Paper!";
            case SCISSORS -> value = "Lost! Scissors decapitates Lizard!";
            case STONE -> value = "Lost! Stone crushes Lizard!";
            case LIZARD -> value = "Draw! Lizard draws with Lizard!";
            case SPOCK -> value = "Win! Lizard poisons Spock!";
            default -> value = "Invalid option!";
        }

        result.put(key, value);
        return result;
    }
}
