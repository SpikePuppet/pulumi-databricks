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

__all__ = ['RepoArgs', 'Repo']

@pulumi.input_type
class RepoArgs:
    def __init__(__self__, *,
                 url: pulumi.Input[str],
                 branch: Optional[pulumi.Input[str]] = None,
                 commit_hash: Optional[pulumi.Input[str]] = None,
                 git_provider: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 sparse_checkout: Optional[pulumi.Input['RepoSparseCheckoutArgs']] = None,
                 tag: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Repo resource.
        :param pulumi.Input[str] url: The URL of the Git Repository to clone from. If the value changes, repo is re-created.
        :param pulumi.Input[str] branch: name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
        :param pulumi.Input[str] commit_hash: Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
        :param pulumi.Input[str] git_provider: case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        :param pulumi.Input[str] path: path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
        :param pulumi.Input[str] tag: name of the tag for initial checkout.  Conflicts with `branch`.
        """
        pulumi.set(__self__, "url", url)
        if branch is not None:
            pulumi.set(__self__, "branch", branch)
        if commit_hash is not None:
            pulumi.set(__self__, "commit_hash", commit_hash)
        if git_provider is not None:
            pulumi.set(__self__, "git_provider", git_provider)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if sparse_checkout is not None:
            pulumi.set(__self__, "sparse_checkout", sparse_checkout)
        if tag is not None:
            pulumi.set(__self__, "tag", tag)

    @property
    @pulumi.getter
    def url(self) -> pulumi.Input[str]:
        """
        The URL of the Git Repository to clone from. If the value changes, repo is re-created.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[str]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def branch(self) -> Optional[pulumi.Input[str]]:
        """
        name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
        """
        return pulumi.get(self, "branch")

    @branch.setter
    def branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branch", value)

    @property
    @pulumi.getter(name="commitHash")
    def commit_hash(self) -> Optional[pulumi.Input[str]]:
        """
        Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
        """
        return pulumi.get(self, "commit_hash")

    @commit_hash.setter
    def commit_hash(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "commit_hash", value)

    @property
    @pulumi.getter(name="gitProvider")
    def git_provider(self) -> Optional[pulumi.Input[str]]:
        """
        case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        """
        return pulumi.get(self, "git_provider")

    @git_provider.setter
    def git_provider(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_provider", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="sparseCheckout")
    def sparse_checkout(self) -> Optional[pulumi.Input['RepoSparseCheckoutArgs']]:
        return pulumi.get(self, "sparse_checkout")

    @sparse_checkout.setter
    def sparse_checkout(self, value: Optional[pulumi.Input['RepoSparseCheckoutArgs']]):
        pulumi.set(self, "sparse_checkout", value)

    @property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input[str]]:
        """
        name of the tag for initial checkout.  Conflicts with `branch`.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tag", value)


@pulumi.input_type
class _RepoState:
    def __init__(__self__, *,
                 branch: Optional[pulumi.Input[str]] = None,
                 commit_hash: Optional[pulumi.Input[str]] = None,
                 git_provider: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 sparse_checkout: Optional[pulumi.Input['RepoSparseCheckoutArgs']] = None,
                 tag: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 workspace_path: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Repo resources.
        :param pulumi.Input[str] branch: name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
        :param pulumi.Input[str] commit_hash: Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
        :param pulumi.Input[str] git_provider: case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        :param pulumi.Input[str] path: path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
        :param pulumi.Input[str] tag: name of the tag for initial checkout.  Conflicts with `branch`.
        :param pulumi.Input[str] url: The URL of the Git Repository to clone from. If the value changes, repo is re-created.
        :param pulumi.Input[str] workspace_path: path on Workspace File System (WSFS) in form of `/Workspace` + `path`
        """
        if branch is not None:
            pulumi.set(__self__, "branch", branch)
        if commit_hash is not None:
            pulumi.set(__self__, "commit_hash", commit_hash)
        if git_provider is not None:
            pulumi.set(__self__, "git_provider", git_provider)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if sparse_checkout is not None:
            pulumi.set(__self__, "sparse_checkout", sparse_checkout)
        if tag is not None:
            pulumi.set(__self__, "tag", tag)
        if url is not None:
            pulumi.set(__self__, "url", url)
        if workspace_path is not None:
            pulumi.set(__self__, "workspace_path", workspace_path)

    @property
    @pulumi.getter
    def branch(self) -> Optional[pulumi.Input[str]]:
        """
        name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
        """
        return pulumi.get(self, "branch")

    @branch.setter
    def branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branch", value)

    @property
    @pulumi.getter(name="commitHash")
    def commit_hash(self) -> Optional[pulumi.Input[str]]:
        """
        Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
        """
        return pulumi.get(self, "commit_hash")

    @commit_hash.setter
    def commit_hash(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "commit_hash", value)

    @property
    @pulumi.getter(name="gitProvider")
    def git_provider(self) -> Optional[pulumi.Input[str]]:
        """
        case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        """
        return pulumi.get(self, "git_provider")

    @git_provider.setter
    def git_provider(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_provider", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="sparseCheckout")
    def sparse_checkout(self) -> Optional[pulumi.Input['RepoSparseCheckoutArgs']]:
        return pulumi.get(self, "sparse_checkout")

    @sparse_checkout.setter
    def sparse_checkout(self, value: Optional[pulumi.Input['RepoSparseCheckoutArgs']]):
        pulumi.set(self, "sparse_checkout", value)

    @property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input[str]]:
        """
        name of the tag for initial checkout.  Conflicts with `branch`.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tag", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL of the Git Repository to clone from. If the value changes, repo is re-created.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter(name="workspacePath")
    def workspace_path(self) -> Optional[pulumi.Input[str]]:
        """
        path on Workspace File System (WSFS) in form of `/Workspace` + `path`
        """
        return pulumi.get(self, "workspace_path")

    @workspace_path.setter
    def workspace_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workspace_path", value)


class Repo(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 commit_hash: Optional[pulumi.Input[str]] = None,
                 git_provider: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 sparse_checkout: Optional[pulumi.Input[pulumi.InputType['RepoSparseCheckoutArgs']]] = None,
                 tag: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        The resource Repo can be imported using the Repo ID (obtained via UI or using API)

        bash

        ```sh
        $ pulumi import databricks:index/repo:Repo this repo_id
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] branch: name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
        :param pulumi.Input[str] commit_hash: Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
        :param pulumi.Input[str] git_provider: case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        :param pulumi.Input[str] path: path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
        :param pulumi.Input[str] tag: name of the tag for initial checkout.  Conflicts with `branch`.
        :param pulumi.Input[str] url: The URL of the Git Repository to clone from. If the value changes, repo is re-created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RepoArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        The resource Repo can be imported using the Repo ID (obtained via UI or using API)

        bash

        ```sh
        $ pulumi import databricks:index/repo:Repo this repo_id
        ```

        :param str resource_name: The name of the resource.
        :param RepoArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RepoArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 commit_hash: Optional[pulumi.Input[str]] = None,
                 git_provider: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 sparse_checkout: Optional[pulumi.Input[pulumi.InputType['RepoSparseCheckoutArgs']]] = None,
                 tag: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RepoArgs.__new__(RepoArgs)

            __props__.__dict__["branch"] = branch
            __props__.__dict__["commit_hash"] = commit_hash
            __props__.__dict__["git_provider"] = git_provider
            __props__.__dict__["path"] = path
            __props__.__dict__["sparse_checkout"] = sparse_checkout
            __props__.__dict__["tag"] = tag
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
            __props__.__dict__["workspace_path"] = None
        super(Repo, __self__).__init__(
            'databricks:index/repo:Repo',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            branch: Optional[pulumi.Input[str]] = None,
            commit_hash: Optional[pulumi.Input[str]] = None,
            git_provider: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            sparse_checkout: Optional[pulumi.Input[pulumi.InputType['RepoSparseCheckoutArgs']]] = None,
            tag: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None,
            workspace_path: Optional[pulumi.Input[str]] = None) -> 'Repo':
        """
        Get an existing Repo resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] branch: name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
        :param pulumi.Input[str] commit_hash: Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
        :param pulumi.Input[str] git_provider: case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        :param pulumi.Input[str] path: path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
        :param pulumi.Input[str] tag: name of the tag for initial checkout.  Conflicts with `branch`.
        :param pulumi.Input[str] url: The URL of the Git Repository to clone from. If the value changes, repo is re-created.
        :param pulumi.Input[str] workspace_path: path on Workspace File System (WSFS) in form of `/Workspace` + `path`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RepoState.__new__(_RepoState)

        __props__.__dict__["branch"] = branch
        __props__.__dict__["commit_hash"] = commit_hash
        __props__.__dict__["git_provider"] = git_provider
        __props__.__dict__["path"] = path
        __props__.__dict__["sparse_checkout"] = sparse_checkout
        __props__.__dict__["tag"] = tag
        __props__.__dict__["url"] = url
        __props__.__dict__["workspace_path"] = workspace_path
        return Repo(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def branch(self) -> pulumi.Output[str]:
        """
        name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
        """
        return pulumi.get(self, "branch")

    @property
    @pulumi.getter(name="commitHash")
    def commit_hash(self) -> pulumi.Output[str]:
        """
        Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
        """
        return pulumi.get(self, "commit_hash")

    @property
    @pulumi.getter(name="gitProvider")
    def git_provider(self) -> pulumi.Output[str]:
        """
        case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        """
        return pulumi.get(self, "git_provider")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[str]:
        """
        path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="sparseCheckout")
    def sparse_checkout(self) -> pulumi.Output[Optional['outputs.RepoSparseCheckout']]:
        return pulumi.get(self, "sparse_checkout")

    @property
    @pulumi.getter
    def tag(self) -> pulumi.Output[Optional[str]]:
        """
        name of the tag for initial checkout.  Conflicts with `branch`.
        """
        return pulumi.get(self, "tag")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        The URL of the Git Repository to clone from. If the value changes, repo is re-created.
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="workspacePath")
    def workspace_path(self) -> pulumi.Output[str]:
        """
        path on Workspace File System (WSFS) in form of `/Workspace` + `path`
        """
        return pulumi.get(self, "workspace_path")

