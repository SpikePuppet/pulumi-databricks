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

__all__ = ['OnlineTableArgs', 'OnlineTable']

@pulumi.input_type
class OnlineTableArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input['OnlineTableSpecArgs']] = None):
        """
        The set of arguments for constructing a OnlineTable resource.
        :param pulumi.Input[str] name: 3-level name of the Online Table to create.
        :param pulumi.Input['OnlineTableSpecArgs'] spec: object containing specification of the online table:
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if spec is not None:
            pulumi.set(__self__, "spec", spec)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        3-level name of the Online Table to create.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def spec(self) -> Optional[pulumi.Input['OnlineTableSpecArgs']]:
        """
        object containing specification of the online table:
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: Optional[pulumi.Input['OnlineTableSpecArgs']]):
        pulumi.set(self, "spec", value)


@pulumi.input_type
class _OnlineTableState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input['OnlineTableSpecArgs']] = None,
                 statuses: Optional[pulumi.Input[Sequence[pulumi.Input['OnlineTableStatusArgs']]]] = None):
        """
        Input properties used for looking up and filtering OnlineTable resources.
        :param pulumi.Input[str] name: 3-level name of the Online Table to create.
        :param pulumi.Input['OnlineTableSpecArgs'] spec: object containing specification of the online table:
        :param pulumi.Input[Sequence[pulumi.Input['OnlineTableStatusArgs']]] statuses: object describing status of the online table:
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if spec is not None:
            pulumi.set(__self__, "spec", spec)
        if statuses is not None:
            pulumi.set(__self__, "statuses", statuses)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        3-level name of the Online Table to create.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def spec(self) -> Optional[pulumi.Input['OnlineTableSpecArgs']]:
        """
        object containing specification of the online table:
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: Optional[pulumi.Input['OnlineTableSpecArgs']]):
        pulumi.set(self, "spec", value)

    @property
    @pulumi.getter
    def statuses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OnlineTableStatusArgs']]]]:
        """
        object describing status of the online table:
        """
        return pulumi.get(self, "statuses")

    @statuses.setter
    def statuses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OnlineTableStatusArgs']]]]):
        pulumi.set(self, "statuses", value)


class OnlineTable(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input[pulumi.InputType['OnlineTableSpecArgs']]] = None,
                 __props__=None):
        """
        > **Note** This resource could be only used on Unity Catalog-enabled workspace!

        This resource allows you to create [Online Table](https://docs.databricks.com/en/machine-learning/feature-store/online-tables.html) in Databricks.  An online table is a read-only copy of a Delta Table that is stored in row-oriented format optimized for online access. Online tables are fully serverless tables that auto-scale throughput capacity with the request load and provide low latency and high throughput access to data of any scale. Online tables are designed to work with Databricks Model Serving, Feature Serving, and retrieval-augmented generation (RAG) applications where they are used for fast data lookups.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.OnlineTable("this", spec=databricks.OnlineTableSpecArgs(
            primary_key_columns=["id"],
            run_triggered=databricks.OnlineTableSpecRunTriggeredArgs(),
            source_table_full_name="main.default.source_table",
        ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        The resource can be imported using the name of the Online Table:

        bash

        ```sh
        $ pulumi import databricks:index/onlineTable:OnlineTable this <endpoint-name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: 3-level name of the Online Table to create.
        :param pulumi.Input[pulumi.InputType['OnlineTableSpecArgs']] spec: object containing specification of the online table:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[OnlineTableArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Note** This resource could be only used on Unity Catalog-enabled workspace!

        This resource allows you to create [Online Table](https://docs.databricks.com/en/machine-learning/feature-store/online-tables.html) in Databricks.  An online table is a read-only copy of a Delta Table that is stored in row-oriented format optimized for online access. Online tables are fully serverless tables that auto-scale throughput capacity with the request load and provide low latency and high throughput access to data of any scale. Online tables are designed to work with Databricks Model Serving, Feature Serving, and retrieval-augmented generation (RAG) applications where they are used for fast data lookups.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.OnlineTable("this", spec=databricks.OnlineTableSpecArgs(
            primary_key_columns=["id"],
            run_triggered=databricks.OnlineTableSpecRunTriggeredArgs(),
            source_table_full_name="main.default.source_table",
        ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        The resource can be imported using the name of the Online Table:

        bash

        ```sh
        $ pulumi import databricks:index/onlineTable:OnlineTable this <endpoint-name>
        ```

        :param str resource_name: The name of the resource.
        :param OnlineTableArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OnlineTableArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input[pulumi.InputType['OnlineTableSpecArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OnlineTableArgs.__new__(OnlineTableArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["spec"] = spec
            __props__.__dict__["statuses"] = None
        super(OnlineTable, __self__).__init__(
            'databricks:index/onlineTable:OnlineTable',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            spec: Optional[pulumi.Input[pulumi.InputType['OnlineTableSpecArgs']]] = None,
            statuses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OnlineTableStatusArgs']]]]] = None) -> 'OnlineTable':
        """
        Get an existing OnlineTable resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: 3-level name of the Online Table to create.
        :param pulumi.Input[pulumi.InputType['OnlineTableSpecArgs']] spec: object containing specification of the online table:
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OnlineTableStatusArgs']]]] statuses: object describing status of the online table:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OnlineTableState.__new__(_OnlineTableState)

        __props__.__dict__["name"] = name
        __props__.__dict__["spec"] = spec
        __props__.__dict__["statuses"] = statuses
        return OnlineTable(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        3-level name of the Online Table to create.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def spec(self) -> pulumi.Output[Optional['outputs.OnlineTableSpec']]:
        """
        object containing specification of the online table:
        """
        return pulumi.get(self, "spec")

    @property
    @pulumi.getter
    def statuses(self) -> pulumi.Output[Sequence['outputs.OnlineTableStatus']]:
        """
        object describing status of the online table:
        """
        return pulumi.get(self, "statuses")

