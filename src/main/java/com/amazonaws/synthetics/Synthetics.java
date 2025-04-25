package com.amazonaws.synthetics;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

public interface Synthetics {
    public <T> CompletableFuture<T> executeStep(String stepName, Callable<T> task) throws Exception;
    public <T> CompletableFuture<T> executeStep(String stepName, Callable<T> task, StepOptions stepOptions) throws Exception;
}