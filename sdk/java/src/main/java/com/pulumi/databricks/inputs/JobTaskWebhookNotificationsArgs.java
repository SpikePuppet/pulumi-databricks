// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTaskWebhookNotificationsOnDurationWarningThresholdExceededArgs;
import com.pulumi.databricks.inputs.JobTaskWebhookNotificationsOnFailureArgs;
import com.pulumi.databricks.inputs.JobTaskWebhookNotificationsOnStartArgs;
import com.pulumi.databricks.inputs.JobTaskWebhookNotificationsOnSuccessArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskWebhookNotificationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskWebhookNotificationsArgs Empty = new JobTaskWebhookNotificationsArgs();

    /**
     * (List) list of notification IDs to call when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
     * 
     * Note that the `id` is not to be confused with the name of the alert destination. The `id` can be retrieved through the API or the URL of Databricks UI `https://&lt;workspace host&gt;/sql/destinations/&lt;notification id&gt;?o=&lt;workspace id&gt;`
     * 
     * Example
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    @Import(name="onDurationWarningThresholdExceededs")
    private @Nullable Output<List<JobTaskWebhookNotificationsOnDurationWarningThresholdExceededArgs>> onDurationWarningThresholdExceededs;

    /**
     * @return (List) list of notification IDs to call when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
     * 
     * Note that the `id` is not to be confused with the name of the alert destination. The `id` can be retrieved through the API or the URL of Databricks UI `https://&lt;workspace host&gt;/sql/destinations/&lt;notification id&gt;?o=&lt;workspace id&gt;`
     * 
     * Example
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    public Optional<Output<List<JobTaskWebhookNotificationsOnDurationWarningThresholdExceededArgs>>> onDurationWarningThresholdExceededs() {
        return Optional.ofNullable(this.onDurationWarningThresholdExceededs);
    }

    /**
     * (List) list of notification IDs to call when the run fails. A maximum of 3 destinations can be specified.
     * 
     */
    @Import(name="onFailures")
    private @Nullable Output<List<JobTaskWebhookNotificationsOnFailureArgs>> onFailures;

    /**
     * @return (List) list of notification IDs to call when the run fails. A maximum of 3 destinations can be specified.
     * 
     */
    public Optional<Output<List<JobTaskWebhookNotificationsOnFailureArgs>>> onFailures() {
        return Optional.ofNullable(this.onFailures);
    }

    /**
     * (List) list of notification IDs to call when the run starts. A maximum of 3 destinations can be specified.
     * 
     */
    @Import(name="onStarts")
    private @Nullable Output<List<JobTaskWebhookNotificationsOnStartArgs>> onStarts;

    /**
     * @return (List) list of notification IDs to call when the run starts. A maximum of 3 destinations can be specified.
     * 
     */
    public Optional<Output<List<JobTaskWebhookNotificationsOnStartArgs>>> onStarts() {
        return Optional.ofNullable(this.onStarts);
    }

    /**
     * (List) list of notification IDs to call when the run completes successfully. A maximum of 3 destinations can be specified.
     * 
     */
    @Import(name="onSuccesses")
    private @Nullable Output<List<JobTaskWebhookNotificationsOnSuccessArgs>> onSuccesses;

    /**
     * @return (List) list of notification IDs to call when the run completes successfully. A maximum of 3 destinations can be specified.
     * 
     */
    public Optional<Output<List<JobTaskWebhookNotificationsOnSuccessArgs>>> onSuccesses() {
        return Optional.ofNullable(this.onSuccesses);
    }

    private JobTaskWebhookNotificationsArgs() {}

    private JobTaskWebhookNotificationsArgs(JobTaskWebhookNotificationsArgs $) {
        this.onDurationWarningThresholdExceededs = $.onDurationWarningThresholdExceededs;
        this.onFailures = $.onFailures;
        this.onStarts = $.onStarts;
        this.onSuccesses = $.onSuccesses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskWebhookNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskWebhookNotificationsArgs $;

        public Builder() {
            $ = new JobTaskWebhookNotificationsArgs();
        }

        public Builder(JobTaskWebhookNotificationsArgs defaults) {
            $ = new JobTaskWebhookNotificationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param onDurationWarningThresholdExceededs (List) list of notification IDs to call when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
         * 
         * Note that the `id` is not to be confused with the name of the alert destination. The `id` can be retrieved through the API or the URL of Databricks UI `https://&lt;workspace host&gt;/sql/destinations/&lt;notification id&gt;?o=&lt;workspace id&gt;`
         * 
         * Example
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder onDurationWarningThresholdExceededs(@Nullable Output<List<JobTaskWebhookNotificationsOnDurationWarningThresholdExceededArgs>> onDurationWarningThresholdExceededs) {
            $.onDurationWarningThresholdExceededs = onDurationWarningThresholdExceededs;
            return this;
        }

        /**
         * @param onDurationWarningThresholdExceededs (List) list of notification IDs to call when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
         * 
         * Note that the `id` is not to be confused with the name of the alert destination. The `id` can be retrieved through the API or the URL of Databricks UI `https://&lt;workspace host&gt;/sql/destinations/&lt;notification id&gt;?o=&lt;workspace id&gt;`
         * 
         * Example
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder onDurationWarningThresholdExceededs(List<JobTaskWebhookNotificationsOnDurationWarningThresholdExceededArgs> onDurationWarningThresholdExceededs) {
            return onDurationWarningThresholdExceededs(Output.of(onDurationWarningThresholdExceededs));
        }

        /**
         * @param onDurationWarningThresholdExceededs (List) list of notification IDs to call when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
         * 
         * Note that the `id` is not to be confused with the name of the alert destination. The `id` can be retrieved through the API or the URL of Databricks UI `https://&lt;workspace host&gt;/sql/destinations/&lt;notification id&gt;?o=&lt;workspace id&gt;`
         * 
         * Example
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder onDurationWarningThresholdExceededs(JobTaskWebhookNotificationsOnDurationWarningThresholdExceededArgs... onDurationWarningThresholdExceededs) {
            return onDurationWarningThresholdExceededs(List.of(onDurationWarningThresholdExceededs));
        }

        /**
         * @param onFailures (List) list of notification IDs to call when the run fails. A maximum of 3 destinations can be specified.
         * 
         * @return builder
         * 
         */
        public Builder onFailures(@Nullable Output<List<JobTaskWebhookNotificationsOnFailureArgs>> onFailures) {
            $.onFailures = onFailures;
            return this;
        }

        /**
         * @param onFailures (List) list of notification IDs to call when the run fails. A maximum of 3 destinations can be specified.
         * 
         * @return builder
         * 
         */
        public Builder onFailures(List<JobTaskWebhookNotificationsOnFailureArgs> onFailures) {
            return onFailures(Output.of(onFailures));
        }

        /**
         * @param onFailures (List) list of notification IDs to call when the run fails. A maximum of 3 destinations can be specified.
         * 
         * @return builder
         * 
         */
        public Builder onFailures(JobTaskWebhookNotificationsOnFailureArgs... onFailures) {
            return onFailures(List.of(onFailures));
        }

        /**
         * @param onStarts (List) list of notification IDs to call when the run starts. A maximum of 3 destinations can be specified.
         * 
         * @return builder
         * 
         */
        public Builder onStarts(@Nullable Output<List<JobTaskWebhookNotificationsOnStartArgs>> onStarts) {
            $.onStarts = onStarts;
            return this;
        }

        /**
         * @param onStarts (List) list of notification IDs to call when the run starts. A maximum of 3 destinations can be specified.
         * 
         * @return builder
         * 
         */
        public Builder onStarts(List<JobTaskWebhookNotificationsOnStartArgs> onStarts) {
            return onStarts(Output.of(onStarts));
        }

        /**
         * @param onStarts (List) list of notification IDs to call when the run starts. A maximum of 3 destinations can be specified.
         * 
         * @return builder
         * 
         */
        public Builder onStarts(JobTaskWebhookNotificationsOnStartArgs... onStarts) {
            return onStarts(List.of(onStarts));
        }

        /**
         * @param onSuccesses (List) list of notification IDs to call when the run completes successfully. A maximum of 3 destinations can be specified.
         * 
         * @return builder
         * 
         */
        public Builder onSuccesses(@Nullable Output<List<JobTaskWebhookNotificationsOnSuccessArgs>> onSuccesses) {
            $.onSuccesses = onSuccesses;
            return this;
        }

        /**
         * @param onSuccesses (List) list of notification IDs to call when the run completes successfully. A maximum of 3 destinations can be specified.
         * 
         * @return builder
         * 
         */
        public Builder onSuccesses(List<JobTaskWebhookNotificationsOnSuccessArgs> onSuccesses) {
            return onSuccesses(Output.of(onSuccesses));
        }

        /**
         * @param onSuccesses (List) list of notification IDs to call when the run completes successfully. A maximum of 3 destinations can be specified.
         * 
         * @return builder
         * 
         */
        public Builder onSuccesses(JobTaskWebhookNotificationsOnSuccessArgs... onSuccesses) {
            return onSuccesses(List.of(onSuccesses));
        }

        public JobTaskWebhookNotificationsArgs build() {
            return $;
        }
    }

}
