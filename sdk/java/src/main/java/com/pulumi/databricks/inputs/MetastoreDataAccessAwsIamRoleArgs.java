// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetastoreDataAccessAwsIamRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreDataAccessAwsIamRoleArgs Empty = new MetastoreDataAccessAwsIamRoleArgs();

    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="unityCatalogIamArn")
    private @Nullable Output<String> unityCatalogIamArn;

    public Optional<Output<String>> unityCatalogIamArn() {
        return Optional.ofNullable(this.unityCatalogIamArn);
    }

    private MetastoreDataAccessAwsIamRoleArgs() {}

    private MetastoreDataAccessAwsIamRoleArgs(MetastoreDataAccessAwsIamRoleArgs $) {
        this.externalId = $.externalId;
        this.roleArn = $.roleArn;
        this.unityCatalogIamArn = $.unityCatalogIamArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreDataAccessAwsIamRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreDataAccessAwsIamRoleArgs $;

        public Builder() {
            $ = new MetastoreDataAccessAwsIamRoleArgs();
        }

        public Builder(MetastoreDataAccessAwsIamRoleArgs defaults) {
            $ = new MetastoreDataAccessAwsIamRoleArgs(Objects.requireNonNull(defaults));
        }

        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder unityCatalogIamArn(@Nullable Output<String> unityCatalogIamArn) {
            $.unityCatalogIamArn = unityCatalogIamArn;
            return this;
        }

        public Builder unityCatalogIamArn(String unityCatalogIamArn) {
            return unityCatalogIamArn(Output.of(unityCatalogIamArn));
        }

        public MetastoreDataAccessAwsIamRoleArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
