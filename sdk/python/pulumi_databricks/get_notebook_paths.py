# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetNotebookPathsResult',
    'AwaitableGetNotebookPathsResult',
    'get_notebook_paths',
    'get_notebook_paths_output',
]

@pulumi.output_type
class GetNotebookPathsResult:
    """
    A collection of values returned by getNotebookPaths.
    """
    def __init__(__self__, id=None, notebook_path_lists=None, path=None, recursive=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if notebook_path_lists and not isinstance(notebook_path_lists, list):
            raise TypeError("Expected argument 'notebook_path_lists' to be a list")
        pulumi.set(__self__, "notebook_path_lists", notebook_path_lists)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)
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
    @pulumi.getter(name="notebookPathLists")
    def notebook_path_lists(self) -> Sequence['outputs.GetNotebookPathsNotebookPathListResult']:
        """
        list of objects with `path` and `language` attributes
        """
        return pulumi.get(self, "notebook_path_lists")

    @property
    @pulumi.getter
    def path(self) -> str:
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def recursive(self) -> bool:
        return pulumi.get(self, "recursive")


class AwaitableGetNotebookPathsResult(GetNotebookPathsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNotebookPathsResult(
            id=self.id,
            notebook_path_lists=self.notebook_path_lists,
            path=self.path,
            recursive=self.recursive)


def get_notebook_paths(path: Optional[str] = None,
                       recursive: Optional[bool] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNotebookPathsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_databricks as databricks

    prod = databricks.get_notebook_paths(path="/Production",
        recursive=True)
    ```


    :param str path: Path to workspace directory
    :param bool recursive: Either or recursively walk given path
    """
    __args__ = dict()
    __args__['path'] = path
    __args__['recursive'] = recursive
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('databricks:index/getNotebookPaths:getNotebookPaths', __args__, opts=opts, typ=GetNotebookPathsResult).value

    return AwaitableGetNotebookPathsResult(
        id=__ret__.id,
        notebook_path_lists=__ret__.notebook_path_lists,
        path=__ret__.path,
        recursive=__ret__.recursive)


@_utilities.lift_output_func(get_notebook_paths)
def get_notebook_paths_output(path: Optional[pulumi.Input[str]] = None,
                              recursive: Optional[pulumi.Input[bool]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNotebookPathsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_databricks as databricks

    prod = databricks.get_notebook_paths(path="/Production",
        recursive=True)
    ```


    :param str path: Path to workspace directory
    :param bool recursive: Either or recursively walk given path
    """
    ...
