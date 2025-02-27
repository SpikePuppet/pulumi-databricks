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
    'GetClustersResult',
    'AwaitableGetClustersResult',
    'get_clusters',
    'get_clusters_output',
]

@pulumi.output_type
class GetClustersResult:
    """
    A collection of values returned by getClusters.
    """
    def __init__(__self__, cluster_name_contains=None, id=None, ids=None):
        if cluster_name_contains and not isinstance(cluster_name_contains, str):
            raise TypeError("Expected argument 'cluster_name_contains' to be a str")
        pulumi.set(__self__, "cluster_name_contains", cluster_name_contains)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)

    @property
    @pulumi.getter(name="clusterNameContains")
    def cluster_name_contains(self) -> Optional[str]:
        return pulumi.get(self, "cluster_name_contains")

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
        list of Cluster ids
        """
        return pulumi.get(self, "ids")


class AwaitableGetClustersResult(GetClustersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClustersResult(
            cluster_name_contains=self.cluster_name_contains,
            id=self.id,
            ids=self.ids)


def get_clusters(cluster_name_contains: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClustersResult:
    """
    ## Example Usage

    Retrieve cluster IDs for all clusters:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_clusters()
    ```

    Retrieve cluster IDs for all clusters having "Shared" in the cluster name:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all_shared = databricks.get_clusters(cluster_name_contains="shared")
    ```

    ## Related Resources

    The following resources are used in the same context:

    * End to end workspace management guide.
    * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
    * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
    * InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
    * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
    * Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
    * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).


    :param str cluster_name_contains: Only return Cluster ids that match the given name string.
    """
    __args__ = dict()
    __args__['clusterNameContains'] = cluster_name_contains
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getClusters:getClusters', __args__, opts=opts, typ=GetClustersResult).value

    return AwaitableGetClustersResult(
        cluster_name_contains=pulumi.get(__ret__, 'cluster_name_contains'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'))


@_utilities.lift_output_func(get_clusters)
def get_clusters_output(cluster_name_contains: Optional[pulumi.Input[Optional[str]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClustersResult]:
    """
    ## Example Usage

    Retrieve cluster IDs for all clusters:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_clusters()
    ```

    Retrieve cluster IDs for all clusters having "Shared" in the cluster name:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all_shared = databricks.get_clusters(cluster_name_contains="shared")
    ```

    ## Related Resources

    The following resources are used in the same context:

    * End to end workspace management guide.
    * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
    * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
    * InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
    * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
    * Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
    * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).


    :param str cluster_name_contains: Only return Cluster ids that match the given name string.
    """
    ...
