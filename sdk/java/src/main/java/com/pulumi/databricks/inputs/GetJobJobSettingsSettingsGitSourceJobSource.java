// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsGitSourceJobSource extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsGitSourceJobSource Empty = new GetJobJobSettingsSettingsGitSourceJobSource();

    @Import(name="dirtyState")
    private @Nullable String dirtyState;

    public Optional<String> dirtyState() {
        return Optional.ofNullable(this.dirtyState);
    }

    @Import(name="importFromGitBranch", required=true)
    private String importFromGitBranch;

    public String importFromGitBranch() {
        return this.importFromGitBranch;
    }

    @Import(name="jobConfigPath", required=true)
    private String jobConfigPath;

    public String jobConfigPath() {
        return this.jobConfigPath;
    }

    private GetJobJobSettingsSettingsGitSourceJobSource() {}

    private GetJobJobSettingsSettingsGitSourceJobSource(GetJobJobSettingsSettingsGitSourceJobSource $) {
        this.dirtyState = $.dirtyState;
        this.importFromGitBranch = $.importFromGitBranch;
        this.jobConfigPath = $.jobConfigPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsGitSourceJobSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsGitSourceJobSource $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsGitSourceJobSource();
        }

        public Builder(GetJobJobSettingsSettingsGitSourceJobSource defaults) {
            $ = new GetJobJobSettingsSettingsGitSourceJobSource(Objects.requireNonNull(defaults));
        }

        public Builder dirtyState(@Nullable String dirtyState) {
            $.dirtyState = dirtyState;
            return this;
        }

        public Builder importFromGitBranch(String importFromGitBranch) {
            $.importFromGitBranch = importFromGitBranch;
            return this;
        }

        public Builder jobConfigPath(String jobConfigPath) {
            $.jobConfigPath = jobConfigPath;
            return this;
        }

        public GetJobJobSettingsSettingsGitSourceJobSource build() {
            if ($.importFromGitBranch == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsGitSourceJobSource", "importFromGitBranch");
            }
            if ($.jobConfigPath == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsGitSourceJobSource", "jobConfigPath");
            }
            return $;
        }
    }

}
