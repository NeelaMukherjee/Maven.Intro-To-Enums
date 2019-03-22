package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    String input;

    public AliceBobEvaluator(String input){
        this.input = input;

    }

    public boolean isAlice() {

        return input.equals("Alice");
    }

    public boolean isBob() {

        return input.equals("Bob");
    }
}
