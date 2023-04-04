# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['IpAccessListArgs', 'IpAccessList']

@pulumi.input_type
class IpAccessListArgs:
    def __init__(__self__, *,
                 ip_addresses: pulumi.Input[Sequence[pulumi.Input[str]]],
                 label: pulumi.Input[str],
                 list_type: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a IpAccessList resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ip_addresses: A string list of IP addresses and CIDR ranges.
        :param pulumi.Input[str] label: This is the display name for the given IP ACL List.
        :param pulumi.Input[str] list_type: Can only be "ALLOW" or "BLOCK".
        :param pulumi.Input[bool] enabled: Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
        """
        pulumi.set(__self__, "ip_addresses", ip_addresses)
        pulumi.set(__self__, "label", label)
        pulumi.set(__self__, "list_type", list_type)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter(name="ipAddresses")
    def ip_addresses(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A string list of IP addresses and CIDR ranges.
        """
        return pulumi.get(self, "ip_addresses")

    @ip_addresses.setter
    def ip_addresses(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "ip_addresses", value)

    @property
    @pulumi.getter
    def label(self) -> pulumi.Input[str]:
        """
        This is the display name for the given IP ACL List.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[str]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="listType")
    def list_type(self) -> pulumi.Input[str]:
        """
        Can only be "ALLOW" or "BLOCK".
        """
        return pulumi.get(self, "list_type")

    @list_type.setter
    def list_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "list_type", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)


@pulumi.input_type
class _IpAccessListState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 list_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IpAccessList resources.
        :param pulumi.Input[bool] enabled: Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ip_addresses: A string list of IP addresses and CIDR ranges.
        :param pulumi.Input[str] label: This is the display name for the given IP ACL List.
        :param pulumi.Input[str] list_type: Can only be "ALLOW" or "BLOCK".
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if ip_addresses is not None:
            pulumi.set(__self__, "ip_addresses", ip_addresses)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if list_type is not None:
            pulumi.set(__self__, "list_type", list_type)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="ipAddresses")
    def ip_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A string list of IP addresses and CIDR ranges.
        """
        return pulumi.get(self, "ip_addresses")

    @ip_addresses.setter
    def ip_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ip_addresses", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        This is the display name for the given IP ACL List.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="listType")
    def list_type(self) -> Optional[pulumi.Input[str]]:
        """
        Can only be "ALLOW" or "BLOCK".
        """
        return pulumi.get(self, "list_type")

    @list_type.setter
    def list_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "list_type", value)


class IpAccessList(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 list_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Security-conscious enterprises that use cloud SaaS applications need to restrict access to their own employees. Authentication helps to prove user identity, but that does not enforce network location of the users. Accessing a cloud service from an unsecured network can pose security risks to an enterprise, especially when the user may have authorized access to sensitive or personal data. Enterprise network perimeters apply security policies and limit access to external services (for example, firewalls, proxies, DLP, and logging), so access beyond these controls are assumed to be untrusted. Please see [IP Access List](https://docs.databricks.com/security/network/ip-access-list.html) for full feature documentation.

        > **Note** The total number of IP addresses and CIDR scopes provided across all ACL Lists in a workspace can not exceed 1000.  Refer to the docs above for specifics.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.WorkspaceConf("this", custom_config={
            "enableIpAccessLists": True,
        })
        allowed_list = databricks.IpAccessList("allowed-list",
            label="allow_in",
            list_type="ALLOW",
            ip_addresses=[
                "1.1.1.1",
                "1.2.3.0/24",
                "1.2.5.0/24",
            ],
            opts=pulumi.ResourceOptions(depends_on=[this]))
        ```
        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide.
        * MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
        * MwsPrivateAccessSettings to create a [Private Access Setting](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html#step-5-create-a-private-access-settings-configuration-using-the-databricks-account-api) that can be used as part of a MwsWorkspaces resource to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html).
        * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).

        ## Import

        The databricks_ip_access_list can be imported using idbash

        ```sh
         $ pulumi import databricks:index/ipAccessList:IpAccessList this <list-id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ip_addresses: A string list of IP addresses and CIDR ranges.
        :param pulumi.Input[str] label: This is the display name for the given IP ACL List.
        :param pulumi.Input[str] list_type: Can only be "ALLOW" or "BLOCK".
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IpAccessListArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Security-conscious enterprises that use cloud SaaS applications need to restrict access to their own employees. Authentication helps to prove user identity, but that does not enforce network location of the users. Accessing a cloud service from an unsecured network can pose security risks to an enterprise, especially when the user may have authorized access to sensitive or personal data. Enterprise network perimeters apply security policies and limit access to external services (for example, firewalls, proxies, DLP, and logging), so access beyond these controls are assumed to be untrusted. Please see [IP Access List](https://docs.databricks.com/security/network/ip-access-list.html) for full feature documentation.

        > **Note** The total number of IP addresses and CIDR scopes provided across all ACL Lists in a workspace can not exceed 1000.  Refer to the docs above for specifics.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.WorkspaceConf("this", custom_config={
            "enableIpAccessLists": True,
        })
        allowed_list = databricks.IpAccessList("allowed-list",
            label="allow_in",
            list_type="ALLOW",
            ip_addresses=[
                "1.1.1.1",
                "1.2.3.0/24",
                "1.2.5.0/24",
            ],
            opts=pulumi.ResourceOptions(depends_on=[this]))
        ```
        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide.
        * MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
        * MwsPrivateAccessSettings to create a [Private Access Setting](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html#step-5-create-a-private-access-settings-configuration-using-the-databricks-account-api) that can be used as part of a MwsWorkspaces resource to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html).
        * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).

        ## Import

        The databricks_ip_access_list can be imported using idbash

        ```sh
         $ pulumi import databricks:index/ipAccessList:IpAccessList this <list-id>
        ```

        :param str resource_name: The name of the resource.
        :param IpAccessListArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IpAccessListArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 list_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IpAccessListArgs.__new__(IpAccessListArgs)

            __props__.__dict__["enabled"] = enabled
            if ip_addresses is None and not opts.urn:
                raise TypeError("Missing required property 'ip_addresses'")
            __props__.__dict__["ip_addresses"] = ip_addresses
            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__.__dict__["label"] = label
            if list_type is None and not opts.urn:
                raise TypeError("Missing required property 'list_type'")
            __props__.__dict__["list_type"] = list_type
        super(IpAccessList, __self__).__init__(
            'databricks:index/ipAccessList:IpAccessList',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            label: Optional[pulumi.Input[str]] = None,
            list_type: Optional[pulumi.Input[str]] = None) -> 'IpAccessList':
        """
        Get an existing IpAccessList resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ip_addresses: A string list of IP addresses and CIDR ranges.
        :param pulumi.Input[str] label: This is the display name for the given IP ACL List.
        :param pulumi.Input[str] list_type: Can only be "ALLOW" or "BLOCK".
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IpAccessListState.__new__(_IpAccessListState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["ip_addresses"] = ip_addresses
        __props__.__dict__["label"] = label
        __props__.__dict__["list_type"] = list_type
        return IpAccessList(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="ipAddresses")
    def ip_addresses(self) -> pulumi.Output[Sequence[str]]:
        """
        A string list of IP addresses and CIDR ranges.
        """
        return pulumi.get(self, "ip_addresses")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        This is the display name for the given IP ACL List.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="listType")
    def list_type(self) -> pulumi.Output[str]:
        """
        Can only be "ALLOW" or "BLOCK".
        """
        return pulumi.get(self, "list_type")

