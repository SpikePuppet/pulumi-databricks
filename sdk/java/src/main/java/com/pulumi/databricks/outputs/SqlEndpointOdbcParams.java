// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlEndpointOdbcParams {
    private @Nullable String host;
    private @Nullable String hostname;
    private String path;
    private Integer port;
    private String protocol;

    private SqlEndpointOdbcParams() {}
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    public String path() {
        return this.path;
    }
    public Integer port() {
        return this.port;
    }
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlEndpointOdbcParams defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String host;
        private @Nullable String hostname;
        private String path;
        private Integer port;
        private String protocol;
        public Builder() {}
        public Builder(SqlEndpointOdbcParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.hostname = defaults.hostname;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder host(@Nullable String host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {

            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("SqlEndpointOdbcParams", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("SqlEndpointOdbcParams", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("SqlEndpointOdbcParams", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        public SqlEndpointOdbcParams build() {
            final var _resultValue = new SqlEndpointOdbcParams();
            _resultValue.host = host;
            _resultValue.hostname = hostname;
            _resultValue.path = path;
            _resultValue.port = port;
            _resultValue.protocol = protocol;
            return _resultValue;
        }
    }
}
