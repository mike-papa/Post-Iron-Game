package com.example.postirongame.turn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TurnManagerTest {

    private TurnManager turnManager;

    @BeforeEach
    void setUp() {
        turnManager = new TurnManager();
    }

    @Test
    void getCurrentTurn_initialTurnExists_returnsTurnWithCorrectDateAndNumber() {
        // Given an initialized TurnManager

        // When getting the current turn
        Turn currentTurn = turnManager.getCurrentTurn();

        // Then the current turn should not be null
        assertNotNull(currentTurn);

        // And the date of the current turn should be the initial date (1993-11-7)
        assertEquals(LocalDate.of(1993, 11, 7), currentTurn.getDate());

        // And the turn number should be 0
        assertEquals(0, currentTurn.getTurnNumber());
    }

    @Test
    void addTurn_multipleTurnsAdded_checkIfDatesAndNumbersAreIncremented() {
        // Given an initialized TurnManager with an initial turn

        // When adding multiple turns
        for (int i = 1; i <= 3; i++) {
            turnManager.addTurn();
            Turn currentTurn = turnManager.getCurrentTurn();

            // Then the date should be incremented by 1 day for each added turn
            assertEquals(LocalDate.of(1993, 11, 7).plusDays(i), currentTurn.getDate());

            // And the turn number should be incremented by 1 for each added turn
            assertEquals(i, currentTurn.getTurnNumber());
        }
    }
}