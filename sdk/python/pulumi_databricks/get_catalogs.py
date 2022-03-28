# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetCatalogsResult',
    'AwaitableGetCatalogsResult',
    'get_catalogs',
    'get_catalogs_output',
]

@pulumi.output_type
class GetCatalogsResult:
    """
    A collection of values returned by getCatalogs.
    """
    def __init__(__self__, id=None, ids=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
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
    def ids(self) -> Sequence[str]:
        """
        set of Catalog names
        """
        return pulumi.get(self, "ids")


class AwaitableGetCatalogsResult(GetCatalogsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCatalogsResult(
            id=self.id,
            ids=self.ids)


def get_catalogs(ids: Optional[Sequence[str]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCatalogsResult:
    """
    ## Example Usage

    Listing all catalogs:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_catalogs()
    pulumi.export("allCatalogs", all)
    ```
    ## Related Resources

    The following resources are used in the same context:

    * Table to manage tables within Unity Catalog.
    * Schema to manage schemas within Unity Catalog.
    * Catalog to manage catalogs within Unity Catalog.


    :param Sequence[str] ids: set of Catalog names
    """
    __args__ = dict()
    __args__['ids'] = ids
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('databricks:index/getCatalogs:getCatalogs', __args__, opts=opts, typ=GetCatalogsResult).value

    return AwaitableGetCatalogsResult(
        id=__ret__.id,
        ids=__ret__.ids)


@_utilities.lift_output_func(get_catalogs)
def get_catalogs_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCatalogsResult]:
    """
    ## Example Usage

    Listing all catalogs:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_catalogs()
    pulumi.export("allCatalogs", all)
    ```
    ## Related Resources

    The following resources are used in the same context:

    * Table to manage tables within Unity Catalog.
    * Schema to manage schemas within Unity Catalog.
    * Catalog to manage catalogs within Unity Catalog.


    :param Sequence[str] ids: set of Catalog names
    """
    ...
