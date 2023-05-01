package com.itclinical.challenge;

import com.itclinical.challenge.nthcharacter.params.RetrieveNthCharacterParams;
import com.itclinical.challenge.nthcharacter.result.RetrieveNthCharacterResult;
import com.itclinical.challenge.operation.RetrieveNthCharacterOperation;

public class NthCharacterEngineImpl extends EngineTemplate implements NthCharacterEngine {

    public NthCharacterEngineImpl() {
        super("NTH CHARACTER");
    }

    @Override
    public RetrieveNthCharacterResult retrieveNthCharacter(RetrieveNthCharacterParams params) {
        return executeOperation(new RetrieveNthCharacterOperation(), params);
    }
}
