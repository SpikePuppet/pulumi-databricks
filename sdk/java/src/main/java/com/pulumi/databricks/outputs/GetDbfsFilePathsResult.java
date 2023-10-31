// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetDbfsFilePathsPathList;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDbfsFilePathsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String path;
    /**
     * @return returns list of objects with `path` and `file_size` attributes in each
     * 
     */
    private List<GetDbfsFilePathsPathList> pathLists;
    private Boolean recursive;

    private GetDbfsFilePathsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String path() {
        return this.path;
    }
    /**
     * @return returns list of objects with `path` and `file_size` attributes in each
     * 
     */
    public List<GetDbfsFilePathsPathList> pathLists() {
        return this.pathLists;
    }
    public Boolean recursive() {
        return this.recursive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDbfsFilePathsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String path;
        private List<GetDbfsFilePathsPathList> pathLists;
        private Boolean recursive;
        public Builder() {}
        public Builder(GetDbfsFilePathsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.path = defaults.path;
    	      this.pathLists = defaults.pathLists;
    	      this.recursive = defaults.recursive;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder pathLists(List<GetDbfsFilePathsPathList> pathLists) {
            this.pathLists = Objects.requireNonNull(pathLists);
            return this;
        }
        public Builder pathLists(GetDbfsFilePathsPathList... pathLists) {
            return pathLists(List.of(pathLists));
        }
        @CustomType.Setter
        public Builder recursive(Boolean recursive) {
            this.recursive = Objects.requireNonNull(recursive);
            return this;
        }
        public GetDbfsFilePathsResult build() {
            final var _resultValue = new GetDbfsFilePathsResult();
            _resultValue.id = id;
            _resultValue.path = path;
            _resultValue.pathLists = pathLists;
            _resultValue.recursive = recursive;
            return _resultValue;
        }
    }
}
