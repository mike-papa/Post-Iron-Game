package com.example.postirongame.gameCharacter;

import java.util.ArrayList;
import java.util.List;

public class GameCharacterClassConfig {
    public static List<GameCharacterClass> getConfiguredGameCharacterClasses() {
        return new ArrayList<>(List.of(
                new GameCharacterClass("Plumber", 5, 5, 5, 5, 5, 5, "Andrzej was born in Gliwice in 1955. The 1950s in Poland were marked by post-Stalin liberalisation, known as the \"Polish October\". As a teenager, he played for the local football team. During one of the night parties at the local disco, he met a young woman named Alicja, who soon became the love of his life. After completing his education at the local technical school in Gliwice, Andrew began his career as a plumber. The relationship with Alicja intensified, which led to the decision to marry. Andrew and his wife now have four beautiful children. The family has become the centre of his life and he does everything he can to ensure they have a safe and happy life.")
        ));

    }
}
