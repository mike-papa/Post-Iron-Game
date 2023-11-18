package com.example.postirongame.gameCharacter;

import lombok.Data;
@Data
public class GameCharacterProgress {
    private static GameCharacterProgress instance;
    private int money = 0;
    private int publicOpinion = 0;
    private int familyOpinion = 0;
    private int mentalState = 0;
    private GameCharacterProgress() {
    }

    public static GameCharacterProgress getInstance() {
        if (instance == null) {
            instance = new GameCharacterProgress();
        }
        return instance;
    }
    public void modifyMoney(int amount) {
        money += amount;
        if(money<0){
            handleGameOver();
        }
    }
    public void modifyPublicOpinion(int amount) {
        publicOpinion += amount;
        if(mentalState < 0){
            handleGameOver();
        }else if(mentalState > 100){
            mentalState = 100;
        }
    }

    public void modifyFamilyOpinion(int amount) {
        familyOpinion += amount;
        if(familyOpinion < 0){
            handleGameOver();
        }else if(familyOpinion > 100){
            familyOpinion = 100;
        }
    }
    public void modifyMentalState(int amount) {
        mentalState += amount;
        if(mentalState < 0){
            handleGameOver();
        }else if(mentalState > 100){
            mentalState = 100;
        }
    }
    private void handleGameOver() {
        System.out.println("Game Over");
    }
}
