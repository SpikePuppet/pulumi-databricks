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

__all__ = ['SqlPermissionsArgs', 'SqlPermissions']

@pulumi.input_type
class SqlPermissionsArgs:
    def __init__(__self__, *,
                 anonymous_function: Optional[pulumi.Input[bool]] = None,
                 any_file: Optional[pulumi.Input[bool]] = None,
                 catalog: Optional[pulumi.Input[bool]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 privilege_assignments: Optional[pulumi.Input[Sequence[pulumi.Input['SqlPermissionsPrivilegeAssignmentArgs']]]] = None,
                 table: Optional[pulumi.Input[str]] = None,
                 view: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SqlPermissions resource.
        :param pulumi.Input[bool] anonymous_function: If this access control for using anonymous function. Defaults to `false`.
        :param pulumi.Input[bool] any_file: If this access control for reading/writing any file. Defaults to `false`.
        :param pulumi.Input[bool] catalog: If this access control for the entire catalog. Defaults to `false`.
        :param pulumi.Input[str] database: Name of the database. Has default value of `default`.
        :param pulumi.Input[str] table: Name of the table. Can be combined with `database`.
        :param pulumi.Input[str] view: Name of the view. Can be combined with `database`.
        """
        if anonymous_function is not None:
            pulumi.set(__self__, "anonymous_function", anonymous_function)
        if any_file is not None:
            pulumi.set(__self__, "any_file", any_file)
        if catalog is not None:
            pulumi.set(__self__, "catalog", catalog)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if privilege_assignments is not None:
            pulumi.set(__self__, "privilege_assignments", privilege_assignments)
        if table is not None:
            pulumi.set(__self__, "table", table)
        if view is not None:
            pulumi.set(__self__, "view", view)

    @property
    @pulumi.getter(name="anonymousFunction")
    def anonymous_function(self) -> Optional[pulumi.Input[bool]]:
        """
        If this access control for using anonymous function. Defaults to `false`.
        """
        return pulumi.get(self, "anonymous_function")

    @anonymous_function.setter
    def anonymous_function(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "anonymous_function", value)

    @property
    @pulumi.getter(name="anyFile")
    def any_file(self) -> Optional[pulumi.Input[bool]]:
        """
        If this access control for reading/writing any file. Defaults to `false`.
        """
        return pulumi.get(self, "any_file")

    @any_file.setter
    def any_file(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "any_file", value)

    @property
    @pulumi.getter
    def catalog(self) -> Optional[pulumi.Input[bool]]:
        """
        If this access control for the entire catalog. Defaults to `false`.
        """
        return pulumi.get(self, "catalog")

    @catalog.setter
    def catalog(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "catalog", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the database. Has default value of `default`.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="privilegeAssignments")
    def privilege_assignments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SqlPermissionsPrivilegeAssignmentArgs']]]]:
        return pulumi.get(self, "privilege_assignments")

    @privilege_assignments.setter
    def privilege_assignments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SqlPermissionsPrivilegeAssignmentArgs']]]]):
        pulumi.set(self, "privilege_assignments", value)

    @property
    @pulumi.getter
    def table(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the table. Can be combined with `database`.
        """
        return pulumi.get(self, "table")

    @table.setter
    def table(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "table", value)

    @property
    @pulumi.getter
    def view(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the view. Can be combined with `database`.
        """
        return pulumi.get(self, "view")

    @view.setter
    def view(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "view", value)


@pulumi.input_type
class _SqlPermissionsState:
    def __init__(__self__, *,
                 anonymous_function: Optional[pulumi.Input[bool]] = None,
                 any_file: Optional[pulumi.Input[bool]] = None,
                 catalog: Optional[pulumi.Input[bool]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 privilege_assignments: Optional[pulumi.Input[Sequence[pulumi.Input['SqlPermissionsPrivilegeAssignmentArgs']]]] = None,
                 table: Optional[pulumi.Input[str]] = None,
                 view: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SqlPermissions resources.
        :param pulumi.Input[bool] anonymous_function: If this access control for using anonymous function. Defaults to `false`.
        :param pulumi.Input[bool] any_file: If this access control for reading/writing any file. Defaults to `false`.
        :param pulumi.Input[bool] catalog: If this access control for the entire catalog. Defaults to `false`.
        :param pulumi.Input[str] database: Name of the database. Has default value of `default`.
        :param pulumi.Input[str] table: Name of the table. Can be combined with `database`.
        :param pulumi.Input[str] view: Name of the view. Can be combined with `database`.
        """
        if anonymous_function is not None:
            pulumi.set(__self__, "anonymous_function", anonymous_function)
        if any_file is not None:
            pulumi.set(__self__, "any_file", any_file)
        if catalog is not None:
            pulumi.set(__self__, "catalog", catalog)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if privilege_assignments is not None:
            pulumi.set(__self__, "privilege_assignments", privilege_assignments)
        if table is not None:
            pulumi.set(__self__, "table", table)
        if view is not None:
            pulumi.set(__self__, "view", view)

    @property
    @pulumi.getter(name="anonymousFunction")
    def anonymous_function(self) -> Optional[pulumi.Input[bool]]:
        """
        If this access control for using anonymous function. Defaults to `false`.
        """
        return pulumi.get(self, "anonymous_function")

    @anonymous_function.setter
    def anonymous_function(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "anonymous_function", value)

    @property
    @pulumi.getter(name="anyFile")
    def any_file(self) -> Optional[pulumi.Input[bool]]:
        """
        If this access control for reading/writing any file. Defaults to `false`.
        """
        return pulumi.get(self, "any_file")

    @any_file.setter
    def any_file(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "any_file", value)

    @property
    @pulumi.getter
    def catalog(self) -> Optional[pulumi.Input[bool]]:
        """
        If this access control for the entire catalog. Defaults to `false`.
        """
        return pulumi.get(self, "catalog")

    @catalog.setter
    def catalog(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "catalog", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the database. Has default value of `default`.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="privilegeAssignments")
    def privilege_assignments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SqlPermissionsPrivilegeAssignmentArgs']]]]:
        return pulumi.get(self, "privilege_assignments")

    @privilege_assignments.setter
    def privilege_assignments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SqlPermissionsPrivilegeAssignmentArgs']]]]):
        pulumi.set(self, "privilege_assignments", value)

    @property
    @pulumi.getter
    def table(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the table. Can be combined with `database`.
        """
        return pulumi.get(self, "table")

    @table.setter
    def table(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "table", value)

    @property
    @pulumi.getter
    def view(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the view. Can be combined with `database`.
        """
        return pulumi.get(self, "view")

    @view.setter
    def view(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "view", value)


class SqlPermissions(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 anonymous_function: Optional[pulumi.Input[bool]] = None,
                 any_file: Optional[pulumi.Input[bool]] = None,
                 catalog: Optional[pulumi.Input[bool]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 privilege_assignments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SqlPermissionsPrivilegeAssignmentArgs']]]]] = None,
                 table: Optional[pulumi.Input[str]] = None,
                 view: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        The following resource definition will enforce access control on a table by executing the following SQL queries on a special auto-terminating cluster it would create for this operation:

        * ``` SHOW GRANT ON TABLE `default`.`foo`  ```
        * ```REVOKE ALL PRIVILEGES ON TABLE `default`.`foo` FROM ... every group and user that has access to it ...```
        * ``` GRANT MODIFY, SELECT ON TABLE `default`.`foo` TO `serge@example.com`  ```
        * ``` GRANT SELECT ON TABLE `default`.`foo` TO `special group`  ```

        ```python
        import pulumi
        import pulumi_databricks as databricks

        foo_table = databricks.SqlPermissions("fooTable",
            privilege_assignments=[
                databricks.SqlPermissionsPrivilegeAssignmentArgs(
                    principal="serge@example.com",
                    privileges=[
                        "SELECT",
                        "MODIFY",
                    ],
                ),
                databricks.SqlPermissionsPrivilegeAssignmentArgs(
                    principal="special group",
                    privileges=["SELECT"],
                ),
            ],
            table="foo")
        ```
        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Grants to manage data access in Unity Catalog.
        * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        * User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to Group within the workspace.

        ## Import

        The resource can be imported using a synthetic identifier. Examples of valid synthetic identifiers are* `table/default.foo` - table `foo` in a `default` database. Database is always mandatory. * `view/bar.foo` - view `foo` in `bar` database. * `database/bar` - `bar` database. * `catalog/` - entire catalog. `/` suffix is mandatory. * `any file/` - direct access to any file. `/` suffix is mandatory. * `anonymous function/` - anonymous function. `/` suffix is mandatory. bash

        ```sh
         $ pulumi import databricks:index/sqlPermissions:SqlPermissions foo /<object-type>/<object-name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] anonymous_function: If this access control for using anonymous function. Defaults to `false`.
        :param pulumi.Input[bool] any_file: If this access control for reading/writing any file. Defaults to `false`.
        :param pulumi.Input[bool] catalog: If this access control for the entire catalog. Defaults to `false`.
        :param pulumi.Input[str] database: Name of the database. Has default value of `default`.
        :param pulumi.Input[str] table: Name of the table. Can be combined with `database`.
        :param pulumi.Input[str] view: Name of the view. Can be combined with `database`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SqlPermissionsArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        The following resource definition will enforce access control on a table by executing the following SQL queries on a special auto-terminating cluster it would create for this operation:

        * ``` SHOW GRANT ON TABLE `default`.`foo`  ```
        * ```REVOKE ALL PRIVILEGES ON TABLE `default`.`foo` FROM ... every group and user that has access to it ...```
        * ``` GRANT MODIFY, SELECT ON TABLE `default`.`foo` TO `serge@example.com`  ```
        * ``` GRANT SELECT ON TABLE `default`.`foo` TO `special group`  ```

        ```python
        import pulumi
        import pulumi_databricks as databricks

        foo_table = databricks.SqlPermissions("fooTable",
            privilege_assignments=[
                databricks.SqlPermissionsPrivilegeAssignmentArgs(
                    principal="serge@example.com",
                    privileges=[
                        "SELECT",
                        "MODIFY",
                    ],
                ),
                databricks.SqlPermissionsPrivilegeAssignmentArgs(
                    principal="special group",
                    privileges=["SELECT"],
                ),
            ],
            table="foo")
        ```
        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Grants to manage data access in Unity Catalog.
        * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        * User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to Group within the workspace.

        ## Import

        The resource can be imported using a synthetic identifier. Examples of valid synthetic identifiers are* `table/default.foo` - table `foo` in a `default` database. Database is always mandatory. * `view/bar.foo` - view `foo` in `bar` database. * `database/bar` - `bar` database. * `catalog/` - entire catalog. `/` suffix is mandatory. * `any file/` - direct access to any file. `/` suffix is mandatory. * `anonymous function/` - anonymous function. `/` suffix is mandatory. bash

        ```sh
         $ pulumi import databricks:index/sqlPermissions:SqlPermissions foo /<object-type>/<object-name>
        ```

        :param str resource_name: The name of the resource.
        :param SqlPermissionsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SqlPermissionsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 anonymous_function: Optional[pulumi.Input[bool]] = None,
                 any_file: Optional[pulumi.Input[bool]] = None,
                 catalog: Optional[pulumi.Input[bool]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 privilege_assignments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SqlPermissionsPrivilegeAssignmentArgs']]]]] = None,
                 table: Optional[pulumi.Input[str]] = None,
                 view: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SqlPermissionsArgs.__new__(SqlPermissionsArgs)

            __props__.__dict__["anonymous_function"] = anonymous_function
            __props__.__dict__["any_file"] = any_file
            __props__.__dict__["catalog"] = catalog
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["database"] = database
            __props__.__dict__["privilege_assignments"] = privilege_assignments
            __props__.__dict__["table"] = table
            __props__.__dict__["view"] = view
        super(SqlPermissions, __self__).__init__(
            'databricks:index/sqlPermissions:SqlPermissions',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            anonymous_function: Optional[pulumi.Input[bool]] = None,
            any_file: Optional[pulumi.Input[bool]] = None,
            catalog: Optional[pulumi.Input[bool]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            privilege_assignments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SqlPermissionsPrivilegeAssignmentArgs']]]]] = None,
            table: Optional[pulumi.Input[str]] = None,
            view: Optional[pulumi.Input[str]] = None) -> 'SqlPermissions':
        """
        Get an existing SqlPermissions resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] anonymous_function: If this access control for using anonymous function. Defaults to `false`.
        :param pulumi.Input[bool] any_file: If this access control for reading/writing any file. Defaults to `false`.
        :param pulumi.Input[bool] catalog: If this access control for the entire catalog. Defaults to `false`.
        :param pulumi.Input[str] database: Name of the database. Has default value of `default`.
        :param pulumi.Input[str] table: Name of the table. Can be combined with `database`.
        :param pulumi.Input[str] view: Name of the view. Can be combined with `database`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SqlPermissionsState.__new__(_SqlPermissionsState)

        __props__.__dict__["anonymous_function"] = anonymous_function
        __props__.__dict__["any_file"] = any_file
        __props__.__dict__["catalog"] = catalog
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["database"] = database
        __props__.__dict__["privilege_assignments"] = privilege_assignments
        __props__.__dict__["table"] = table
        __props__.__dict__["view"] = view
        return SqlPermissions(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="anonymousFunction")
    def anonymous_function(self) -> pulumi.Output[Optional[bool]]:
        """
        If this access control for using anonymous function. Defaults to `false`.
        """
        return pulumi.get(self, "anonymous_function")

    @property
    @pulumi.getter(name="anyFile")
    def any_file(self) -> pulumi.Output[Optional[bool]]:
        """
        If this access control for reading/writing any file. Defaults to `false`.
        """
        return pulumi.get(self, "any_file")

    @property
    @pulumi.getter
    def catalog(self) -> pulumi.Output[Optional[bool]]:
        """
        If this access control for the entire catalog. Defaults to `false`.
        """
        return pulumi.get(self, "catalog")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[Optional[str]]:
        """
        Name of the database. Has default value of `default`.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="privilegeAssignments")
    def privilege_assignments(self) -> pulumi.Output[Optional[Sequence['outputs.SqlPermissionsPrivilegeAssignment']]]:
        return pulumi.get(self, "privilege_assignments")

    @property
    @pulumi.getter
    def table(self) -> pulumi.Output[Optional[str]]:
        """
        Name of the table. Can be combined with `database`.
        """
        return pulumi.get(self, "table")

    @property
    @pulumi.getter
    def view(self) -> pulumi.Output[Optional[str]]:
        """
        Name of the view. Can be combined with `database`.
        """
        return pulumi.get(self, "view")

