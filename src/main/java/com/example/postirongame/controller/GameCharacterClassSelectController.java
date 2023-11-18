package com.example.postirongame.controller;

import com.example.postirongame.gameCharacter.GameCharacter;
import com.example.postirongame.gameCharacter.GameCharacterClass;
import com.example.postirongame.gameCharacter.GameCharacterClassConfig;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import java.util.List;
import java.util.stream.Collectors;

public class GameCharacterClassSelectController {
    @FXML
    private ListView<String> gameCharacterClassListView;
    @FXML
    private Label gameCharacterClassDescriptionLabel;
    private final List<GameCharacterClass> allGameCharacterClasses = GameCharacterClassConfig.getConfiguredGameCharacterClasses();
    private GameCharacterClass selectedGameCharacterClass = null;
    public void initialize() {
        initGameCharacterClassListView();
    }
    private void initGameCharacterClassListView() {
        List<String> gameCharacterClassNames = allGameCharacterClasses.stream()
                .map(GameCharacterClass::getClassName)
                .collect(Collectors.toList());

        ObservableList<String> items = FXCollections.observableArrayList(gameCharacterClassNames);
        gameCharacterClassListView.setItems(items);

        gameCharacterClassListView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, selectedClassName) -> handleGameCharacterClassSelection(selectedClassName));
    }

    private void handleGameCharacterClassSelection(String selectedGameCharacterClassName) {

            GameCharacterClass selectedGameCharacterClass = allGameCharacterClasses.stream()
                    .filter(characterClass -> characterClass.getClassName().equals(selectedGameCharacterClassName))
                    .findFirst()
                    .orElse(null);
            if(selectedGameCharacterClass != null){
                this.selectedGameCharacterClass = selectedGameCharacterClass;

                String description = "Class: " + selectedGameCharacterClass.getClassName() + "\n" +
                        "Strength: " + selectedGameCharacterClass.getStrength() + "\n" +
                        "Agility: " + selectedGameCharacterClass.getAgility() + "\n" +
                        "Endurance: " + selectedGameCharacterClass.getEndurance() + "\n" +
                        "Charisma: " + selectedGameCharacterClass.getCharisma() + "\n" +
                        "Intelligence: " + selectedGameCharacterClass.getIntelligence() + "\n" +
                        "Luck: " + selectedGameCharacterClass.getLuck() + "\n" +
                        "Description: " + selectedGameCharacterClass.getDescription();

                gameCharacterClassDescriptionLabel.setText(description);
            }
    }
    public void onSubmitButtonClicked() {
        if (selectedGameCharacterClass != null) {
            GameCharacter gameCharacter = GameCharacter.getInstance();
            gameCharacter.addGameCharacterClass(selectedGameCharacterClass);
            System.out.println(GameCharacter.getInstance().toString());
        }
    }
}