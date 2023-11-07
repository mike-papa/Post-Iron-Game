package com.example.postirongame.gameCharacter;

import lombok.*;
@Data
public class GameCharacter {
    static GameCharacter instance;
    @Getter @Setter private GameCharacterClass gameCharacterClass;
    @Getter @Setter private int strength;
    @Getter @Setter private int agility;
    @Getter @Setter private int endurance;
    @Getter @Setter private int charisma;
    @Getter @Setter private int intelligence;
    @Getter @Setter private int luck;
    @Getter @Setter private String description;

    private GameCharacter() {

    }

    public static GameCharacter getInstance() {
        if (instance == null) {
            instance = new GameCharacter();
        }
        return instance;
    }
    public static void createGameCharacter(GameCharacterClass gameCharacterClass) {
        GameCharacter gameCharacter = GameCharacter.getInstance();
        gameCharacter.setGameCharacterClass(gameCharacterClass);
        gameCharacter.setStrength(gameCharacterClass.getStrength());
        gameCharacter.setAgility(gameCharacterClass.getAgility());
        gameCharacter.setEndurance(gameCharacterClass.getEndurance());
        gameCharacter.setCharisma(gameCharacterClass.getCharisma());
        gameCharacter.setIntelligence(gameCharacterClass.getIntelligence());
        gameCharacter.setLuck(gameCharacterClass.getLuck());
        gameCharacter.setDescription(gameCharacterClass.getDescription());
    }
}
