package com.itclinical.challenge;

public interface Operation <R extends Result, P extends  Params>{

    default  String getOperationName(){
        return getClass().getSimpleName();
    }

    void validateParams(P params);
    R execute(P params) throws Exception;
}
