// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MwsCustomerManagedKeysArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MwsCustomerManagedKeysState;
import com.pulumi.databricks.outputs.MwsCustomerManagedKeysAwsKeyInfo;
import com.pulumi.databricks.outputs.MwsCustomerManagedKeysGcpKeyInfo;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &gt; **Note** If you&#39;ve used the resource before, please add `use_cases = [&#34;MANAGED_SERVICES&#34;]` to keep the previous behaviour.
 * 
 * ### Customer-managed key for managed services
 * 
 * You must configure this during workspace creation
 * 
 * ### For AWS
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.kms.KeyArgs;
 * import com.pulumi.aws.kms.Alias;
 * import com.pulumi.aws.kms.AliasArgs;
 * import com.pulumi.databricks.MwsCustomerManagedKeys;
 * import com.pulumi.databricks.MwsCustomerManagedKeysArgs;
 * import com.pulumi.databricks.inputs.MwsCustomerManagedKeysAwsKeyInfoArgs;
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
 *         final var config = ctx.config();
 *         final var databricksAccountId = config.get("databricksAccountId");
 *         final var current = AwsFunctions.getCallerIdentity();
 * 
 *         final var databricksManagedServicesCmk = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .version("2012-10-17")
 *             .statements(            
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid("Enable IAM User Permissions")
 *                     .effect("Allow")
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type("AWS")
 *                         .identifiers(current.applyValue(getCallerIdentityResult -> getCallerIdentityResult.accountId()))
 *                         .build())
 *                     .actions("kms:*")
 *                     .resources("*")
 *                     .build(),
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid("Allow Databricks to use KMS key for control plane managed services")
 *                     .effect("Allow")
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type("AWS")
 *                         .identifiers("arn:aws:iam::414351767826:root")
 *                         .build())
 *                     .actions(                    
 *                         "kms:Encrypt",
 *                         "kms:Decrypt")
 *                     .resources("*")
 *                     .build())
 *             .build());
 * 
 *         var managedServicesCustomerManagedKey = new Key("managedServicesCustomerManagedKey", KeyArgs.builder()
 *             .policy(databricksManagedServicesCmk.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var managedServicesCustomerManagedKeyAlias = new Alias("managedServicesCustomerManagedKeyAlias", AliasArgs.builder()
 *             .name("alias/managed-services-customer-managed-key-alias")
 *             .targetKeyId(managedServicesCustomerManagedKey.keyId())
 *             .build());
 * 
 *         var managedServices = new MwsCustomerManagedKeys("managedServices", MwsCustomerManagedKeysArgs.builder()
 *             .accountId(databricksAccountId)
 *             .awsKeyInfo(MwsCustomerManagedKeysAwsKeyInfoArgs.builder()
 *                 .keyArn(managedServicesCustomerManagedKey.arn())
 *                 .keyAlias(managedServicesCustomerManagedKeyAlias.name())
 *                 .build())
 *             .useCases("MANAGED_SERVICES")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### For GCP
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MwsCustomerManagedKeys;
 * import com.pulumi.databricks.MwsCustomerManagedKeysArgs;
 * import com.pulumi.databricks.inputs.MwsCustomerManagedKeysGcpKeyInfoArgs;
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
 *         final var config = ctx.config();
 *         final var databricksAccountId = config.get("databricksAccountId");
 *         final var cmekResourceId = config.get("cmekResourceId");
 *         var managedServices = new MwsCustomerManagedKeys("managedServices", MwsCustomerManagedKeysArgs.builder()
 *             .accountId(databricksAccountId)
 *             .gcpKeyInfo(MwsCustomerManagedKeysGcpKeyInfoArgs.builder()
 *                 .kmsKeyId(cmekResourceId)
 *                 .build())
 *             .useCases("MANAGED_SERVICES")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Customer-managed key for workspace storage
 * 
 * ### For AWS
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.kms.KeyArgs;
 * import com.pulumi.aws.kms.Alias;
 * import com.pulumi.aws.kms.AliasArgs;
 * import com.pulumi.databricks.MwsCustomerManagedKeys;
 * import com.pulumi.databricks.MwsCustomerManagedKeysArgs;
 * import com.pulumi.databricks.inputs.MwsCustomerManagedKeysAwsKeyInfoArgs;
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
 *         final var config = ctx.config();
 *         final var databricksAccountId = config.get("databricksAccountId");
 *         final var databricksCrossAccountRole = config.get("databricksCrossAccountRole");
 *         final var databricksStorageCmk = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .version("2012-10-17")
 *             .statements(            
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid("Enable IAM User Permissions")
 *                     .effect("Allow")
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type("AWS")
 *                         .identifiers(current.accountId())
 *                         .build())
 *                     .actions("kms:*")
 *                     .resources("*")
 *                     .build(),
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid("Allow Databricks to use KMS key for DBFS")
 *                     .effect("Allow")
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type("AWS")
 *                         .identifiers("arn:aws:iam::414351767826:root")
 *                         .build())
 *                     .actions(                    
 *                         "kms:Encrypt",
 *                         "kms:Decrypt",
 *                         "kms:ReEncrypt*",
 *                         "kms:GenerateDataKey*",
 *                         "kms:DescribeKey")
 *                     .resources("*")
 *                     .build(),
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid("Allow Databricks to use KMS key for DBFS (Grants)")
 *                     .effect("Allow")
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type("AWS")
 *                         .identifiers("arn:aws:iam::414351767826:root")
 *                         .build())
 *                     .actions(                    
 *                         "kms:CreateGrant",
 *                         "kms:ListGrants",
 *                         "kms:RevokeGrant")
 *                     .resources("*")
 *                     .conditions(GetPolicyDocumentStatementConditionArgs.builder()
 *                         .test("Bool")
 *                         .variable("kms:GrantIsForAWSResource")
 *                         .values("true")
 *                         .build())
 *                     .build(),
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid("Allow Databricks to use KMS key for EBS")
 *                     .effect("Allow")
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type("AWS")
 *                         .identifiers(databricksCrossAccountRole)
 *                         .build())
 *                     .actions(                    
 *                         "kms:Decrypt",
 *                         "kms:GenerateDataKey*",
 *                         "kms:CreateGrant",
 *                         "kms:DescribeKey")
 *                     .resources("*")
 *                     .conditions(GetPolicyDocumentStatementConditionArgs.builder()
 *                         .test("ForAnyValue:StringLike")
 *                         .variable("kms:ViaService")
 *                         .values("ec2.*.amazonaws.com")
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *         var storageCustomerManagedKey = new Key("storageCustomerManagedKey", KeyArgs.builder()
 *             .policy(databricksStorageCmk.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var storageCustomerManagedKeyAlias = new Alias("storageCustomerManagedKeyAlias", AliasArgs.builder()
 *             .name("alias/storage-customer-managed-key-alias")
 *             .targetKeyId(storageCustomerManagedKey.keyId())
 *             .build());
 * 
 *         var storage = new MwsCustomerManagedKeys("storage", MwsCustomerManagedKeysArgs.builder()
 *             .accountId(databricksAccountId)
 *             .awsKeyInfo(MwsCustomerManagedKeysAwsKeyInfoArgs.builder()
 *                 .keyArn(storageCustomerManagedKey.arn())
 *                 .keyAlias(storageCustomerManagedKeyAlias.name())
 *                 .build())
 *             .useCases("STORAGE")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### For GCP
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MwsCustomerManagedKeys;
 * import com.pulumi.databricks.MwsCustomerManagedKeysArgs;
 * import com.pulumi.databricks.inputs.MwsCustomerManagedKeysGcpKeyInfoArgs;
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
 *         final var config = ctx.config();
 *         final var databricksAccountId = config.get("databricksAccountId");
 *         final var cmekResourceId = config.get("cmekResourceId");
 *         var storage = new MwsCustomerManagedKeys("storage", MwsCustomerManagedKeysArgs.builder()
 *             .accountId(databricksAccountId)
 *             .gcpKeyInfo(MwsCustomerManagedKeysGcpKeyInfoArgs.builder()
 *                 .kmsKeyId(cmekResourceId)
 *                 .build())
 *             .useCases("STORAGE")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Related Resources
 * 
 * The following resources are used in the same context:
 * 
 * * Provisioning Databricks on AWS guide.
 * * databricks.MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
 * * databricks.MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
 * * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) &amp; subnets for new workspaces within AWS.
 * * databricks.MwsStorageConfigurations to configure root bucket new workspaces within AWS.
 * * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
 * 
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/mwsCustomerManagedKeys:MwsCustomerManagedKeys")
public class MwsCustomerManagedKeys extends com.pulumi.resources.CustomResource {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * This field is a block and is documented below. This conflicts with `gcp_key_info`
     * 
     */
    @Export(name="awsKeyInfo", refs={MwsCustomerManagedKeysAwsKeyInfo.class}, tree="[0]")
    private Output</* @Nullable */ MwsCustomerManagedKeysAwsKeyInfo> awsKeyInfo;

    /**
     * @return This field is a block and is documented below. This conflicts with `gcp_key_info`
     * 
     */
    public Output<Optional<MwsCustomerManagedKeysAwsKeyInfo>> awsKeyInfo() {
        return Codegen.optional(this.awsKeyInfo);
    }
    /**
     * (Integer) Time in epoch milliseconds when the customer key was created.
     * 
     */
    @Export(name="creationTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> creationTime;

    /**
     * @return (Integer) Time in epoch milliseconds when the customer key was created.
     * 
     */
    public Output<Integer> creationTime() {
        return this.creationTime;
    }
    /**
     * (String) ID of the encryption key configuration object.
     * 
     */
    @Export(name="customerManagedKeyId", refs={String.class}, tree="[0]")
    private Output<String> customerManagedKeyId;

    /**
     * @return (String) ID of the encryption key configuration object.
     * 
     */
    public Output<String> customerManagedKeyId() {
        return this.customerManagedKeyId;
    }
    /**
     * This field is a block and is documented below. This conflicts with `aws_key_info`
     * 
     */
    @Export(name="gcpKeyInfo", refs={MwsCustomerManagedKeysGcpKeyInfo.class}, tree="[0]")
    private Output</* @Nullable */ MwsCustomerManagedKeysGcpKeyInfo> gcpKeyInfo;

    /**
     * @return This field is a block and is documented below. This conflicts with `aws_key_info`
     * 
     */
    public Output<Optional<MwsCustomerManagedKeysGcpKeyInfo>> gcpKeyInfo() {
        return Codegen.optional(this.gcpKeyInfo);
    }
    /**
     * *(since v0.3.4)* List of use cases for which this key will be used. *If you&#39;ve used the resource before, please add `use_cases = [&#34;MANAGED_SERVICES&#34;]` to keep the previous behaviour.* Possible values are:
     * * `MANAGED_SERVICES` - for encryption of the workspace objects (notebooks, secrets) that are stored in the control plane
     * * `STORAGE` - for encryption of the DBFS Storage &amp; Cluster EBS Volumes
     * 
     */
    @Export(name="useCases", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> useCases;

    /**
     * @return *(since v0.3.4)* List of use cases for which this key will be used. *If you&#39;ve used the resource before, please add `use_cases = [&#34;MANAGED_SERVICES&#34;]` to keep the previous behaviour.* Possible values are:
     * * `MANAGED_SERVICES` - for encryption of the workspace objects (notebooks, secrets) that are stored in the control plane
     * * `STORAGE` - for encryption of the DBFS Storage &amp; Cluster EBS Volumes
     * 
     */
    public Output<List<String>> useCases() {
        return this.useCases;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MwsCustomerManagedKeys(String name) {
        this(name, MwsCustomerManagedKeysArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MwsCustomerManagedKeys(String name, MwsCustomerManagedKeysArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MwsCustomerManagedKeys(String name, MwsCustomerManagedKeysArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsCustomerManagedKeys:MwsCustomerManagedKeys", name, args == null ? MwsCustomerManagedKeysArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MwsCustomerManagedKeys(String name, Output<String> id, @Nullable MwsCustomerManagedKeysState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsCustomerManagedKeys:MwsCustomerManagedKeys", name, state, makeResourceOptions(options, id));
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
    public static MwsCustomerManagedKeys get(String name, Output<String> id, @Nullable MwsCustomerManagedKeysState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MwsCustomerManagedKeys(name, id, state, options);
    }
}
