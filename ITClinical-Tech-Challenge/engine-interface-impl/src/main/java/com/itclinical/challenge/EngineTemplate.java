package com.itclinical.challenge;

public abstract class EngineTemplate {
    private final String engineName;

    public EngineTemplate(String engineName) {
        this.engineName = engineName;
    }

    public <R extends Result, P extends  Params> R executeOperation(Operation<R, P> operation, P params) {

        try {
           System.out.println("[" + engineName + "] - " + operation.getOperationName() + " Begin");

            return operation.execute(params);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("[" + engineName + "] - " + operation.getOperationName() + " End");
        }
    }
}
