# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['VolumeArgs', 'Volume']

@pulumi.input_type
class VolumeArgs:
    def __init__(__self__, *,
                 catalog_name: pulumi.Input[str],
                 schema_name: pulumi.Input[str],
                 volume_type: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 storage_location: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Volume resource.
        :param pulumi.Input[str] catalog_name: Name of parent Catalog. Change forces creation of a new resource.
        :param pulumi.Input[str] schema_name: Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
        :param pulumi.Input[str] volume_type: Volume type. `EXTERNAL` or `MANAGED`. Change forces creation of a new resource.
        :param pulumi.Input[str] comment: Free-form text.
        :param pulumi.Input[str] name: Name of the Volume
        :param pulumi.Input[str] owner: Name of the volume owner.
        :param pulumi.Input[str] storage_location: Path inside an External Location. Only used for `EXTERNAL` Volumes. Change forces creation of a new resource.
        """
        pulumi.set(__self__, "catalog_name", catalog_name)
        pulumi.set(__self__, "schema_name", schema_name)
        pulumi.set(__self__, "volume_type", volume_type)
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
        Name of parent Catalog. Change forces creation of a new resource.
        """
        return pulumi.get(self, "catalog_name")

    @catalog_name.setter
    def catalog_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "catalog_name", value)

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> pulumi.Input[str]:
        """
        Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
        """
        return pulumi.get(self, "schema_name")

    @schema_name.setter
    def schema_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema_name", value)

    @property
    @pulumi.getter(name="volumeType")
    def volume_type(self) -> pulumi.Input[str]:
        """
        Volume type. `EXTERNAL` or `MANAGED`. Change forces creation of a new resource.
        """
        return pulumi.get(self, "volume_type")

    @volume_type.setter
    def volume_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "volume_type", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Free-form text.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Volume
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the volume owner.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter(name="storageLocation")
    def storage_location(self) -> Optional[pulumi.Input[str]]:
        """
        Path inside an External Location. Only used for `EXTERNAL` Volumes. Change forces creation of a new resource.
        """
        return pulumi.get(self, "storage_location")

    @storage_location.setter
    def storage_location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_location", value)


@pulumi.input_type
class _VolumeState:
    def __init__(__self__, *,
                 catalog_name: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 storage_location: Optional[pulumi.Input[str]] = None,
                 volume_path: Optional[pulumi.Input[str]] = None,
                 volume_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Volume resources.
        :param pulumi.Input[str] catalog_name: Name of parent Catalog. Change forces creation of a new resource.
        :param pulumi.Input[str] comment: Free-form text.
        :param pulumi.Input[str] name: Name of the Volume
        :param pulumi.Input[str] owner: Name of the volume owner.
        :param pulumi.Input[str] schema_name: Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
        :param pulumi.Input[str] storage_location: Path inside an External Location. Only used for `EXTERNAL` Volumes. Change forces creation of a new resource.
        :param pulumi.Input[str] volume_path: base file path for this Unity Catalog Volume in form of `/Volumes/<catalog>/<schema>/<name>`.
        :param pulumi.Input[str] volume_type: Volume type. `EXTERNAL` or `MANAGED`. Change forces creation of a new resource.
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
        if volume_path is not None:
            pulumi.set(__self__, "volume_path", volume_path)
        if volume_type is not None:
            pulumi.set(__self__, "volume_type", volume_type)

    @property
    @pulumi.getter(name="catalogName")
    def catalog_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of parent Catalog. Change forces creation of a new resource.
        """
        return pulumi.get(self, "catalog_name")

    @catalog_name.setter
    def catalog_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "catalog_name", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Free-form text.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Volume
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the volume owner.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
        """
        return pulumi.get(self, "schema_name")

    @schema_name.setter
    def schema_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema_name", value)

    @property
    @pulumi.getter(name="storageLocation")
    def storage_location(self) -> Optional[pulumi.Input[str]]:
        """
        Path inside an External Location. Only used for `EXTERNAL` Volumes. Change forces creation of a new resource.
        """
        return pulumi.get(self, "storage_location")

    @storage_location.setter
    def storage_location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_location", value)

    @property
    @pulumi.getter(name="volumePath")
    def volume_path(self) -> Optional[pulumi.Input[str]]:
        """
        base file path for this Unity Catalog Volume in form of `/Volumes/<catalog>/<schema>/<name>`.
        """
        return pulumi.get(self, "volume_path")

    @volume_path.setter
    def volume_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "volume_path", value)

    @property
    @pulumi.getter(name="volumeType")
    def volume_type(self) -> Optional[pulumi.Input[str]]:
        """
        Volume type. `EXTERNAL` or `MANAGED`. Change forces creation of a new resource.
        """
        return pulumi.get(self, "volume_type")

    @volume_type.setter
    def volume_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "volume_type", value)


