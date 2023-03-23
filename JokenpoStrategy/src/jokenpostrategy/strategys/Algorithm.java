/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jokenpostrategy.strategys;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Leandro Alves
 */
public abstract class Algorithm {

    protected final String key = "resultado";

    protected String value;

    protected Map<String, String> result = new HashMap<>();
    public abstract Map<String, String> execute(Type pType);
}
