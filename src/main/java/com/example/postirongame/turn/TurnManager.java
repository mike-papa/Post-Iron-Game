package com.example.postirongame.turn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TurnManager {
    private List<Turn> turns;
    public TurnManager() {
        this.turns = new ArrayList<>();
        initializeFirstTurn();
    }

    private void initializeFirstTurn() {
        LocalDate initialDate = LocalDate.of(1993, 11, 7);
        turns.add(new Turn(initialDate, 0));
    }

    public void addTurn() {
        Turn lastTurn = getCurrentTurn();
        LocalDate newDate = lastTurn.getDate().plusDays(1);
        int newTurnNumber = lastTurn.getTurnNumber()+1;
        turns.add(new Turn(newDate,newTurnNumber));
    }

    public Turn getCurrentTurn() {
        if (turns.size() > 0) {
            return turns.get(turns.size()-1);
        } else {
            return null;
        }
    }

}
