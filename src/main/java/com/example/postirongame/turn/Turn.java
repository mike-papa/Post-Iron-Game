package com.example.postirongame.turn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
public class Turn {
    @Getter @Setter
    private LocalDate date;
    @Getter @Setter
    private int turnNumber;

}
