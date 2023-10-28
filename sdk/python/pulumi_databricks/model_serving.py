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

__all__ = ['ModelServingArgs', 'ModelServing']

@pulumi.input_type
class ModelServingArgs:
    def __init__(__self__, *,
                 config: pulumi.Input['ModelServingConfigArgs'],
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['ModelServingTagArgs']]]] = None):
        """
        The set of arguments for constructing a ModelServing resource.
        :param pulumi.Input['ModelServingConfigArgs'] config: The model serving endpoint configuration.
        :param pulumi.Input[str] name: The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
        """
        pulumi.set(__self__, "config", config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Input['ModelServingConfigArgs']:
        """
        The model serving endpoint configuration.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: pulumi.Input['ModelServingConfigArgs']):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ModelServingTagArgs']]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ModelServingTagArgs']]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ModelServingState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input['ModelServingConfigArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 serving_endpoint_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['ModelServingTagArgs']]]] = None):
        """
        Input properties used for looking up and filtering ModelServing resources.
        :param pulumi.Input['ModelServingConfigArgs'] config: The model serving endpoint configuration.
        :param pulumi.Input[str] name: The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
        :param pulumi.Input[str] serving_endpoint_id: Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if serving_endpoint_id is not None:
            pulumi.set(__self__, "serving_endpoint_id", serving_endpoint_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['ModelServingConfigArgs']]:
        """
        The model serving endpoint configuration.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['ModelServingConfigArgs']]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="servingEndpointId")
    def serving_endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
        """
        return pulumi.get(self, "serving_endpoint_id")

    @serving_endpoint_id.setter
    def serving_endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "serving_endpoint_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ModelServingTagArgs']]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ModelServingTagArgs']]]]):
        pulumi.set(self, "tags", value)


class ModelServing(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[pulumi.InputType['ModelServingConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ModelServingTagArgs']]]]] = None,
                 __props__=None):
        """
        This resource allows you to manage [Model Serving](https://docs.databricks.com/machine-learning/model-serving/index.html) endpoints in Databricks.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.ModelServing("this", config=databricks.ModelServingConfigArgs(
            served_models=[
                databricks.ModelServingConfigServedModelArgs(
                    model_name="ads-model",
                    model_version="2",
                    name="prod_model",
                    scale_to_zero_enabled=True,
                    workload_size="Small",
                ),
                databricks.ModelServingConfigServedModelArgs(
                    model_name="ads-model",
                    model_version="4",
                    name="candidate_model",
                    scale_to_zero_enabled=False,
                    workload_size="Small",
                ),
            ],
            traffic_config=databricks.ModelServingConfigTrafficConfigArgs(
                routes=[
                    databricks.ModelServingConfigTrafficConfigRouteArgs(
                        served_model_name="prod_model",
                        traffic_percentage=90,
                    ),
                    databricks.ModelServingConfigTrafficConfigRouteArgs(
                        served_model_name="candidate_model",
                        traffic_percentage=10,
                    ),
                ],
            ),
        ))
        ```
        ## Access Control

        * Permissions can control which groups or individual users can *Manage*, *Query* or *View* individual serving endpoints.

        ## Related Resources

        The following resources are often used in the same context:

        * RegisteredModel to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
        * End to end workspace management guide.
        * Directory to manage directories in [Databricks Workspace](https://docs.databricks.com/workspace/workspace-objects.html).
        * MlflowModel to create models in the [workspace model registry](https://docs.databricks.com/en/mlflow/model-registry.html) in Databricks.
        * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
        * Notebook data to export a notebook from Databricks Workspace.
        * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).

        ## Import

        The model serving resource can be imported using the name of the endpoint. bash

        ```sh
         $ pulumi import databricks:index/modelServing:ModelServing this <model-serving-endpoint-name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ModelServingConfigArgs']] config: The model serving endpoint configuration.
        :param pulumi.Input[str] name: The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ModelServingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to manage [Model Serving](https://docs.databricks.com/machine-learning/model-serving/index.html) endpoints in Databricks.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.ModelServing("this", config=databricks.ModelServingConfigArgs(
            served_models=[
                databricks.ModelServingConfigServedModelArgs(
                    model_name="ads-model",
                    model_version="2",
                    name="prod_model",
                    scale_to_zero_enabled=True,
                    workload_size="Small",
                ),
                databricks.ModelServingConfigServedModelArgs(
                    model_name="ads-model",
                    model_version="4",
                    name="candidate_model",
                    scale_to_zero_enabled=False,
                    workload_size="Small",
                ),
            ],
            traffic_config=databricks.ModelServingConfigTrafficConfigArgs(
                routes=[
                    databricks.ModelServingConfigTrafficConfigRouteArgs(
                        served_model_name="prod_model",
                        traffic_percentage=90,
                    ),
                    databricks.ModelServingConfigTrafficConfigRouteArgs(
                        served_model_name="candidate_model",
                        traffic_percentage=10,
                    ),
                ],
            ),
        ))
        ```
        ## Access Control

        * Permissions can control which groups or individual users can *Manage*, *Query* or *View* individual serving endpoints.

        ## Related Resources

        The following resources are often used in the same context:

        * RegisteredModel to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
        * End to end workspace management guide.
        * Directory to manage directories in [Databricks Workspace](https://docs.databricks.com/workspace/workspace-objects.html).
        * MlflowModel to create models in the [workspace model registry](https://docs.databricks.com/en/mlflow/model-registry.html) in Databricks.
        * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
        * Notebook data to export a notebook from Databricks Workspace.
        * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).

        ## Import

        The model serving resource can be imported using the name of the endpoint. bash

        ```sh
         $ pulumi import databricks:index/modelServing:ModelServing this <model-serving-endpoint-name>
        ```

        :param str resource_name: The name of the resource.
        :param ModelServingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ModelServingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[pulumi.InputType['ModelServingConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ModelServingTagArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ModelServingArgs.__new__(ModelServingArgs)

            if config is None and not opts.urn:
                raise TypeError("Missing required property 'config'")
            __props__.__dict__["config"] = config
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["serving_endpoint_id"] = None
        super(ModelServing, __self__).__init__(
            'databricks:index/modelServing:ModelServing',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[pulumi.InputType['ModelServingConfigArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            serving_endpoint_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ModelServingTagArgs']]]]] = None) -> 'ModelServing':
        """
        Get an existing ModelServing resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ModelServingConfigArgs']] config: The model serving endpoint configuration.
        :param pulumi.Input[str] name: The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
        :param pulumi.Input[str] serving_endpoint_id: Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ModelServingState.__new__(_ModelServingState)

        __props__.__dict__["config"] = config
        __props__.__dict__["name"] = name
        __props__.__dict__["serving_endpoint_id"] = serving_endpoint_id
        __props__.__dict__["tags"] = tags
        return ModelServing(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output['outputs.ModelServingConfig']:
        """
        The model serving endpoint configuration.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="servingEndpointId")
    def serving_endpoint_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
        """
        return pulumi.get(self, "serving_endpoint_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.ModelServingTag']]]:
        return pulumi.get(self, "tags")

