// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetMlflowExperimentTagArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMlflowExperimentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMlflowExperimentArgs Empty = new GetMlflowExperimentArgs();

    /**
     * Location where artifacts for the experiment are stored.
     * 
     */
    @Import(name="artifactLocation")
    private @Nullable Output<String> artifactLocation;

    /**
     * @return Location where artifacts for the experiment are stored.
     * 
     */
    public Optional<Output<String>> artifactLocation() {
        return Optional.ofNullable(this.artifactLocation);
    }

    /**
     * Creation time in unix time stamp.
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<Integer> creationTime;

    /**
     * @return Creation time in unix time stamp.
     * 
     */
    public Optional<Output<Integer>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * Unique identifier for the experiment.
     * 
     */
    @Import(name="experimentId")
    private @Nullable Output<String> experimentId;

    /**
     * @return Unique identifier for the experiment.
     * 
     */
    public Optional<Output<String>> experimentId() {
        return Optional.ofNullable(this.experimentId);
    }

    /**
     * Unique identifier for the experiment. (same as `experiment_id`)
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique identifier for the experiment. (same as `experiment_id`)
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Last update time in unix time stamp.
     * 
     */
    @Import(name="lastUpdateTime")
    private @Nullable Output<Integer> lastUpdateTime;

    /**
     * @return Last update time in unix time stamp.
     * 
     */
    public Optional<Output<Integer>> lastUpdateTime() {
        return Optional.ofNullable(this.lastUpdateTime);
    }

    /**
     * Current life cycle stage of the experiment: `active` or `deleted`.
     * 
     */
    @Import(name="lifecycleStage")
    private @Nullable Output<String> lifecycleStage;

    /**
     * @return Current life cycle stage of the experiment: `active` or `deleted`.
     * 
     */
    public Optional<Output<String>> lifecycleStage() {
        return Optional.ofNullable(this.lifecycleStage);
    }

    /**
     * Path to experiment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Path to experiment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Additional metadata key-value pairs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<GetMlflowExperimentTagArgs>> tags;

    /**
     * @return Additional metadata key-value pairs.
     * 
     */
    public Optional<Output<List<GetMlflowExperimentTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetMlflowExperimentArgs() {}

    private GetMlflowExperimentArgs(GetMlflowExperimentArgs $) {
        this.artifactLocation = $.artifactLocation;
        this.creationTime = $.creationTime;
        this.experimentId = $.experimentId;
        this.id = $.id;
        this.lastUpdateTime = $.lastUpdateTime;
        this.lifecycleStage = $.lifecycleStage;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMlflowExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMlflowExperimentArgs $;

        public Builder() {
            $ = new GetMlflowExperimentArgs();
        }

        public Builder(GetMlflowExperimentArgs defaults) {
            $ = new GetMlflowExperimentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactLocation Location where artifacts for the experiment are stored.
         * 
         * @return builder
         * 
         */
        public Builder artifactLocation(@Nullable Output<String> artifactLocation) {
            $.artifactLocation = artifactLocation;
            return this;
        }

        /**
         * @param artifactLocation Location where artifacts for the experiment are stored.
         * 
         * @return builder
         * 
         */
        public Builder artifactLocation(String artifactLocation) {
            return artifactLocation(Output.of(artifactLocation));
        }

        /**
         * @param creationTime Creation time in unix time stamp.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<Integer> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime Creation time in unix time stamp.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(Integer creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param experimentId Unique identifier for the experiment.
         * 
         * @return builder
         * 
         */
        public Builder experimentId(@Nullable Output<String> experimentId) {
            $.experimentId = experimentId;
            return this;
        }

        /**
         * @param experimentId Unique identifier for the experiment.
         * 
         * @return builder
         * 
         */
        public Builder experimentId(String experimentId) {
            return experimentId(Output.of(experimentId));
        }

        /**
         * @param id Unique identifier for the experiment. (same as `experiment_id`)
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique identifier for the experiment. (same as `experiment_id`)
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param lastUpdateTime Last update time in unix time stamp.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdateTime(@Nullable Output<Integer> lastUpdateTime) {
            $.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * @param lastUpdateTime Last update time in unix time stamp.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdateTime(Integer lastUpdateTime) {
            return lastUpdateTime(Output.of(lastUpdateTime));
        }

        /**
         * @param lifecycleStage Current life cycle stage of the experiment: `active` or `deleted`.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleStage(@Nullable Output<String> lifecycleStage) {
            $.lifecycleStage = lifecycleStage;
            return this;
        }

        /**
         * @param lifecycleStage Current life cycle stage of the experiment: `active` or `deleted`.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleStage(String lifecycleStage) {
            return lifecycleStage(Output.of(lifecycleStage));
        }

        /**
         * @param name Path to experiment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Path to experiment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Additional metadata key-value pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<GetMlflowExperimentTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Additional metadata key-value pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<GetMlflowExperimentTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Additional metadata key-value pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(GetMlflowExperimentTagArgs... tags) {
            return tags(List.of(tags));
        }

        public GetMlflowExperimentArgs build() {
            return $;
        }
    }

}