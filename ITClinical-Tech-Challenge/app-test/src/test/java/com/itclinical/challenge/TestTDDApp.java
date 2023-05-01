package com.itclinical.challenge;

import com.itclinical.challenge.nthcharacter.params.RetrieveNthCharacterParams;
import com.itclinical.challenge.nthcharacter.result.RetrieveNthCharacterResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTDDApp {


    public NthCharacterEngine nthCharacterEngine;

    @Before
    public void setup() {
        nthCharacterEngine = new NthCharacterEngineImpl();

    }

    @Test
    public void tddTestNthUpperCharacter() {

        // TEXT INPUT WITHOUT SPECIAL CHARACTER OR DIGITS
        String textInputWithoutSpecialCharacterOrNumber = "ITCLiNicAl";

        Assert.assertEquals("ITCLNA", nthCharacterEngine.
                retrieveNthCharacter(new RetrieveNthCharacterParams(textInputWithoutSpecialCharacterOrNumber, 1)).getOutputText());

        Assert.assertEquals("TLN", nthCharacterEngine.
                retrieveNthCharacter(new RetrieveNthCharacterParams(textInputWithoutSpecialCharacterOrNumber, 2)).getOutputText());

        Assert.assertEquals("CNA", nthCharacterEngine.
                retrieveNthCharacter(new RetrieveNthCharacterParams(textInputWithoutSpecialCharacterOrNumber, 3)).getOutputText());


        Assert.assertEquals("", nthCharacterEngine.
                retrieveNthCharacter(new RetrieveNthCharacterParams(textInputWithoutSpecialCharacterOrNumber, 100)).getOutputText());


        Assert.assertEquals("", nthCharacterEngine.
                retrieveNthCharacter(new RetrieveNthCharacterParams(textInputWithoutSpecialCharacterOrNumber, -1)).getOutputText());


        Assert.assertEquals("", nthCharacterEngine.
                retrieveNthCharacter(new RetrieveNthCharacterParams(textInputWithoutSpecialCharacterOrNumber, 0)).getOutputText());

    }

    @Test
    public void shouldRetrieveEmptyResultWhenInputIsNullAndEmptyString() {
        RetrieveNthCharacterParams params = new RetrieveNthCharacterParams("", 1);
        Assert.assertEquals("", nthCharacterEngine.retrieveNthCharacter(params).getOutputText());
    }

    @Test
    public void shouldRetrieveWhenInputHasSpecialCharacterOrDigits() {
        String textInputWithSpecialCharacterOrNumber = "@tCL1Nical";
        Assert.assertEquals("@CL1N", nthCharacterEngine.
                retrieveNthCharacter(new RetrieveNthCharacterParams(textInputWithSpecialCharacterOrNumber, 1)).getOutputText());

    }


    @Test
    public void shouldPrintCountNumberOfCharacter() {


        String textInputWithSpecialCharacterOrNumber = "ItCLINiCAL";


        RetrieveNthCharacterResult characterResult = nthCharacterEngine
                .retrieveNthCharacter(new RetrieveNthCharacterParams(textInputWithSpecialCharacterOrNumber, 1));

        System.out.println((characterResult.getCountNumberOfCharacter()));

    }

    @Test
    public void shouldNotPrintFizzBuzz() {
        printFizzBuzz(200);
    }
    @Test
    public void shouldPrintFizzBuzzUntil() {
        printFizzBuzz(50);
    }

    public static void printFizzBuzz(int inputNumber) {
        if (inputNumber >= 1 && inputNumber <= 100) {
            for (int num = 1; num <= 100; num++) {
                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.print("FizzBuzz\n");
                } else if (num % 3 == 0) {
                    System.out.print("Fizz\n");
                } else if (num % 5 == 0) {
                    System.out.print("Buzz\n");
                }
            }
        }
    }

}

