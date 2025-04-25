package software.amazon.synthetics;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

public interface Synthetics {
    /*
     * Execute a step with the given name and task.
     * Make sure to call .get() on the returned CompletableFuture to block until the task is completed before moving to the next step.
     * 
     * @param stepName the name of the step
     * @param task the task to execute
     * @return a CompletableFuture that will be completed with the result of the task
     * @throws Exception if the task throws an exception
     */
    public <T> CompletableFuture<T> executeStep(String stepName, Callable<T> task) throws Exception;
    /*
     * Execute a step with the given name, task, and options.
     * Make sure to call .get() on the returned CompletableFuture to block until the task is completed before moving to the next step.
     *
     * @param stepName the name of the step
     * @param task the task to execute
     * @param stepOptions the options for the step
     * @return a CompletableFuture that will be completed with the result of the task
     * @throws Exception if the task throws an exception
     */
    public <T> CompletableFuture<T> executeStep(String stepName, Callable<T> task, StepOptions stepOptions) throws Exception;
}