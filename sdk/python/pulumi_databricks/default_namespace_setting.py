# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DefaultNamespaceSettingArgs', 'DefaultNamespaceSetting']

@pulumi.input_type
class DefaultNamespaceSettingArgs:
    def __init__(__self__, *,
                 namespace: pulumi.Input['DefaultNamespaceSettingNamespaceArgs'],
                 etag: Optional[pulumi.Input[str]] = None,
                 setting_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DefaultNamespaceSetting resource.
        :param pulumi.Input['DefaultNamespaceSettingNamespaceArgs'] namespace: The configuration details.
        """
        pulumi.set(__self__, "namespace", namespace)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if setting_name is not None:
            pulumi.set(__self__, "setting_name", setting_name)

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Input['DefaultNamespaceSettingNamespaceArgs']:
        """
        The configuration details.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: pulumi.Input['DefaultNamespaceSettingNamespaceArgs']):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter(name="settingName")
    def setting_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "setting_name")

    @setting_name.setter
    def setting_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "setting_name", value)


@pulumi.input_type
class _DefaultNamespaceSettingState:
    def __init__(__self__, *,
                 etag: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input['DefaultNamespaceSettingNamespaceArgs']] = None,
                 setting_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DefaultNamespaceSetting resources.
        :param pulumi.Input['DefaultNamespaceSettingNamespaceArgs'] namespace: The configuration details.
        """
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if setting_name is not None:
            pulumi.set(__self__, "setting_name", setting_name)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input['DefaultNamespaceSettingNamespaceArgs']]:
        """
        The configuration details.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input['DefaultNamespaceSettingNamespaceArgs']]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter(name="settingName")
    def setting_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "setting_name")

    @setting_name.setter
    def setting_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "setting_name", value)


class DefaultNamespaceSetting(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[pulumi.InputType['DefaultNamespaceSettingNamespaceArgs']]] = None,
                 setting_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The `DefaultNamespaceSetting` resource allows you to operate the setting configuration for the default namespace in the Databricks workspace.
        Setting the default catalog for the workspace determines the catalog that is used when queries do not reference
        a fully qualified 3 level name. For example, if the default catalog is set to 'retail_prod' then a query
        'SELECT * FROM myTable' would reference the object 'retail_prod.default.myTable'
        (the schema 'default' is always assumed).
        This setting requires a restart of clusters and SQL warehouses to take effect. Additionally, the default namespace only applies when using Unity Catalog-enabled compute.
        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.DefaultNamespaceSetting("this", namespace=databricks.DefaultNamespaceSettingNamespaceArgs(
            value="namespace_value",
        ))
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['DefaultNamespaceSettingNamespaceArgs']] namespace: The configuration details.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DefaultNamespaceSettingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The `DefaultNamespaceSetting` resource allows you to operate the setting configuration for the default namespace in the Databricks workspace.
        Setting the default catalog for the workspace determines the catalog that is used when queries do not reference
        a fully qualified 3 level name. For example, if the default catalog is set to 'retail_prod' then a query
        'SELECT * FROM myTable' would reference the object 'retail_prod.default.myTable'
        (the schema 'default' is always assumed).
        This setting requires a restart of clusters and SQL warehouses to take effect. Additionally, the default namespace only applies when using Unity Catalog-enabled compute.
        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.DefaultNamespaceSetting("this", namespace=databricks.DefaultNamespaceSettingNamespaceArgs(
            value="namespace_value",
        ))
        ```

        :param str resource_name: The name of the resource.
        :param DefaultNamespaceSettingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DefaultNamespaceSettingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[pulumi.InputType['DefaultNamespaceSettingNamespaceArgs']]] = None,
                 setting_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DefaultNamespaceSettingArgs.__new__(DefaultNamespaceSettingArgs)

            __props__.__dict__["etag"] = etag
            if namespace is None and not opts.urn:
                raise TypeError("Missing required property 'namespace'")
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["setting_name"] = setting_name
        super(DefaultNamespaceSetting, __self__).__init__(
            'databricks:index/defaultNamespaceSetting:DefaultNamespaceSetting',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            etag: Optional[pulumi.Input[str]] = None,
            namespace: Optional[pulumi.Input[pulumi.InputType['DefaultNamespaceSettingNamespaceArgs']]] = None,
            setting_name: Optional[pulumi.Input[str]] = None) -> 'DefaultNamespaceSetting':
        """
        Get an existing DefaultNamespaceSetting resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['DefaultNamespaceSettingNamespaceArgs']] namespace: The configuration details.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DefaultNamespaceSettingState.__new__(_DefaultNamespaceSettingState)

        __props__.__dict__["etag"] = etag
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["setting_name"] = setting_name
        return DefaultNamespaceSetting(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def etag(self) -> pulumi.Output[str]:
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Output['outputs.DefaultNamespaceSettingNamespace']:
        """
        The configuration details.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="settingName")
    def setting_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "setting_name")

