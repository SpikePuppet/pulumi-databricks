// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs;
import com.pulumi.databricks.inputs.VectorSearchIndexDirectAccessIndexSpecEmbeddingVectorColumnArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VectorSearchIndexDirectAccessIndexSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final VectorSearchIndexDirectAccessIndexSpecArgs Empty = new VectorSearchIndexDirectAccessIndexSpecArgs();

    /**
     * array of objects representing columns that contain the embedding source.  Each entry consists of:
     * 
     */
    @Import(name="embeddingSourceColumns")
    private @Nullable Output<List<VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs>> embeddingSourceColumns;

    /**
     * @return array of objects representing columns that contain the embedding source.  Each entry consists of:
     * 
     */
    public Optional<Output<List<VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs>>> embeddingSourceColumns() {
        return Optional.ofNullable(this.embeddingSourceColumns);
    }

    @Import(name="embeddingVectorColumns")
    private @Nullable Output<List<VectorSearchIndexDirectAccessIndexSpecEmbeddingVectorColumnArgs>> embeddingVectorColumns;

    public Optional<Output<List<VectorSearchIndexDirectAccessIndexSpecEmbeddingVectorColumnArgs>>> embeddingVectorColumns() {
        return Optional.ofNullable(this.embeddingVectorColumns);
    }

    /**
     * The schema of the index in JSON format.  Check the [API documentation](https://docs.databricks.com/api/workspace/vectorsearchindexes/createindex#direct_access_index_spec-schema_json) for a list of supported data types.
     * 
     */
    @Import(name="schemaJson")
    private @Nullable Output<String> schemaJson;

    /**
     * @return The schema of the index in JSON format.  Check the [API documentation](https://docs.databricks.com/api/workspace/vectorsearchindexes/createindex#direct_access_index_spec-schema_json) for a list of supported data types.
     * 
     */
    public Optional<Output<String>> schemaJson() {
        return Optional.ofNullable(this.schemaJson);
    }

    private VectorSearchIndexDirectAccessIndexSpecArgs() {}

    private VectorSearchIndexDirectAccessIndexSpecArgs(VectorSearchIndexDirectAccessIndexSpecArgs $) {
        this.embeddingSourceColumns = $.embeddingSourceColumns;
        this.embeddingVectorColumns = $.embeddingVectorColumns;
        this.schemaJson = $.schemaJson;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VectorSearchIndexDirectAccessIndexSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VectorSearchIndexDirectAccessIndexSpecArgs $;

        public Builder() {
            $ = new VectorSearchIndexDirectAccessIndexSpecArgs();
        }

        public Builder(VectorSearchIndexDirectAccessIndexSpecArgs defaults) {
            $ = new VectorSearchIndexDirectAccessIndexSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param embeddingSourceColumns array of objects representing columns that contain the embedding source.  Each entry consists of:
         * 
         * @return builder
         * 
         */
        public Builder embeddingSourceColumns(@Nullable Output<List<VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs>> embeddingSourceColumns) {
            $.embeddingSourceColumns = embeddingSourceColumns;
            return this;
        }

        /**
         * @param embeddingSourceColumns array of objects representing columns that contain the embedding source.  Each entry consists of:
         * 
         * @return builder
         * 
         */
        public Builder embeddingSourceColumns(List<VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs> embeddingSourceColumns) {
            return embeddingSourceColumns(Output.of(embeddingSourceColumns));
        }

        /**
         * @param embeddingSourceColumns array of objects representing columns that contain the embedding source.  Each entry consists of:
         * 
         * @return builder
         * 
         */
        public Builder embeddingSourceColumns(VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs... embeddingSourceColumns) {
            return embeddingSourceColumns(List.of(embeddingSourceColumns));
        }

        public Builder embeddingVectorColumns(@Nullable Output<List<VectorSearchIndexDirectAccessIndexSpecEmbeddingVectorColumnArgs>> embeddingVectorColumns) {
            $.embeddingVectorColumns = embeddingVectorColumns;
            return this;
        }

        public Builder embeddingVectorColumns(List<VectorSearchIndexDirectAccessIndexSpecEmbeddingVectorColumnArgs> embeddingVectorColumns) {
            return embeddingVectorColumns(Output.of(embeddingVectorColumns));
        }

        public Builder embeddingVectorColumns(VectorSearchIndexDirectAccessIndexSpecEmbeddingVectorColumnArgs... embeddingVectorColumns) {
            return embeddingVectorColumns(List.of(embeddingVectorColumns));
        }

        /**
         * @param schemaJson The schema of the index in JSON format.  Check the [API documentation](https://docs.databricks.com/api/workspace/vectorsearchindexes/createindex#direct_access_index_spec-schema_json) for a list of supported data types.
         * 
         * @return builder
         * 
         */
        public Builder schemaJson(@Nullable Output<String> schemaJson) {
            $.schemaJson = schemaJson;
            return this;
        }

        /**
         * @param schemaJson The schema of the index in JSON format.  Check the [API documentation](https://docs.databricks.com/api/workspace/vectorsearchindexes/createindex#direct_access_index_spec-schema_json) for a list of supported data types.
         * 
         * @return builder
         * 
         */
        public Builder schemaJson(String schemaJson) {
            return schemaJson(Output.of(schemaJson));
        }

        public VectorSearchIndexDirectAccessIndexSpecArgs build() {
            return $;
        }
    }

}
