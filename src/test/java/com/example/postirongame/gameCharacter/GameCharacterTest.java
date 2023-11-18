package com.example.postirongame.gameCharacter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameCharacterTest {

    private GameCharacter gameCharacter;

    @BeforeEach
    void setUp() {
        gameCharacter = GameCharacter.getInstance();
    }

    @Test
    void getInstance_initialInstanceExists_returnsSameInstance() {
        // Given an initialized GameCharacter

        // When getting the instance multiple times
        GameCharacter anotherInstance = GameCharacter.getInstance();

        // Then the instances should be the same
        assertSame(gameCharacter, anotherInstance);
    }

    @Test
    void addGameCharacterClass_validGameCharacterClass_setsCharacterAttributes() {
        // Given a GameCharacter instance

        // When adding a GameCharacterClass
        GameCharacterClass characterClass = new GameCharacterClass("ExampleClass", 10, 5, 8, 3, 4, 2, "Example description");
        gameCharacter.addGameCharacterClass(characterClass);

        // Then the character attributes should be set accordingly
        assertEquals("ExampleClass", gameCharacter.getGameCharacterClass().getClassName());
        assertEquals(10, gameCharacter.getStrength());
        assertEquals(5, gameCharacter.getAgility());
        assertEquals(8, gameCharacter.getEndurance());
        assertEquals(3, gameCharacter.getCharisma());
        assertEquals(4, gameCharacter.getIntelligence());
        assertEquals(2, gameCharacter.getLuck());
        assertEquals("Example description", gameCharacter.getDescription());

    }
}