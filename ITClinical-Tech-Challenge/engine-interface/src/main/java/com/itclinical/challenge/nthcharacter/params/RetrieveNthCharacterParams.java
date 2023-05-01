package com.itclinical.challenge.nthcharacter.params;


import com.itclinical.challenge.Params;

public class RetrieveNthCharacterParams extends Params {
    private final String inputText;
    private final int maxNtCharacterNumber;

    public RetrieveNthCharacterParams(String textInput, int counterNumber) {
        this.inputText = textInput;
        this.maxNtCharacterNumber = counterNumber;
    }

    public String getInputText() {
        return inputText;
    }

    public int getMaxNtCharacterNumber() {
        return maxNtCharacterNumber;
    }
}
