# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['MlflowWebhookArgs', 'MlflowWebhook']

@pulumi.input_type
class MlflowWebhookArgs:
    def __init__(__self__, *,
                 events: pulumi.Input[Sequence[pulumi.Input[str]]],
                 description: Optional[pulumi.Input[str]] = None,
                 http_url_spec: Optional[pulumi.Input['MlflowWebhookHttpUrlSpecArgs']] = None,
                 job_spec: Optional[pulumi.Input['MlflowWebhookJobSpecArgs']] = None,
                 model_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MlflowWebhook resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] events: The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
               
               Configuration must include one of `http_url_spec` or `job_spec` blocks, but not both.
        :param pulumi.Input[str] description: Optional description of the MLflow webhook.
        :param pulumi.Input[str] model_name: Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
        :param pulumi.Input[str] status: Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
        """
        MlflowWebhookArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            events=events,
            description=description,
            http_url_spec=http_url_spec,
            job_spec=job_spec,
            model_name=model_name,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             events: pulumi.Input[Sequence[pulumi.Input[str]]],
             description: Optional[pulumi.Input[str]] = None,
             http_url_spec: Optional[pulumi.Input['MlflowWebhookHttpUrlSpecArgs']] = None,
             job_spec: Optional[pulumi.Input['MlflowWebhookJobSpecArgs']] = None,
             model_name: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("events", events)
        if description is not None:
            _setter("description", description)
        if http_url_spec is not None:
            _setter("http_url_spec", http_url_spec)
        if job_spec is not None:
            _setter("job_spec", job_spec)
        if model_name is not None:
            _setter("model_name", model_name)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter
    def events(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.

        Configuration must include one of `http_url_spec` or `job_spec` blocks, but not both.
        """
        return pulumi.get(self, "events")

    @events.setter
    def events(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "events", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Optional description of the MLflow webhook.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="httpUrlSpec")
    def http_url_spec(self) -> Optional[pulumi.Input['MlflowWebhookHttpUrlSpecArgs']]:
        return pulumi.get(self, "http_url_spec")

    @http_url_spec.setter
    def http_url_spec(self, value: Optional[pulumi.Input['MlflowWebhookHttpUrlSpecArgs']]):
        pulumi.set(self, "http_url_spec", value)

    @property
    @pulumi.getter(name="jobSpec")
    def job_spec(self) -> Optional[pulumi.Input['MlflowWebhookJobSpecArgs']]:
        return pulumi.get(self, "job_spec")

    @job_spec.setter
    def job_spec(self, value: Optional[pulumi.Input['MlflowWebhookJobSpecArgs']]):
        pulumi.set(self, "job_spec", value)

    @property
    @pulumi.getter(name="modelName")
    def model_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
        """
        return pulumi.get(self, "model_name")

    @model_name.setter
    def model_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "model_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _MlflowWebhookState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 http_url_spec: Optional[pulumi.Input['MlflowWebhookHttpUrlSpecArgs']] = None,
                 job_spec: Optional[pulumi.Input['MlflowWebhookJobSpecArgs']] = None,
                 model_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MlflowWebhook resources.
        :param pulumi.Input[str] description: Optional description of the MLflow webhook.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] events: The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
               
               Configuration must include one of `http_url_spec` or `job_spec` blocks, but not both.
        :param pulumi.Input[str] model_name: Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
        :param pulumi.Input[str] status: Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
        """
        _MlflowWebhookState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            events=events,
            http_url_spec=http_url_spec,
            job_spec=job_spec,
            model_name=model_name,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             http_url_spec: Optional[pulumi.Input['MlflowWebhookHttpUrlSpecArgs']] = None,
             job_spec: Optional[pulumi.Input['MlflowWebhookJobSpecArgs']] = None,
             model_name: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if description is not None:
            _setter("description", description)
        if events is not None:
            _setter("events", events)
        if http_url_spec is not None:
            _setter("http_url_spec", http_url_spec)
        if job_spec is not None:
            _setter("job_spec", job_spec)
        if model_name is not None:
            _setter("model_name", model_name)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Optional description of the MLflow webhook.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def events(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.

        Configuration must include one of `http_url_spec` or `job_spec` blocks, but not both.
        """
        return pulumi.get(self, "events")

    @events.setter
    def events(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "events", value)

    @property
    @pulumi.getter(name="httpUrlSpec")
    def http_url_spec(self) -> Optional[pulumi.Input['MlflowWebhookHttpUrlSpecArgs']]:
        return pulumi.get(self, "http_url_spec")

    @http_url_spec.setter
    def http_url_spec(self, value: Optional[pulumi.Input['MlflowWebhookHttpUrlSpecArgs']]):
        pulumi.set(self, "http_url_spec", value)

    @property
    @pulumi.getter(name="jobSpec")
    def job_spec(self) -> Optional[pulumi.Input['MlflowWebhookJobSpecArgs']]:
        return pulumi.get(self, "job_spec")

    @job_spec.setter
    def job_spec(self, value: Optional[pulumi.Input['MlflowWebhookJobSpecArgs']]):
        pulumi.set(self, "job_spec", value)

    @property
    @pulumi.getter(name="modelName")
    def model_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
        """
        return pulumi.get(self, "model_name")

    @model_name.setter
    def model_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "model_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class MlflowWebhook(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 http_url_spec: Optional[pulumi.Input[pulumi.InputType['MlflowWebhookHttpUrlSpecArgs']]] = None,
                 job_spec: Optional[pulumi.Input[pulumi.InputType['MlflowWebhookJobSpecArgs']]] = None,
                 model_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource allows you to create [MLflow Model Registry Webhooks](https://docs.databricks.com/applications/mlflow/model-registry-webhooks.html) in Databricks.  Webhooks enable you to listen for Model Registry events so your integrations can automatically trigger actions. You can use webhooks to automate and integrate your machine learning pipeline with existing CI/CD tools and workflows. Webhooks allow trigger execution of a Databricks job or call a web service on specific event(s) that is generated in the MLflow Registry - stage transitioning, creation of registered model, creation of transition request, etc.

        ## Example Usage
        ### POSTing to URL

        ```python
        import pulumi
        import pulumi_databricks as databricks

        url = databricks.MlflowWebhook("url",
            description="URL webhook trigger",
            events=["TRANSITION_REQUEST_CREATED"],
            http_url_spec=databricks.MlflowWebhookHttpUrlSpecArgs(
                url="https://my_cool_host/webhook",
            ))
        ```
        ## Access Control

        * MLflow webhooks could be configured only by workspace admins.

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
        * MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
        * MlflowModel to create [MLflow models](https://docs.databricks.com/applications/mlflow/models.html) in Databricks.
        * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
        * Notebook data to export a notebook from Databricks Workspace.
        * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Optional description of the MLflow webhook.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] events: The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
               
               Configuration must include one of `http_url_spec` or `job_spec` blocks, but not both.
        :param pulumi.Input[str] model_name: Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
        :param pulumi.Input[str] status: Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MlflowWebhookArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to create [MLflow Model Registry Webhooks](https://docs.databricks.com/applications/mlflow/model-registry-webhooks.html) in Databricks.  Webhooks enable you to listen for Model Registry events so your integrations can automatically trigger actions. You can use webhooks to automate and integrate your machine learning pipeline with existing CI/CD tools and workflows. Webhooks allow trigger execution of a Databricks job or call a web service on specific event(s) that is generated in the MLflow Registry - stage transitioning, creation of registered model, creation of transition request, etc.

        ## Example Usage
        ### POSTing to URL

        ```python
        import pulumi
        import pulumi_databricks as databricks

        url = databricks.MlflowWebhook("url",
            description="URL webhook trigger",
            events=["TRANSITION_REQUEST_CREATED"],
            http_url_spec=databricks.MlflowWebhookHttpUrlSpecArgs(
                url="https://my_cool_host/webhook",
            ))
        ```
        ## Access Control

        * MLflow webhooks could be configured only by workspace admins.

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
        * MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
        * MlflowModel to create [MLflow models](https://docs.databricks.com/applications/mlflow/models.html) in Databricks.
        * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
        * Notebook data to export a notebook from Databricks Workspace.
        * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param MlflowWebhookArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MlflowWebhookArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            MlflowWebhookArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 http_url_spec: Optional[pulumi.Input[pulumi.InputType['MlflowWebhookHttpUrlSpecArgs']]] = None,
                 job_spec: Optional[pulumi.Input[pulumi.InputType['MlflowWebhookJobSpecArgs']]] = None,
                 model_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MlflowWebhookArgs.__new__(MlflowWebhookArgs)

            __props__.__dict__["description"] = description
            if events is None and not opts.urn:
                raise TypeError("Missing required property 'events'")
            __props__.__dict__["events"] = events
            if http_url_spec is not None and not isinstance(http_url_spec, MlflowWebhookHttpUrlSpecArgs):
                http_url_spec = http_url_spec or {}
                def _setter(key, value):
                    http_url_spec[key] = value
                MlflowWebhookHttpUrlSpecArgs._configure(_setter, **http_url_spec)
            __props__.__dict__["http_url_spec"] = http_url_spec
            if job_spec is not None and not isinstance(job_spec, MlflowWebhookJobSpecArgs):
                job_spec = job_spec or {}
                def _setter(key, value):
                    job_spec[key] = value
                MlflowWebhookJobSpecArgs._configure(_setter, **job_spec)
            __props__.__dict__["job_spec"] = job_spec
            __props__.__dict__["model_name"] = model_name
            __props__.__dict__["status"] = status
        super(MlflowWebhook, __self__).__init__(
            'databricks:index/mlflowWebhook:MlflowWebhook',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            http_url_spec: Optional[pulumi.Input[pulumi.InputType['MlflowWebhookHttpUrlSpecArgs']]] = None,
            job_spec: Optional[pulumi.Input[pulumi.InputType['MlflowWebhookJobSpecArgs']]] = None,
            model_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'MlflowWebhook':
        """
        Get an existing MlflowWebhook resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Optional description of the MLflow webhook.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] events: The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
               
               Configuration must include one of `http_url_spec` or `job_spec` blocks, but not both.
        :param pulumi.Input[str] model_name: Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
        :param pulumi.Input[str] status: Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MlflowWebhookState.__new__(_MlflowWebhookState)

        __props__.__dict__["description"] = description
        __props__.__dict__["events"] = events
        __props__.__dict__["http_url_spec"] = http_url_spec
        __props__.__dict__["job_spec"] = job_spec
        __props__.__dict__["model_name"] = model_name
        __props__.__dict__["status"] = status
        return MlflowWebhook(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Optional description of the MLflow webhook.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def events(self) -> pulumi.Output[Sequence[str]]:
        """
        The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.

        Configuration must include one of `http_url_spec` or `job_spec` blocks, but not both.
        """
        return pulumi.get(self, "events")

    @property
    @pulumi.getter(name="httpUrlSpec")
    def http_url_spec(self) -> pulumi.Output[Optional['outputs.MlflowWebhookHttpUrlSpec']]:
        return pulumi.get(self, "http_url_spec")

    @property
    @pulumi.getter(name="jobSpec")
    def job_spec(self) -> pulumi.Output[Optional['outputs.MlflowWebhookJobSpec']]:
        return pulumi.get(self, "job_spec")

    @property
    @pulumi.getter(name="modelName")
    def model_name(self) -> pulumi.Output[Optional[str]]:
        """
        Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
        """
        return pulumi.get(self, "model_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[str]]:
        """
        Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
        """
        return pulumi.get(self, "status")

