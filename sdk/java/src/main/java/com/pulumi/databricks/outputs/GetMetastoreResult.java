// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetMetastoreMetastoreInfo;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMetastoreResult {
    /**
     * @return ID of the metastore
     * 
     */
    private String id;
    private String metastoreId;
    /**
     * @return MetastoreInfo object for a databricks_metastore. This contains the following attributes:
     * 
     */
    private GetMetastoreMetastoreInfo metastoreInfo;
    /**
     * @return Name of metastore.
     * 
     */
    private String name;
    private String region;

    private GetMetastoreResult() {}
    /**
     * @return ID of the metastore
     * 
     */
    public String id() {
        return this.id;
    }
    public String metastoreId() {
        return this.metastoreId;
    }
    /**
     * @return MetastoreInfo object for a databricks_metastore. This contains the following attributes:
     * 
     */
    public GetMetastoreMetastoreInfo metastoreInfo() {
        return this.metastoreInfo;
    }
    /**
     * @return Name of metastore.
     * 
     */
    public String name() {
        return this.name;
    }
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetastoreResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String metastoreId;
        private GetMetastoreMetastoreInfo metastoreInfo;
        private String name;
        private String region;
        public Builder() {}
        public Builder(GetMetastoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.metastoreId = defaults.metastoreId;
    	      this.metastoreInfo = defaults.metastoreInfo;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetMetastoreResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder metastoreId(String metastoreId) {
            if (metastoreId == null) {
              throw new MissingRequiredPropertyException("GetMetastoreResult", "metastoreId");
            }
            this.metastoreId = metastoreId;
            return this;
        }
        @CustomType.Setter
        public Builder metastoreInfo(GetMetastoreMetastoreInfo metastoreInfo) {
            if (metastoreInfo == null) {
              throw new MissingRequiredPropertyException("GetMetastoreResult", "metastoreInfo");
            }
            this.metastoreInfo = metastoreInfo;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetMetastoreResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetMetastoreResult", "region");
            }
            this.region = region;
            return this;
        }
        public GetMetastoreResult build() {
            final var _resultValue = new GetMetastoreResult();
            _resultValue.id = id;
            _resultValue.metastoreId = metastoreId;
            _resultValue.metastoreInfo = metastoreInfo;
            _resultValue.name = name;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
