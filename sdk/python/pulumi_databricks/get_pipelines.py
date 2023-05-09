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
    'GetPipelinesResult',
    'AwaitableGetPipelinesResult',
    'get_pipelines',
    'get_pipelines_output',
]

@pulumi.output_type
class GetPipelinesResult:
    """
    A collection of values returned by getPipelines.
    """
    def __init__(__self__, id=None, ids=None, pipeline_name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if pipeline_name and not isinstance(pipeline_name, str):
            raise TypeError("Expected argument 'pipeline_name' to be a str")
        pulumi.set(__self__, "pipeline_name", pipeline_name)

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
        List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="pipelineName")
    def pipeline_name(self) -> Optional[str]:
        return pulumi.get(self, "pipeline_name")


class AwaitableGetPipelinesResult(GetPipelinesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPipelinesResult(
            id=self.id,
            ids=self.ids,
            pipeline_name=self.pipeline_name)


def get_pipelines(ids: Optional[Sequence[str]] = None,
                  pipeline_name: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPipelinesResult:
    """
    ## Example Usage

    Get all Delta Live Tables pipelines:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_pipelines()
    pulumi.export("allPipelines", all.ids)
    ```

    Filter Delta Live Tables pipelines by name (exact match):

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_pipelines(pipeline_name="my_pipeline")
    pulumi.export("myPipeline", this.ids)
    ```

    Filter Delta Live Tables pipelines by name (wildcard search):

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_pipelines(pipeline_name="%pipeline%")
    pulumi.export("wildcardPipelines", this.ids)
    ```
    ## Related Resources

    The following resources are used in the same context:

    * End to end workspace management guide.
    * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
    * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
    * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
    * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).


    :param Sequence[str] ids: List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
    :param str pipeline_name: Filter Delta Live Tables pipelines by name for a given search term. `%` is the supported wildcard operator.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['pipelineName'] = pipeline_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getPipelines:getPipelines', __args__, opts=opts, typ=GetPipelinesResult).value

    return AwaitableGetPipelinesResult(
        id=__ret__.id,
        ids=__ret__.ids,
        pipeline_name=__ret__.pipeline_name)


@_utilities.lift_output_func(get_pipelines)
def get_pipelines_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                         pipeline_name: Optional[pulumi.Input[Optional[str]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPipelinesResult]:
    """
    ## Example Usage

    Get all Delta Live Tables pipelines:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_pipelines()
    pulumi.export("allPipelines", all.ids)
    ```

    Filter Delta Live Tables pipelines by name (exact match):

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_pipelines(pipeline_name="my_pipeline")
    pulumi.export("myPipeline", this.ids)
    ```

    Filter Delta Live Tables pipelines by name (wildcard search):

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_pipelines(pipeline_name="%pipeline%")
    pulumi.export("wildcardPipelines", this.ids)
    ```
    ## Related Resources

    The following resources are used in the same context:

    * End to end workspace management guide.
    * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
    * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
    * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
    * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).


    :param Sequence[str] ids: List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
    :param str pipeline_name: Filter Delta Live Tables pipelines by name for a given search term. `%` is the supported wildcard operator.
    """
    ...
