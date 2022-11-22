// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ShareObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShareObjectArgs Empty = new ShareObjectArgs();

    @Import(name="addedAt")
    private @Nullable Output<Integer> addedAt;

    public Optional<Output<Integer>> addedAt() {
        return Optional.ofNullable(this.addedAt);
    }

    @Import(name="addedBy")
    private @Nullable Output<String> addedBy;

    public Optional<Output<String>> addedBy() {
        return Optional.ofNullable(this.addedBy);
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
     * Type of the object, currently only `TABLE` is allowed.
     * 
     */
    @Import(name="dataObjectType", required=true)
    private Output<String> dataObjectType;

    /**
     * @return Type of the object, currently only `TABLE` is allowed.
     * 
     */
    public Output<String> dataObjectType() {
        return this.dataObjectType;
    }

    /**
     * Full name of the object, e.g. `catalog.schema.name` for a table.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Full name of the object, e.g. `catalog.schema.name` for a table.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="sharedAs")
    private @Nullable Output<String> sharedAs;

    public Optional<Output<String>> sharedAs() {
        return Optional.ofNullable(this.sharedAs);
    }

    private ShareObjectArgs() {}

    private ShareObjectArgs(ShareObjectArgs $) {
        this.addedAt = $.addedAt;
        this.addedBy = $.addedBy;
        this.comment = $.comment;
        this.dataObjectType = $.dataObjectType;
        this.name = $.name;
        this.sharedAs = $.sharedAs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShareObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShareObjectArgs $;

        public Builder() {
            $ = new ShareObjectArgs();
        }

        public Builder(ShareObjectArgs defaults) {
            $ = new ShareObjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder addedAt(@Nullable Output<Integer> addedAt) {
            $.addedAt = addedAt;
            return this;
        }

        public Builder addedAt(Integer addedAt) {
            return addedAt(Output.of(addedAt));
        }

        public Builder addedBy(@Nullable Output<String> addedBy) {
            $.addedBy = addedBy;
            return this;
        }

        public Builder addedBy(String addedBy) {
            return addedBy(Output.of(addedBy));
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
         * @param dataObjectType Type of the object, currently only `TABLE` is allowed.
         * 
         * @return builder
         * 
         */
        public Builder dataObjectType(Output<String> dataObjectType) {
            $.dataObjectType = dataObjectType;
            return this;
        }

        /**
         * @param dataObjectType Type of the object, currently only `TABLE` is allowed.
         * 
         * @return builder
         * 
         */
        public Builder dataObjectType(String dataObjectType) {
            return dataObjectType(Output.of(dataObjectType));
        }

        /**
         * @param name Full name of the object, e.g. `catalog.schema.name` for a table.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Full name of the object, e.g. `catalog.schema.name` for a table.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder sharedAs(@Nullable Output<String> sharedAs) {
            $.sharedAs = sharedAs;
            return this;
        }

        public Builder sharedAs(String sharedAs) {
            return sharedAs(Output.of(sharedAs));
        }

        public ShareObjectArgs build() {
            $.dataObjectType = Objects.requireNonNull($.dataObjectType, "expected parameter 'dataObjectType' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
