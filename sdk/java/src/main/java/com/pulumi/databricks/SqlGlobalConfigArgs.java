// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlGlobalConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlGlobalConfigArgs Empty = new SqlGlobalConfigArgs();

    /**
     * Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you&#39;re specifying not permitted configuration.
     * 
     */
    @Import(name="dataAccessConfig")
    private @Nullable Output<Map<String,Object>> dataAccessConfig;

    /**
     * @return Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you&#39;re specifying not permitted configuration.
     * 
     */
    public Optional<Output<Map<String,Object>>> dataAccessConfig() {
        return Optional.ofNullable(this.dataAccessConfig);
    }

    /**
     * @deprecated
     * This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future
     * 
     */
    @Deprecated /* This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future */
    @Import(name="enableServerlessCompute")
    private @Nullable Output<Boolean> enableServerlessCompute;

    /**
     * @deprecated
     * This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future
     * 
     */
    @Deprecated /* This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future */
    public Optional<Output<Boolean>> enableServerlessCompute() {
        return Optional.ofNullable(this.enableServerlessCompute);
    }

    /**
     * databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
     * 
     */
    @Import(name="instanceProfileArn")
    private @Nullable Output<String> instanceProfileArn;

    /**
     * @return databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
     * 
     */
    public Optional<Output<String>> instanceProfileArn() {
        return Optional.ofNullable(this.instanceProfileArn);
    }

    /**
     * The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
     * 
     */
    @Import(name="securityPolicy")
    private @Nullable Output<String> securityPolicy;

    /**
     * @return The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
     * 
     */
    public Optional<Output<String>> securityPolicy() {
        return Optional.ofNullable(this.securityPolicy);
    }

    /**
     * SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
     * 
     */
    @Import(name="sqlConfigParams")
    private @Nullable Output<Map<String,Object>> sqlConfigParams;

    /**
     * @return SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
     * 
     */
    public Optional<Output<Map<String,Object>>> sqlConfigParams() {
        return Optional.ofNullable(this.sqlConfigParams);
    }

    private SqlGlobalConfigArgs() {}

    private SqlGlobalConfigArgs(SqlGlobalConfigArgs $) {
        this.dataAccessConfig = $.dataAccessConfig;
        this.enableServerlessCompute = $.enableServerlessCompute;
        this.instanceProfileArn = $.instanceProfileArn;
        this.securityPolicy = $.securityPolicy;
        this.sqlConfigParams = $.sqlConfigParams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlGlobalConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlGlobalConfigArgs $;

        public Builder() {
            $ = new SqlGlobalConfigArgs();
        }

        public Builder(SqlGlobalConfigArgs defaults) {
            $ = new SqlGlobalConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataAccessConfig Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you&#39;re specifying not permitted configuration.
         * 
         * @return builder
         * 
         */
        public Builder dataAccessConfig(@Nullable Output<Map<String,Object>> dataAccessConfig) {
            $.dataAccessConfig = dataAccessConfig;
            return this;
        }

        /**
         * @param dataAccessConfig Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you&#39;re specifying not permitted configuration.
         * 
         * @return builder
         * 
         */
        public Builder dataAccessConfig(Map<String,Object> dataAccessConfig) {
            return dataAccessConfig(Output.of(dataAccessConfig));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future
         * 
         */
        @Deprecated /* This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future */
        public Builder enableServerlessCompute(@Nullable Output<Boolean> enableServerlessCompute) {
            $.enableServerlessCompute = enableServerlessCompute;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future
         * 
         */
        @Deprecated /* This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future */
        public Builder enableServerlessCompute(Boolean enableServerlessCompute) {
            return enableServerlessCompute(Output.of(enableServerlessCompute));
        }

        /**
         * @param instanceProfileArn databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfileArn(@Nullable Output<String> instanceProfileArn) {
            $.instanceProfileArn = instanceProfileArn;
            return this;
        }

        /**
         * @param instanceProfileArn databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfileArn(String instanceProfileArn) {
            return instanceProfileArn(Output.of(instanceProfileArn));
        }

        /**
         * @param securityPolicy The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
         * 
         * @return builder
         * 
         */
        public Builder securityPolicy(@Nullable Output<String> securityPolicy) {
            $.securityPolicy = securityPolicy;
            return this;
        }

        /**
         * @param securityPolicy The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
         * 
         * @return builder
         * 
         */
        public Builder securityPolicy(String securityPolicy) {
            return securityPolicy(Output.of(securityPolicy));
        }

        /**
         * @param sqlConfigParams SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
         * 
         * @return builder
         * 
         */
        public Builder sqlConfigParams(@Nullable Output<Map<String,Object>> sqlConfigParams) {
            $.sqlConfigParams = sqlConfigParams;
            return this;
        }

        /**
         * @param sqlConfigParams SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
         * 
         * @return builder
         * 
         */
        public Builder sqlConfigParams(Map<String,Object> sqlConfigParams) {
            return sqlConfigParams(Output.of(sqlConfigParams));
        }

        public SqlGlobalConfigArgs build() {
            return $;
        }
    }

}
