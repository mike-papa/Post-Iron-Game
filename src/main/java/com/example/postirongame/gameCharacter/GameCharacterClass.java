package com.example.postirongame.gameCharacter;

import lombok.*;

@AllArgsConstructor
public class GameCharacterClass {
    @Getter @Setter private String className;
    @Getter @Setter private int strength;
    @Getter @Setter private int agility;
    @Getter @Setter private int endurance;
    @Getter @Setter private int charisma;
    @Getter @Setter private int intelligence;
    @Getter @Setter private int luck;
    @Getter @Setter private String description;
}
