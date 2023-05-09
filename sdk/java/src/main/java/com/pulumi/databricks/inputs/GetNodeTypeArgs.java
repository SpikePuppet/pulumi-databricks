// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodeTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodeTypeArgs Empty = new GetNodeTypeArgs();

    /**
     * Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq &#39;.node_types[]|.category&#39;|sort |uniq`):
     * * `General Purpose` (all clouds)
     * * `General Purpose (HDD)` (Azure)
     * * `Compute Optimized` (all clouds)
     * * `Memory Optimized` (all clouds)
     * * `Memory Optimized (Remote HDD)` (Azure)
     * * `Storage Optimized` (AWS, Azure)
     * * `GPU Accelerated` (AWS, Azure)
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq &#39;.node_types[]|.category&#39;|sort |uniq`):
     * * `General Purpose` (all clouds)
     * * `General Purpose (HDD)` (Azure)
     * * `Compute Optimized` (all clouds)
     * * `Memory Optimized` (all clouds)
     * * `Memory Optimized (Remote HDD)` (Azure)
     * * `Storage Optimized` (AWS, Azure)
     * * `GPU Accelerated` (AWS, Azure)
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * if we should limit the search only to [AWS fleet instance types](https://docs.databricks.com/compute/aws-fleet-instances.html). Default to *false*.
     * 
     */
    @Import(name="fleet")
    private @Nullable Output<Boolean> fleet;

    /**
     * @return if we should limit the search only to [AWS fleet instance types](https://docs.databricks.com/compute/aws-fleet-instances.html). Default to *false*.
     * 
     */
    public Optional<Output<Boolean>> fleet() {
        return Optional.ofNullable(this.fleet);
    }

    /**
     * Number of gigabytes per core available on instance. Conflicts with `min_memory_gb`. Defaults to *0*.
     * 
     */
    @Import(name="gbPerCore")
    private @Nullable Output<Integer> gbPerCore;

    /**
     * @return Number of gigabytes per core available on instance. Conflicts with `min_memory_gb`. Defaults to *0*.
     * 
     */
    public Optional<Output<Integer>> gbPerCore() {
        return Optional.ofNullable(this.gbPerCore);
    }

    /**
     * if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
     * 
     */
    @Import(name="graviton")
    private @Nullable Output<Boolean> graviton;

    /**
     * @return if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
     * 
     */
    public Optional<Output<Boolean>> graviton() {
        return Optional.ofNullable(this.graviton);
    }

    /**
     * node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * . Pick only nodes that have IO Cache. Defaults to *false*.
     * 
     */
    @Import(name="isIoCacheEnabled")
    private @Nullable Output<Boolean> isIoCacheEnabled;

    /**
     * @return . Pick only nodes that have IO Cache. Defaults to *false*.
     * 
     */
    public Optional<Output<Boolean>> isIoCacheEnabled() {
        return Optional.ofNullable(this.isIoCacheEnabled);
    }

    /**
     * Pick only nodes with local storage. Defaults to *false*.
     * 
     */
    @Import(name="localDisk")
    private @Nullable Output<Boolean> localDisk;

    /**
     * @return Pick only nodes with local storage. Defaults to *false*.
     * 
     */
    public Optional<Output<Boolean>> localDisk() {
        return Optional.ofNullable(this.localDisk);
    }

    /**
     * Pick only nodes that have size local storage greater or equal to given value. Defaults to *0*.
     * 
     */
    @Import(name="localDiskMinSize")
    private @Nullable Output<Integer> localDiskMinSize;

    /**
     * @return Pick only nodes that have size local storage greater or equal to given value. Defaults to *0*.
     * 
     */
    public Optional<Output<Integer>> localDiskMinSize() {
        return Optional.ofNullable(this.localDiskMinSize);
    }

    /**
     * Minimum number of CPU cores available on instance. Defaults to *0*.
     * 
     */
    @Import(name="minCores")
    private @Nullable Output<Integer> minCores;

    /**
     * @return Minimum number of CPU cores available on instance. Defaults to *0*.
     * 
     */
    public Optional<Output<Integer>> minCores() {
        return Optional.ofNullable(this.minCores);
    }

    /**
     * Minimum number of GPU&#39;s attached to instance. Defaults to *0*.
     * 
     */
    @Import(name="minGpus")
    private @Nullable Output<Integer> minGpus;

    /**
     * @return Minimum number of GPU&#39;s attached to instance. Defaults to *0*.
     * 
     */
    public Optional<Output<Integer>> minGpus() {
        return Optional.ofNullable(this.minGpus);
    }

    /**
     * Minimum amount of memory per node in gigabytes. Defaults to *0*.
     * 
     */
    @Import(name="minMemoryGb")
    private @Nullable Output<Integer> minMemoryGb;

    /**
     * @return Minimum amount of memory per node in gigabytes. Defaults to *0*.
     * 
     */
    public Optional<Output<Integer>> minMemoryGb() {
        return Optional.ofNullable(this.minMemoryGb);
    }

    /**
     * Pick only nodes that can run Photon driver. Defaults to *false*.
     * 
     */
    @Import(name="photonDriverCapable")
    private @Nullable Output<Boolean> photonDriverCapable;

    /**
     * @return Pick only nodes that can run Photon driver. Defaults to *false*.
     * 
     */
    public Optional<Output<Boolean>> photonDriverCapable() {
        return Optional.ofNullable(this.photonDriverCapable);
    }

    /**
     * Pick only nodes that can run Photon workers. Defaults to *false*.
     * 
     */
    @Import(name="photonWorkerCapable")
    private @Nullable Output<Boolean> photonWorkerCapable;

    /**
     * @return Pick only nodes that can run Photon workers. Defaults to *false*.
     * 
     */
    public Optional<Output<Boolean>> photonWorkerCapable() {
        return Optional.ofNullable(this.photonWorkerCapable);
    }

    /**
     * Pick only nodes that support port forwarding. Defaults to *false*.
     * 
     */
    @Import(name="supportPortForwarding")
    private @Nullable Output<Boolean> supportPortForwarding;

    /**
     * @return Pick only nodes that support port forwarding. Defaults to *false*.
     * 
     */
    public Optional<Output<Boolean>> supportPortForwarding() {
        return Optional.ofNullable(this.supportPortForwarding);
    }

    private GetNodeTypeArgs() {}

    private GetNodeTypeArgs(GetNodeTypeArgs $) {
        this.category = $.category;
        this.fleet = $.fleet;
        this.gbPerCore = $.gbPerCore;
        this.graviton = $.graviton;
        this.id = $.id;
        this.isIoCacheEnabled = $.isIoCacheEnabled;
        this.localDisk = $.localDisk;
        this.localDiskMinSize = $.localDiskMinSize;
        this.minCores = $.minCores;
        this.minGpus = $.minGpus;
        this.minMemoryGb = $.minMemoryGb;
        this.photonDriverCapable = $.photonDriverCapable;
        this.photonWorkerCapable = $.photonWorkerCapable;
        this.supportPortForwarding = $.supportPortForwarding;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodeTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodeTypeArgs $;

        public Builder() {
            $ = new GetNodeTypeArgs();
        }

        public Builder(GetNodeTypeArgs defaults) {
            $ = new GetNodeTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq &#39;.node_types[]|.category&#39;|sort |uniq`):
         * * `General Purpose` (all clouds)
         * * `General Purpose (HDD)` (Azure)
         * * `Compute Optimized` (all clouds)
         * * `Memory Optimized` (all clouds)
         * * `Memory Optimized (Remote HDD)` (Azure)
         * * `Storage Optimized` (AWS, Azure)
         * * `GPU Accelerated` (AWS, Azure)
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq &#39;.node_types[]|.category&#39;|sort |uniq`):
         * * `General Purpose` (all clouds)
         * * `General Purpose (HDD)` (Azure)
         * * `Compute Optimized` (all clouds)
         * * `Memory Optimized` (all clouds)
         * * `Memory Optimized (Remote HDD)` (Azure)
         * * `Storage Optimized` (AWS, Azure)
         * * `GPU Accelerated` (AWS, Azure)
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param fleet if we should limit the search only to [AWS fleet instance types](https://docs.databricks.com/compute/aws-fleet-instances.html). Default to *false*.
         * 
         * @return builder
         * 
         */
        public Builder fleet(@Nullable Output<Boolean> fleet) {
            $.fleet = fleet;
            return this;
        }

        /**
         * @param fleet if we should limit the search only to [AWS fleet instance types](https://docs.databricks.com/compute/aws-fleet-instances.html). Default to *false*.
         * 
         * @return builder
         * 
         */
        public Builder fleet(Boolean fleet) {
            return fleet(Output.of(fleet));
        }

        /**
         * @param gbPerCore Number of gigabytes per core available on instance. Conflicts with `min_memory_gb`. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder gbPerCore(@Nullable Output<Integer> gbPerCore) {
            $.gbPerCore = gbPerCore;
            return this;
        }

        /**
         * @param gbPerCore Number of gigabytes per core available on instance. Conflicts with `min_memory_gb`. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder gbPerCore(Integer gbPerCore) {
            return gbPerCore(Output.of(gbPerCore));
        }

        /**
         * @param graviton if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
         * 
         * @return builder
         * 
         */
        public Builder graviton(@Nullable Output<Boolean> graviton) {
            $.graviton = graviton;
            return this;
        }

        /**
         * @param graviton if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
         * 
         * @return builder
         * 
         */
        public Builder graviton(Boolean graviton) {
            return graviton(Output.of(graviton));
        }

        /**
         * @param id node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param isIoCacheEnabled . Pick only nodes that have IO Cache. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder isIoCacheEnabled(@Nullable Output<Boolean> isIoCacheEnabled) {
            $.isIoCacheEnabled = isIoCacheEnabled;
            return this;
        }

        /**
         * @param isIoCacheEnabled . Pick only nodes that have IO Cache. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder isIoCacheEnabled(Boolean isIoCacheEnabled) {
            return isIoCacheEnabled(Output.of(isIoCacheEnabled));
        }

        /**
         * @param localDisk Pick only nodes with local storage. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder localDisk(@Nullable Output<Boolean> localDisk) {
            $.localDisk = localDisk;
            return this;
        }

        /**
         * @param localDisk Pick only nodes with local storage. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder localDisk(Boolean localDisk) {
            return localDisk(Output.of(localDisk));
        }

        /**
         * @param localDiskMinSize Pick only nodes that have size local storage greater or equal to given value. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder localDiskMinSize(@Nullable Output<Integer> localDiskMinSize) {
            $.localDiskMinSize = localDiskMinSize;
            return this;
        }

        /**
         * @param localDiskMinSize Pick only nodes that have size local storage greater or equal to given value. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder localDiskMinSize(Integer localDiskMinSize) {
            return localDiskMinSize(Output.of(localDiskMinSize));
        }

        /**
         * @param minCores Minimum number of CPU cores available on instance. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder minCores(@Nullable Output<Integer> minCores) {
            $.minCores = minCores;
            return this;
        }

        /**
         * @param minCores Minimum number of CPU cores available on instance. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder minCores(Integer minCores) {
            return minCores(Output.of(minCores));
        }

        /**
         * @param minGpus Minimum number of GPU&#39;s attached to instance. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder minGpus(@Nullable Output<Integer> minGpus) {
            $.minGpus = minGpus;
            return this;
        }

        /**
         * @param minGpus Minimum number of GPU&#39;s attached to instance. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder minGpus(Integer minGpus) {
            return minGpus(Output.of(minGpus));
        }

        /**
         * @param minMemoryGb Minimum amount of memory per node in gigabytes. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder minMemoryGb(@Nullable Output<Integer> minMemoryGb) {
            $.minMemoryGb = minMemoryGb;
            return this;
        }

        /**
         * @param minMemoryGb Minimum amount of memory per node in gigabytes. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder minMemoryGb(Integer minMemoryGb) {
            return minMemoryGb(Output.of(minMemoryGb));
        }

        /**
         * @param photonDriverCapable Pick only nodes that can run Photon driver. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder photonDriverCapable(@Nullable Output<Boolean> photonDriverCapable) {
            $.photonDriverCapable = photonDriverCapable;
            return this;
        }

        /**
         * @param photonDriverCapable Pick only nodes that can run Photon driver. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder photonDriverCapable(Boolean photonDriverCapable) {
            return photonDriverCapable(Output.of(photonDriverCapable));
        }

        /**
         * @param photonWorkerCapable Pick only nodes that can run Photon workers. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder photonWorkerCapable(@Nullable Output<Boolean> photonWorkerCapable) {
            $.photonWorkerCapable = photonWorkerCapable;
            return this;
        }

        /**
         * @param photonWorkerCapable Pick only nodes that can run Photon workers. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder photonWorkerCapable(Boolean photonWorkerCapable) {
            return photonWorkerCapable(Output.of(photonWorkerCapable));
        }

        /**
         * @param supportPortForwarding Pick only nodes that support port forwarding. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder supportPortForwarding(@Nullable Output<Boolean> supportPortForwarding) {
            $.supportPortForwarding = supportPortForwarding;
            return this;
        }

        /**
         * @param supportPortForwarding Pick only nodes that support port forwarding. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder supportPortForwarding(Boolean supportPortForwarding) {
            return supportPortForwarding(Output.of(supportPortForwarding));
        }

        public GetNodeTypeArgs build() {
            return $;
        }
    }

}
