// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingTagArgs Empty = new ModelServingTagArgs();

    /**
     * The key field for a tag.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key field for a tag.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The value field for a tag.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value field for a tag.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ModelServingTagArgs() {}

    private ModelServingTagArgs(ModelServingTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingTagArgs $;

        public Builder() {
            $ = new ModelServingTagArgs();
        }

        public Builder(ModelServingTagArgs defaults) {
            $ = new ModelServingTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key field for a tag.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key field for a tag.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The value field for a tag.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value field for a tag.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ModelServingTagArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("ModelServingTagArgs", "key");
            }
            return $;
        }
    }

}
