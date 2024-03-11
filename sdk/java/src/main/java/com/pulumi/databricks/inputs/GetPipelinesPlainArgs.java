// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPipelinesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelinesPlainArgs Empty = new GetPipelinesPlainArgs();

    /**
     * List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Filter Delta Live Tables pipelines by name for a given search term. `%!`(MISSING) is the supported wildcard operator.
     * 
     */
    @Import(name="pipelineName")
    private @Nullable String pipelineName;

    /**
     * @return Filter Delta Live Tables pipelines by name for a given search term. `%!`(MISSING) is the supported wildcard operator.
     * 
     */
    public Optional<String> pipelineName() {
        return Optional.ofNullable(this.pipelineName);
    }

    private GetPipelinesPlainArgs() {}

    private GetPipelinesPlainArgs(GetPipelinesPlainArgs $) {
        this.ids = $.ids;
        this.pipelineName = $.pipelineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPipelinesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPipelinesPlainArgs $;

        public Builder() {
            $ = new GetPipelinesPlainArgs();
        }

        public Builder(GetPipelinesPlainArgs defaults) {
            $ = new GetPipelinesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
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
        public Builder pipelineName(@Nullable String pipelineName) {
            $.pipelineName = pipelineName;
            return this;
        }

        public GetPipelinesPlainArgs build() {
            return $;
        }
    }

}
