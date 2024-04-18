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

__all__ = ['SecretScopeArgs', 'SecretScope']

@pulumi.input_type
class SecretScopeArgs:
    def __init__(__self__, *,
                 backend_type: Optional[pulumi.Input[str]] = None,
                 initial_manage_principal: Optional[pulumi.Input[str]] = None,
                 keyvault_metadata: Optional[pulumi.Input['SecretScopeKeyvaultMetadataArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SecretScope resource.
        :param pulumi.Input[str] backend_type: Either `DATABRICKS` or `AZURE_KEYVAULT`
        :param pulumi.Input[str] initial_manage_principal: The principal with the only possible value `users` that is initially granted `MANAGE` permission to the created scope.  If it's omitted, then the SecretAcl with `MANAGE` permission applied to the scope is assigned to the API request issuer's user identity (see [documentation](https://docs.databricks.com/dev-tools/api/latest/secrets.html#create-secret-scope)). This part of the state cannot be imported.
        :param pulumi.Input[str] name: Scope name requested by the user. Must be unique within a workspace. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        if backend_type is not None:
            pulumi.set(__self__, "backend_type", backend_type)
        if initial_manage_principal is not None:
            pulumi.set(__self__, "initial_manage_principal", initial_manage_principal)
        if keyvault_metadata is not None:
            pulumi.set(__self__, "keyvault_metadata", keyvault_metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="backendType")
    def backend_type(self) -> Optional[pulumi.Input[str]]:
        """
        Either `DATABRICKS` or `AZURE_KEYVAULT`
        """
        return pulumi.get(self, "backend_type")

    @backend_type.setter
    def backend_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backend_type", value)

    @property
    @pulumi.getter(name="initialManagePrincipal")
    def initial_manage_principal(self) -> Optional[pulumi.Input[str]]:
        """
        The principal with the only possible value `users` that is initially granted `MANAGE` permission to the created scope.  If it's omitted, then the SecretAcl with `MANAGE` permission applied to the scope is assigned to the API request issuer's user identity (see [documentation](https://docs.databricks.com/dev-tools/api/latest/secrets.html#create-secret-scope)). This part of the state cannot be imported.
        """
        return pulumi.get(self, "initial_manage_principal")

    @initial_manage_principal.setter
    def initial_manage_principal(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "initial_manage_principal", value)

    @property
    @pulumi.getter(name="keyvaultMetadata")
    def keyvault_metadata(self) -> Optional[pulumi.Input['SecretScopeKeyvaultMetadataArgs']]:
        return pulumi.get(self, "keyvault_metadata")

    @keyvault_metadata.setter
    def keyvault_metadata(self, value: Optional[pulumi.Input['SecretScopeKeyvaultMetadataArgs']]):
        pulumi.set(self, "keyvault_metadata", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Scope name requested by the user. Must be unique within a workspace. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SecretScopeState:
    def __init__(__self__, *,
                 backend_type: Optional[pulumi.Input[str]] = None,
                 initial_manage_principal: Optional[pulumi.Input[str]] = None,
                 keyvault_metadata: Optional[pulumi.Input['SecretScopeKeyvaultMetadataArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SecretScope resources.
        :param pulumi.Input[str] backend_type: Either `DATABRICKS` or `AZURE_KEYVAULT`
        :param pulumi.Input[str] initial_manage_principal: The principal with the only possible value `users` that is initially granted `MANAGE` permission to the created scope.  If it's omitted, then the SecretAcl with `MANAGE` permission applied to the scope is assigned to the API request issuer's user identity (see [documentation](https://docs.databricks.com/dev-tools/api/latest/secrets.html#create-secret-scope)). This part of the state cannot be imported.
        :param pulumi.Input[str] name: Scope name requested by the user. Must be unique within a workspace. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        if backend_type is not None:
            pulumi.set(__self__, "backend_type", backend_type)
        if initial_manage_principal is not None:
            pulumi.set(__self__, "initial_manage_principal", initial_manage_principal)
        if keyvault_metadata is not None:
            pulumi.set(__self__, "keyvault_metadata", keyvault_metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="backendType")
    def backend_type(self) -> Optional[pulumi.Input[str]]:
        """
        Either `DATABRICKS` or `AZURE_KEYVAULT`
        """
        return pulumi.get(self, "backend_type")

    @backend_type.setter
    def backend_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backend_type", value)

    @property
    @pulumi.getter(name="initialManagePrincipal")
    def initial_manage_principal(self) -> Optional[pulumi.Input[str]]:
        """
        The principal with the only possible value `users` that is initially granted `MANAGE` permission to the created scope.  If it's omitted, then the SecretAcl with `MANAGE` permission applied to the scope is assigned to the API request issuer's user identity (see [documentation](https://docs.databricks.com/dev-tools/api/latest/secrets.html#create-secret-scope)). This part of the state cannot be imported.
        """
        return pulumi.get(self, "initial_manage_principal")

    @initial_manage_principal.setter
    def initial_manage_principal(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "initial_manage_principal", value)

    @property
    @pulumi.getter(name="keyvaultMetadata")
    def keyvault_metadata(self) -> Optional[pulumi.Input['SecretScopeKeyvaultMetadataArgs']]:
        return pulumi.get(self, "keyvault_metadata")

    @keyvault_metadata.setter
    def keyvault_metadata(self, value: Optional[pulumi.Input['SecretScopeKeyvaultMetadataArgs']]):
        pulumi.set(self, "keyvault_metadata", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Scope name requested by the user. Must be unique within a workspace. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class SecretScope(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backend_type: Optional[pulumi.Input[str]] = None,
                 initial_manage_principal: Optional[pulumi.Input[str]] = None,
                 keyvault_metadata: Optional[pulumi.Input[pulumi.InputType['SecretScopeKeyvaultMetadataArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Sometimes accessing data requires that you authenticate to external data sources through JDBC. Instead of directly entering your credentials into a notebook, use Databricks secrets to store your credentials and reference them in notebooks and jobs. Please consult [Secrets User Guide](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) for more details.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.SecretScope("this", name="terraform-demo-scope")
        ```
        <!--End PulumiCodeChooser -->

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
        * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
        * Secret to manage [secrets](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.
        * SecretAcl to manage access to [secrets](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.

        ## Import

        The secret resource scope can be imported using the scope name. `initial_manage_principal` state won't be imported, because the underlying API doesn't include it in the response.

        bash

        ```sh
        $ pulumi import databricks:index/secretScope:SecretScope object <scopeName>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backend_type: Either `DATABRICKS` or `AZURE_KEYVAULT`
        :param pulumi.Input[str] initial_manage_principal: The principal with the only possible value `users` that is initially granted `MANAGE` permission to the created scope.  If it's omitted, then the SecretAcl with `MANAGE` permission applied to the scope is assigned to the API request issuer's user identity (see [documentation](https://docs.databricks.com/dev-tools/api/latest/secrets.html#create-secret-scope)). This part of the state cannot be imported.
        :param pulumi.Input[str] name: Scope name requested by the user. Must be unique within a workspace. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SecretScopeArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Sometimes accessing data requires that you authenticate to external data sources through JDBC. Instead of directly entering your credentials into a notebook, use Databricks secrets to store your credentials and reference them in notebooks and jobs. Please consult [Secrets User Guide](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) for more details.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.SecretScope("this", name="terraform-demo-scope")
        ```
        <!--End PulumiCodeChooser -->

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
        * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
        * Secret to manage [secrets](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.
        * SecretAcl to manage access to [secrets](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.

        ## Import

        The secret resource scope can be imported using the scope name. `initial_manage_principal` state won't be imported, because the underlying API doesn't include it in the response.

        bash

        ```sh
        $ pulumi import databricks:index/secretScope:SecretScope object <scopeName>
        ```

        :param str resource_name: The name of the resource.
        :param SecretScopeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecretScopeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backend_type: Optional[pulumi.Input[str]] = None,
                 initial_manage_principal: Optional[pulumi.Input[str]] = None,
                 keyvault_metadata: Optional[pulumi.Input[pulumi.InputType['SecretScopeKeyvaultMetadataArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecretScopeArgs.__new__(SecretScopeArgs)

            __props__.__dict__["backend_type"] = backend_type
            __props__.__dict__["initial_manage_principal"] = initial_manage_principal
            __props__.__dict__["keyvault_metadata"] = keyvault_metadata
            __props__.__dict__["name"] = name
        super(SecretScope, __self__).__init__(
            'databricks:index/secretScope:SecretScope',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backend_type: Optional[pulumi.Input[str]] = None,
            initial_manage_principal: Optional[pulumi.Input[str]] = None,
            keyvault_metadata: Optional[pulumi.Input[pulumi.InputType['SecretScopeKeyvaultMetadataArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'SecretScope':
        """
        Get an existing SecretScope resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backend_type: Either `DATABRICKS` or `AZURE_KEYVAULT`
        :param pulumi.Input[str] initial_manage_principal: The principal with the only possible value `users` that is initially granted `MANAGE` permission to the created scope.  If it's omitted, then the SecretAcl with `MANAGE` permission applied to the scope is assigned to the API request issuer's user identity (see [documentation](https://docs.databricks.com/dev-tools/api/latest/secrets.html#create-secret-scope)). This part of the state cannot be imported.
        :param pulumi.Input[str] name: Scope name requested by the user. Must be unique within a workspace. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecretScopeState.__new__(_SecretScopeState)

        __props__.__dict__["backend_type"] = backend_type
        __props__.__dict__["initial_manage_principal"] = initial_manage_principal
        __props__.__dict__["keyvault_metadata"] = keyvault_metadata
        __props__.__dict__["name"] = name
        return SecretScope(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="backendType")
    def backend_type(self) -> pulumi.Output[str]:
        """
        Either `DATABRICKS` or `AZURE_KEYVAULT`
        """
        return pulumi.get(self, "backend_type")

    @property
    @pulumi.getter(name="initialManagePrincipal")
    def initial_manage_principal(self) -> pulumi.Output[Optional[str]]:
        """
        The principal with the only possible value `users` that is initially granted `MANAGE` permission to the created scope.  If it's omitted, then the SecretAcl with `MANAGE` permission applied to the scope is assigned to the API request issuer's user identity (see [documentation](https://docs.databricks.com/dev-tools/api/latest/secrets.html#create-secret-scope)). This part of the state cannot be imported.
        """
        return pulumi.get(self, "initial_manage_principal")

    @property
    @pulumi.getter(name="keyvaultMetadata")
    def keyvault_metadata(self) -> pulumi.Output[Optional['outputs.SecretScopeKeyvaultMetadata']]:
        return pulumi.get(self, "keyvault_metadata")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Scope name requested by the user. Must be unique within a workspace. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
        """
        return pulumi.get(self, "name")

