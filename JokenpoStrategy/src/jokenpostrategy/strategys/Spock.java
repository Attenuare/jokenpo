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
public class Spock extends Algorithm{
    
    @Override
    public Map<String, String> execute(Type pType) {
        switch (pType) {
            case PAPER -> value = "Lost! Paper disproves Spock!";
            case SCISSORS -> value = "Win! Spock smashes Scissors!";
            case STONE -> value = "Win! Spock vapourizes Stone!";
            case LIZARD -> value = "Lost! Lizard poisons Spock!";
            case SPOCK -> value = "Draw! Spock draws with Spock!";
            default -> value = "Invalid option!";
        }

        result.put(key, value);
        return result;
    }
}
