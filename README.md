## Cloudwatch Synthetics Java SDK

Cloudwatch Synthetics supports creating canaries based on Java runtimes.<br>
One can run the complete Java code as a single unit as part of a canary by providing the entry point.<br>
Synthetics also provides library function to modularize the workflow running as part of the canary and run them as steps, with each step having their own metrics and a report specific to the step.<br>

The interfaces in this package are intened to help build the Java projects by providing the required types to use the library functions.

An example usage of the library function looks like the following:
The handler that will be used while creating the canary being `org.example.monitoring.MonitoringApp::executeAllSteps`

```java
package org.example.monitoring;

import software.amazon.synthetics.StepConfiguration;
import software.amazon.synthetics.StepOptions;
import software.amazon.synthetics.Synthetics;

public class MonitoringApp {
    public void executeAllSteps(Synthetics synthetics) throws Exception {
        synthetics.executeStep("Step1", () -> {
            try {
                // workflow for task1
                return null;
            } catch (Exception e) {
                throw e;
            }
        }).get();
        synthetics.executeStep("Step2", () -> {
            try {
                // workflow for task2
                return null;
            } catch (Exception e) {
                throw e;
            }
        }).get();
    }
}
```

### Building 

Once you check out the code from GitHub, you can build it using [Gradle](https://gradle.org/install/).

```
gradle wrapper && ./gradlew build
```

### Using the interfaces in your codebase

Once built, `aws-cloudwatch-synthetics-sdk-java.jar` is created in the `build/libs` folder.

The same can be used in a Gradle project by specifying it in the `dependencies` section by adding.
```
compileOnly files('path/to/aws-cloudwatch-synthetics-sdk-java.jar')
```

## Security

See [CONTRIBUTING](CONTRIBUTING.md#security-issue-notifications) for more information.

## License

This project is licensed under the Apache-2.0 License.

