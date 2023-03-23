/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jokenpostrategy.strategys;

/**
 *
 * @author Leandro Alves
 */
public enum Type {
    PAPER(1), SCISSORS(2), STONE(3), LIZARD(4), SPOCK(5);

    Type(Integer pId) {
        this.id = pId;
    }

    private final Integer id;

    public Integer getId() {
        return id;
    }

    public static Type getInstance(Integer pId) {
        for (Type t: Type.values()) {
            if(t.getId().equals(pId)) {
                return t;
            }
        }
        throw new RuntimeException(String.format("Not a valid type. Id: %d", pId));
    }
}
