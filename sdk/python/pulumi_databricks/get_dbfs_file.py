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
    'GetDbfsFileResult',
    'AwaitableGetDbfsFileResult',
    'get_dbfs_file',
    'get_dbfs_file_output',
]

@pulumi.output_type
class GetDbfsFileResult:
    """
    A collection of values returned by getDbfsFile.
    """
    def __init__(__self__, content=None, file_size=None, id=None, limit_file_size=None, path=None):
        if content and not isinstance(content, str):
            raise TypeError("Expected argument 'content' to be a str")
        pulumi.set(__self__, "content", content)
        if file_size and not isinstance(file_size, int):
            raise TypeError("Expected argument 'file_size' to be a int")
        pulumi.set(__self__, "file_size", file_size)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if limit_file_size and not isinstance(limit_file_size, bool):
            raise TypeError("Expected argument 'limit_file_size' to be a bool")
        pulumi.set(__self__, "limit_file_size", limit_file_size)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)

    @property
    @pulumi.getter
    def content(self) -> str:
        """
        base64-encoded file contents
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="fileSize")
    def file_size(self) -> int:
        """
        size of the file in bytes
        """
        return pulumi.get(self, "file_size")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="limitFileSize")
    def limit_file_size(self) -> bool:
        return pulumi.get(self, "limit_file_size")

    @property
    @pulumi.getter
    def path(self) -> str:
        return pulumi.get(self, "path")


class AwaitableGetDbfsFileResult(GetDbfsFileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDbfsFileResult(
            content=self.content,
            file_size=self.file_size,
            id=self.id,
            limit_file_size=self.limit_file_size,
            path=self.path)


def get_dbfs_file(limit_file_size: Optional[bool] = None,
                  path: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDbfsFileResult:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    This data source allows to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_databricks as databricks

    report = databricks.get_dbfs_file(limit_file_size=True,
        path="dbfs:/reports/some.csv")
    ```
    ## Related Resources

    The following resources are used in the same context:

    * End to end workspace management guide.
    * get_dbfs_file_paths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    * DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    * Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.


    :param bool limit_file_size: Do not load content for files larger than 4MB.
    :param str path: Path on DBFS for the file from which to get content.
    """
    __args__ = dict()
    __args__['limitFileSize'] = limit_file_size
    __args__['path'] = path
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getDbfsFile:getDbfsFile', __args__, opts=opts, typ=GetDbfsFileResult).value

    return AwaitableGetDbfsFileResult(
        content=__ret__.content,
        file_size=__ret__.file_size,
        id=__ret__.id,
        limit_file_size=__ret__.limit_file_size,
        path=__ret__.path)


@_utilities.lift_output_func(get_dbfs_file)
def get_dbfs_file_output(limit_file_size: Optional[pulumi.Input[bool]] = None,
                         path: Optional[pulumi.Input[str]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDbfsFileResult]:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    This data source allows to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_databricks as databricks

    report = databricks.get_dbfs_file(limit_file_size=True,
        path="dbfs:/reports/some.csv")
    ```
    ## Related Resources

    The following resources are used in the same context:

    * End to end workspace management guide.
    * get_dbfs_file_paths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    * DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    * Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.


    :param bool limit_file_size: Do not load content for files larger than 4MB.
    :param str path: Path on DBFS for the file from which to get content.
    """
    ...
