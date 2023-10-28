# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SecretArgs', 'Secret']

@pulumi.input_type
class SecretArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 scope: pulumi.Input[str],
                 string_value: pulumi.Input[str]):
        """
        The set of arguments for constructing a Secret resource.
        :param pulumi.Input[str] key: (String) key within secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        :param pulumi.Input[str] scope: (String) name of databricks secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        :param pulumi.Input[str] string_value: (String) super secret sensitive value.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "scope", scope)
        pulumi.set(__self__, "string_value", string_value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        (String) key within secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Input[str]:
        """
        (String) name of databricks secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: pulumi.Input[str]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter(name="stringValue")
    def string_value(self) -> pulumi.Input[str]:
        """
        (String) super secret sensitive value.
        """
        return pulumi.get(self, "string_value")

    @string_value.setter
    def string_value(self, value: pulumi.Input[str]):
        pulumi.set(self, "string_value", value)


@pulumi.input_type
class _SecretState:
    def __init__(__self__, *,
                 config_reference: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 last_updated_timestamp: Optional[pulumi.Input[int]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 string_value: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Secret resources.
        :param pulumi.Input[str] config_reference: (String) value to use as a secret reference in [Spark configuration and environment variables](https://docs.databricks.com/security/secrets/secrets.html#use-a-secret-in-a-spark-configuration-property-or-environment-variable): `{{secrets/scope/key}}`.
        :param pulumi.Input[str] key: (String) key within secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        :param pulumi.Input[int] last_updated_timestamp: (Integer) time secret was updated
        :param pulumi.Input[str] scope: (String) name of databricks secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        :param pulumi.Input[str] string_value: (String) super secret sensitive value.
        """
        if config_reference is not None:
            pulumi.set(__self__, "config_reference", config_reference)
        if key is not None:
            pulumi.set(__self__, "key", key)
        if last_updated_timestamp is not None:
            pulumi.set(__self__, "last_updated_timestamp", last_updated_timestamp)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if string_value is not None:
            pulumi.set(__self__, "string_value", string_value)

    @property
    @pulumi.getter(name="configReference")
    def config_reference(self) -> Optional[pulumi.Input[str]]:
        """
        (String) value to use as a secret reference in [Spark configuration and environment variables](https://docs.databricks.com/security/secrets/secrets.html#use-a-secret-in-a-spark-configuration-property-or-environment-variable): `{{secrets/scope/key}}`.
        """
        return pulumi.get(self, "config_reference")

    @config_reference.setter
    def config_reference(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_reference", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        (String) key within secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter(name="lastUpdatedTimestamp")
    def last_updated_timestamp(self) -> Optional[pulumi.Input[int]]:
        """
        (Integer) time secret was updated
        """
        return pulumi.get(self, "last_updated_timestamp")

    @last_updated_timestamp.setter
    def last_updated_timestamp(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "last_updated_timestamp", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[str]]:
        """
        (String) name of databricks secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter(name="stringValue")
    def string_value(self) -> Optional[pulumi.Input[str]]:
        """
        (String) super secret sensitive value.
        """
        return pulumi.get(self, "string_value")

    @string_value.setter
    def string_value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "string_value", value)


class Secret(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 string_value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource you can insert a secret under the provided scope with the given name. If a secret already exists with the same name, this command overwrites the existing secret’s value. The server encrypts the secret using the secret scope’s encryption settings before storing it. You must have WRITE or MANAGE permission on the secret scope. The secret key must consist of alphanumeric characters, dashes, underscores, and periods, and cannot exceed 128 characters. The maximum allowed secret value size is 128 KB. The maximum number of secrets in a given scope is 1000. You can read a secret value only from within a command on a cluster (for example, through a notebook); there is no API to read a secret value outside of a cluster. The permission applied is based on who is invoking the command and you must have at least READ permission. Please consult [Secrets User Guide](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) for more details.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        app = databricks.SecretScope("app")
        publishing_api = databricks.Secret("publishingApi",
            key="publishing_api",
            string_value=data["azurerm_key_vault_secret"]["example"]["value"],
            scope=app.id)
        this = databricks.Cluster("this", spark_conf={
            "fs.azure.account.oauth2.client.secret": publishing_api.config_reference,
        })
        ```
        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
        * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
        * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
        * SecretAcl to manage access to [secrets](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.
        * SecretScope to create [secret scopes](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.

        ## Import

        The resource secret can be imported using `scopeName|||secretKey` combination. **This may change in future versions.** bash

        ```sh
         $ pulumi import databricks:index/secret:Secret app `scopeName|||secretKey`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: (String) key within secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        :param pulumi.Input[str] scope: (String) name of databricks secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        :param pulumi.Input[str] string_value: (String) super secret sensitive value.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecretArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource you can insert a secret under the provided scope with the given name. If a secret already exists with the same name, this command overwrites the existing secret’s value. The server encrypts the secret using the secret scope’s encryption settings before storing it. You must have WRITE or MANAGE permission on the secret scope. The secret key must consist of alphanumeric characters, dashes, underscores, and periods, and cannot exceed 128 characters. The maximum allowed secret value size is 128 KB. The maximum number of secrets in a given scope is 1000. You can read a secret value only from within a command on a cluster (for example, through a notebook); there is no API to read a secret value outside of a cluster. The permission applied is based on who is invoking the command and you must have at least READ permission. Please consult [Secrets User Guide](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) for more details.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        app = databricks.SecretScope("app")
        publishing_api = databricks.Secret("publishingApi",
            key="publishing_api",
            string_value=data["azurerm_key_vault_secret"]["example"]["value"],
            scope=app.id)
        this = databricks.Cluster("this", spark_conf={
            "fs.azure.account.oauth2.client.secret": publishing_api.config_reference,
        })
        ```
        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
        * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
        * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
        * SecretAcl to manage access to [secrets](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.
        * SecretScope to create [secret scopes](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.

        ## Import

        The resource secret can be imported using `scopeName|||secretKey` combination. **This may change in future versions.** bash

        ```sh
         $ pulumi import databricks:index/secret:Secret app `scopeName|||secretKey`
        ```

        :param str resource_name: The name of the resource.
        :param SecretArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecretArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 string_value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecretArgs.__new__(SecretArgs)

            if key is None and not opts.urn:
                raise TypeError("Missing required property 'key'")
            __props__.__dict__["key"] = key
            if scope is None and not opts.urn:
                raise TypeError("Missing required property 'scope'")
            __props__.__dict__["scope"] = scope
            if string_value is None and not opts.urn:
                raise TypeError("Missing required property 'string_value'")
            __props__.__dict__["string_value"] = None if string_value is None else pulumi.Output.secret(string_value)
            __props__.__dict__["config_reference"] = None
            __props__.__dict__["last_updated_timestamp"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["stringValue"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Secret, __self__).__init__(
            'databricks:index/secret:Secret',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_reference: Optional[pulumi.Input[str]] = None,
            key: Optional[pulumi.Input[str]] = None,
            last_updated_timestamp: Optional[pulumi.Input[int]] = None,
            scope: Optional[pulumi.Input[str]] = None,
            string_value: Optional[pulumi.Input[str]] = None) -> 'Secret':
        """
        Get an existing Secret resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config_reference: (String) value to use as a secret reference in [Spark configuration and environment variables](https://docs.databricks.com/security/secrets/secrets.html#use-a-secret-in-a-spark-configuration-property-or-environment-variable): `{{secrets/scope/key}}`.
        :param pulumi.Input[str] key: (String) key within secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        :param pulumi.Input[int] last_updated_timestamp: (Integer) time secret was updated
        :param pulumi.Input[str] scope: (String) name of databricks secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        :param pulumi.Input[str] string_value: (String) super secret sensitive value.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecretState.__new__(_SecretState)

        __props__.__dict__["config_reference"] = config_reference
        __props__.__dict__["key"] = key
        __props__.__dict__["last_updated_timestamp"] = last_updated_timestamp
        __props__.__dict__["scope"] = scope
        __props__.__dict__["string_value"] = string_value
        return Secret(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configReference")
    def config_reference(self) -> pulumi.Output[str]:
        """
        (String) value to use as a secret reference in [Spark configuration and environment variables](https://docs.databricks.com/security/secrets/secrets.html#use-a-secret-in-a-spark-configuration-property-or-environment-variable): `{{secrets/scope/key}}`.
        """
        return pulumi.get(self, "config_reference")

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        (String) key within secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter(name="lastUpdatedTimestamp")
    def last_updated_timestamp(self) -> pulumi.Output[int]:
        """
        (Integer) time secret was updated
        """
        return pulumi.get(self, "last_updated_timestamp")

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Output[str]:
        """
        (String) name of databricks secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter(name="stringValue")
    def string_value(self) -> pulumi.Output[str]:
        """
        (String) super secret sensitive value.
        """
        return pulumi.get(self, "string_value")

