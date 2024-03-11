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

__all__ = [
    'GetDbfsFilePathsResult',
    'AwaitableGetDbfsFilePathsResult',
    'get_dbfs_file_paths',
    'get_dbfs_file_paths_output',
]

@pulumi.output_type
class GetDbfsFilePathsResult:
    """
    A collection of values returned by getDbfsFilePaths.
    """
    def __init__(__self__, id=None, path=None, path_lists=None, recursive=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)
        if path_lists and not isinstance(path_lists, list):
            raise TypeError("Expected argument 'path_lists' to be a list")
        pulumi.set(__self__, "path_lists", path_lists)
        if recursive and not isinstance(recursive, bool):
            raise TypeError("Expected argument 'recursive' to be a bool")
        pulumi.set(__self__, "recursive", recursive)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def path(self) -> str:
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="pathLists")
    def path_lists(self) -> Sequence['outputs.GetDbfsFilePathsPathListResult']:
        """
        returns list of objects with `path` and `file_size` attributes in each
        """
        return pulumi.get(self, "path_lists")

    @property
    @pulumi.getter
    def recursive(self) -> bool:
        return pulumi.get(self, "recursive")


class AwaitableGetDbfsFilePathsResult(GetDbfsFilePathsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDbfsFilePathsResult(
            id=self.id,
            path=self.path,
            path_lists=self.path_lists,
            recursive=self.recursive)


def get_dbfs_file_paths(path: Optional[str] = None,
                        recursive: Optional[bool] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDbfsFilePathsResult:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    This data source allows to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_databricks as databricks

    partitions = databricks.get_dbfs_file_paths(path="dbfs:/user/hive/default.db/table",
        recursive=False)
    ```
    <!--End PulumiCodeChooser -->

    ## Related Resources

    The following resources are used in the same context:

    * End to end workspace management guide.
    * DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    * get_dbfs_file_paths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    * DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    * Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
    * Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.


    :param str path: Path on DBFS for the file to perform listing
    :param bool recursive: Either or not recursively list all files
    """
    __args__ = dict()
    __args__['path'] = path
    __args__['recursive'] = recursive
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getDbfsFilePaths:getDbfsFilePaths', __args__, opts=opts, typ=GetDbfsFilePathsResult).value

    return AwaitableGetDbfsFilePathsResult(
        id=pulumi.get(__ret__, 'id'),
        path=pulumi.get(__ret__, 'path'),
        path_lists=pulumi.get(__ret__, 'path_lists'),
        recursive=pulumi.get(__ret__, 'recursive'))


@_utilities.lift_output_func(get_dbfs_file_paths)
def get_dbfs_file_paths_output(path: Optional[pulumi.Input[str]] = None,
                               recursive: Optional[pulumi.Input[bool]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDbfsFilePathsResult]:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    This data source allows to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_databricks as databricks

    partitions = databricks.get_dbfs_file_paths(path="dbfs:/user/hive/default.db/table",
        recursive=False)
    ```
    <!--End PulumiCodeChooser -->

    ## Related Resources

    The following resources are used in the same context:

    * End to end workspace management guide.
    * DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    * get_dbfs_file_paths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    * DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    * Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
    * Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.


    :param str path: Path on DBFS for the file to perform listing
    :param bool recursive: Either or not recursively list all files
    """
    ...
