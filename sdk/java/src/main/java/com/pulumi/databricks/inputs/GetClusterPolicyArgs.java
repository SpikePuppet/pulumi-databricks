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


public final class GetClusterPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterPolicyArgs Empty = new GetClusterPolicyArgs();

    /**
     * Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
     * 
     */
    @Import(name="definition")
    private @Nullable Output<String> definition;

    /**
     * @return Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
     * 
     */
    public Optional<Output<String>> definition() {
        return Optional.ofNullable(this.definition);
    }

    /**
     * The id of the cluster policy.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The id of the cluster policy.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Max number of clusters per user that can be active using this policy
     * 
     */
    @Import(name="maxClustersPerUser")
    private @Nullable Output<Integer> maxClustersPerUser;

    /**
     * @return Max number of clusters per user that can be active using this policy
     * 
     */
    public Optional<Output<Integer>> maxClustersPerUser() {
        return Optional.ofNullable(this.maxClustersPerUser);
    }

    /**
     * Name of the cluster policy. The cluster policy must exist before this resource can be planned.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the cluster policy. The cluster policy must exist before this resource can be planned.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetClusterPolicyArgs() {}

    private GetClusterPolicyArgs(GetClusterPolicyArgs $) {
        this.definition = $.definition;
        this.id = $.id;
        this.maxClustersPerUser = $.maxClustersPerUser;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterPolicyArgs $;

        public Builder() {
            $ = new GetClusterPolicyArgs();
        }

        public Builder(GetClusterPolicyArgs defaults) {
            $ = new GetClusterPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param definition Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
         * 
         * @return builder
         * 
         */
        public Builder definition(@Nullable Output<String> definition) {
            $.definition = definition;
            return this;
        }

        /**
         * @param definition Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
         * 
         * @return builder
         * 
         */
        public Builder definition(String definition) {
            return definition(Output.of(definition));
        }

        /**
         * @param id The id of the cluster policy.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the cluster policy.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param maxClustersPerUser Max number of clusters per user that can be active using this policy
         * 
         * @return builder
         * 
         */
        public Builder maxClustersPerUser(@Nullable Output<Integer> maxClustersPerUser) {
            $.maxClustersPerUser = maxClustersPerUser;
            return this;
        }

        /**
         * @param maxClustersPerUser Max number of clusters per user that can be active using this policy
         * 
         * @return builder
         * 
         */
        public Builder maxClustersPerUser(Integer maxClustersPerUser) {
            return maxClustersPerUser(Output.of(maxClustersPerUser));
        }

        /**
         * @param name Name of the cluster policy. The cluster policy must exist before this resource can be planned.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the cluster policy. The cluster policy must exist before this resource can be planned.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetClusterPolicyArgs build() {
            return $;
        }
    }

}
