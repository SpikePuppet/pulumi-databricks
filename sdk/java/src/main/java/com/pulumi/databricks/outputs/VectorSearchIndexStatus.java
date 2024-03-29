// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VectorSearchIndexStatus {
    /**
     * @return Index API Url to be used to perform operations on the index
     * 
     */
    private @Nullable String indexUrl;
    /**
     * @return Number of rows indexed
     * 
     */
    private @Nullable Integer indexedRowCount;
    /**
     * @return Message associated with the index status
     * 
     */
    private @Nullable String message;
    /**
     * @return Whether the index is ready for search
     * 
     */
    private @Nullable Boolean ready;

    private VectorSearchIndexStatus() {}
    /**
     * @return Index API Url to be used to perform operations on the index
     * 
     */
    public Optional<String> indexUrl() {
        return Optional.ofNullable(this.indexUrl);
    }
    /**
     * @return Number of rows indexed
     * 
     */
    public Optional<Integer> indexedRowCount() {
        return Optional.ofNullable(this.indexedRowCount);
    }
    /**
     * @return Message associated with the index status
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return Whether the index is ready for search
     * 
     */
    public Optional<Boolean> ready() {
        return Optional.ofNullable(this.ready);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VectorSearchIndexStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String indexUrl;
        private @Nullable Integer indexedRowCount;
        private @Nullable String message;
        private @Nullable Boolean ready;
        public Builder() {}
        public Builder(VectorSearchIndexStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexUrl = defaults.indexUrl;
    	      this.indexedRowCount = defaults.indexedRowCount;
    	      this.message = defaults.message;
    	      this.ready = defaults.ready;
        }

        @CustomType.Setter
        public Builder indexUrl(@Nullable String indexUrl) {

            this.indexUrl = indexUrl;
            return this;
        }
        @CustomType.Setter
        public Builder indexedRowCount(@Nullable Integer indexedRowCount) {

            this.indexedRowCount = indexedRowCount;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {

            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder ready(@Nullable Boolean ready) {

            this.ready = ready;
            return this;
        }
        public VectorSearchIndexStatus build() {
            final var _resultValue = new VectorSearchIndexStatus();
            _resultValue.indexUrl = indexUrl;
            _resultValue.indexedRowCount = indexedRowCount;
            _resultValue.message = message;
            _resultValue.ready = ready;
            return _resultValue;
        }
    }
}
