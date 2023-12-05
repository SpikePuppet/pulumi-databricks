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


public final class CatalogWorkspaceBindingState extends com.pulumi.resources.ResourceArgs {

    public static final CatalogWorkspaceBindingState Empty = new CatalogWorkspaceBindingState();

    /**
     * Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
     * 
     */
    @Import(name="bindingType")
    private @Nullable Output<String> bindingType;

    /**
     * @return Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
     * 
     */
    public Optional<Output<String>> bindingType() {
        return Optional.ofNullable(this.bindingType);
    }

    /**
     * @deprecated
     * Please use &#39;securable_name&#39; and &#39;securable_type instead.
     * 
     */
    @Deprecated /* Please use 'securable_name' and 'securable_type instead. */
    @Import(name="catalogName")
    private @Nullable Output<String> catalogName;

    /**
     * @deprecated
     * Please use &#39;securable_name&#39; and &#39;securable_type instead.
     * 
     */
    @Deprecated /* Please use 'securable_name' and 'securable_type instead. */
    public Optional<Output<String>> catalogName() {
        return Optional.ofNullable(this.catalogName);
    }

    /**
     * Name of securable. Change forces creation of a new resource.
     * 
     */
    @Import(name="securableName")
    private @Nullable Output<String> securableName;

    /**
     * @return Name of securable. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> securableName() {
        return Optional.ofNullable(this.securableName);
    }

    /**
     * Type of securable. Default to `catalog`. Change forces creation of a new resource.
     * 
     */
    @Import(name="securableType")
    private @Nullable Output<String> securableType;

    /**
     * @return Type of securable. Default to `catalog`. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> securableType() {
        return Optional.ofNullable(this.securableType);
    }

    /**
     * ID of the workspace. Change forces creation of a new resource.
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<Integer> workspaceId;

    /**
     * @return ID of the workspace. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<Integer>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private CatalogWorkspaceBindingState() {}

    private CatalogWorkspaceBindingState(CatalogWorkspaceBindingState $) {
        this.bindingType = $.bindingType;
        this.catalogName = $.catalogName;
        this.securableName = $.securableName;
        this.securableType = $.securableType;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogWorkspaceBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogWorkspaceBindingState $;

        public Builder() {
            $ = new CatalogWorkspaceBindingState();
        }

        public Builder(CatalogWorkspaceBindingState defaults) {
            $ = new CatalogWorkspaceBindingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bindingType Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
         * 
         * @return builder
         * 
         */
        public Builder bindingType(@Nullable Output<String> bindingType) {
            $.bindingType = bindingType;
            return this;
        }

        /**
         * @param bindingType Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
         * 
         * @return builder
         * 
         */
        public Builder bindingType(String bindingType) {
            return bindingType(Output.of(bindingType));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Please use &#39;securable_name&#39; and &#39;securable_type instead.
         * 
         */
        @Deprecated /* Please use 'securable_name' and 'securable_type instead. */
        public Builder catalogName(@Nullable Output<String> catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Please use &#39;securable_name&#39; and &#39;securable_type instead.
         * 
         */
        @Deprecated /* Please use 'securable_name' and 'securable_type instead. */
        public Builder catalogName(String catalogName) {
            return catalogName(Output.of(catalogName));
        }

        /**
         * @param securableName Name of securable. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder securableName(@Nullable Output<String> securableName) {
            $.securableName = securableName;
            return this;
        }

        /**
         * @param securableName Name of securable. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder securableName(String securableName) {
            return securableName(Output.of(securableName));
        }

        /**
         * @param securableType Type of securable. Default to `catalog`. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder securableType(@Nullable Output<String> securableType) {
            $.securableType = securableType;
            return this;
        }

        /**
         * @param securableType Type of securable. Default to `catalog`. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder securableType(String securableType) {
            return securableType(Output.of(securableType));
        }

        /**
         * @param workspaceId ID of the workspace. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<Integer> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId ID of the workspace. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Integer workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public CatalogWorkspaceBindingState build() {
            return $;
        }
    }

}
