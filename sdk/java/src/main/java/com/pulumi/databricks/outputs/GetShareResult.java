// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetShareObject;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetShareResult {
    /**
     * @return Time when the share was created.
     * 
     */
    private Integer createdAt;
    /**
     * @return The principal that created the share.
     * 
     */
    private String createdBy;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Full name of the object being shared.
     * 
     */
    private String name;
    /**
     * @return arrays containing details of each object in the share.
     * 
     */
    private List<GetShareObject> objects;

    private GetShareResult() {}
    /**
     * @return Time when the share was created.
     * 
     */
    public Integer createdAt() {
        return this.createdAt;
    }
    /**
     * @return The principal that created the share.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Full name of the object being shared.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return arrays containing details of each object in the share.
     * 
     */
    public List<GetShareObject> objects() {
        return this.objects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetShareResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer createdAt;
        private String createdBy;
        private String id;
        private String name;
        private List<GetShareObject> objects;
        public Builder() {}
        public Builder(GetShareResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.objects = defaults.objects;
        }

        @CustomType.Setter
        public Builder createdAt(Integer createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder objects(List<GetShareObject> objects) {
            this.objects = Objects.requireNonNull(objects);
            return this;
        }
        public Builder objects(GetShareObject... objects) {
            return objects(List.of(objects));
        }
        public GetShareResult build() {
            final var _resultValue = new GetShareResult();
            _resultValue.createdAt = createdAt;
            _resultValue.createdBy = createdBy;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.objects = objects;
            return _resultValue;
        }
    }
}
