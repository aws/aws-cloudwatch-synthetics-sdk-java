package software.amazon.synthetics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/* 
 * Options for a canary step.
 * @param stepConfiguration the configuration for the step
*/

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class StepOptions {
    private StepConfiguration stepConfiguration;
}
