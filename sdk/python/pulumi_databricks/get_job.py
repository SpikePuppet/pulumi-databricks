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
    'GetJobResult',
    'AwaitableGetJobResult',
    'get_job',
    'get_job_output',
]

@pulumi.output_type
class GetJobResult:
    """
    A collection of values returned by getJob.
    """
    def __init__(__self__, id=None, job_id=None, job_name=None, job_settings=None, name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if job_id and not isinstance(job_id, str):
            raise TypeError("Expected argument 'job_id' to be a str")
        pulumi.set(__self__, "job_id", job_id)
        if job_name and not isinstance(job_name, str):
            raise TypeError("Expected argument 'job_name' to be a str")
        pulumi.set(__self__, "job_name", job_name)
        if job_settings and not isinstance(job_settings, dict):
            raise TypeError("Expected argument 'job_settings' to be a dict")
        pulumi.set(__self__, "job_settings", job_settings)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        the id of Job if the resource was matched by name.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="jobId")
    def job_id(self) -> str:
        return pulumi.get(self, "job_id")

    @property
    @pulumi.getter(name="jobName")
    def job_name(self) -> str:
        return pulumi.get(self, "job_name")

    @property
    @pulumi.getter(name="jobSettings")
    def job_settings(self) -> 'outputs.GetJobJobSettingsResult':
        """
        the same fields as in databricks_job.
        """
        return pulumi.get(self, "job_settings")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        the job name of Job if the resource was matched by id.
        """
        return pulumi.get(self, "name")


class AwaitableGetJobResult(GetJobResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetJobResult(
            id=self.id,
            job_id=self.job_id,
            job_name=self.job_name,
            job_settings=self.job_settings,
            name=self.name)


def get_job(id: Optional[str] = None,
            job_id: Optional[str] = None,
            job_name: Optional[str] = None,
            job_settings: Optional[pulumi.InputType['GetJobJobSettingsArgs']] = None,
            name: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetJobResult:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    Retrieves the settings of Job by name or by id. Complements the feature of the get_jobs data source.

    ## Example Usage

    Getting the existing cluster id of specific Job by name or by id:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_job(job_name="My job")
    pulumi.export("jobNumWorkers", this.job_settings.settings.new_cluster.num_workers)
    ```
    ## Related Resources

    The following resources are used in the same context:

    * get_jobs data to get all jobs and their names from a workspace.
    * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.


    :param str id: the id of Job if the resource was matched by name.
    :param pulumi.InputType['GetJobJobSettingsArgs'] job_settings: the same fields as in databricks_job.
    :param str name: the job name of Job if the resource was matched by id.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['jobId'] = job_id
    __args__['jobName'] = job_name
    __args__['jobSettings'] = job_settings
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getJob:getJob', __args__, opts=opts, typ=GetJobResult).value

    return AwaitableGetJobResult(
        id=__ret__.id,
        job_id=__ret__.job_id,
        job_name=__ret__.job_name,
        job_settings=__ret__.job_settings,
        name=__ret__.name)


@_utilities.lift_output_func(get_job)
def get_job_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                   job_id: Optional[pulumi.Input[Optional[str]]] = None,
                   job_name: Optional[pulumi.Input[Optional[str]]] = None,
                   job_settings: Optional[pulumi.Input[Optional[pulumi.InputType['GetJobJobSettingsArgs']]]] = None,
                   name: Optional[pulumi.Input[Optional[str]]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetJobResult]:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    Retrieves the settings of Job by name or by id. Complements the feature of the get_jobs data source.

    ## Example Usage

    Getting the existing cluster id of specific Job by name or by id:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_job(job_name="My job")
    pulumi.export("jobNumWorkers", this.job_settings.settings.new_cluster.num_workers)
    ```
    ## Related Resources

    The following resources are used in the same context:

    * get_jobs data to get all jobs and their names from a workspace.
    * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.


    :param str id: the id of Job if the resource was matched by name.
    :param pulumi.InputType['GetJobJobSettingsArgs'] job_settings: the same fields as in databricks_job.
    :param str name: the job name of Job if the resource was matched by id.
    """
    ...
