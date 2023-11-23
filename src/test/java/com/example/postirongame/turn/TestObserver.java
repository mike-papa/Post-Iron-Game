package com.example.postirongame.turn;


public class TestObserver implements TurnManagerObserver {
    private boolean updateCalled = false;
    private Turn newTurn;

    @Override
    public void updateTurn(Turn newTurn) {
        this.updateCalled = true;
        this.newTurn = newTurn;
    }

    public boolean isUpdateCalled() {
        return updateCalled;
    }

    public Turn getNewTurn() {
        return newTurn;
    }
}