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
    'GetNotebookResult',
    'AwaitableGetNotebookResult',
    'get_notebook',
    'get_notebook_output',
]

@pulumi.output_type
class GetNotebookResult:
    """
    A collection of values returned by getNotebook.
    """
    def __init__(__self__, content=None, format=None, id=None, language=None, object_id=None, object_type=None, path=None):
        if content and not isinstance(content, str):
            raise TypeError("Expected argument 'content' to be a str")
        pulumi.set(__self__, "content", content)
        if format and not isinstance(format, str):
            raise TypeError("Expected argument 'format' to be a str")
        pulumi.set(__self__, "format", format)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if language and not isinstance(language, str):
            raise TypeError("Expected argument 'language' to be a str")
        pulumi.set(__self__, "language", language)
        if object_id and not isinstance(object_id, int):
            raise TypeError("Expected argument 'object_id' to be a int")
        pulumi.set(__self__, "object_id", object_id)
        if object_type and not isinstance(object_type, str):
            raise TypeError("Expected argument 'object_type' to be a str")
        pulumi.set(__self__, "object_type", object_type)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)

    @property
    @pulumi.getter
    def content(self) -> str:
        """
        notebook content in selected format
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def format(self) -> str:
        return pulumi.get(self, "format")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def language(self) -> str:
        """
        notebook language
        """
        return pulumi.get(self, "language")

    @property
    @pulumi.getter(name="objectId")
    def object_id(self) -> int:
        """
        notebook object ID
        """
        return pulumi.get(self, "object_id")

    @property
    @pulumi.getter(name="objectType")
    def object_type(self) -> str:
        """
        notebook object type
        """
        return pulumi.get(self, "object_type")

    @property
    @pulumi.getter
    def path(self) -> str:
        return pulumi.get(self, "path")


class AwaitableGetNotebookResult(GetNotebookResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNotebookResult(
            content=self.content,
            format=self.format,
            id=self.id,
            language=self.language,
            object_id=self.object_id,
            object_type=self.object_type,
            path=self.path)


def get_notebook(format: Optional[str] = None,
                 language: Optional[str] = None,
                 object_id: Optional[int] = None,
                 object_type: Optional[str] = None,
                 path: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNotebookResult:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    This data source allows to export a notebook from Databricks Workspace.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_databricks as databricks

    features = databricks.get_notebook(path="/Production/Features",
        format="SOURCE")
    ```
    <!--End PulumiCodeChooser -->


    :param str format: Notebook format to export. Either `SOURCE`, `HTML`, `JUPYTER`, or `DBC`.
    :param str language: notebook language
    :param int object_id: notebook object ID
    :param str object_type: notebook object type
    :param str path: Notebook path on the workspace
    """
    __args__ = dict()
    __args__['format'] = format
    __args__['language'] = language
    __args__['objectId'] = object_id
    __args__['objectType'] = object_type
    __args__['path'] = path
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getNotebook:getNotebook', __args__, opts=opts, typ=GetNotebookResult).value

    return AwaitableGetNotebookResult(
        content=pulumi.get(__ret__, 'content'),
        format=pulumi.get(__ret__, 'format'),
        id=pulumi.get(__ret__, 'id'),
        language=pulumi.get(__ret__, 'language'),
        object_id=pulumi.get(__ret__, 'object_id'),
        object_type=pulumi.get(__ret__, 'object_type'),
        path=pulumi.get(__ret__, 'path'))


@_utilities.lift_output_func(get_notebook)
def get_notebook_output(format: Optional[pulumi.Input[str]] = None,
                        language: Optional[pulumi.Input[Optional[str]]] = None,
                        object_id: Optional[pulumi.Input[Optional[int]]] = None,
                        object_type: Optional[pulumi.Input[Optional[str]]] = None,
                        path: Optional[pulumi.Input[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNotebookResult]:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    This data source allows to export a notebook from Databricks Workspace.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_databricks as databricks

    features = databricks.get_notebook(path="/Production/Features",
        format="SOURCE")
    ```
    <!--End PulumiCodeChooser -->


    :param str format: Notebook format to export. Either `SOURCE`, `HTML`, `JUPYTER`, or `DBC`.
    :param str language: notebook language
    :param int object_id: notebook object ID
    :param str object_type: notebook object type
    :param str path: Notebook path on the workspace
    """
    ...
