package software.amazon.synthetics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/* 
 * Configuration for a canary step.
 * @param stepSuccessMetric indicates if the step emits metrics indicating step success, defaults to True when not set.
 * @param stepDurationMetric indicates if the step emits metrics indicating step duration, defaults to True when not set.
 * @param continueOnStepFailure indicates if the canary should continue to the next step if this step fails, defaults to False if not set.
 * @param stepsReport indicates if the canary reports step execution summary, defaults to True when not set.
 */
@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class StepConfiguration {
    private Boolean stepSuccessMetric;
    private Boolean stepDurationMetric;
    private Boolean continueOnStepFailure;
    private Boolean stepsReport;
}
