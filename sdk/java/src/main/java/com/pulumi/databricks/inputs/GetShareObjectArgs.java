// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetShareObjectPartitionArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetShareObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetShareObjectArgs Empty = new GetShareObjectArgs();

    @Import(name="addedAt", required=true)
    private Output<Integer> addedAt;

    public Output<Integer> addedAt() {
        return this.addedAt;
    }

    @Import(name="addedBy", required=true)
    private Output<String> addedBy;

    public Output<String> addedBy() {
        return this.addedBy;
    }

    @Import(name="cdfEnabled")
    private @Nullable Output<Boolean> cdfEnabled;

    public Optional<Output<Boolean>> cdfEnabled() {
        return Optional.ofNullable(this.cdfEnabled);
    }

    /**
     * Description about the object.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Description about the object.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Type of the object.
     * 
     */
    @Import(name="dataObjectType", required=true)
    private Output<String> dataObjectType;

    /**
     * @return Type of the object.
     * 
     */
    public Output<String> dataObjectType() {
        return this.dataObjectType;
    }

    @Import(name="historyDataSharingStatus")
    private @Nullable Output<String> historyDataSharingStatus;

    public Optional<Output<String>> historyDataSharingStatus() {
        return Optional.ofNullable(this.historyDataSharingStatus);
    }

    /**
     * The name of the share
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the share
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="partitions")
    private @Nullable Output<List<GetShareObjectPartitionArgs>> partitions;

    public Optional<Output<List<GetShareObjectPartitionArgs>>> partitions() {
        return Optional.ofNullable(this.partitions);
    }

    @Import(name="sharedAs")
    private @Nullable Output<String> sharedAs;

    public Optional<Output<String>> sharedAs() {
        return Optional.ofNullable(this.sharedAs);
    }

    @Import(name="startVersion")
    private @Nullable Output<Integer> startVersion;

    public Optional<Output<Integer>> startVersion() {
        return Optional.ofNullable(this.startVersion);
    }

    @Import(name="status", required=true)
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    private GetShareObjectArgs() {}

    private GetShareObjectArgs(GetShareObjectArgs $) {
        this.addedAt = $.addedAt;
        this.addedBy = $.addedBy;
        this.cdfEnabled = $.cdfEnabled;
        this.comment = $.comment;
        this.dataObjectType = $.dataObjectType;
        this.historyDataSharingStatus = $.historyDataSharingStatus;
        this.name = $.name;
        this.partitions = $.partitions;
        this.sharedAs = $.sharedAs;
        this.startVersion = $.startVersion;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetShareObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetShareObjectArgs $;

        public Builder() {
            $ = new GetShareObjectArgs();
        }

        public Builder(GetShareObjectArgs defaults) {
            $ = new GetShareObjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder addedAt(Output<Integer> addedAt) {
            $.addedAt = addedAt;
            return this;
        }

        public Builder addedAt(Integer addedAt) {
            return addedAt(Output.of(addedAt));
        }

        public Builder addedBy(Output<String> addedBy) {
            $.addedBy = addedBy;
            return this;
        }

        public Builder addedBy(String addedBy) {
            return addedBy(Output.of(addedBy));
        }

        public Builder cdfEnabled(@Nullable Output<Boolean> cdfEnabled) {
            $.cdfEnabled = cdfEnabled;
            return this;
        }

        public Builder cdfEnabled(Boolean cdfEnabled) {
            return cdfEnabled(Output.of(cdfEnabled));
        }

        /**
         * @param comment Description about the object.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Description about the object.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param dataObjectType Type of the object.
         * 
         * @return builder
         * 
         */
        public Builder dataObjectType(Output<String> dataObjectType) {
            $.dataObjectType = dataObjectType;
            return this;
        }

        /**
         * @param dataObjectType Type of the object.
         * 
         * @return builder
         * 
         */
        public Builder dataObjectType(String dataObjectType) {
            return dataObjectType(Output.of(dataObjectType));
        }

        public Builder historyDataSharingStatus(@Nullable Output<String> historyDataSharingStatus) {
            $.historyDataSharingStatus = historyDataSharingStatus;
            return this;
        }

        public Builder historyDataSharingStatus(String historyDataSharingStatus) {
            return historyDataSharingStatus(Output.of(historyDataSharingStatus));
        }

        /**
         * @param name The name of the share
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the share
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder partitions(@Nullable Output<List<GetShareObjectPartitionArgs>> partitions) {
            $.partitions = partitions;
            return this;
        }

        public Builder partitions(List<GetShareObjectPartitionArgs> partitions) {
            return partitions(Output.of(partitions));
        }

        public Builder partitions(GetShareObjectPartitionArgs... partitions) {
            return partitions(List.of(partitions));
        }

        public Builder sharedAs(@Nullable Output<String> sharedAs) {
            $.sharedAs = sharedAs;
            return this;
        }

        public Builder sharedAs(String sharedAs) {
            return sharedAs(Output.of(sharedAs));
        }

        public Builder startVersion(@Nullable Output<Integer> startVersion) {
            $.startVersion = startVersion;
            return this;
        }

        public Builder startVersion(Integer startVersion) {
            return startVersion(Output.of(startVersion));
        }

        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetShareObjectArgs build() {
            if ($.addedAt == null) {
                throw new MissingRequiredPropertyException("GetShareObjectArgs", "addedAt");
            }
            if ($.addedBy == null) {
                throw new MissingRequiredPropertyException("GetShareObjectArgs", "addedBy");
            }
            if ($.dataObjectType == null) {
                throw new MissingRequiredPropertyException("GetShareObjectArgs", "dataObjectType");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetShareObjectArgs", "name");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("GetShareObjectArgs", "status");
            }
            return $;
        }
    }

}
