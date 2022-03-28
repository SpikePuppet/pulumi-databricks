# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MwsVpcEndpointArgs', 'MwsVpcEndpoint']

@pulumi.input_type
class MwsVpcEndpointArgs:
    def __init__(__self__, *,
                 aws_vpc_endpoint_id: pulumi.Input[str],
                 region: pulumi.Input[str],
                 vpc_endpoint_name: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 aws_endpoint_service_id: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 use_case: Optional[pulumi.Input[str]] = None,
                 vpc_endpoint_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MwsVpcEndpoint resource.
        :param pulumi.Input[str] region: Region of AWS VPC
        :param pulumi.Input[str] vpc_endpoint_name: Name of VPC Endpoint in Databricks Account
        :param pulumi.Input[str] account_id: Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        :param pulumi.Input[str] aws_endpoint_service_id: ID of Databricks VPC endpoint service to connect to. Please contact your Databricks representative to request mapping
        :param pulumi.Input[str] state: State of VPC Endpoint
        :param pulumi.Input[str] vpc_endpoint_id: Canonical unique identifier of VPC Endpoint in Databricks Account
        """
        pulumi.set(__self__, "aws_vpc_endpoint_id", aws_vpc_endpoint_id)
        pulumi.set(__self__, "region", region)
        pulumi.set(__self__, "vpc_endpoint_name", vpc_endpoint_name)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if aws_account_id is not None:
            pulumi.set(__self__, "aws_account_id", aws_account_id)
        if aws_endpoint_service_id is not None:
            pulumi.set(__self__, "aws_endpoint_service_id", aws_endpoint_service_id)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if use_case is not None:
            pulumi.set(__self__, "use_case", use_case)
        if vpc_endpoint_id is not None:
            pulumi.set(__self__, "vpc_endpoint_id", vpc_endpoint_id)

    @property
    @pulumi.getter(name="awsVpcEndpointId")
    def aws_vpc_endpoint_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "aws_vpc_endpoint_id")

    @aws_vpc_endpoint_id.setter
    def aws_vpc_endpoint_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "aws_vpc_endpoint_id", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        Region of AWS VPC
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="vpcEndpointName")
    def vpc_endpoint_name(self) -> pulumi.Input[str]:
        """
        Name of VPC Endpoint in Databricks Account
        """
        return pulumi.get(self, "vpc_endpoint_name")

    @vpc_endpoint_name.setter
    def vpc_endpoint_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_endpoint_name", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "aws_account_id")

    @aws_account_id.setter
    def aws_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_account_id", value)

    @property
    @pulumi.getter(name="awsEndpointServiceId")
    def aws_endpoint_service_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of Databricks VPC endpoint service to connect to. Please contact your Databricks representative to request mapping
        """
        return pulumi.get(self, "aws_endpoint_service_id")

    @aws_endpoint_service_id.setter
    def aws_endpoint_service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_endpoint_service_id", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        State of VPC Endpoint
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter(name="useCase")
    def use_case(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "use_case")

    @use_case.setter
    def use_case(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "use_case", value)

    @property
    @pulumi.getter(name="vpcEndpointId")
    def vpc_endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        Canonical unique identifier of VPC Endpoint in Databricks Account
        """
        return pulumi.get(self, "vpc_endpoint_id")

    @vpc_endpoint_id.setter
    def vpc_endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_endpoint_id", value)


@pulumi.input_type
class _MwsVpcEndpointState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 aws_endpoint_service_id: Optional[pulumi.Input[str]] = None,
                 aws_vpc_endpoint_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 use_case: Optional[pulumi.Input[str]] = None,
                 vpc_endpoint_id: Optional[pulumi.Input[str]] = None,
                 vpc_endpoint_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MwsVpcEndpoint resources.
        :param pulumi.Input[str] account_id: Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        :param pulumi.Input[str] aws_endpoint_service_id: ID of Databricks VPC endpoint service to connect to. Please contact your Databricks representative to request mapping
        :param pulumi.Input[str] region: Region of AWS VPC
        :param pulumi.Input[str] state: State of VPC Endpoint
        :param pulumi.Input[str] vpc_endpoint_id: Canonical unique identifier of VPC Endpoint in Databricks Account
        :param pulumi.Input[str] vpc_endpoint_name: Name of VPC Endpoint in Databricks Account
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if aws_account_id is not None:
            pulumi.set(__self__, "aws_account_id", aws_account_id)
        if aws_endpoint_service_id is not None:
            pulumi.set(__self__, "aws_endpoint_service_id", aws_endpoint_service_id)
        if aws_vpc_endpoint_id is not None:
            pulumi.set(__self__, "aws_vpc_endpoint_id", aws_vpc_endpoint_id)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if use_case is not None:
            pulumi.set(__self__, "use_case", use_case)
        if vpc_endpoint_id is not None:
            pulumi.set(__self__, "vpc_endpoint_id", vpc_endpoint_id)
        if vpc_endpoint_name is not None:
            pulumi.set(__self__, "vpc_endpoint_name", vpc_endpoint_name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "aws_account_id")

    @aws_account_id.setter
    def aws_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_account_id", value)

    @property
    @pulumi.getter(name="awsEndpointServiceId")
    def aws_endpoint_service_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of Databricks VPC endpoint service to connect to. Please contact your Databricks representative to request mapping
        """
        return pulumi.get(self, "aws_endpoint_service_id")

    @aws_endpoint_service_id.setter
    def aws_endpoint_service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_endpoint_service_id", value)

    @property
    @pulumi.getter(name="awsVpcEndpointId")
    def aws_vpc_endpoint_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "aws_vpc_endpoint_id")

    @aws_vpc_endpoint_id.setter
    def aws_vpc_endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_vpc_endpoint_id", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        Region of AWS VPC
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        State of VPC Endpoint
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter(name="useCase")
    def use_case(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "use_case")

    @use_case.setter
    def use_case(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "use_case", value)

    @property
    @pulumi.getter(name="vpcEndpointId")
    def vpc_endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        Canonical unique identifier of VPC Endpoint in Databricks Account
        """
        return pulumi.get(self, "vpc_endpoint_id")

    @vpc_endpoint_id.setter
    def vpc_endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_endpoint_id", value)

    @property
    @pulumi.getter(name="vpcEndpointName")
    def vpc_endpoint_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of VPC Endpoint in Databricks Account
        """
        return pulumi.get(self, "vpc_endpoint_name")

    @vpc_endpoint_name.setter
    def vpc_endpoint_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_endpoint_name", value)


class MwsVpcEndpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 aws_endpoint_service_id: Optional[pulumi.Input[str]] = None,
                 aws_vpc_endpoint_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 use_case: Optional[pulumi.Input[str]] = None,
                 vpc_endpoint_id: Optional[pulumi.Input[str]] = None,
                 vpc_endpoint_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        :param pulumi.Input[str] aws_endpoint_service_id: ID of Databricks VPC endpoint service to connect to. Please contact your Databricks representative to request mapping
        :param pulumi.Input[str] region: Region of AWS VPC
        :param pulumi.Input[str] state: State of VPC Endpoint
        :param pulumi.Input[str] vpc_endpoint_id: Canonical unique identifier of VPC Endpoint in Databricks Account
        :param pulumi.Input[str] vpc_endpoint_name: Name of VPC Endpoint in Databricks Account
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MwsVpcEndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param MwsVpcEndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MwsVpcEndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 aws_endpoint_service_id: Optional[pulumi.Input[str]] = None,
                 aws_vpc_endpoint_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 use_case: Optional[pulumi.Input[str]] = None,
                 vpc_endpoint_id: Optional[pulumi.Input[str]] = None,
                 vpc_endpoint_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MwsVpcEndpointArgs.__new__(MwsVpcEndpointArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["aws_account_id"] = aws_account_id
            __props__.__dict__["aws_endpoint_service_id"] = aws_endpoint_service_id
            if aws_vpc_endpoint_id is None and not opts.urn:
                raise TypeError("Missing required property 'aws_vpc_endpoint_id'")
            __props__.__dict__["aws_vpc_endpoint_id"] = aws_vpc_endpoint_id
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["state"] = state
            __props__.__dict__["use_case"] = use_case
            __props__.__dict__["vpc_endpoint_id"] = vpc_endpoint_id
            if vpc_endpoint_name is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_endpoint_name'")
            __props__.__dict__["vpc_endpoint_name"] = vpc_endpoint_name
        super(MwsVpcEndpoint, __self__).__init__(
            'databricks:index/mwsVpcEndpoint:MwsVpcEndpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            aws_account_id: Optional[pulumi.Input[str]] = None,
            aws_endpoint_service_id: Optional[pulumi.Input[str]] = None,
            aws_vpc_endpoint_id: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            use_case: Optional[pulumi.Input[str]] = None,
            vpc_endpoint_id: Optional[pulumi.Input[str]] = None,
            vpc_endpoint_name: Optional[pulumi.Input[str]] = None) -> 'MwsVpcEndpoint':
        """
        Get an existing MwsVpcEndpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        :param pulumi.Input[str] aws_endpoint_service_id: ID of Databricks VPC endpoint service to connect to. Please contact your Databricks representative to request mapping
        :param pulumi.Input[str] region: Region of AWS VPC
        :param pulumi.Input[str] state: State of VPC Endpoint
        :param pulumi.Input[str] vpc_endpoint_id: Canonical unique identifier of VPC Endpoint in Databricks Account
        :param pulumi.Input[str] vpc_endpoint_name: Name of VPC Endpoint in Databricks Account
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MwsVpcEndpointState.__new__(_MwsVpcEndpointState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["aws_account_id"] = aws_account_id
        __props__.__dict__["aws_endpoint_service_id"] = aws_endpoint_service_id
        __props__.__dict__["aws_vpc_endpoint_id"] = aws_vpc_endpoint_id
        __props__.__dict__["region"] = region
        __props__.__dict__["state"] = state
        __props__.__dict__["use_case"] = use_case
        __props__.__dict__["vpc_endpoint_id"] = vpc_endpoint_id
        __props__.__dict__["vpc_endpoint_name"] = vpc_endpoint_name
        return MwsVpcEndpoint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[str]]:
        """
        Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "aws_account_id")

    @property
    @pulumi.getter(name="awsEndpointServiceId")
    def aws_endpoint_service_id(self) -> pulumi.Output[str]:
        """
        ID of Databricks VPC endpoint service to connect to. Please contact your Databricks representative to request mapping
        """
        return pulumi.get(self, "aws_endpoint_service_id")

    @property
    @pulumi.getter(name="awsVpcEndpointId")
    def aws_vpc_endpoint_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "aws_vpc_endpoint_id")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        Region of AWS VPC
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        State of VPC Endpoint
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="useCase")
    def use_case(self) -> pulumi.Output[str]:
        return pulumi.get(self, "use_case")

    @property
    @pulumi.getter(name="vpcEndpointId")
    def vpc_endpoint_id(self) -> pulumi.Output[str]:
        """
        Canonical unique identifier of VPC Endpoint in Databricks Account
        """
        return pulumi.get(self, "vpc_endpoint_id")

    @property
    @pulumi.getter(name="vpcEndpointName")
    def vpc_endpoint_name(self) -> pulumi.Output[str]:
        """
        Name of VPC Endpoint in Databricks Account
        """
        return pulumi.get(self, "vpc_endpoint_name")

