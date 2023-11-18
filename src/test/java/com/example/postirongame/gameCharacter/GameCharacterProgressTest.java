package com.example.postirongame.gameCharacter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameCharacterProgressTest {

    private GameCharacterProgress progress;

    @BeforeEach
    void setUp() {
        progress = GameCharacterProgress.getInstance();
    }

    @Test
    void getInstance_initialInstanceExists_returnsSameInstance() {
        // Given an initialized GameCharacterProgress

        // When getting the instance multiple times
        GameCharacterProgress anotherInstance = GameCharacterProgress.getInstance();

        // Then the instances should be the same
        assertSame(progress, anotherInstance);
    }

    @Test
    void modifyMoney_positiveAmount_moneyIncreased() {
        // Given a GameCharacterProgress instance
        progress.setMoney(0);
        // When modifying money with a positive amount
        progress.modifyMoney(10);

        // Then the money should be increased by the specified amount
        assertEquals(10, progress.getMoney());
    }

    @Test
    void modifyPublicOpinion_negativeAmount_publicOpinionDecreased() {
        // Given a GameCharacterProgress instance with initial public opinion
        progress.setPublicOpinion(60);
        // When modifying public opinion with a negative amount
        progress.modifyPublicOpinion(-20);

        // Then the public opinion should be decreased by the specified amount
        assertEquals(40, progress.getPublicOpinion());
    }
    @Test
    void modifyMentalState_increaseMentalStateAboveMax_setsMentalStateToMax() {
        // Given a GameCharacterProgress instance with initial mental state
        progress.setMentalState(80);
        // When modifying mental state with an amount that exceeds the maximum (100)
        progress.modifyMentalState(30);

        // Then the mental state should be set to the maximum (100)
        assertEquals(100, progress.getMentalState());
    }

    @Test
    void modifyMoney_subtractMoreThanCurrentAmount_resultsInNegativeMoney() {
        // Given a GameCharacterProgress instance with initial money
        progress.setMoney(10);
        // When modifying money by subtracting more than the current amount
        progress.modifyMoney(-20);

        // Then the money should be negative (initial amount - 20)
        assertEquals(-10, progress.getMoney());
    }
}