// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpAccessListState extends com.pulumi.resources.ResourceArgs {

    public static final IpAccessListState Empty = new IpAccessListState();

    /**
     * Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * This is a field to allow the group to have instance pool create privileges.
     * 
     */
    @Import(name="ipAddresses")
    private @Nullable Output<List<String>> ipAddresses;

    /**
     * @return This is a field to allow the group to have instance pool create privileges.
     * 
     */
    public Optional<Output<List<String>>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }

    /**
     * This is the display name for the given IP ACL List.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return This is the display name for the given IP ACL List.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Can only be &#34;ALLOW&#34; or &#34;BLOCK&#34;
     * 
     */
    @Import(name="listType")
    private @Nullable Output<String> listType;

    /**
     * @return Can only be &#34;ALLOW&#34; or &#34;BLOCK&#34;
     * 
     */
    public Optional<Output<String>> listType() {
        return Optional.ofNullable(this.listType);
    }

    private IpAccessListState() {}

    private IpAccessListState(IpAccessListState $) {
        this.enabled = $.enabled;
        this.ipAddresses = $.ipAddresses;
        this.label = $.label;
        this.listType = $.listType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpAccessListState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpAccessListState $;

        public Builder() {
            $ = new IpAccessListState();
        }

        public Builder(IpAccessListState defaults) {
            $ = new IpAccessListState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param ipAddresses This is a field to allow the group to have instance pool create privileges.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(@Nullable Output<List<String>> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * @param ipAddresses This is a field to allow the group to have instance pool create privileges.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(List<String> ipAddresses) {
            return ipAddresses(Output.of(ipAddresses));
        }

        /**
         * @param ipAddresses This is a field to allow the group to have instance pool create privileges.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }

        /**
         * @param label This is the display name for the given IP ACL List.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label This is the display name for the given IP ACL List.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param listType Can only be &#34;ALLOW&#34; or &#34;BLOCK&#34;
         * 
         * @return builder
         * 
         */
        public Builder listType(@Nullable Output<String> listType) {
            $.listType = listType;
            return this;
        }

        /**
         * @param listType Can only be &#34;ALLOW&#34; or &#34;BLOCK&#34;
         * 
         * @return builder
         * 
         */
        public Builder listType(String listType) {
            return listType(Output.of(listType));
        }

        public IpAccessListState build() {
            return $;
        }
    }

}