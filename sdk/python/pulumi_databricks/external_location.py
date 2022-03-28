# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ExternalLocationArgs', 'ExternalLocation']

@pulumi.input_type
class ExternalLocationArgs:
    def __init__(__self__, *,
                 credential_name: pulumi.Input[str],
                 url: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ExternalLocation resource.
        :param pulumi.Input[str] credential_name: Name of the StorageCredential to use with this External Location.
        :param pulumi.Input[str] url: Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure).
        :param pulumi.Input[str] comment: User-supplied free-form text.
        :param pulumi.Input[str] name: Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        :param pulumi.Input[str] owner: Username/groupname of External Location owner. Currently this field can only be changed after the resource is created.
        """
        pulumi.set(__self__, "credential_name", credential_name)
        pulumi.set(__self__, "url", url)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if metastore_id is not None:
            pulumi.set(__self__, "metastore_id", metastore_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)

    @property
    @pulumi.getter(name="credentialName")
    def credential_name(self) -> pulumi.Input[str]:
        """
        Name of the StorageCredential to use with this External Location.
        """
        return pulumi.get(self, "credential_name")

    @credential_name.setter
    def credential_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "credential_name", value)

    @property
    @pulumi.getter
    def url(self) -> pulumi.Input[str]:
        """
        Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure).
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[str]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        User-supplied free-form text.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="metastoreId")
    def metastore_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "metastore_id")

    @metastore_id.setter
    def metastore_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metastore_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Username/groupname of External Location owner. Currently this field can only be changed after the resource is created.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)


@pulumi.input_type
class _ExternalLocationState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 credential_name: Optional[pulumi.Input[str]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ExternalLocation resources.
        :param pulumi.Input[str] comment: User-supplied free-form text.
        :param pulumi.Input[str] credential_name: Name of the StorageCredential to use with this External Location.
        :param pulumi.Input[str] name: Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        :param pulumi.Input[str] owner: Username/groupname of External Location owner. Currently this field can only be changed after the resource is created.
        :param pulumi.Input[str] url: Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure).
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if credential_name is not None:
            pulumi.set(__self__, "credential_name", credential_name)
        if metastore_id is not None:
            pulumi.set(__self__, "metastore_id", metastore_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        User-supplied free-form text.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="credentialName")
    def credential_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the StorageCredential to use with this External Location.
        """
        return pulumi.get(self, "credential_name")

    @credential_name.setter
    def credential_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "credential_name", value)

    @property
    @pulumi.getter(name="metastoreId")
    def metastore_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "metastore_id")

    @metastore_id.setter
    def metastore_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metastore_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Username/groupname of External Location owner. Currently this field can only be changed after the resource is created.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure).
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


class ExternalLocation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 credential_name: Optional[pulumi.Input[str]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **Private Preview** This feature is in [Private Preview](https://docs.databricks.com/release-notes/release-types.html). Contact your Databricks representative to request access.

        To work with external tables, Unity Catalog introduces two new objects to access and work with external cloud storage:
        - StorageCredential represent authentication methods to access cloud storage (e.g. an IAM role for Amazon S3 or a service principal for Azure Storage). Storage credentials are access-controlled to determine which users can use the credential.
        - `ExternalLocation` are objects that combine a cloud storage path with a Storage Credential that can be used to access the location.

        ## Import

        This resource can be imported by namebash

        ```sh
         $ pulumi import databricks:index/externalLocation:ExternalLocation this <name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: User-supplied free-form text.
        :param pulumi.Input[str] credential_name: Name of the StorageCredential to use with this External Location.
        :param pulumi.Input[str] name: Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        :param pulumi.Input[str] owner: Username/groupname of External Location owner. Currently this field can only be changed after the resource is created.
        :param pulumi.Input[str] url: Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ExternalLocationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Private Preview** This feature is in [Private Preview](https://docs.databricks.com/release-notes/release-types.html). Contact your Databricks representative to request access.

        To work with external tables, Unity Catalog introduces two new objects to access and work with external cloud storage:
        - StorageCredential represent authentication methods to access cloud storage (e.g. an IAM role for Amazon S3 or a service principal for Azure Storage). Storage credentials are access-controlled to determine which users can use the credential.
        - `ExternalLocation` are objects that combine a cloud storage path with a Storage Credential that can be used to access the location.

        ## Import

        This resource can be imported by namebash

        ```sh
         $ pulumi import databricks:index/externalLocation:ExternalLocation this <name>
        ```

        :param str resource_name: The name of the resource.
        :param ExternalLocationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ExternalLocationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 credential_name: Optional[pulumi.Input[str]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ExternalLocationArgs.__new__(ExternalLocationArgs)

            __props__.__dict__["comment"] = comment
            if credential_name is None and not opts.urn:
                raise TypeError("Missing required property 'credential_name'")
            __props__.__dict__["credential_name"] = credential_name
            __props__.__dict__["metastore_id"] = metastore_id
            __props__.__dict__["name"] = name
            __props__.__dict__["owner"] = owner
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
        super(ExternalLocation, __self__).__init__(
            'databricks:index/externalLocation:ExternalLocation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            credential_name: Optional[pulumi.Input[str]] = None,
            metastore_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'ExternalLocation':
        """
        Get an existing ExternalLocation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: User-supplied free-form text.
        :param pulumi.Input[str] credential_name: Name of the StorageCredential to use with this External Location.
        :param pulumi.Input[str] name: Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        :param pulumi.Input[str] owner: Username/groupname of External Location owner. Currently this field can only be changed after the resource is created.
        :param pulumi.Input[str] url: Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ExternalLocationState.__new__(_ExternalLocationState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["credential_name"] = credential_name
        __props__.__dict__["metastore_id"] = metastore_id
        __props__.__dict__["name"] = name
        __props__.__dict__["owner"] = owner
        __props__.__dict__["url"] = url
        return ExternalLocation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        User-supplied free-form text.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="credentialName")
    def credential_name(self) -> pulumi.Output[str]:
        """
        Name of the StorageCredential to use with this External Location.
        """
        return pulumi.get(self, "credential_name")

    @property
    @pulumi.getter(name="metastoreId")
    def metastore_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "metastore_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[str]:
        """
        Username/groupname of External Location owner. Currently this field can only be changed after the resource is created.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure).
        """
        return pulumi.get(self, "url")

