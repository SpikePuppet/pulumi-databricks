// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.SqlPermissionsPrivilegeAssignmentArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlPermissionsState extends com.pulumi.resources.ResourceArgs {

    public static final SqlPermissionsState Empty = new SqlPermissionsState();

    /**
     * If this access control for using anonymous function. Defaults to `false`.
     * 
     */
    @Import(name="anonymousFunction")
    private @Nullable Output<Boolean> anonymousFunction;

    /**
     * @return If this access control for using anonymous function. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> anonymousFunction() {
        return Optional.ofNullable(this.anonymousFunction);
    }

    /**
     * If this access control for reading/writing any file. Defaults to `false`.
     * 
     */
    @Import(name="anyFile")
    private @Nullable Output<Boolean> anyFile;

    /**
     * @return If this access control for reading/writing any file. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> anyFile() {
        return Optional.ofNullable(this.anyFile);
    }

    /**
     * If this access control for the entire catalog. Defaults to `false`.
     * 
     */
    @Import(name="catalog")
    private @Nullable Output<Boolean> catalog;

    /**
     * @return If this access control for the entire catalog. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> catalog() {
        return Optional.ofNullable(this.catalog);
    }

    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * Name of the database. Has default value of `default`.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return Name of the database. Has default value of `default`.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    @Import(name="privilegeAssignments")
    private @Nullable Output<List<SqlPermissionsPrivilegeAssignmentArgs>> privilegeAssignments;

    public Optional<Output<List<SqlPermissionsPrivilegeAssignmentArgs>>> privilegeAssignments() {
        return Optional.ofNullable(this.privilegeAssignments);
    }

    /**
     * Name of the table. Can be combined with `database`.
     * 
     */
    @Import(name="table")
    private @Nullable Output<String> table;

    /**
     * @return Name of the table. Can be combined with `database`.
     * 
     */
    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    /**
     * Name of the view. Can be combined with `database`.
     * 
     */
    @Import(name="view")
    private @Nullable Output<String> view;

    /**
     * @return Name of the view. Can be combined with `database`.
     * 
     */
    public Optional<Output<String>> view() {
        return Optional.ofNullable(this.view);
    }

    private SqlPermissionsState() {}

    private SqlPermissionsState(SqlPermissionsState $) {
        this.anonymousFunction = $.anonymousFunction;
        this.anyFile = $.anyFile;
        this.catalog = $.catalog;
        this.clusterId = $.clusterId;
        this.database = $.database;
        this.privilegeAssignments = $.privilegeAssignments;
        this.table = $.table;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlPermissionsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlPermissionsState $;

        public Builder() {
            $ = new SqlPermissionsState();
        }

        public Builder(SqlPermissionsState defaults) {
            $ = new SqlPermissionsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param anonymousFunction If this access control for using anonymous function. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder anonymousFunction(@Nullable Output<Boolean> anonymousFunction) {
            $.anonymousFunction = anonymousFunction;
            return this;
        }

        /**
         * @param anonymousFunction If this access control for using anonymous function. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder anonymousFunction(Boolean anonymousFunction) {
            return anonymousFunction(Output.of(anonymousFunction));
        }

        /**
         * @param anyFile If this access control for reading/writing any file. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder anyFile(@Nullable Output<Boolean> anyFile) {
            $.anyFile = anyFile;
            return this;
        }

        /**
         * @param anyFile If this access control for reading/writing any file. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder anyFile(Boolean anyFile) {
            return anyFile(Output.of(anyFile));
        }

        /**
         * @param catalog If this access control for the entire catalog. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder catalog(@Nullable Output<Boolean> catalog) {
            $.catalog = catalog;
            return this;
        }

        /**
         * @param catalog If this access control for the entire catalog. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder catalog(Boolean catalog) {
            return catalog(Output.of(catalog));
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param database Name of the database. Has default value of `default`.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Name of the database. Has default value of `default`.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        public Builder privilegeAssignments(@Nullable Output<List<SqlPermissionsPrivilegeAssignmentArgs>> privilegeAssignments) {
            $.privilegeAssignments = privilegeAssignments;
            return this;
        }

        public Builder privilegeAssignments(List<SqlPermissionsPrivilegeAssignmentArgs> privilegeAssignments) {
            return privilegeAssignments(Output.of(privilegeAssignments));
        }

        public Builder privilegeAssignments(SqlPermissionsPrivilegeAssignmentArgs... privilegeAssignments) {
            return privilegeAssignments(List.of(privilegeAssignments));
        }

        /**
         * @param table Name of the table. Can be combined with `database`.
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table Name of the table. Can be combined with `database`.
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        /**
         * @param view Name of the view. Can be combined with `database`.
         * 
         * @return builder
         * 
         */
        public Builder view(@Nullable Output<String> view) {
            $.view = view;
            return this;
        }

        /**
         * @param view Name of the view. Can be combined with `database`.
         * 
         * @return builder
         * 
         */
        public Builder view(String view) {
            return view(Output.of(view));
        }

        public SqlPermissionsState build() {
            return $;
        }
    }

}
