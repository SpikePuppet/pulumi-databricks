# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MetastoreAssignmentArgs', 'MetastoreAssignment']

@pulumi.input_type
class MetastoreAssignmentArgs:
    def __init__(__self__, *,
                 metastore_id: pulumi.Input[str],
                 workspace_id: pulumi.Input[int],
                 default_catalog_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MetastoreAssignment resource.
        :param pulumi.Input[str] metastore_id: Unique identifier of the parent Metastore
        :param pulumi.Input[int] workspace_id: id of the workspace for the assignment
        :param pulumi.Input[str] default_catalog_name: Default catalog used for this assignment, default to `hive_metastore`
        """
        pulumi.set(__self__, "metastore_id", metastore_id)
        pulumi.set(__self__, "workspace_id", workspace_id)
        if default_catalog_name is not None:
            pulumi.set(__self__, "default_catalog_name", default_catalog_name)

    @property
    @pulumi.getter(name="metastoreId")
    def metastore_id(self) -> pulumi.Input[str]:
        """
        Unique identifier of the parent Metastore
        """
        return pulumi.get(self, "metastore_id")

    @metastore_id.setter
    def metastore_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "metastore_id", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Input[int]:
        """
        id of the workspace for the assignment
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "workspace_id", value)

    @property
    @pulumi.getter(name="defaultCatalogName")
    def default_catalog_name(self) -> Optional[pulumi.Input[str]]:
        """
        Default catalog used for this assignment, default to `hive_metastore`
        """
        return pulumi.get(self, "default_catalog_name")

    @default_catalog_name.setter
    def default_catalog_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_catalog_name", value)


@pulumi.input_type
class _MetastoreAssignmentState:
    def __init__(__self__, *,
                 default_catalog_name: Optional[pulumi.Input[str]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 workspace_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering MetastoreAssignment resources.
        :param pulumi.Input[str] default_catalog_name: Default catalog used for this assignment, default to `hive_metastore`
        :param pulumi.Input[str] metastore_id: Unique identifier of the parent Metastore
        :param pulumi.Input[int] workspace_id: id of the workspace for the assignment
        """
        if default_catalog_name is not None:
            pulumi.set(__self__, "default_catalog_name", default_catalog_name)
        if metastore_id is not None:
            pulumi.set(__self__, "metastore_id", metastore_id)
        if workspace_id is not None:
            pulumi.set(__self__, "workspace_id", workspace_id)

    @property
    @pulumi.getter(name="defaultCatalogName")
    def default_catalog_name(self) -> Optional[pulumi.Input[str]]:
        """
        Default catalog used for this assignment, default to `hive_metastore`
        """
        return pulumi.get(self, "default_catalog_name")

    @default_catalog_name.setter
    def default_catalog_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_catalog_name", value)

    @property
    @pulumi.getter(name="metastoreId")
    def metastore_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the parent Metastore
        """
        return pulumi.get(self, "metastore_id")

    @metastore_id.setter
    def metastore_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metastore_id", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> Optional[pulumi.Input[int]]:
        """
        id of the workspace for the assignment
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "workspace_id", value)


class MetastoreAssignment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_catalog_name: Optional[pulumi.Input[str]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 workspace_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        A single Metastore can be shared across Databricks workspaces, and each linked workspace has a consistent view of the data and a single set of access policies. You can only create a single metastore for each region in which your organization operates.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this_metastore = databricks.Metastore("thisMetastore",
            storage_root=f"s3://{aws_s3_bucket['metastore']['id']}/metastore",
            owner="uc admins",
            region="us-east-1",
            force_destroy=True)
        this_metastore_assignment = databricks.MetastoreAssignment("thisMetastoreAssignment",
            metastore_id=this_metastore.id,
            workspace_id=local["workspace_id"])
        ```

        ## Import

        This resource can be imported by combination of workspace id and metastore idbash

        ```sh
         $ pulumi import databricks:index/metastoreAssignment:MetastoreAssignment this '<workspace_id>|<metastore_id>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_catalog_name: Default catalog used for this assignment, default to `hive_metastore`
        :param pulumi.Input[str] metastore_id: Unique identifier of the parent Metastore
        :param pulumi.Input[int] workspace_id: id of the workspace for the assignment
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MetastoreAssignmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A single Metastore can be shared across Databricks workspaces, and each linked workspace has a consistent view of the data and a single set of access policies. You can only create a single metastore for each region in which your organization operates.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this_metastore = databricks.Metastore("thisMetastore",
            storage_root=f"s3://{aws_s3_bucket['metastore']['id']}/metastore",
            owner="uc admins",
            region="us-east-1",
            force_destroy=True)
        this_metastore_assignment = databricks.MetastoreAssignment("thisMetastoreAssignment",
            metastore_id=this_metastore.id,
            workspace_id=local["workspace_id"])
        ```

        ## Import

        This resource can be imported by combination of workspace id and metastore idbash

        ```sh
         $ pulumi import databricks:index/metastoreAssignment:MetastoreAssignment this '<workspace_id>|<metastore_id>'
        ```

        :param str resource_name: The name of the resource.
        :param MetastoreAssignmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MetastoreAssignmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_catalog_name: Optional[pulumi.Input[str]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 workspace_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MetastoreAssignmentArgs.__new__(MetastoreAssignmentArgs)

            __props__.__dict__["default_catalog_name"] = default_catalog_name
            if metastore_id is None and not opts.urn:
                raise TypeError("Missing required property 'metastore_id'")
            __props__.__dict__["metastore_id"] = metastore_id
            if workspace_id is None and not opts.urn:
                raise TypeError("Missing required property 'workspace_id'")
            __props__.__dict__["workspace_id"] = workspace_id
        super(MetastoreAssignment, __self__).__init__(
            'databricks:index/metastoreAssignment:MetastoreAssignment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            default_catalog_name: Optional[pulumi.Input[str]] = None,
            metastore_id: Optional[pulumi.Input[str]] = None,
            workspace_id: Optional[pulumi.Input[int]] = None) -> 'MetastoreAssignment':
        """
        Get an existing MetastoreAssignment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_catalog_name: Default catalog used for this assignment, default to `hive_metastore`
        :param pulumi.Input[str] metastore_id: Unique identifier of the parent Metastore
        :param pulumi.Input[int] workspace_id: id of the workspace for the assignment
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MetastoreAssignmentState.__new__(_MetastoreAssignmentState)

        __props__.__dict__["default_catalog_name"] = default_catalog_name
        __props__.__dict__["metastore_id"] = metastore_id
        __props__.__dict__["workspace_id"] = workspace_id
        return MetastoreAssignment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="defaultCatalogName")
    def default_catalog_name(self) -> pulumi.Output[Optional[str]]:
        """
        Default catalog used for this assignment, default to `hive_metastore`
        """
        return pulumi.get(self, "default_catalog_name")

    @property
    @pulumi.getter(name="metastoreId")
    def metastore_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the parent Metastore
        """
        return pulumi.get(self, "metastore_id")

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Output[int]:
        """
        id of the workspace for the assignment
        """
        return pulumi.get(self, "workspace_id")

