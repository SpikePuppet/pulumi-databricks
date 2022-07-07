# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['MetastoreDataAccessArgs', 'MetastoreDataAccess']

@pulumi.input_type
class MetastoreDataAccessArgs:
    def __init__(__self__, *,
                 metastore_id: pulumi.Input[str],
                 aws_iam_role: Optional[pulumi.Input['MetastoreDataAccessAwsIamRoleArgs']] = None,
                 azure_managed_identity: Optional[pulumi.Input['MetastoreDataAccessAzureManagedIdentityArgs']] = None,
                 azure_service_principal: Optional[pulumi.Input['MetastoreDataAccessAzureServicePrincipalArgs']] = None,
                 configuration_type: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MetastoreDataAccess resource.
        :param pulumi.Input[str] metastore_id: Unique identifier of the parent Metastore
        :param pulumi.Input[str] name: Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        pulumi.set(__self__, "metastore_id", metastore_id)
        if aws_iam_role is not None:
            pulumi.set(__self__, "aws_iam_role", aws_iam_role)
        if azure_managed_identity is not None:
            pulumi.set(__self__, "azure_managed_identity", azure_managed_identity)
        if azure_service_principal is not None:
            pulumi.set(__self__, "azure_service_principal", azure_service_principal)
        if configuration_type is not None:
            pulumi.set(__self__, "configuration_type", configuration_type)
        if is_default is not None:
            pulumi.set(__self__, "is_default", is_default)
        if name is not None:
            pulumi.set(__self__, "name", name)

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
    @pulumi.getter(name="awsIamRole")
    def aws_iam_role(self) -> Optional[pulumi.Input['MetastoreDataAccessAwsIamRoleArgs']]:
        return pulumi.get(self, "aws_iam_role")

    @aws_iam_role.setter
    def aws_iam_role(self, value: Optional[pulumi.Input['MetastoreDataAccessAwsIamRoleArgs']]):
        pulumi.set(self, "aws_iam_role", value)

    @property
    @pulumi.getter(name="azureManagedIdentity")
    def azure_managed_identity(self) -> Optional[pulumi.Input['MetastoreDataAccessAzureManagedIdentityArgs']]:
        return pulumi.get(self, "azure_managed_identity")

    @azure_managed_identity.setter
    def azure_managed_identity(self, value: Optional[pulumi.Input['MetastoreDataAccessAzureManagedIdentityArgs']]):
        pulumi.set(self, "azure_managed_identity", value)

    @property
    @pulumi.getter(name="azureServicePrincipal")
    def azure_service_principal(self) -> Optional[pulumi.Input['MetastoreDataAccessAzureServicePrincipalArgs']]:
        return pulumi.get(self, "azure_service_principal")

    @azure_service_principal.setter
    def azure_service_principal(self, value: Optional[pulumi.Input['MetastoreDataAccessAzureServicePrincipalArgs']]):
        pulumi.set(self, "azure_service_principal", value)

    @property
    @pulumi.getter(name="configurationType")
    def configuration_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "configuration_type")

    @configuration_type.setter
    def configuration_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "configuration_type", value)

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "is_default")

    @is_default.setter
    def is_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_default", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _MetastoreDataAccessState:
    def __init__(__self__, *,
                 aws_iam_role: Optional[pulumi.Input['MetastoreDataAccessAwsIamRoleArgs']] = None,
                 azure_managed_identity: Optional[pulumi.Input['MetastoreDataAccessAzureManagedIdentityArgs']] = None,
                 azure_service_principal: Optional[pulumi.Input['MetastoreDataAccessAzureServicePrincipalArgs']] = None,
                 configuration_type: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MetastoreDataAccess resources.
        :param pulumi.Input[str] metastore_id: Unique identifier of the parent Metastore
        :param pulumi.Input[str] name: Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        if aws_iam_role is not None:
            pulumi.set(__self__, "aws_iam_role", aws_iam_role)
        if azure_managed_identity is not None:
            pulumi.set(__self__, "azure_managed_identity", azure_managed_identity)
        if azure_service_principal is not None:
            pulumi.set(__self__, "azure_service_principal", azure_service_principal)
        if configuration_type is not None:
            pulumi.set(__self__, "configuration_type", configuration_type)
        if is_default is not None:
            pulumi.set(__self__, "is_default", is_default)
        if metastore_id is not None:
            pulumi.set(__self__, "metastore_id", metastore_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="awsIamRole")
    def aws_iam_role(self) -> Optional[pulumi.Input['MetastoreDataAccessAwsIamRoleArgs']]:
        return pulumi.get(self, "aws_iam_role")

    @aws_iam_role.setter
    def aws_iam_role(self, value: Optional[pulumi.Input['MetastoreDataAccessAwsIamRoleArgs']]):
        pulumi.set(self, "aws_iam_role", value)

    @property
    @pulumi.getter(name="azureManagedIdentity")
    def azure_managed_identity(self) -> Optional[pulumi.Input['MetastoreDataAccessAzureManagedIdentityArgs']]:
        return pulumi.get(self, "azure_managed_identity")

    @azure_managed_identity.setter
    def azure_managed_identity(self, value: Optional[pulumi.Input['MetastoreDataAccessAzureManagedIdentityArgs']]):
        pulumi.set(self, "azure_managed_identity", value)

    @property
    @pulumi.getter(name="azureServicePrincipal")
    def azure_service_principal(self) -> Optional[pulumi.Input['MetastoreDataAccessAzureServicePrincipalArgs']]:
        return pulumi.get(self, "azure_service_principal")

    @azure_service_principal.setter
    def azure_service_principal(self, value: Optional[pulumi.Input['MetastoreDataAccessAzureServicePrincipalArgs']]):
        pulumi.set(self, "azure_service_principal", value)

    @property
    @pulumi.getter(name="configurationType")
    def configuration_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "configuration_type")

    @configuration_type.setter
    def configuration_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "configuration_type", value)

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "is_default")

    @is_default.setter
    def is_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_default", value)

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
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class MetastoreDataAccess(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_iam_role: Optional[pulumi.Input[pulumi.InputType['MetastoreDataAccessAwsIamRoleArgs']]] = None,
                 azure_managed_identity: Optional[pulumi.Input[pulumi.InputType['MetastoreDataAccessAzureManagedIdentityArgs']]] = None,
                 azure_service_principal: Optional[pulumi.Input[pulumi.InputType['MetastoreDataAccessAzureServicePrincipalArgs']]] = None,
                 configuration_type: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **Public Preview** This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html). Contact your Databricks representative to request access.

        Each Metastore requires an IAM role that will be assumed by Unity Catalog to access data. `MetastoreDataAccess` defines this

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] metastore_id: Unique identifier of the parent Metastore
        :param pulumi.Input[str] name: Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MetastoreDataAccessArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Public Preview** This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html). Contact your Databricks representative to request access.

        Each Metastore requires an IAM role that will be assumed by Unity Catalog to access data. `MetastoreDataAccess` defines this

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param MetastoreDataAccessArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MetastoreDataAccessArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_iam_role: Optional[pulumi.Input[pulumi.InputType['MetastoreDataAccessAwsIamRoleArgs']]] = None,
                 azure_managed_identity: Optional[pulumi.Input[pulumi.InputType['MetastoreDataAccessAzureManagedIdentityArgs']]] = None,
                 azure_service_principal: Optional[pulumi.Input[pulumi.InputType['MetastoreDataAccessAzureServicePrincipalArgs']]] = None,
                 configuration_type: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
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
            __props__ = MetastoreDataAccessArgs.__new__(MetastoreDataAccessArgs)

            __props__.__dict__["aws_iam_role"] = aws_iam_role
            __props__.__dict__["azure_managed_identity"] = azure_managed_identity
            __props__.__dict__["azure_service_principal"] = azure_service_principal
            __props__.__dict__["configuration_type"] = configuration_type
            __props__.__dict__["is_default"] = is_default
            if metastore_id is None and not opts.urn:
                raise TypeError("Missing required property 'metastore_id'")
            __props__.__dict__["metastore_id"] = metastore_id
            __props__.__dict__["name"] = name
        super(MetastoreDataAccess, __self__).__init__(
            'databricks:index/metastoreDataAccess:MetastoreDataAccess',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws_iam_role: Optional[pulumi.Input[pulumi.InputType['MetastoreDataAccessAwsIamRoleArgs']]] = None,
            azure_managed_identity: Optional[pulumi.Input[pulumi.InputType['MetastoreDataAccessAzureManagedIdentityArgs']]] = None,
            azure_service_principal: Optional[pulumi.Input[pulumi.InputType['MetastoreDataAccessAzureServicePrincipalArgs']]] = None,
            configuration_type: Optional[pulumi.Input[str]] = None,
            is_default: Optional[pulumi.Input[bool]] = None,
            metastore_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'MetastoreDataAccess':
        """
        Get an existing MetastoreDataAccess resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] metastore_id: Unique identifier of the parent Metastore
        :param pulumi.Input[str] name: Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MetastoreDataAccessState.__new__(_MetastoreDataAccessState)

        __props__.__dict__["aws_iam_role"] = aws_iam_role
        __props__.__dict__["azure_managed_identity"] = azure_managed_identity
        __props__.__dict__["azure_service_principal"] = azure_service_principal
        __props__.__dict__["configuration_type"] = configuration_type
        __props__.__dict__["is_default"] = is_default
        __props__.__dict__["metastore_id"] = metastore_id
        __props__.__dict__["name"] = name
        return MetastoreDataAccess(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="awsIamRole")
    def aws_iam_role(self) -> pulumi.Output[Optional['outputs.MetastoreDataAccessAwsIamRole']]:
        return pulumi.get(self, "aws_iam_role")

    @property
    @pulumi.getter(name="azureManagedIdentity")
    def azure_managed_identity(self) -> pulumi.Output[Optional['outputs.MetastoreDataAccessAzureManagedIdentity']]:
        return pulumi.get(self, "azure_managed_identity")

    @property
    @pulumi.getter(name="azureServicePrincipal")
    def azure_service_principal(self) -> pulumi.Output[Optional['outputs.MetastoreDataAccessAzureServicePrincipal']]:
        return pulumi.get(self, "azure_service_principal")

    @property
    @pulumi.getter(name="configurationType")
    def configuration_type(self) -> pulumi.Output[str]:
        return pulumi.get(self, "configuration_type")

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "is_default")

    @property
    @pulumi.getter(name="metastoreId")
    def metastore_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the parent Metastore
        """
        return pulumi.get(self, "metastore_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        return pulumi.get(self, "name")

