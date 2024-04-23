# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SqlGlobalConfigArgs', 'SqlGlobalConfig']

@pulumi.input_type
class SqlGlobalConfigArgs:
    def __init__(__self__, *,
                 data_access_config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enable_serverless_compute: Optional[pulumi.Input[bool]] = None,
                 google_service_account: Optional[pulumi.Input[str]] = None,
                 instance_profile_arn: Optional[pulumi.Input[str]] = None,
                 security_policy: Optional[pulumi.Input[str]] = None,
                 sql_config_params: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a SqlGlobalConfig resource.
        :param pulumi.Input[Mapping[str, Any]] data_access_config: Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
        :param pulumi.Input[str] google_service_account: used to access GCP services, such as Cloud Storage, from databricks_sql_endpoint. Please note that this parameter is only for GCP, and will generate an error if used on other clouds.
        :param pulumi.Input[str] instance_profile_arn: databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
        :param pulumi.Input[str] security_policy: The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
        :param pulumi.Input[Mapping[str, Any]] sql_config_params: SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
        """
        if data_access_config is not None:
            pulumi.set(__self__, "data_access_config", data_access_config)
        if enable_serverless_compute is not None:
            warnings.warn("""This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future""", DeprecationWarning)
            pulumi.log.warn("""enable_serverless_compute is deprecated: This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future""")
        if enable_serverless_compute is not None:
            pulumi.set(__self__, "enable_serverless_compute", enable_serverless_compute)
        if google_service_account is not None:
            pulumi.set(__self__, "google_service_account", google_service_account)
        if instance_profile_arn is not None:
            pulumi.set(__self__, "instance_profile_arn", instance_profile_arn)
        if security_policy is not None:
            pulumi.set(__self__, "security_policy", security_policy)
        if sql_config_params is not None:
            pulumi.set(__self__, "sql_config_params", sql_config_params)

    @property
    @pulumi.getter(name="dataAccessConfig")
    def data_access_config(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
        """
        return pulumi.get(self, "data_access_config")

    @data_access_config.setter
    def data_access_config(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "data_access_config", value)

    @property
    @pulumi.getter(name="enableServerlessCompute")
    def enable_serverless_compute(self) -> Optional[pulumi.Input[bool]]:
        warnings.warn("""This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future""", DeprecationWarning)
        pulumi.log.warn("""enable_serverless_compute is deprecated: This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future""")

        return pulumi.get(self, "enable_serverless_compute")

    @enable_serverless_compute.setter
    def enable_serverless_compute(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_serverless_compute", value)

    @property
    @pulumi.getter(name="googleServiceAccount")
    def google_service_account(self) -> Optional[pulumi.Input[str]]:
        """
        used to access GCP services, such as Cloud Storage, from databricks_sql_endpoint. Please note that this parameter is only for GCP, and will generate an error if used on other clouds.
        """
        return pulumi.get(self, "google_service_account")

    @google_service_account.setter
    def google_service_account(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "google_service_account", value)

    @property
    @pulumi.getter(name="instanceProfileArn")
    def instance_profile_arn(self) -> Optional[pulumi.Input[str]]:
        """
        databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
        """
        return pulumi.get(self, "instance_profile_arn")

    @instance_profile_arn.setter
    def instance_profile_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_profile_arn", value)

    @property
    @pulumi.getter(name="securityPolicy")
    def security_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
        """
        return pulumi.get(self, "security_policy")

    @security_policy.setter
    def security_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_policy", value)

    @property
    @pulumi.getter(name="sqlConfigParams")
    def sql_config_params(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
        """
        return pulumi.get(self, "sql_config_params")

    @sql_config_params.setter
    def sql_config_params(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "sql_config_params", value)


@pulumi.input_type
class _SqlGlobalConfigState:
    def __init__(__self__, *,
                 data_access_config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enable_serverless_compute: Optional[pulumi.Input[bool]] = None,
                 google_service_account: Optional[pulumi.Input[str]] = None,
                 instance_profile_arn: Optional[pulumi.Input[str]] = None,
                 security_policy: Optional[pulumi.Input[str]] = None,
                 sql_config_params: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        Input properties used for looking up and filtering SqlGlobalConfig resources.
        :param pulumi.Input[Mapping[str, Any]] data_access_config: Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
        :param pulumi.Input[str] google_service_account: used to access GCP services, such as Cloud Storage, from databricks_sql_endpoint. Please note that this parameter is only for GCP, and will generate an error if used on other clouds.
        :param pulumi.Input[str] instance_profile_arn: databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
        :param pulumi.Input[str] security_policy: The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
        :param pulumi.Input[Mapping[str, Any]] sql_config_params: SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
        """
        if data_access_config is not None:
            pulumi.set(__self__, "data_access_config", data_access_config)
        if enable_serverless_compute is not None:
            warnings.warn("""This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future""", DeprecationWarning)
            pulumi.log.warn("""enable_serverless_compute is deprecated: This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future""")
        if enable_serverless_compute is not None:
            pulumi.set(__self__, "enable_serverless_compute", enable_serverless_compute)
        if google_service_account is not None:
            pulumi.set(__self__, "google_service_account", google_service_account)
        if instance_profile_arn is not None:
            pulumi.set(__self__, "instance_profile_arn", instance_profile_arn)
        if security_policy is not None:
            pulumi.set(__self__, "security_policy", security_policy)
        if sql_config_params is not None:
            pulumi.set(__self__, "sql_config_params", sql_config_params)

    @property
    @pulumi.getter(name="dataAccessConfig")
    def data_access_config(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
        """
        return pulumi.get(self, "data_access_config")

    @data_access_config.setter
    def data_access_config(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "data_access_config", value)

    @property
    @pulumi.getter(name="enableServerlessCompute")
    def enable_serverless_compute(self) -> Optional[pulumi.Input[bool]]:
        warnings.warn("""This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future""", DeprecationWarning)
        pulumi.log.warn("""enable_serverless_compute is deprecated: This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future""")

        return pulumi.get(self, "enable_serverless_compute")

    @enable_serverless_compute.setter
    def enable_serverless_compute(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_serverless_compute", value)

    @property
    @pulumi.getter(name="googleServiceAccount")
    def google_service_account(self) -> Optional[pulumi.Input[str]]:
        """
        used to access GCP services, such as Cloud Storage, from databricks_sql_endpoint. Please note that this parameter is only for GCP, and will generate an error if used on other clouds.
        """
        return pulumi.get(self, "google_service_account")

    @google_service_account.setter
    def google_service_account(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "google_service_account", value)

    @property
    @pulumi.getter(name="instanceProfileArn")
    def instance_profile_arn(self) -> Optional[pulumi.Input[str]]:
        """
        databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
        """
        return pulumi.get(self, "instance_profile_arn")

    @instance_profile_arn.setter
    def instance_profile_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_profile_arn", value)

    @property
    @pulumi.getter(name="securityPolicy")
    def security_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
        """
        return pulumi.get(self, "security_policy")

    @security_policy.setter
    def security_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_policy", value)

    @property
    @pulumi.getter(name="sqlConfigParams")
    def sql_config_params(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
        """
        return pulumi.get(self, "sql_config_params")

    @sql_config_params.setter
    def sql_config_params(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "sql_config_params", value)


class SqlGlobalConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_access_config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enable_serverless_compute: Optional[pulumi.Input[bool]] = None,
                 google_service_account: Optional[pulumi.Input[str]] = None,
                 instance_profile_arn: Optional[pulumi.Input[str]] = None,
                 security_policy: Optional[pulumi.Input[str]] = None,
                 sql_config_params: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        """
        This resource configures the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all SqlEndpoint of workspace. *Please note that changing parameters of this resource will restart all running databricks_sql_endpoint.*  To use this resource you need to be an administrator.

        ## Example Usage

        ### AWS example

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.SqlGlobalConfig("this",
            security_policy="DATA_ACCESS_CONTROL",
            instance_profile_arn="arn:....",
            data_access_config={
                "spark.sql.session.timeZone": "UTC",
            })
        ```

        ### Azure example

        For Azure you should use the `data_access_config` to provide the service principal configuration. You can use the Databricks SQL Admin Console UI to help you generate the right configuration values.

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.SqlGlobalConfig("this",
            security_policy="DATA_ACCESS_CONTROL",
            data_access_config={
                "spark.hadoop.fs.azure.account.auth.type": "OAuth",
                "spark.hadoop.fs.azure.account.oauth.provider.type": "org.apache.hadoop.fs.azurebfs.oauth2.ClientCredsTokenProvider",
                "spark.hadoop.fs.azure.account.oauth2.client.id": application_id,
                "spark.hadoop.fs.azure.account.oauth2.client.secret": f"{{{{secrets/{secret_scope}/{secret_key}}}}}",
                "spark.hadoop.fs.azure.account.oauth2.client.endpoint": f"https://login.microsoftonline.com/{tenant_id}/oauth2/token",
            },
            sql_config_params={
                "ANSI_MODE": "true",
            })
        ```

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
        * SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
        * SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
        * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).

        ## Import

        You can import a `databricks_sql_global_config` resource with command like the following (you need to use `global` as ID):

        bash

        ```sh
        $ pulumi import databricks:index/sqlGlobalConfig:SqlGlobalConfig this global
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] data_access_config: Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
        :param pulumi.Input[str] google_service_account: used to access GCP services, such as Cloud Storage, from databricks_sql_endpoint. Please note that this parameter is only for GCP, and will generate an error if used on other clouds.
        :param pulumi.Input[str] instance_profile_arn: databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
        :param pulumi.Input[str] security_policy: The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
        :param pulumi.Input[Mapping[str, Any]] sql_config_params: SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SqlGlobalConfigArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource configures the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all SqlEndpoint of workspace. *Please note that changing parameters of this resource will restart all running databricks_sql_endpoint.*  To use this resource you need to be an administrator.

        ## Example Usage

        ### AWS example

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.SqlGlobalConfig("this",
            security_policy="DATA_ACCESS_CONTROL",
            instance_profile_arn="arn:....",
            data_access_config={
                "spark.sql.session.timeZone": "UTC",
            })
        ```

        ### Azure example

        For Azure you should use the `data_access_config` to provide the service principal configuration. You can use the Databricks SQL Admin Console UI to help you generate the right configuration values.

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.SqlGlobalConfig("this",
            security_policy="DATA_ACCESS_CONTROL",
            data_access_config={
                "spark.hadoop.fs.azure.account.auth.type": "OAuth",
                "spark.hadoop.fs.azure.account.oauth.provider.type": "org.apache.hadoop.fs.azurebfs.oauth2.ClientCredsTokenProvider",
                "spark.hadoop.fs.azure.account.oauth2.client.id": application_id,
                "spark.hadoop.fs.azure.account.oauth2.client.secret": f"{{{{secrets/{secret_scope}/{secret_key}}}}}",
                "spark.hadoop.fs.azure.account.oauth2.client.endpoint": f"https://login.microsoftonline.com/{tenant_id}/oauth2/token",
            },
            sql_config_params={
                "ANSI_MODE": "true",
            })
        ```

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
        * SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
        * SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
        * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).

        ## Import

        You can import a `databricks_sql_global_config` resource with command like the following (you need to use `global` as ID):

        bash

        ```sh
        $ pulumi import databricks:index/sqlGlobalConfig:SqlGlobalConfig this global
        ```

        :param str resource_name: The name of the resource.
        :param SqlGlobalConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SqlGlobalConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_access_config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enable_serverless_compute: Optional[pulumi.Input[bool]] = None,
                 google_service_account: Optional[pulumi.Input[str]] = None,
                 instance_profile_arn: Optional[pulumi.Input[str]] = None,
                 security_policy: Optional[pulumi.Input[str]] = None,
                 sql_config_params: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SqlGlobalConfigArgs.__new__(SqlGlobalConfigArgs)

            __props__.__dict__["data_access_config"] = data_access_config
            __props__.__dict__["enable_serverless_compute"] = enable_serverless_compute
            __props__.__dict__["google_service_account"] = google_service_account
            __props__.__dict__["instance_profile_arn"] = instance_profile_arn
            __props__.__dict__["security_policy"] = security_policy
            __props__.__dict__["sql_config_params"] = sql_config_params
        super(SqlGlobalConfig, __self__).__init__(
            'databricks:index/sqlGlobalConfig:SqlGlobalConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            data_access_config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            enable_serverless_compute: Optional[pulumi.Input[bool]] = None,
            google_service_account: Optional[pulumi.Input[str]] = None,
            instance_profile_arn: Optional[pulumi.Input[str]] = None,
            security_policy: Optional[pulumi.Input[str]] = None,
            sql_config_params: Optional[pulumi.Input[Mapping[str, Any]]] = None) -> 'SqlGlobalConfig':
        """
        Get an existing SqlGlobalConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] data_access_config: Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
        :param pulumi.Input[str] google_service_account: used to access GCP services, such as Cloud Storage, from databricks_sql_endpoint. Please note that this parameter is only for GCP, and will generate an error if used on other clouds.
        :param pulumi.Input[str] instance_profile_arn: databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
        :param pulumi.Input[str] security_policy: The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
        :param pulumi.Input[Mapping[str, Any]] sql_config_params: SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SqlGlobalConfigState.__new__(_SqlGlobalConfigState)

        __props__.__dict__["data_access_config"] = data_access_config
        __props__.__dict__["enable_serverless_compute"] = enable_serverless_compute
        __props__.__dict__["google_service_account"] = google_service_account
        __props__.__dict__["instance_profile_arn"] = instance_profile_arn
        __props__.__dict__["security_policy"] = security_policy
        __props__.__dict__["sql_config_params"] = sql_config_params
        return SqlGlobalConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dataAccessConfig")
    def data_access_config(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
        """
        return pulumi.get(self, "data_access_config")

    @property
    @pulumi.getter(name="enableServerlessCompute")
    def enable_serverless_compute(self) -> pulumi.Output[bool]:
        warnings.warn("""This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future""", DeprecationWarning)
        pulumi.log.warn("""enable_serverless_compute is deprecated: This field is intended as an internal API and may be removed from the Databricks Terraform provider in the future""")

        return pulumi.get(self, "enable_serverless_compute")

    @property
    @pulumi.getter(name="googleServiceAccount")
    def google_service_account(self) -> pulumi.Output[Optional[str]]:
        """
        used to access GCP services, such as Cloud Storage, from databricks_sql_endpoint. Please note that this parameter is only for GCP, and will generate an error if used on other clouds.
        """
        return pulumi.get(self, "google_service_account")

    @property
    @pulumi.getter(name="instanceProfileArn")
    def instance_profile_arn(self) -> pulumi.Output[Optional[str]]:
        """
        databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
        """
        return pulumi.get(self, "instance_profile_arn")

    @property
    @pulumi.getter(name="securityPolicy")
    def security_policy(self) -> pulumi.Output[Optional[str]]:
        """
        The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
        """
        return pulumi.get(self, "security_policy")

    @property
    @pulumi.getter(name="sqlConfigParams")
    def sql_config_params(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
        """
        return pulumi.get(self, "sql_config_params")

