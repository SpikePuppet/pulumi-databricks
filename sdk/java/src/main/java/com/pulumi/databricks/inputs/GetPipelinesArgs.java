// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPipelinesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelinesArgs Empty = new GetPipelinesArgs();

    /**
     * List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Filter Delta Live Tables pipelines by name for a given search term. `%!`(MISSING) is the supported wildcard operator.
     * 
     */
    @Import(name="pipelineName")
    private @Nullable Output<String> pipelineName;

    /**
     * @return Filter Delta Live Tables pipelines by name for a given search term. `%!`(MISSING) is the supported wildcard operator.
     * 
     */
    public Optional<Output<String>> pipelineName() {
        return Optional.ofNullable(this.pipelineName);
    }

    private GetPipelinesArgs() {}

    private GetPipelinesArgs(GetPipelinesArgs $) {
        this.ids = $.ids;
        this.pipelineName = $.pipelineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPipelinesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPipelinesArgs $;

        public Builder() {
            $ = new GetPipelinesArgs();
        }

        public Builder(GetPipelinesArgs defaults) {
            $ = new GetPipelinesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param pipelineName Filter Delta Live Tables pipelines by name for a given search term. `%!`(MISSING) is the supported wildcard operator.
         * 
         * @return builder
         * 
         */
        public Builder pipelineName(@Nullable Output<String> pipelineName) {
            $.pipelineName = pipelineName;
            return this;
        }

        /**
         * @param pipelineName Filter Delta Live Tables pipelines by name for a given search term. `%!`(MISSING) is the supported wildcard operator.
         * 
         * @return builder
         * 
         */
        public Builder pipelineName(String pipelineName) {
            return pipelineName(Output.of(pipelineName));
        }

        public GetPipelinesArgs build() {
            return $;
        }
    }

}
