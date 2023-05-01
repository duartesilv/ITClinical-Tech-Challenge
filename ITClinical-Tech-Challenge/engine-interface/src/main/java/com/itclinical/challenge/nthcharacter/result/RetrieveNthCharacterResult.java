package com.itclinical.challenge.nthcharacter.result;

import com.itclinical.challenge.Result;

public class RetrieveNthCharacterResult extends Result {

    String countNumberOfCharacter;

    private String outputText;

    public String getOutputText() {
        return outputText;
    }

    public void setOutputText(String outputText) {
        this.outputText = outputText;
    }

    public String getCountNumberOfCharacter() {
        return countNumberOfCharacter;
    }

    public void setCountNumberOfCharacter(String countNumberOfCharacter) {
        this.countNumberOfCharacter = countNumberOfCharacter;
    }
}
