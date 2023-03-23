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
public class JokenpoSubstitution {

    private Algorithm algorithm;

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void jogar(Type pType) {
        Map<String, String> map = algorithm.execute(pType);
        System.out.println(map);
    }
}
