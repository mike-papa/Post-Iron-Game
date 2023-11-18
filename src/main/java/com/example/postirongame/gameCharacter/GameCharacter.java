package com.example.postirongame.gameCharacter;

import lombok.*;
@Data
public class GameCharacter {
    private static GameCharacter instance;
    private GameCharacterClass gameCharacterClass;
    private int strength;
    private int agility;
    private int endurance;
    private int charisma;
    private int intelligence;
    private int luck;
    private String description;

    private GameCharacterProgress gameCharacterProgress;
    private GameCharacter(GameCharacterProgress gameCharacterProgress) {
        this.gameCharacterProgress = gameCharacterProgress;
    }

    public static GameCharacter getInstance() {
        if (instance == null) {
            instance = new GameCharacter(GameCharacterProgress.getInstance());
        }
        return instance;
    }
    public void addGameCharacterClass(GameCharacterClass gameCharacterClass) {
        setGameCharacterClass(gameCharacterClass);
        setStrength(gameCharacterClass.getStrength());
        setAgility(gameCharacterClass.getAgility());
        setEndurance(gameCharacterClass.getEndurance());
        setCharisma(gameCharacterClass.getCharisma());
        setIntelligence(gameCharacterClass.getIntelligence());
        setLuck(gameCharacterClass.getLuck());
        setDescription(gameCharacterClass.getDescription());
    }
}
