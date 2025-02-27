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
    'GetTableResult',
    'AwaitableGetTableResult',
    'get_table',
    'get_table_output',
]

@pulumi.output_type
class GetTableResult:
    """
    A collection of values returned by getTable.
    """
    def __init__(__self__, id=None, name=None, table_info=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if table_info and not isinstance(table_info, dict):
            raise TypeError("Expected argument 'table_info' to be a dict")
        pulumi.set(__self__, "table_info", table_info)

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of table, relative to parent schema.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="tableInfo")
    def table_info(self) -> 'outputs.GetTableTableInfoResult':
        """
        TableInfo object for a Unity Catalog table. This contains the following attributes:
        """
        return pulumi.get(self, "table_info")


class AwaitableGetTableResult(GetTableResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTableResult(
            id=self.id,
            name=self.name,
            table_info=self.table_info)


def get_table(id: Optional[str] = None,
              name: Optional[str] = None,
              table_info: Optional[pulumi.InputType['GetTableTableInfoArgs']] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTableResult:
    """
    ## Example Usage

    Read  on a specific table `main.certified.fct_transactions`:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    fct_transactions = databricks.get_table(name="main.certified.fct_transactions")
    things = databricks.Grants("things",
        table=fct_transactions.name,
        grants=[databricks.GrantsGrantArgs(
            principal="sensitive",
            privileges=[
                "SELECT",
                "MODIFY",
            ],
        )])
    ```

    ## Related Resources

    The following resources are used in the same context:

    * Grant to manage grants within Unity Catalog.
    * get_tables to list all tables within a schema in Unity Catalog.


    :param str name: Full name of the databricks_table: _`catalog`.`schema`.`table`_
    :param pulumi.InputType['GetTableTableInfoArgs'] table_info: TableInfo object for a Unity Catalog table. This contains the following attributes:
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    __args__['tableInfo'] = table_info
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getTable:getTable', __args__, opts=opts, typ=GetTableResult).value

    return AwaitableGetTableResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        table_info=pulumi.get(__ret__, 'table_info'))


@_utilities.lift_output_func(get_table)
def get_table_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                     name: Optional[pulumi.Input[str]] = None,
                     table_info: Optional[pulumi.Input[Optional[pulumi.InputType['GetTableTableInfoArgs']]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTableResult]:
    """
    ## Example Usage

    Read  on a specific table `main.certified.fct_transactions`:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    fct_transactions = databricks.get_table(name="main.certified.fct_transactions")
    things = databricks.Grants("things",
        table=fct_transactions.name,
        grants=[databricks.GrantsGrantArgs(
            principal="sensitive",
            privileges=[
                "SELECT",
                "MODIFY",
            ],
        )])
    ```

    ## Related Resources

    The following resources are used in the same context:

    * Grant to manage grants within Unity Catalog.
    * get_tables to list all tables within a schema in Unity Catalog.


    :param str name: Full name of the databricks_table: _`catalog`.`schema`.`table`_
    :param pulumi.InputType['GetTableTableInfoArgs'] table_info: TableInfo object for a Unity Catalog table. This contains the following attributes:
    """
    ...
