// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClustersResult {
    private @Nullable String clusterNameContains;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return list of databricks.Cluster ids
     * 
     */
    private List<String> ids;

    private GetClustersResult() {}
    public Optional<String> clusterNameContains() {
        return Optional.ofNullable(this.clusterNameContains);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return list of databricks.Cluster ids
     * 
     */
    public List<String> ids() {
        return this.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clusterNameContains;
        private String id;
        private List<String> ids;
        public Builder() {}
        public Builder(GetClustersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterNameContains = defaults.clusterNameContains;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
        }

        @CustomType.Setter
        public Builder clusterNameContains(@Nullable String clusterNameContains) {

            this.clusterNameContains = clusterNameContains;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetClustersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetClustersResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public GetClustersResult build() {
            final var _resultValue = new GetClustersResult();
            _resultValue.clusterNameContains = clusterNameContains;
            _resultValue.id = id;
            _resultValue.ids = ids;
            return _resultValue;
        }
    }
}
