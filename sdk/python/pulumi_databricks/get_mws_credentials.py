# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetMwsCredentialsResult',
    'AwaitableGetMwsCredentialsResult',
    'get_mws_credentials',
    'get_mws_credentials_output',
]

@pulumi.output_type
class GetMwsCredentialsResult:
    """
    A collection of values returned by getMwsCredentials.
    """
    def __init__(__self__, id=None, ids=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, dict):
            raise TypeError("Expected argument 'ids' to be a dict")
        pulumi.set(__self__, "ids", ids)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Mapping[str, Any]:
        """
        name-to-id map for all of the credentials in the account
        """
        return pulumi.get(self, "ids")


class AwaitableGetMwsCredentialsResult(GetMwsCredentialsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMwsCredentialsResult(
            id=self.id,
            ids=self.ids)


def get_mws_credentials(ids: Optional[Mapping[str, Any]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMwsCredentialsResult:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    Lists all MwsCredentials in Databricks Account.

    > **Note** `account_id` provider configuration property is required for this resource to work.

    ## Example Usage

    Listing all credentials in Databricks Account

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_mws_credentials()
    pulumi.export("allMwsCredentials", all.ids)
    ```
    <!--End PulumiCodeChooser -->

    ## Related Resources

    The following resources are used in the same context:

    * Provisioning Databricks on AWS guide.
    * MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
    * MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
    * MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
    * MwsStorageConfigurations to configure root bucket new workspaces within AWS.
    * MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).


    :param Mapping[str, Any] ids: name-to-id map for all of the credentials in the account
    """
    __args__ = dict()
    __args__['ids'] = ids
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getMwsCredentials:getMwsCredentials', __args__, opts=opts, typ=GetMwsCredentialsResult).value

    return AwaitableGetMwsCredentialsResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'))


@_utilities.lift_output_func(get_mws_credentials)
def get_mws_credentials_output(ids: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMwsCredentialsResult]:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    Lists all MwsCredentials in Databricks Account.

    > **Note** `account_id` provider configuration property is required for this resource to work.

    ## Example Usage

    Listing all credentials in Databricks Account

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_mws_credentials()
    pulumi.export("allMwsCredentials", all.ids)
    ```
    <!--End PulumiCodeChooser -->

    ## Related Resources

    The following resources are used in the same context:

    * Provisioning Databricks on AWS guide.
    * MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
    * MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
    * MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
    * MwsStorageConfigurations to configure root bucket new workspaces within AWS.
    * MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).


    :param Mapping[str, Any] ids: name-to-id map for all of the credentials in the account
    """
    ...
