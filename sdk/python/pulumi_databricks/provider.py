# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 auth_type: Optional[pulumi.Input[str]] = None,
                 azure_client_id: Optional[pulumi.Input[str]] = None,
                 azure_client_secret: Optional[pulumi.Input[str]] = None,
                 azure_environment: Optional[pulumi.Input[str]] = None,
                 azure_login_app_id: Optional[pulumi.Input[str]] = None,
                 azure_tenant_id: Optional[pulumi.Input[str]] = None,
                 azure_use_msi: Optional[pulumi.Input[bool]] = None,
                 azure_workspace_resource_id: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 config_file: Optional[pulumi.Input[str]] = None,
                 debug_headers: Optional[pulumi.Input[bool]] = None,
                 debug_truncate_bytes: Optional[pulumi.Input[int]] = None,
                 google_credentials: Optional[pulumi.Input[str]] = None,
                 google_service_account: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 http_timeout_seconds: Optional[pulumi.Input[int]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 profile: Optional[pulumi.Input[str]] = None,
                 rate_limit: Optional[pulumi.Input[int]] = None,
                 skip_verify: Optional[pulumi.Input[bool]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 token_endpoint: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if auth_type is not None:
            pulumi.set(__self__, "auth_type", auth_type)
        if azure_client_id is not None:
            pulumi.set(__self__, "azure_client_id", azure_client_id)
        if azure_client_secret is not None:
            pulumi.set(__self__, "azure_client_secret", azure_client_secret)
        if azure_environment is not None:
            pulumi.set(__self__, "azure_environment", azure_environment)
        if azure_login_app_id is not None:
            pulumi.set(__self__, "azure_login_app_id", azure_login_app_id)
        if azure_tenant_id is not None:
            pulumi.set(__self__, "azure_tenant_id", azure_tenant_id)
        if azure_use_msi is not None:
            pulumi.set(__self__, "azure_use_msi", azure_use_msi)
        if azure_workspace_resource_id is not None:
            pulumi.set(__self__, "azure_workspace_resource_id", azure_workspace_resource_id)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if client_secret is not None:
            pulumi.set(__self__, "client_secret", client_secret)
        if config_file is not None:
            pulumi.set(__self__, "config_file", config_file)
        if debug_headers is not None:
            pulumi.set(__self__, "debug_headers", debug_headers)
        if debug_truncate_bytes is not None:
            pulumi.set(__self__, "debug_truncate_bytes", debug_truncate_bytes)
        if google_credentials is not None:
            pulumi.set(__self__, "google_credentials", google_credentials)
        if google_service_account is not None:
            pulumi.set(__self__, "google_service_account", google_service_account)
        if host is not None:
            pulumi.set(__self__, "host", host)
        if http_timeout_seconds is not None:
            pulumi.set(__self__, "http_timeout_seconds", http_timeout_seconds)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if profile is not None:
            pulumi.set(__self__, "profile", profile)
        if rate_limit is not None:
            pulumi.set(__self__, "rate_limit", rate_limit)
        if skip_verify is not None:
            pulumi.set(__self__, "skip_verify", skip_verify)
        if token is not None:
            pulumi.set(__self__, "token", token)
        if token_endpoint is not None:
            pulumi.set(__self__, "token_endpoint", token_endpoint)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="authType")
    def auth_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "auth_type")

    @auth_type.setter
    def auth_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auth_type", value)

    @property
    @pulumi.getter(name="azureClientId")
    def azure_client_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "azure_client_id")

    @azure_client_id.setter
    def azure_client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "azure_client_id", value)

    @property
    @pulumi.getter(name="azureClientSecret")
    def azure_client_secret(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "azure_client_secret")

    @azure_client_secret.setter
    def azure_client_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "azure_client_secret", value)

    @property
    @pulumi.getter(name="azureEnvironment")
    def azure_environment(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "azure_environment")

    @azure_environment.setter
    def azure_environment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "azure_environment", value)

    @property
    @pulumi.getter(name="azureLoginAppId")
    def azure_login_app_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "azure_login_app_id")

    @azure_login_app_id.setter
    def azure_login_app_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "azure_login_app_id", value)

    @property
    @pulumi.getter(name="azureTenantId")
    def azure_tenant_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "azure_tenant_id")

    @azure_tenant_id.setter
    def azure_tenant_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "azure_tenant_id", value)

    @property
    @pulumi.getter(name="azureUseMsi")
    def azure_use_msi(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "azure_use_msi")

    @azure_use_msi.setter
    def azure_use_msi(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "azure_use_msi", value)

    @property
    @pulumi.getter(name="azureWorkspaceResourceId")
    def azure_workspace_resource_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "azure_workspace_resource_id")

    @azure_workspace_resource_id.setter
    def azure_workspace_resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "azure_workspace_resource_id", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_secret", value)

    @property
    @pulumi.getter(name="configFile")
    def config_file(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "config_file")

    @config_file.setter
    def config_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_file", value)

    @property
    @pulumi.getter(name="debugHeaders")
    def debug_headers(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "debug_headers")

    @debug_headers.setter
    def debug_headers(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "debug_headers", value)

    @property
    @pulumi.getter(name="debugTruncateBytes")
    def debug_truncate_bytes(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "debug_truncate_bytes")

    @debug_truncate_bytes.setter
    def debug_truncate_bytes(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "debug_truncate_bytes", value)

    @property
    @pulumi.getter(name="googleCredentials")
    def google_credentials(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "google_credentials")

    @google_credentials.setter
    def google_credentials(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "google_credentials", value)

    @property
    @pulumi.getter(name="googleServiceAccount")
    def google_service_account(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "google_service_account")

    @google_service_account.setter
    def google_service_account(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "google_service_account", value)

    @property
    @pulumi.getter
    def host(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter(name="httpTimeoutSeconds")
    def http_timeout_seconds(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "http_timeout_seconds")

    @http_timeout_seconds.setter
    def http_timeout_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "http_timeout_seconds", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def profile(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "profile")

    @profile.setter
    def profile(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "profile", value)

    @property
    @pulumi.getter(name="rateLimit")
    def rate_limit(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "rate_limit")

    @rate_limit.setter
    def rate_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "rate_limit", value)

    @property
    @pulumi.getter(name="skipVerify")
    def skip_verify(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "skip_verify")

    @skip_verify.setter
    def skip_verify(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_verify", value)

    @property
    @pulumi.getter
    def token(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token", value)

    @property
    @pulumi.getter(name="tokenEndpoint")
    def token_endpoint(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "token_endpoint")

    @token_endpoint.setter
    def token_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_endpoint", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 auth_type: Optional[pulumi.Input[str]] = None,
                 azure_client_id: Optional[pulumi.Input[str]] = None,
                 azure_client_secret: Optional[pulumi.Input[str]] = None,
                 azure_environment: Optional[pulumi.Input[str]] = None,
                 azure_login_app_id: Optional[pulumi.Input[str]] = None,
                 azure_tenant_id: Optional[pulumi.Input[str]] = None,
                 azure_use_msi: Optional[pulumi.Input[bool]] = None,
                 azure_workspace_resource_id: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 config_file: Optional[pulumi.Input[str]] = None,
                 debug_headers: Optional[pulumi.Input[bool]] = None,
                 debug_truncate_bytes: Optional[pulumi.Input[int]] = None,
                 google_credentials: Optional[pulumi.Input[str]] = None,
                 google_service_account: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 http_timeout_seconds: Optional[pulumi.Input[int]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 profile: Optional[pulumi.Input[str]] = None,
                 rate_limit: Optional[pulumi.Input[int]] = None,
                 skip_verify: Optional[pulumi.Input[bool]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 token_endpoint: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the databricks package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the databricks package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 auth_type: Optional[pulumi.Input[str]] = None,
                 azure_client_id: Optional[pulumi.Input[str]] = None,
                 azure_client_secret: Optional[pulumi.Input[str]] = None,
                 azure_environment: Optional[pulumi.Input[str]] = None,
                 azure_login_app_id: Optional[pulumi.Input[str]] = None,
                 azure_tenant_id: Optional[pulumi.Input[str]] = None,
                 azure_use_msi: Optional[pulumi.Input[bool]] = None,
                 azure_workspace_resource_id: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 config_file: Optional[pulumi.Input[str]] = None,
                 debug_headers: Optional[pulumi.Input[bool]] = None,
                 debug_truncate_bytes: Optional[pulumi.Input[int]] = None,
                 google_credentials: Optional[pulumi.Input[str]] = None,
                 google_service_account: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 http_timeout_seconds: Optional[pulumi.Input[int]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 profile: Optional[pulumi.Input[str]] = None,
                 rate_limit: Optional[pulumi.Input[int]] = None,
                 skip_verify: Optional[pulumi.Input[bool]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 token_endpoint: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["auth_type"] = auth_type
            __props__.__dict__["azure_client_id"] = azure_client_id
            __props__.__dict__["azure_client_secret"] = None if azure_client_secret is None else pulumi.Output.secret(azure_client_secret)
            __props__.__dict__["azure_environment"] = azure_environment
            __props__.__dict__["azure_login_app_id"] = azure_login_app_id
            __props__.__dict__["azure_tenant_id"] = azure_tenant_id
            __props__.__dict__["azure_use_msi"] = pulumi.Output.from_input(azure_use_msi).apply(pulumi.runtime.to_json) if azure_use_msi is not None else None
            __props__.__dict__["azure_workspace_resource_id"] = azure_workspace_resource_id
            __props__.__dict__["client_id"] = client_id
            __props__.__dict__["client_secret"] = None if client_secret is None else pulumi.Output.secret(client_secret)
            __props__.__dict__["config_file"] = config_file
            __props__.__dict__["debug_headers"] = pulumi.Output.from_input(debug_headers).apply(pulumi.runtime.to_json) if debug_headers is not None else None
            __props__.__dict__["debug_truncate_bytes"] = pulumi.Output.from_input(debug_truncate_bytes).apply(pulumi.runtime.to_json) if debug_truncate_bytes is not None else None
            __props__.__dict__["google_credentials"] = None if google_credentials is None else pulumi.Output.secret(google_credentials)
            __props__.__dict__["google_service_account"] = google_service_account
            __props__.__dict__["host"] = host
            __props__.__dict__["http_timeout_seconds"] = pulumi.Output.from_input(http_timeout_seconds).apply(pulumi.runtime.to_json) if http_timeout_seconds is not None else None
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            __props__.__dict__["profile"] = profile
            __props__.__dict__["rate_limit"] = pulumi.Output.from_input(rate_limit).apply(pulumi.runtime.to_json) if rate_limit is not None else None
            __props__.__dict__["skip_verify"] = pulumi.Output.from_input(skip_verify).apply(pulumi.runtime.to_json) if skip_verify is not None else None
            __props__.__dict__["token"] = None if token is None else pulumi.Output.secret(token)
            __props__.__dict__["token_endpoint"] = token_endpoint
            __props__.__dict__["username"] = username
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["azureClientSecret", "clientSecret", "googleCredentials", "password", "token"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Provider, __self__).__init__(
            'databricks',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="authType")
    def auth_type(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "auth_type")

    @property
    @pulumi.getter(name="azureClientId")
    def azure_client_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "azure_client_id")

    @property
    @pulumi.getter(name="azureClientSecret")
    def azure_client_secret(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "azure_client_secret")

    @property
    @pulumi.getter(name="azureEnvironment")
    def azure_environment(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "azure_environment")

    @property
    @pulumi.getter(name="azureLoginAppId")
    def azure_login_app_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "azure_login_app_id")

    @property
    @pulumi.getter(name="azureTenantId")
    def azure_tenant_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "azure_tenant_id")

    @property
    @pulumi.getter(name="azureWorkspaceResourceId")
    def azure_workspace_resource_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "azure_workspace_resource_id")

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "client_secret")

    @property
    @pulumi.getter(name="configFile")
    def config_file(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "config_file")

    @property
    @pulumi.getter(name="googleCredentials")
    def google_credentials(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "google_credentials")

    @property
    @pulumi.getter(name="googleServiceAccount")
    def google_service_account(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "google_service_account")

    @property
    @pulumi.getter
    def host(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "host")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def profile(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "profile")

    @property
    @pulumi.getter
    def token(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "token")

    @property
    @pulumi.getter(name="tokenEndpoint")
    def token_endpoint(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "token_endpoint")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "username")

