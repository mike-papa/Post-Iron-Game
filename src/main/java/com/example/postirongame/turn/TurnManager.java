package com.example.postirongame.turn;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TurnManager {
    @Getter
    List<Turn> turns;
    @Getter
    private final List<TurnManagerObserver> observers;
    public TurnManager() {
        this.turns = new ArrayList<>();
        this.observers = new ArrayList<>();
        initializeFirstTurn();
    }
    public void addObserver(TurnManagerObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TurnManagerObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (TurnManagerObserver observer : observers) {
            observer.updateTurn(turns.get(turns.size()-1));
        }
    }

    private void initializeFirstTurn() {
        LocalDate initialDate = LocalDate.of(1993, 11, 7);
        turns.add(new Turn(initialDate, 0));
        notifyObservers();
    }

    public void addTurn() {
        Turn lastTurn = getCurrentTurn();
        LocalDate newDate = lastTurn.getDate().plusDays(1);
        int newTurnNumber = lastTurn.getTurnNumber()+1;
        turns.add(new Turn(newDate,newTurnNumber));
        notifyObservers();
    }

    public Turn getCurrentTurn() {
        if (turns.size() > 0) {
            return turns.get(turns.size()-1);
        } else {
            return null;
        }
    }

}
