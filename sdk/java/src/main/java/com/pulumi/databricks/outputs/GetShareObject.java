// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetShareObjectPartition;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetShareObject {
    private Integer addedAt;
    private String addedBy;
    private @Nullable Boolean cdfEnabled;
    /**
     * @return Description about the object.
     * 
     */
    private @Nullable String comment;
    /**
     * @return Type of the object.
     * 
     */
    private String dataObjectType;
    private @Nullable String historyDataSharingStatus;
    /**
     * @return The name of the share
     * 
     */
    private String name;
    private @Nullable List<GetShareObjectPartition> partitions;
    private @Nullable String sharedAs;
    private @Nullable Integer startVersion;
    private String status;

    private GetShareObject() {}
    public Integer addedAt() {
        return this.addedAt;
    }
    public String addedBy() {
        return this.addedBy;
    }
    public Optional<Boolean> cdfEnabled() {
        return Optional.ofNullable(this.cdfEnabled);
    }
    /**
     * @return Description about the object.
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return Type of the object.
     * 
     */
    public String dataObjectType() {
        return this.dataObjectType;
    }
    public Optional<String> historyDataSharingStatus() {
        return Optional.ofNullable(this.historyDataSharingStatus);
    }
    /**
     * @return The name of the share
     * 
     */
    public String name() {
        return this.name;
    }
    public List<GetShareObjectPartition> partitions() {
        return this.partitions == null ? List.of() : this.partitions;
    }
    public Optional<String> sharedAs() {
        return Optional.ofNullable(this.sharedAs);
    }
    public Optional<Integer> startVersion() {
        return Optional.ofNullable(this.startVersion);
    }
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetShareObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer addedAt;
        private String addedBy;
        private @Nullable Boolean cdfEnabled;
        private @Nullable String comment;
        private String dataObjectType;
        private @Nullable String historyDataSharingStatus;
        private String name;
        private @Nullable List<GetShareObjectPartition> partitions;
        private @Nullable String sharedAs;
        private @Nullable Integer startVersion;
        private String status;
        public Builder() {}
        public Builder(GetShareObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addedAt = defaults.addedAt;
    	      this.addedBy = defaults.addedBy;
    	      this.cdfEnabled = defaults.cdfEnabled;
    	      this.comment = defaults.comment;
    	      this.dataObjectType = defaults.dataObjectType;
    	      this.historyDataSharingStatus = defaults.historyDataSharingStatus;
    	      this.name = defaults.name;
    	      this.partitions = defaults.partitions;
    	      this.sharedAs = defaults.sharedAs;
    	      this.startVersion = defaults.startVersion;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder addedAt(Integer addedAt) {
            if (addedAt == null) {
              throw new MissingRequiredPropertyException("GetShareObject", "addedAt");
            }
            this.addedAt = addedAt;
            return this;
        }
        @CustomType.Setter
        public Builder addedBy(String addedBy) {
            if (addedBy == null) {
              throw new MissingRequiredPropertyException("GetShareObject", "addedBy");
            }
            this.addedBy = addedBy;
            return this;
        }
        @CustomType.Setter
        public Builder cdfEnabled(@Nullable Boolean cdfEnabled) {

            this.cdfEnabled = cdfEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder dataObjectType(String dataObjectType) {
            if (dataObjectType == null) {
              throw new MissingRequiredPropertyException("GetShareObject", "dataObjectType");
            }
            this.dataObjectType = dataObjectType;
            return this;
        }
        @CustomType.Setter
        public Builder historyDataSharingStatus(@Nullable String historyDataSharingStatus) {

            this.historyDataSharingStatus = historyDataSharingStatus;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetShareObject", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder partitions(@Nullable List<GetShareObjectPartition> partitions) {

            this.partitions = partitions;
            return this;
        }
        public Builder partitions(GetShareObjectPartition... partitions) {
            return partitions(List.of(partitions));
        }
        @CustomType.Setter
        public Builder sharedAs(@Nullable String sharedAs) {

            this.sharedAs = sharedAs;
            return this;
        }
        @CustomType.Setter
        public Builder startVersion(@Nullable Integer startVersion) {

            this.startVersion = startVersion;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetShareObject", "status");
            }
            this.status = status;
            return this;
        }
        public GetShareObject build() {
            final var _resultValue = new GetShareObject();
            _resultValue.addedAt = addedAt;
            _resultValue.addedBy = addedBy;
            _resultValue.cdfEnabled = cdfEnabled;
            _resultValue.comment = comment;
            _resultValue.dataObjectType = dataObjectType;
            _resultValue.historyDataSharingStatus = historyDataSharingStatus;
            _resultValue.name = name;
            _resultValue.partitions = partitions;
            _resultValue.sharedAs = sharedAs;
            _resultValue.startVersion = startVersion;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
