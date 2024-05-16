// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag Empty = new GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag();

    @Import(name="inheritedFromName")
    private @Nullable String inheritedFromName;

    public Optional<String> inheritedFromName() {
        return Optional.ofNullable(this.inheritedFromName);
    }

    @Import(name="inheritedFromType")
    private @Nullable String inheritedFromType;

    public Optional<String> inheritedFromType() {
        return Optional.ofNullable(this.inheritedFromType);
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag() {}

    private GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag(GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag $) {
        this.inheritedFromName = $.inheritedFromName;
        this.inheritedFromType = $.inheritedFromType;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag $;

        public Builder() {
            $ = new GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag();
        }

        public Builder(GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag defaults) {
            $ = new GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag(Objects.requireNonNull(defaults));
        }

        public Builder inheritedFromName(@Nullable String inheritedFromName) {
            $.inheritedFromName = inheritedFromName;
            return this;
        }

        public Builder inheritedFromType(@Nullable String inheritedFromType) {
            $.inheritedFromType = inheritedFromType;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag", "value");
            }
            return $;
        }
    }

}
