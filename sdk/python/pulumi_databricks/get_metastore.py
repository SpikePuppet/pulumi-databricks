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

__all__ = [
    'GetMetastoreResult',
    'AwaitableGetMetastoreResult',
    'get_metastore',
    'get_metastore_output',
]

@pulumi.output_type
class GetMetastoreResult:
    """
    A collection of values returned by getMetastore.
    """
    def __init__(__self__, id=None, metastore_id=None, metastore_info=None, name=None, region=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if metastore_id and not isinstance(metastore_id, str):
            raise TypeError("Expected argument 'metastore_id' to be a str")
        pulumi.set(__self__, "metastore_id", metastore_id)
        if metastore_info and not isinstance(metastore_info, dict):
            raise TypeError("Expected argument 'metastore_info' to be a dict")
        pulumi.set(__self__, "metastore_info", metastore_info)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the metastore
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="metastoreId")
    def metastore_id(self) -> str:
        return pulumi.get(self, "metastore_id")

    @property
    @pulumi.getter(name="metastoreInfo")
    def metastore_info(self) -> 'outputs.GetMetastoreMetastoreInfoResult':
        """
        MetastoreInfo object for a databricks_metastore. This contains the following attributes:
        """
        return pulumi.get(self, "metastore_info")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of metastore.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> str:
        return pulumi.get(self, "region")


class AwaitableGetMetastoreResult(GetMetastoreResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMetastoreResult(
            id=self.id,
            metastore_id=self.metastore_id,
            metastore_info=self.metastore_info,
            name=self.name,
            region=self.region)


def get_metastore(id: Optional[str] = None,
                  metastore_id: Optional[str] = None,
                  metastore_info: Optional[pulumi.InputType['GetMetastoreMetastoreInfoArgs']] = None,
                  name: Optional[str] = None,
                  region: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMetastoreResult:
    """
    ## Example Usage

    MetastoreInfo response for a given metastore id

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this_metastore = databricks.Metastore("this",
        name="primary",
        storage_root=f"s3://{metastore['id']}/metastore",
        owner=unity_admin_group,
        force_destroy=True)
    this = databricks.get_metastore_output(metastore_id=this_metastore.id)
    pulumi.export("someMetastore", this.metastore_info)
    ```

    ## Related Resources

    The following resources are used in the same context:

    * get_metastores to get mapping of name to id of all metastores.
    * Metastore to manage Metastores within Unity Catalog.
    * Catalog to manage catalogs within Unity Catalog.


    :param str id: ID of the metastore
    :param str metastore_id: ID of the metastore
    :param pulumi.InputType['GetMetastoreMetastoreInfoArgs'] metastore_info: MetastoreInfo object for a databricks_metastore. This contains the following attributes:
    :param str name: Name of the metastore
    :param str region: Region of the metastore
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['metastoreId'] = metastore_id
    __args__['metastoreInfo'] = metastore_info
    __args__['name'] = name
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getMetastore:getMetastore', __args__, opts=opts, typ=GetMetastoreResult).value

    return AwaitableGetMetastoreResult(
        id=pulumi.get(__ret__, 'id'),
        metastore_id=pulumi.get(__ret__, 'metastore_id'),
        metastore_info=pulumi.get(__ret__, 'metastore_info'),
        name=pulumi.get(__ret__, 'name'),
        region=pulumi.get(__ret__, 'region'))


@_utilities.lift_output_func(get_metastore)
def get_metastore_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                         metastore_id: Optional[pulumi.Input[Optional[str]]] = None,
                         metastore_info: Optional[pulumi.Input[Optional[pulumi.InputType['GetMetastoreMetastoreInfoArgs']]]] = None,
                         name: Optional[pulumi.Input[Optional[str]]] = None,
                         region: Optional[pulumi.Input[Optional[str]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMetastoreResult]:
    """
    ## Example Usage

    MetastoreInfo response for a given metastore id

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this_metastore = databricks.Metastore("this",
        name="primary",
        storage_root=f"s3://{metastore['id']}/metastore",
        owner=unity_admin_group,
        force_destroy=True)
    this = databricks.get_metastore_output(metastore_id=this_metastore.id)
    pulumi.export("someMetastore", this.metastore_info)
    ```

    ## Related Resources

    The following resources are used in the same context:

    * get_metastores to get mapping of name to id of all metastores.
    * Metastore to manage Metastores within Unity Catalog.
    * Catalog to manage catalogs within Unity Catalog.


    :param str id: ID of the metastore
    :param str metastore_id: ID of the metastore
    :param pulumi.InputType['GetMetastoreMetastoreInfoArgs'] metastore_info: MetastoreInfo object for a databricks_metastore. This contains the following attributes:
    :param str name: Name of the metastore
    :param str region: Region of the metastore
    """
    ...
