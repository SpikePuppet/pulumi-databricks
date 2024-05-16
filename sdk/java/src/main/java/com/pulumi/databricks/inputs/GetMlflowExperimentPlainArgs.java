// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetMlflowExperimentTag;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMlflowExperimentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMlflowExperimentPlainArgs Empty = new GetMlflowExperimentPlainArgs();

    /**
     * Location where artifacts for the experiment are stored.
     * 
     */
    @Import(name="artifactLocation")
    private @Nullable String artifactLocation;

    /**
     * @return Location where artifacts for the experiment are stored.
     * 
     */
    public Optional<String> artifactLocation() {
        return Optional.ofNullable(this.artifactLocation);
    }

    /**
     * Creation time in unix time stamp.
     * 
     */
    @Import(name="creationTime")
    private @Nullable Integer creationTime;

    /**
     * @return Creation time in unix time stamp.
     * 
     */
    public Optional<Integer> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * Unique identifier for the experiment.
     * 
     */
    @Import(name="experimentId")
    private @Nullable String experimentId;

    /**
     * @return Unique identifier for the experiment.
     * 
     */
    public Optional<String> experimentId() {
        return Optional.ofNullable(this.experimentId);
    }

    /**
     * Unique identifier for the experiment. (same as `experiment_id`)
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Unique identifier for the experiment. (same as `experiment_id`)
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Last update time in unix time stamp.
     * 
     */
    @Import(name="lastUpdateTime")
    private @Nullable Integer lastUpdateTime;

    /**
     * @return Last update time in unix time stamp.
     * 
     */
    public Optional<Integer> lastUpdateTime() {
        return Optional.ofNullable(this.lastUpdateTime);
    }

    /**
     * Current life cycle stage of the experiment: `active` or `deleted`.
     * 
     */
    @Import(name="lifecycleStage")
    private @Nullable String lifecycleStage;

    /**
     * @return Current life cycle stage of the experiment: `active` or `deleted`.
     * 
     */
    public Optional<String> lifecycleStage() {
        return Optional.ofNullable(this.lifecycleStage);
    }

    /**
     * Path to experiment.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Path to experiment.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Additional metadata key-value pairs.
     * 
     */
    @Import(name="tags")
    private @Nullable List<GetMlflowExperimentTag> tags;

    /**
     * @return Additional metadata key-value pairs.
     * 
     */
    public Optional<List<GetMlflowExperimentTag>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetMlflowExperimentPlainArgs() {}

    private GetMlflowExperimentPlainArgs(GetMlflowExperimentPlainArgs $) {
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
    public static Builder builder(GetMlflowExperimentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMlflowExperimentPlainArgs $;

        public Builder() {
            $ = new GetMlflowExperimentPlainArgs();
        }

        public Builder(GetMlflowExperimentPlainArgs defaults) {
            $ = new GetMlflowExperimentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactLocation Location where artifacts for the experiment are stored.
         * 
         * @return builder
         * 
         */
        public Builder artifactLocation(@Nullable String artifactLocation) {
            $.artifactLocation = artifactLocation;
            return this;
        }

        /**
         * @param creationTime Creation time in unix time stamp.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Integer creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param experimentId Unique identifier for the experiment.
         * 
         * @return builder
         * 
         */
        public Builder experimentId(@Nullable String experimentId) {
            $.experimentId = experimentId;
            return this;
        }

        /**
         * @param id Unique identifier for the experiment. (same as `experiment_id`)
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param lastUpdateTime Last update time in unix time stamp.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdateTime(@Nullable Integer lastUpdateTime) {
            $.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * @param lifecycleStage Current life cycle stage of the experiment: `active` or `deleted`.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleStage(@Nullable String lifecycleStage) {
            $.lifecycleStage = lifecycleStage;
            return this;
        }

        /**
         * @param name Path to experiment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags Additional metadata key-value pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<GetMlflowExperimentTag> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Additional metadata key-value pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(GetMlflowExperimentTag... tags) {
            return tags(List.of(tags));
        }

        public GetMlflowExperimentPlainArgs build() {
            return $;
        }
    }

}
