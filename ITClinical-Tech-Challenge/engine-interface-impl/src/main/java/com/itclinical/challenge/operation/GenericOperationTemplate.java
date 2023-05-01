package com.itclinical.challenge.operation;

import com.itclinical.challenge.Operation;
import com.itclinical.challenge.Params;
import com.itclinical.challenge.Result;

public abstract class GenericOperationTemplate<R extends Result, P extends Params> implements Operation<R, P> {

    protected abstract void doExecute(P params, R result) throws Exception;

    protected abstract R newResult();

    protected void doValidateParameters(P params) {}

    @Override
    public void validateParams(P params) {
        doValidateParameters(params);

    }

    @Override
    public R execute(P params) throws Exception {
        R result = newResult();

        try {

            System.out.println("[OPERATION] begin executing operation:" + getOperationName());
            validateParams(params);

            doExecute(params, result);
            return result;
        } catch (Exception exception) {
            throw exception;

        }
    }
}
