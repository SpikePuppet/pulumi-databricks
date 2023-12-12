// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MwsLogDeliveryArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MwsLogDeliveryState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Note** Initialize provider with `alias = &#34;mws&#34;`, `host  = &#34;https://accounts.cloud.databricks.com&#34;` and use `provider = databricks.mws`
 * 
 * This resource configures the delivery of the two supported log types from Databricks workspaces: [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
 * 
 * You cannot delete a log delivery configuration, but you can disable it when you no longer need it. This fact is important because there is a limit to the number of enabled log delivery configurations that you can create for an account. You can create a maximum of two enabled configurations that use the account level (no workspace filter) and two enabled configurations for every specific workspace (a workspaceId can occur in the workspace filter for two configurations). You can re-enable a disabled configuration, but the request fails if it violates the limits previously described.
 * 
 * ## Billable Usage
 * 
 * CSV files are delivered to `&lt;delivery_path_prefix&gt;/billable-usage/csv/` and are named `workspaceId=&lt;workspace-id&gt;-usageMonth=&lt;month&gt;.csv`, which are delivered daily by overwriting the month&#39;s CSV file for each workspace. Format of CSV file, as well as some usage examples, can be found [here](https://docs.databricks.com/administration-guide/account-settings/usage.html#download-usage-as-a-csv-file).
 * 
 * Common processing scenario is to apply [cost allocation tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html), that could be enforced by setting custom_tags on a cluster or through cluster policy. Report contains `clusterId` field, that could be joined with data from AWS [cost and usage reports](https://docs.aws.amazon.com/cur/latest/userguide/cur-create.html), that can be joined with `user:ClusterId` tag from AWS usage report.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MwsLogDelivery;
 * import com.pulumi.databricks.MwsLogDeliveryArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var usageLogs = new MwsLogDelivery(&#34;usageLogs&#34;, MwsLogDeliveryArgs.builder()        
 *             .accountId(var_.databricks_account_id())
 *             .credentialsId(databricks_mws_credentials.log_writer().credentials_id())
 *             .storageConfigurationId(databricks_mws_storage_configurations.log_bucket().storage_configuration_id())
 *             .deliveryPathPrefix(&#34;billable-usage&#34;)
 *             .configName(&#34;Usage Logs&#34;)
 *             .logType(&#34;BILLABLE_USAGE&#34;)
 *             .outputFormat(&#34;CSV&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Audit Logs
 * 
 * JSON files with [static schema](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html#audit-log-schema) are delivered to `&lt;delivery_path_prefix&gt;/workspaceId=&lt;workspaceId&gt;/date=&lt;yyyy-mm-dd&gt;/auditlogs_&lt;internal-id&gt;.json`. Logs are available within 15 minutes of activation for audit logs. New JSON files are delivered every few minutes, potentially overwriting existing files for each workspace. Sometimes data may arrive later than 15 minutes. Databricks can overwrite the delivered log files in your bucket at any time. If a file is overwritten, the existing content remains, but there may be additional lines for more auditable events. Overwriting ensures exactly-once semantics without requiring read or delete access to your account.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MwsLogDelivery;
 * import com.pulumi.databricks.MwsLogDeliveryArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var auditLogs = new MwsLogDelivery(&#34;auditLogs&#34;, MwsLogDeliveryArgs.builder()        
 *             .accountId(var_.databricks_account_id())
 *             .credentialsId(databricks_mws_credentials.log_writer().credentials_id())
 *             .storageConfigurationId(databricks_mws_storage_configurations.log_bucket().storage_configuration_id())
 *             .deliveryPathPrefix(&#34;audit-logs&#34;)
 *             .configName(&#34;Audit Logs&#34;)
 *             .logType(&#34;AUDIT_LOGS&#34;)
 *             .outputFormat(&#34;JSON&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Related Resources
 * 
 * The following resources are used in the same context:
 * 
 * * Provisioning Databricks on AWS guide.
 * * databricks.MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
 * * databricks.MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
 * * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) &amp; subnets for new workspaces within AWS.
 * * databricks.MwsStorageConfigurations to configure root bucket new workspaces within AWS.
 * * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
 * 
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/mwsLogDelivery:MwsLogDelivery")
public class MwsLogDelivery extends com.pulumi.resources.CustomResource {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Databricks log delivery configuration ID.
     * 
     */
    @Export(name="configId", refs={String.class}, tree="[0]")
    private Output<String> configId;

    /**
     * @return Databricks log delivery configuration ID.
     * 
     */
    public Output<String> configId() {
        return this.configId;
    }
    /**
     * The optional human-readable name of the log delivery configuration. Defaults to empty.
     * 
     */
    @Export(name="configName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> configName;

    /**
     * @return The optional human-readable name of the log delivery configuration. Defaults to empty.
     * 
     */
    public Output<Optional<String>> configName() {
        return Codegen.optional(this.configName);
    }
    /**
     * The ID for a Databricks credential configuration that represents the AWS IAM role with policy and trust relationship as described in the main billable usage documentation page.
     * 
     */
    @Export(name="credentialsId", refs={String.class}, tree="[0]")
    private Output<String> credentialsId;

    /**
     * @return The ID for a Databricks credential configuration that represents the AWS IAM role with policy and trust relationship as described in the main billable usage documentation page.
     * 
     */
    public Output<String> credentialsId() {
        return this.credentialsId;
    }
    /**
     * Defaults to empty, which means that logs are delivered to the root of the bucket. The value must be a valid S3 object key. It must not start or end with a slash character.
     * 
     */
    @Export(name="deliveryPathPrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deliveryPathPrefix;

    /**
     * @return Defaults to empty, which means that logs are delivered to the root of the bucket. The value must be a valid S3 object key. It must not start or end with a slash character.
     * 
     */
    public Output<Optional<String>> deliveryPathPrefix() {
        return Codegen.optional(this.deliveryPathPrefix);
    }
    /**
     * The optional start month and year for delivery, specified in YYYY-MM format. Defaults to current year and month. Usage is not available before 2019-03.
     * 
     */
    @Export(name="deliveryStartTime", refs={String.class}, tree="[0]")
    private Output<String> deliveryStartTime;

    /**
     * @return The optional start month and year for delivery, specified in YYYY-MM format. Defaults to current year and month. Usage is not available before 2019-03.
     * 
     */
    public Output<String> deliveryStartTime() {
        return this.deliveryStartTime;
    }
    /**
     * The type of log delivery. `BILLABLE_USAGE` and `AUDIT_LOGS` are supported.
     * 
     */
    @Export(name="logType", refs={String.class}, tree="[0]")
    private Output<String> logType;

    /**
     * @return The type of log delivery. `BILLABLE_USAGE` and `AUDIT_LOGS` are supported.
     * 
     */
    public Output<String> logType() {
        return this.logType;
    }
    /**
     * The file type of log delivery. Currently `CSV` (for `BILLABLE_USAGE`) and `JSON` (for `AUDIT_LOGS`) are supported.
     * 
     */
    @Export(name="outputFormat", refs={String.class}, tree="[0]")
    private Output<String> outputFormat;

    /**
     * @return The file type of log delivery. Currently `CSV` (for `BILLABLE_USAGE`) and `JSON` (for `AUDIT_LOGS`) are supported.
     * 
     */
    public Output<String> outputFormat() {
        return this.outputFormat;
    }
    /**
     * Status of log delivery configuration. Set to ENABLED or DISABLED. Defaults to ENABLED. This is the only field you can update.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of log delivery configuration. Set to ENABLED or DISABLED. Defaults to ENABLED. This is the only field you can update.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The ID for a Databricks storage configuration that represents the S3 bucket with bucket policy as described in the main billable usage documentation page.
     * 
     */
    @Export(name="storageConfigurationId", refs={String.class}, tree="[0]")
    private Output<String> storageConfigurationId;

    /**
     * @return The ID for a Databricks storage configuration that represents the S3 bucket with bucket policy as described in the main billable usage documentation page.
     * 
     */
    public Output<String> storageConfigurationId() {
        return this.storageConfigurationId;
    }
    /**
     * By default, this log configuration applies to all workspaces associated with your account ID. If your account is on the E2 version of the platform or on a select custom plan that allows multiple workspaces per account, you may have multiple workspaces associated with your account ID. You can optionally set the field as mentioned earlier to an array of workspace IDs. If you plan to use different log delivery configurations for several workspaces, set this explicitly rather than leaving it blank. If you leave this blank and your account ID gets additional workspaces in the future, this configuration will also apply to the new workspaces.
     * 
     */
    @Export(name="workspaceIdsFilters", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> workspaceIdsFilters;

    /**
     * @return By default, this log configuration applies to all workspaces associated with your account ID. If your account is on the E2 version of the platform or on a select custom plan that allows multiple workspaces per account, you may have multiple workspaces associated with your account ID. You can optionally set the field as mentioned earlier to an array of workspace IDs. If you plan to use different log delivery configurations for several workspaces, set this explicitly rather than leaving it blank. If you leave this blank and your account ID gets additional workspaces in the future, this configuration will also apply to the new workspaces.
     * 
     */
    public Output<Optional<List<Integer>>> workspaceIdsFilters() {
        return Codegen.optional(this.workspaceIdsFilters);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MwsLogDelivery(String name) {
        this(name, MwsLogDeliveryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MwsLogDelivery(String name, MwsLogDeliveryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MwsLogDelivery(String name, MwsLogDeliveryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsLogDelivery:MwsLogDelivery", name, args == null ? MwsLogDeliveryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MwsLogDelivery(String name, Output<String> id, @Nullable MwsLogDeliveryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsLogDelivery:MwsLogDelivery", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MwsLogDelivery get(String name, Output<String> id, @Nullable MwsLogDeliveryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MwsLogDelivery(name, id, state, options);
    }
}
