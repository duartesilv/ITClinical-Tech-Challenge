package com.itclinical.challenge;

import com.itclinical.challenge.nth.RetrieveNthCharacterParams;
import com.itclinical.challenge.nth.RetrieveNthCharacterResult;

public interface NthEngineInterface {
    public interface NthCharacterEngines {
      RetrieveNthCharacterResult retrieveNthCharacter(RetrieveNthCharacterParams params);

    }
}
