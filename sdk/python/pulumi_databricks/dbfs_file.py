# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['DbfsFileArgs', 'DbfsFile']

@pulumi.input_type
class DbfsFileArgs:
    def __init__(__self__, *,
                 path: pulumi.Input[str],
                 content_base64: Optional[pulumi.Input[str]] = None,
                 md5: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DbfsFile resource.
        :param pulumi.Input[str] path: The path of the file in which you wish to save.
        :param pulumi.Input[str] source: The full absolute path to the file. Conflicts with `content_base64`.
        """
        DbfsFileArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            path=path,
            content_base64=content_base64,
            md5=md5,
            source=source,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             path: pulumi.Input[str],
             content_base64: Optional[pulumi.Input[str]] = None,
             md5: Optional[pulumi.Input[str]] = None,
             source: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("path", path)
        if content_base64 is not None:
            _setter("content_base64", content_base64)
        if md5 is not None:
            _setter("md5", md5)
        if source is not None:
            _setter("source", source)

    @property
    @pulumi.getter
    def path(self) -> pulumi.Input[str]:
        """
        The path of the file in which you wish to save.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: pulumi.Input[str]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="contentBase64")
    def content_base64(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "content_base64")

    @content_base64.setter
    def content_base64(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_base64", value)

    @property
    @pulumi.getter
    def md5(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "md5")

    @md5.setter
    def md5(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "md5", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[str]]:
        """
        The full absolute path to the file. Conflicts with `content_base64`.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source", value)


@pulumi.input_type
class _DbfsFileState:
    def __init__(__self__, *,
                 content_base64: Optional[pulumi.Input[str]] = None,
                 dbfs_path: Optional[pulumi.Input[str]] = None,
                 file_size: Optional[pulumi.Input[int]] = None,
                 md5: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DbfsFile resources.
        :param pulumi.Input[str] dbfs_path: Path, but with `dbfs:` prefix.
        :param pulumi.Input[int] file_size: The file size of the file that is being tracked by this resource in bytes.
        :param pulumi.Input[str] path: The path of the file in which you wish to save.
        :param pulumi.Input[str] source: The full absolute path to the file. Conflicts with `content_base64`.
        """
        _DbfsFileState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            content_base64=content_base64,
            dbfs_path=dbfs_path,
            file_size=file_size,
            md5=md5,
            path=path,
            source=source,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             content_base64: Optional[pulumi.Input[str]] = None,
             dbfs_path: Optional[pulumi.Input[str]] = None,
             file_size: Optional[pulumi.Input[int]] = None,
             md5: Optional[pulumi.Input[str]] = None,
             path: Optional[pulumi.Input[str]] = None,
             source: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if content_base64 is not None:
            _setter("content_base64", content_base64)
        if dbfs_path is not None:
            _setter("dbfs_path", dbfs_path)
        if file_size is not None:
            _setter("file_size", file_size)
        if md5 is not None:
            _setter("md5", md5)
        if path is not None:
            _setter("path", path)
        if source is not None:
            _setter("source", source)

    @property
    @pulumi.getter(name="contentBase64")
    def content_base64(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "content_base64")

    @content_base64.setter
    def content_base64(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_base64", value)

    @property
    @pulumi.getter(name="dbfsPath")
    def dbfs_path(self) -> Optional[pulumi.Input[str]]:
        """
        Path, but with `dbfs:` prefix.
        """
        return pulumi.get(self, "dbfs_path")

    @dbfs_path.setter
    def dbfs_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dbfs_path", value)

    @property
    @pulumi.getter(name="fileSize")
    def file_size(self) -> Optional[pulumi.Input[int]]:
        """
        The file size of the file that is being tracked by this resource in bytes.
        """
        return pulumi.get(self, "file_size")

    @file_size.setter
    def file_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "file_size", value)

    @property
    @pulumi.getter
    def md5(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "md5")

    @md5.setter
    def md5(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "md5", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        The path of the file in which you wish to save.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[str]]:
        """
        The full absolute path to the file. Conflicts with `content_base64`.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source", value)


class DbfsFile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content_base64: Optional[pulumi.Input[str]] = None,
                 md5: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        The resource dbfs file can be imported using the path of the filebash

        ```sh
         $ pulumi import databricks:index/dbfsFile:DbfsFile this <path>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] path: The path of the file in which you wish to save.
        :param pulumi.Input[str] source: The full absolute path to the file. Conflicts with `content_base64`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DbfsFileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        The resource dbfs file can be imported using the path of the filebash

        ```sh
         $ pulumi import databricks:index/dbfsFile:DbfsFile this <path>
        ```

        :param str resource_name: The name of the resource.
        :param DbfsFileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DbfsFileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DbfsFileArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content_base64: Optional[pulumi.Input[str]] = None,
                 md5: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DbfsFileArgs.__new__(DbfsFileArgs)

            __props__.__dict__["content_base64"] = content_base64
            __props__.__dict__["md5"] = md5
            if path is None and not opts.urn:
                raise TypeError("Missing required property 'path'")
            __props__.__dict__["path"] = path
            __props__.__dict__["source"] = source
            __props__.__dict__["dbfs_path"] = None
            __props__.__dict__["file_size"] = None
        super(DbfsFile, __self__).__init__(
            'databricks:index/dbfsFile:DbfsFile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            content_base64: Optional[pulumi.Input[str]] = None,
            dbfs_path: Optional[pulumi.Input[str]] = None,
            file_size: Optional[pulumi.Input[int]] = None,
            md5: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            source: Optional[pulumi.Input[str]] = None) -> 'DbfsFile':
        """
        Get an existing DbfsFile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dbfs_path: Path, but with `dbfs:` prefix.
        :param pulumi.Input[int] file_size: The file size of the file that is being tracked by this resource in bytes.
        :param pulumi.Input[str] path: The path of the file in which you wish to save.
        :param pulumi.Input[str] source: The full absolute path to the file. Conflicts with `content_base64`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DbfsFileState.__new__(_DbfsFileState)

        __props__.__dict__["content_base64"] = content_base64
        __props__.__dict__["dbfs_path"] = dbfs_path
        __props__.__dict__["file_size"] = file_size
        __props__.__dict__["md5"] = md5
        __props__.__dict__["path"] = path
        __props__.__dict__["source"] = source
        return DbfsFile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="contentBase64")
    def content_base64(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "content_base64")

    @property
    @pulumi.getter(name="dbfsPath")
    def dbfs_path(self) -> pulumi.Output[str]:
        """
        Path, but with `dbfs:` prefix.
        """
        return pulumi.get(self, "dbfs_path")

    @property
    @pulumi.getter(name="fileSize")
    def file_size(self) -> pulumi.Output[int]:
        """
        The file size of the file that is being tracked by this resource in bytes.
        """
        return pulumi.get(self, "file_size")

    @property
    @pulumi.getter
    def md5(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "md5")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[str]:
        """
        The path of the file in which you wish to save.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output[Optional[str]]:
        """
        The full absolute path to the file. Conflicts with `content_base64`.
        """
        return pulumi.get(self, "source")

