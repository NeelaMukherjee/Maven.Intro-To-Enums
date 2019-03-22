package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE("ALICE", "Hey, my name is ALICE!"),
    BOB("BOB", "Hey, my name is BOB!");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    String name;
    String catchPhrase;

    AliceBobEnum(String name, String catchPhrase) {

        this.name = name;
        this.catchPhrase = catchPhrase;

    }

    public String getCatchPhrase() {

        return catchPhrase;
    }

    public boolean isAlice() {

        return (getName().equals("ALICE"));
    }


    public boolean isBob() {

        return (getName().equals("BOB"));
    }
}
