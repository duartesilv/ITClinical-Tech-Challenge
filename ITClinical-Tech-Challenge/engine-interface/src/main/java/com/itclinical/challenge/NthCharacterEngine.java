package com.itclinical.challenge;

import com.itclinical.challenge.nthcharacter.params.RetrieveNthCharacterParams;
import com.itclinical.challenge.nthcharacter.result.RetrieveNthCharacterResult;

public interface NthCharacterEngine {

      RetrieveNthCharacterResult retrieveNthCharacter(RetrieveNthCharacterParams params);
}
