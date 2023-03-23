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
public class Stone extends Algorithm {
    
    @Override
    public Map<String, String> execute(Type pType) {
        switch (pType) {
            case PAPER -> value = "Lost! Paper covers Stone!";
            case SCISSORS -> value = "Win! Stone crushes Scissors!";
            case STONE -> value = "Draw! Stone draws with Stone!";
            case LIZARD -> value = "Win! Stone crushes Lizard!";
            case SPOCK -> value = "Lost! Spock vapourizes Stone!";
            default -> value = "Invalid Option!";
        }

        result.put(key, value);
        return result;
    }
}
