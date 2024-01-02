// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobTaskNewClusterDockerImageBasicAuth {
    private String password;
    private String username;

    private JobTaskNewClusterDockerImageBasicAuth() {}
    public String password() {
        return this.password;
    }
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskNewClusterDockerImageBasicAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        private String username;
        public Builder() {}
        public Builder(JobTaskNewClusterDockerImageBasicAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("JobTaskNewClusterDockerImageBasicAuth", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("JobTaskNewClusterDockerImageBasicAuth", "username");
            }
            this.username = username;
            return this;
        }
        public JobTaskNewClusterDockerImageBasicAuth build() {
            final var _resultValue = new JobTaskNewClusterDockerImageBasicAuth();
            _resultValue.password = password;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
