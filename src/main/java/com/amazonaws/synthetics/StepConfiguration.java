package com.amazonaws.synthetics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    private Boolean continueOnHttpStepFailure;
    private Boolean stepsReport;
}
