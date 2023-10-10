# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CatalogWorkspaceBindingArgs', 'CatalogWorkspaceBinding']

@pulumi.input_type
class CatalogWorkspaceBindingArgs:
    def __init__(__self__, *,
                 catalog_name: pulumi.Input[str],
                 workspace_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a CatalogWorkspaceBinding resource.
        :param pulumi.Input[str] catalog_name: Name of Catalog. Change forces creation of a new resource.
        :param pulumi.Input[str] workspace_id: ID of the workspace. Change forces creation of a new resource.
        """
        CatalogWorkspaceBindingArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            catalog_name=catalog_name,
            workspace_id=workspace_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             catalog_name: pulumi.Input[str],
             workspace_id: pulumi.Input[str],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("catalog_name", catalog_name)
        _setter("workspace_id", workspace_id)

    @property
    @pulumi.getter(name="catalogName")
    def catalog_name(self) -> pulumi.Input[str]:
        """
        Name of Catalog. Change forces creation of a new resource.
        """
        return pulumi.get(self, "catalog_name")

    @catalog_name.setter
    def catalog_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "catalog_name", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Input[str]:
        """
        ID of the workspace. Change forces creation of a new resource.
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "workspace_id", value)


@pulumi.input_type
class _CatalogWorkspaceBindingState:
    def __init__(__self__, *,
                 catalog_name: Optional[pulumi.Input[str]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CatalogWorkspaceBinding resources.
        :param pulumi.Input[str] catalog_name: Name of Catalog. Change forces creation of a new resource.
        :param pulumi.Input[str] workspace_id: ID of the workspace. Change forces creation of a new resource.
        """
        _CatalogWorkspaceBindingState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            catalog_name=catalog_name,
            workspace_id=workspace_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             catalog_name: Optional[pulumi.Input[str]] = None,
             workspace_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if catalog_name is not None:
            _setter("catalog_name", catalog_name)
        if workspace_id is not None:
            _setter("workspace_id", workspace_id)

    @property
    @pulumi.getter(name="catalogName")
    def catalog_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of Catalog. Change forces creation of a new resource.
        """
        return pulumi.get(self, "catalog_name")

    @catalog_name.setter
    def catalog_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "catalog_name", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the workspace. Change forces creation of a new resource.
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workspace_id", value)


class CatalogWorkspaceBinding(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catalog_name: Optional[pulumi.Input[str]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        sandbox_catalog = databricks.Catalog("sandboxCatalog", isolation_mode="ISOLATED")
        sandbox_catalog_workspace_binding = databricks.CatalogWorkspaceBinding("sandboxCatalogWorkspaceBinding",
            catalog_name=sandbox_catalog.name,
            workspace_id=databricks_mws_workspaces["other"]["workspace_id"])
        ```

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] catalog_name: Name of Catalog. Change forces creation of a new resource.
        :param pulumi.Input[str] workspace_id: ID of the workspace. Change forces creation of a new resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CatalogWorkspaceBindingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        sandbox_catalog = databricks.Catalog("sandboxCatalog", isolation_mode="ISOLATED")
        sandbox_catalog_workspace_binding = databricks.CatalogWorkspaceBinding("sandboxCatalogWorkspaceBinding",
            catalog_name=sandbox_catalog.name,
            workspace_id=databricks_mws_workspaces["other"]["workspace_id"])
        ```

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param CatalogWorkspaceBindingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CatalogWorkspaceBindingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            CatalogWorkspaceBindingArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catalog_name: Optional[pulumi.Input[str]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CatalogWorkspaceBindingArgs.__new__(CatalogWorkspaceBindingArgs)

            if catalog_name is None and not opts.urn:
                raise TypeError("Missing required property 'catalog_name'")
            __props__.__dict__["catalog_name"] = catalog_name
            if workspace_id is None and not opts.urn:
                raise TypeError("Missing required property 'workspace_id'")
            __props__.__dict__["workspace_id"] = workspace_id
        super(CatalogWorkspaceBinding, __self__).__init__(
            'databricks:index/catalogWorkspaceBinding:CatalogWorkspaceBinding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            catalog_name: Optional[pulumi.Input[str]] = None,
            workspace_id: Optional[pulumi.Input[str]] = None) -> 'CatalogWorkspaceBinding':
        """
        Get an existing CatalogWorkspaceBinding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] catalog_name: Name of Catalog. Change forces creation of a new resource.
        :param pulumi.Input[str] workspace_id: ID of the workspace. Change forces creation of a new resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CatalogWorkspaceBindingState.__new__(_CatalogWorkspaceBindingState)

        __props__.__dict__["catalog_name"] = catalog_name
        __props__.__dict__["workspace_id"] = workspace_id
        return CatalogWorkspaceBinding(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="catalogName")
    def catalog_name(self) -> pulumi.Output[str]:
        """
        Name of Catalog. Change forces creation of a new resource.
        """
        return pulumi.get(self, "catalog_name")

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Output[str]:
        """
        ID of the workspace. Change forces creation of a new resource.
        """
        return pulumi.get(self, "workspace_id")

