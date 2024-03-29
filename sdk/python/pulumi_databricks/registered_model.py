# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RegisteredModelArgs', 'RegisteredModel']

@pulumi.input_type
class RegisteredModelArgs:
    def __init__(__self__, *,
                 catalog_name: pulumi.Input[str],
                 schema_name: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 storage_location: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a RegisteredModel resource.
        :param pulumi.Input[str] catalog_name: The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
        :param pulumi.Input[str] schema_name: The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
        :param pulumi.Input[str] comment: The comment attached to the registered model.
        :param pulumi.Input[str] name: The name of the registered model.  *Change of this parameter forces recreation of the resource.*
        :param pulumi.Input[str] owner: Name of the registered model owner.
        :param pulumi.Input[str] storage_location: The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
        """
        pulumi.set(__self__, "catalog_name", catalog_name)
        pulumi.set(__self__, "schema_name", schema_name)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if storage_location is not None:
            pulumi.set(__self__, "storage_location", storage_location)

    @property
    @pulumi.getter(name="catalogName")
    def catalog_name(self) -> pulumi.Input[str]:
        """
        The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
        """
        return pulumi.get(self, "catalog_name")

    @catalog_name.setter
    def catalog_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "catalog_name", value)

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> pulumi.Input[str]:
        """
        The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
        """
        return pulumi.get(self, "schema_name")

    @schema_name.setter
    def schema_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema_name", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        The comment attached to the registered model.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the registered model.  *Change of this parameter forces recreation of the resource.*
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the registered model owner.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter(name="storageLocation")
    def storage_location(self) -> Optional[pulumi.Input[str]]:
        """
        The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
        """
        return pulumi.get(self, "storage_location")

    @storage_location.setter
    def storage_location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_location", value)


@pulumi.input_type
class _RegisteredModelState:
    def __init__(__self__, *,
                 catalog_name: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 storage_location: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RegisteredModel resources.
        :param pulumi.Input[str] catalog_name: The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
        :param pulumi.Input[str] comment: The comment attached to the registered model.
        :param pulumi.Input[str] name: The name of the registered model.  *Change of this parameter forces recreation of the resource.*
        :param pulumi.Input[str] owner: Name of the registered model owner.
        :param pulumi.Input[str] schema_name: The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
        :param pulumi.Input[str] storage_location: The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
        """
        if catalog_name is not None:
            pulumi.set(__self__, "catalog_name", catalog_name)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if schema_name is not None:
            pulumi.set(__self__, "schema_name", schema_name)
        if storage_location is not None:
            pulumi.set(__self__, "storage_location", storage_location)

    @property
    @pulumi.getter(name="catalogName")
    def catalog_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
        """
        return pulumi.get(self, "catalog_name")

    @catalog_name.setter
    def catalog_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "catalog_name", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        The comment attached to the registered model.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the registered model.  *Change of this parameter forces recreation of the resource.*
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the registered model owner.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
        """
        return pulumi.get(self, "schema_name")

    @schema_name.setter
    def schema_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema_name", value)

    @property
    @pulumi.getter(name="storageLocation")
    def storage_location(self) -> Optional[pulumi.Input[str]]:
        """
        The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
        """
        return pulumi.get(self, "storage_location")

    @storage_location.setter
    def storage_location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_location", value)


class RegisteredModel(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catalog_name: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 storage_location: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **Note** This resource could be only used with workspace-level provider!

        This resource allows you to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.RegisteredModel("this",
            catalog_name="main",
            schema_name="default")
        ```
        <!--End PulumiCodeChooser -->

        ## Access Control

        * Grants can be used to grant principals `ALL_PRIVILEGES`, `APPLY_TAG`, and `EXECUTE` privileges.

        ## Related Resources

        The following resources are often used in the same context:

        * ModelServing to serve this model on a Databricks serving endpoint.
        * MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
        * Table data to manage tables within Unity Catalog.
        * Schema data to manage schemas within Unity Catalog.
        * Catalog data to manage catalogs within Unity Catalog.

        ## Import

        The registered model resource can be imported using the full (3-level) name of the model.

        bash

        ```sh
        $ pulumi import databricks:index/registeredModel:RegisteredModel this <catalog_name.schema_name.model_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] catalog_name: The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
        :param pulumi.Input[str] comment: The comment attached to the registered model.
        :param pulumi.Input[str] name: The name of the registered model.  *Change of this parameter forces recreation of the resource.*
        :param pulumi.Input[str] owner: Name of the registered model owner.
        :param pulumi.Input[str] schema_name: The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
        :param pulumi.Input[str] storage_location: The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RegisteredModelArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Note** This resource could be only used with workspace-level provider!

        This resource allows you to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.RegisteredModel("this",
            catalog_name="main",
            schema_name="default")
        ```
        <!--End PulumiCodeChooser -->

        ## Access Control

        * Grants can be used to grant principals `ALL_PRIVILEGES`, `APPLY_TAG`, and `EXECUTE` privileges.

        ## Related Resources

        The following resources are often used in the same context:

        * ModelServing to serve this model on a Databricks serving endpoint.
        * MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
        * Table data to manage tables within Unity Catalog.
        * Schema data to manage schemas within Unity Catalog.
        * Catalog data to manage catalogs within Unity Catalog.

        ## Import

        The registered model resource can be imported using the full (3-level) name of the model.

        bash

        ```sh
        $ pulumi import databricks:index/registeredModel:RegisteredModel this <catalog_name.schema_name.model_name>
        ```

        :param str resource_name: The name of the resource.
        :param RegisteredModelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RegisteredModelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catalog_name: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 storage_location: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RegisteredModelArgs.__new__(RegisteredModelArgs)

            if catalog_name is None and not opts.urn:
                raise TypeError("Missing required property 'catalog_name'")
            __props__.__dict__["catalog_name"] = catalog_name
            __props__.__dict__["comment"] = comment
            __props__.__dict__["name"] = name
            __props__.__dict__["owner"] = owner
            if schema_name is None and not opts.urn:
                raise TypeError("Missing required property 'schema_name'")
            __props__.__dict__["schema_name"] = schema_name
            __props__.__dict__["storage_location"] = storage_location
        super(RegisteredModel, __self__).__init__(
            'databricks:index/registeredModel:RegisteredModel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            catalog_name: Optional[pulumi.Input[str]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner: Optional[pulumi.Input[str]] = None,
            schema_name: Optional[pulumi.Input[str]] = None,
            storage_location: Optional[pulumi.Input[str]] = None) -> 'RegisteredModel':
        """
        Get an existing RegisteredModel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] catalog_name: The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
        :param pulumi.Input[str] comment: The comment attached to the registered model.
        :param pulumi.Input[str] name: The name of the registered model.  *Change of this parameter forces recreation of the resource.*
        :param pulumi.Input[str] owner: Name of the registered model owner.
        :param pulumi.Input[str] schema_name: The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
        :param pulumi.Input[str] storage_location: The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RegisteredModelState.__new__(_RegisteredModelState)

        __props__.__dict__["catalog_name"] = catalog_name
        __props__.__dict__["comment"] = comment
        __props__.__dict__["name"] = name
        __props__.__dict__["owner"] = owner
        __props__.__dict__["schema_name"] = schema_name
        __props__.__dict__["storage_location"] = storage_location
        return RegisteredModel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="catalogName")
    def catalog_name(self) -> pulumi.Output[str]:
        """
        The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
        """
        return pulumi.get(self, "catalog_name")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        The comment attached to the registered model.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the registered model.  *Change of this parameter forces recreation of the resource.*
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[str]:
        """
        Name of the registered model owner.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> pulumi.Output[str]:
        """
        The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
        """
        return pulumi.get(self, "schema_name")

    @property
    @pulumi.getter(name="storageLocation")
    def storage_location(self) -> pulumi.Output[str]:
        """
        The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
        """
        return pulumi.get(self, "storage_location")

