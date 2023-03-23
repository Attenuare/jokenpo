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
public class Paper extends Algorithm{
    
    @Override
    public Map<String, String> execute(Type pType) {
        switch (pType) {
            case PAPER -> value = "Draw! Paper draws with Paper!";
            case SCISSORS -> value = "Lost! Scissors cuts Paper!";
            case STONE -> value = "Win! Paper covers Stone!";
            case LIZARD -> value = "Lost! Lizard eats Paper!";
            case SPOCK -> value = "Win! Paper disproves Spock!";
            default -> value = "Invalid option!";
        }

        result.put(key, value);
        return result;
    }
}