class Volume(pulumi.CustomResource):
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
                 volume_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **Public Preview** This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html).

        > **Note** This resource could be only used with workspace-level provider!

        Volumes are Unity Catalog objects representing a logical volume of storage in a cloud object storage location. Volumes provide capabilities for accessing, storing, governing, and organizing files. While tables provide governance over tabular datasets, volumes add governance over non-tabular datasets. You can use volumes to store and access files in any format, including structured, semi-structured, and unstructured data.

        A volume resides in the third layer of Unity Catalog’s three-level namespace. Volumes are siblings to tables, views, and other objects organized under a schema in Unity Catalog.

        A volume can be **managed** or **external**.

        A **managed volume** is a Unity Catalog-governed storage volume created within the default storage location of the containing schema. Managed volumes allow the creation of governed storage for working with files without the overhead of external locations and storage credentials. You do not need to specify a location when creating a managed volume, and all file access for data in managed volumes is through paths managed by Unity Catalog.

        An **external volume** is a Unity Catalog-governed storage volume registered against a directory within an external location.

        A volume can be referenced using its identifier: ```<catalogName>.<schemaName>.<volumeName>```, where:

        * ```<catalogName>```: The name of the catalog containing the Volume.
        * ```<schemaName>```: The name of the schema containing the Volume.
        * ```<volumeName>```: The name of the Volume. It identifies the volume object.

        The path to access files in volumes uses the following format:

        ```/Volumes/<catalog>/<schema>/<volume>/<path>/<file_name>```

        Databricks also supports an optional ```dbfs:/``` scheme, so the following path also works:

        ```dbfs:/Volumes/<catalog>/<schema>/<volume>/<path>/<file_name>```

        This resource manages Volumes in Unity Catalog.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        sandbox = databricks.Catalog("sandbox",
            name="sandbox",
            comment="this catalog is managed by terraform",
            properties={
                "purpose": "testing",
            })
        things = databricks.Schema("things",
            catalog_name=sandbox.name,
            name="things",
            comment="this schema is managed by terraform",
            properties={
                "kind": "various",
            })
        external = databricks.StorageCredential("external",
            name="creds",
            aws_iam_role=databricks.StorageCredentialAwsIamRoleArgs(
                role_arn=external_data_access["arn"],
            ))
        some = databricks.ExternalLocation("some",
            name="external-location",
            url=f"s3://{external_aws_s3_bucket['id']}/some",
            credential_name=external.name)
        this = databricks.Volume("this",
            name="quickstart_volume",
            catalog_name=sandbox.name,
            schema_name=things.name,
            volume_type="EXTERNAL",
            storage_location=some.url,
            comment="this volume is managed by terraform")
        ```

        ## Import

        This resource can be imported by `full_name` which is the 3-level Volume identifier: `<catalog>.<schema>.<name>`

        bash

        ```sh
        $ pulumi import databricks:index/volume:Volume this <catalog_name>.<schema_name>.<name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] catalog_name: Name of parent Catalog. Change forces creation of a new resource.
        :param pulumi.Input[str] comment: Free-form text.
        :param pulumi.Input[str] name: Name of the Volume
        :param pulumi.Input[str] owner: Name of the volume owner.
        :param pulumi.Input[str] schema_name: Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
        :param pulumi.Input[str] storage_location: Path inside an External Location. Only used for `EXTERNAL` Volumes. Change forces creation of a new resource.
        :param pulumi.Input[str] volume_type: Volume type. `EXTERNAL` or `MANAGED`. Change forces creation of a new resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VolumeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Public Preview** This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html).

        > **Note** This resource could be only used with workspace-level provider!

        Volumes are Unity Catalog objects representing a logical volume of storage in a cloud object storage location. Volumes provide capabilities for accessing, storing, governing, and organizing files. While tables provide governance over tabular datasets, volumes add governance over non-tabular datasets. You can use volumes to store and access files in any format, including structured, semi-structured, and unstructured data.

        A volume resides in the third layer of Unity Catalog’s three-level namespace. Volumes are siblings to tables, views, and other objects organized under a schema in Unity Catalog.

        A volume can be **managed** or **external**.

        A **managed volume** is a Unity Catalog-governed storage volume created within the default storage location of the containing schema. Managed volumes allow the creation of governed storage for working with files without the overhead of external locations and storage credentials. You do not need to specify a location when creating a managed volume, and all file access for data in managed volumes is through paths managed by Unity Catalog.

        An **external volume** is a Unity Catalog-governed storage volume registered against a directory within an external location.

        A volume can be referenced using its identifier: ```<catalogName>.<schemaName>.<volumeName>```, where:

        * ```<catalogName>```: The name of the catalog containing the Volume.
        * ```<schemaName>```: The name of the schema containing the Volume.
        * ```<volumeName>```: The name of the Volume. It identifies the volume object.

        The path to access files in volumes uses the following format:

        ```/Volumes/<catalog>/<schema>/<volume>/<path>/<file_name>```

        Databricks also supports an optional ```dbfs:/``` scheme, so the following path also works:

        ```dbfs:/Volumes/<catalog>/<schema>/<volume>/<path>/<file_name>```

        This resource manages Volumes in Unity Catalog.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        sandbox = databricks.Catalog("sandbox",
            name="sandbox",
            comment="this catalog is managed by terraform",
            properties={
                "purpose": "testing",
            })
        things = databricks.Schema("things",
            catalog_name=sandbox.name,
            name="things",
            comment="this schema is managed by terraform",
            properties={
                "kind": "various",
            })
        external = databricks.StorageCredential("external",
            name="creds",
            aws_iam_role=databricks.StorageCredentialAwsIamRoleArgs(
                role_arn=external_data_access["arn"],
            ))
        some = databricks.ExternalLocation("some",
            name="external-location",
            url=f"s3://{external_aws_s3_bucket['id']}/some",
            credential_name=external.name)
        this = databricks.Volume("this",
            name="quickstart_volume",
            catalog_name=sandbox.name,
            schema_name=things.name,
            volume_type="EXTERNAL",
            storage_location=some.url,
            comment="this volume is managed by terraform")
        ```

        ## Import

        This resource can be imported by `full_name` which is the 3-level Volume identifier: `<catalog>.<schema>.<name>`

        bash

        ```sh
        $ pulumi import databricks:index/volume:Volume this <catalog_name>.<schema_name>.<name>
        ```

        :param str resource_name: The name of the resource.
        :param VolumeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VolumeArgs, pulumi.ResourceOptions, *args, **kwargs)
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
                 volume_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VolumeArgs.__new__(VolumeArgs)

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
            if volume_type is None and not opts.urn:
                raise TypeError("Missing required property 'volume_type'")
            __props__.__dict__["volume_type"] = volume_type
            __props__.__dict__["volume_path"] = None
        super(Volume, __self__).__init__(
            'databricks:index/volume:Volume',
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
            storage_location: Optional[pulumi.Input[str]] = None,
            volume_path: Optional[pulumi.Input[str]] = None,
            volume_type: Optional[pulumi.Input[str]] = None) -> 'Volume':
        """
        Get an existing Volume resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] catalog_name: Name of parent Catalog. Change forces creation of a new resource.
        :param pulumi.Input[str] comment: Free-form text.
        :param pulumi.Input[str] name: Name of the Volume
        :param pulumi.Input[str] owner: Name of the volume owner.
        :param pulumi.Input[str] schema_name: Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
        :param pulumi.Input[str] storage_location: Path inside an External Location. Only used for `EXTERNAL` Volumes. Change forces creation of a new resource.
        :param pulumi.Input[str] volume_path: base file path for this Unity Catalog Volume in form of `/Volumes/<catalog>/<schema>/<name>`.
        :param pulumi.Input[str] volume_type: Volume type. `EXTERNAL` or `MANAGED`. Change forces creation of a new resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VolumeState.__new__(_VolumeState)

        __props__.__dict__["catalog_name"] = catalog_name
        __props__.__dict__["comment"] = comment
        __props__.__dict__["name"] = name
        __props__.__dict__["owner"] = owner
        __props__.__dict__["schema_name"] = schema_name
        __props__.__dict__["storage_location"] = storage_location
        __props__.__dict__["volume_path"] = volume_path
        __props__.__dict__["volume_type"] = volume_type
        return Volume(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="catalogName")
    def catalog_name(self) -> pulumi.Output[str]:
        """
        Name of parent Catalog. Change forces creation of a new resource.
        """
        return pulumi.get(self, "catalog_name")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Free-form text.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Volume
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[str]:
        """
        Name of the volume owner.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> pulumi.Output[str]:
        """
        Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
        """
        return pulumi.get(self, "schema_name")

    @property
    @pulumi.getter(name="storageLocation")
    def storage_location(self) -> pulumi.Output[Optional[str]]:
        """
        Path inside an External Location. Only used for `EXTERNAL` Volumes. Change forces creation of a new resource.
        """
        return pulumi.get(self, "storage_location")

    @property
    @pulumi.getter(name="volumePath")
    def volume_path(self) -> pulumi.Output[str]:
        """
        base file path for this Unity Catalog Volume in form of `/Volumes/<catalog>/<schema>/<name>`.
        """
        return pulumi.get(self, "volume_path")

    @property
    @pulumi.getter(name="volumeType")
    def volume_type(self) -> pulumi.Output[str]:
        """
        Volume type. `EXTERNAL` or `MANAGED`. Change forces creation of a new resource.
        """
        return pulumi.get(self, "volume_type")

