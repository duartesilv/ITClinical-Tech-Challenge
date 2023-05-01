package com.itclinical.challenge.operation;

import com.itclinical.challenge.nthcharacter.params.RetrieveNthCharacterParams;
import com.itclinical.challenge.nthcharacter.result.RetrieveNthCharacterResult;
import java.util.LinkedHashMap;


public class RetrieveNthCharacterOperation extends GenericOperationTemplate<RetrieveNthCharacterResult, RetrieveNthCharacterParams> {



    private String outputMessage="error";

    @Override
    protected void doValidateParameters(RetrieveNthCharacterParams params) {
        super.doValidateParameters(params);

        if (params.getInputText() == null || params.getMaxNtCharacterNumber() <= 0) {
            outputMessage = "";
        } else if (params.getInputText().length() < params.getMaxNtCharacterNumber()) {
            if (params.getInputText().length() < params.getMaxNtCharacterNumber()) {
                outputMessage = "";
            }
        }
    }

    @Override
    protected void doExecute(RetrieveNthCharacterParams params, RetrieveNthCharacterResult result) throws Exception {

        if (outputMessage.isEmpty()) {
            //Failed validatetion parameters
            result.setOutputText(outputMessage);

        } else {
            String retrieveNthUpperCharacter = retrieveNthUpperCharacter(params);
            result.setOutputText(retrieveNthUpperCharacter);
            String  countNumberCharacterBuilder = countNumberOfCharacter(retrieveNthUpperCharacter);
            result.setCountNumberOfCharacter(countNumberCharacterBuilder);
        }
    }

    private String retrieveNthUpperCharacter(RetrieveNthCharacterParams params) {
         StringBuilder builder = new StringBuilder();
        for (int starInputTextIndex = params.getMaxNtCharacterNumber() - 1; starInputTextIndex < params.getInputText().length();
             starInputTextIndex += params.getMaxNtCharacterNumber()) {

            char character = params.getInputText().charAt(starInputTextIndex);
            if (Character.isUpperCase(character) || !Character.isLetterOrDigit(character) || Character.isDigit(character)) {
                builder.append(character);
                builder.append(" ");
            }
        }

        if (builder.length() > 0) {
            builder.deleteCharAt(builder.length() - 1);
        }

        return builder.toString().replace(" ", "");

    }

    @Override
    protected RetrieveNthCharacterResult newResult() {
        return new RetrieveNthCharacterResult();

    }
    private String countNumberOfCharacter(String params){

        LinkedHashMap<Character, Integer> countNumberOfCharacter = new LinkedHashMap<>();
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < params.length(); i++) {
            char character = params.charAt(i);
            if (countNumberOfCharacter.containsKey(character)) {
                countNumberOfCharacter.put(character, countNumberOfCharacter.get(character) + 1);
            } else {
                countNumberOfCharacter.put(character, 1);
            }
        }

        for (char character : countNumberOfCharacter.keySet()) {
            builder.append(character).append(" = ").append(countNumberOfCharacter.get(character)).append("\n");
        }

        return builder.toString();

    }
}
