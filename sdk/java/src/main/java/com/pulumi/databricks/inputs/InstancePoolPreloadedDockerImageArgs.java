// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.InstancePoolPreloadedDockerImageBasicAuthArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePoolPreloadedDockerImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstancePoolPreloadedDockerImageArgs Empty = new InstancePoolPreloadedDockerImageArgs();

    /**
     * `basic_auth.username` and `basic_auth.password` for Docker repository. Docker registry credentials are encrypted when they are stored in Databricks internal storage and when they are passed to a registry upon fetching Docker images at cluster launch. However, other authenticated and authorized API users of this workspace can access the username and password.
     * 
     * Example usage with azurerm_container_registry, that you can adapt to your specific use-case:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.docker.registryImage;
     * import com.pulumi.docker.RegistryImageArgs;
     * import com.pulumi.databricks.InstancePool;
     * import com.pulumi.databricks.InstancePoolArgs;
     * import com.pulumi.databricks.inputs.InstancePoolPreloadedDockerImageArgs;
     * import com.pulumi.databricks.inputs.InstancePoolPreloadedDockerImageBasicAuthArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var this_ = new RegistryImage("this", RegistryImageArgs.builder()        
     *             .build()
     *             .name(String.format("%s/sample:latest", thisAzurermContainerRegistry.loginServer()))
     *             .build());
     * 
     *         var thisInstancePool = new InstancePool("thisInstancePool", InstancePoolArgs.builder()        
     *             .preloadedDockerImages(InstancePoolPreloadedDockerImageArgs.builder()
     *                 .url(this_.name())
     *                 .basicAuth(InstancePoolPreloadedDockerImageBasicAuthArgs.builder()
     *                     .username(thisAzurermContainerRegistry.adminUsername())
     *                     .password(thisAzurermContainerRegistry.adminPassword())
     *                     .build())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    @Import(name="basicAuth")
    private @Nullable Output<InstancePoolPreloadedDockerImageBasicAuthArgs> basicAuth;

    /**
     * @return `basic_auth.username` and `basic_auth.password` for Docker repository. Docker registry credentials are encrypted when they are stored in Databricks internal storage and when they are passed to a registry upon fetching Docker images at cluster launch. However, other authenticated and authorized API users of this workspace can access the username and password.
     * 
     * Example usage with azurerm_container_registry, that you can adapt to your specific use-case:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.docker.registryImage;
     * import com.pulumi.docker.RegistryImageArgs;
     * import com.pulumi.databricks.InstancePool;
     * import com.pulumi.databricks.InstancePoolArgs;
     * import com.pulumi.databricks.inputs.InstancePoolPreloadedDockerImageArgs;
     * import com.pulumi.databricks.inputs.InstancePoolPreloadedDockerImageBasicAuthArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var this_ = new RegistryImage("this", RegistryImageArgs.builder()        
     *             .build()
     *             .name(String.format("%s/sample:latest", thisAzurermContainerRegistry.loginServer()))
     *             .build());
     * 
     *         var thisInstancePool = new InstancePool("thisInstancePool", InstancePoolArgs.builder()        
     *             .preloadedDockerImages(InstancePoolPreloadedDockerImageArgs.builder()
     *                 .url(this_.name())
     *                 .basicAuth(InstancePoolPreloadedDockerImageBasicAuthArgs.builder()
     *                     .username(thisAzurermContainerRegistry.adminUsername())
     *                     .password(thisAzurermContainerRegistry.adminPassword())
     *                     .build())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public Optional<Output<InstancePoolPreloadedDockerImageBasicAuthArgs>> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }

    /**
     * URL for the Docker image
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return URL for the Docker image
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private InstancePoolPreloadedDockerImageArgs() {}

    private InstancePoolPreloadedDockerImageArgs(InstancePoolPreloadedDockerImageArgs $) {
        this.basicAuth = $.basicAuth;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePoolPreloadedDockerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePoolPreloadedDockerImageArgs $;

        public Builder() {
            $ = new InstancePoolPreloadedDockerImageArgs();
        }

        public Builder(InstancePoolPreloadedDockerImageArgs defaults) {
            $ = new InstancePoolPreloadedDockerImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basicAuth `basic_auth.username` and `basic_auth.password` for Docker repository. Docker registry credentials are encrypted when they are stored in Databricks internal storage and when they are passed to a registry upon fetching Docker images at cluster launch. However, other authenticated and authorized API users of this workspace can access the username and password.
         * 
         * Example usage with azurerm_container_registry, that you can adapt to your specific use-case:
         * 
         * &lt;!--Start PulumiCodeChooser --&gt;
         * <pre>
         * {@code
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.docker.registryImage;
         * import com.pulumi.docker.RegistryImageArgs;
         * import com.pulumi.databricks.InstancePool;
         * import com.pulumi.databricks.InstancePoolArgs;
         * import com.pulumi.databricks.inputs.InstancePoolPreloadedDockerImageArgs;
         * import com.pulumi.databricks.inputs.InstancePoolPreloadedDockerImageBasicAuthArgs;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         var this_ = new RegistryImage("this", RegistryImageArgs.builder()        
         *             .build()
         *             .name(String.format("%s/sample:latest", thisAzurermContainerRegistry.loginServer()))
         *             .build());
         * 
         *         var thisInstancePool = new InstancePool("thisInstancePool", InstancePoolArgs.builder()        
         *             .preloadedDockerImages(InstancePoolPreloadedDockerImageArgs.builder()
         *                 .url(this_.name())
         *                 .basicAuth(InstancePoolPreloadedDockerImageBasicAuthArgs.builder()
         *                     .username(thisAzurermContainerRegistry.adminUsername())
         *                     .password(thisAzurermContainerRegistry.adminPassword())
         *                     .build())
         *                 .build())
         *             .build());
         * 
         *     }
         * }
         * }
         * </pre>
         * &lt;!--End PulumiCodeChooser --&gt;
         * 
         * @return builder
         * 
         */
        public Builder basicAuth(@Nullable Output<InstancePoolPreloadedDockerImageBasicAuthArgs> basicAuth) {
            $.basicAuth = basicAuth;
            return this;
        }

        /**
         * @param basicAuth `basic_auth.username` and `basic_auth.password` for Docker repository. Docker registry credentials are encrypted when they are stored in Databricks internal storage and when they are passed to a registry upon fetching Docker images at cluster launch. However, other authenticated and authorized API users of this workspace can access the username and password.
         * 
         * Example usage with azurerm_container_registry, that you can adapt to your specific use-case:
         * 
         * &lt;!--Start PulumiCodeChooser --&gt;
         * <pre>
         * {@code
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.docker.registryImage;
         * import com.pulumi.docker.RegistryImageArgs;
         * import com.pulumi.databricks.InstancePool;
         * import com.pulumi.databricks.InstancePoolArgs;
         * import com.pulumi.databricks.inputs.InstancePoolPreloadedDockerImageArgs;
         * import com.pulumi.databricks.inputs.InstancePoolPreloadedDockerImageBasicAuthArgs;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         var this_ = new RegistryImage("this", RegistryImageArgs.builder()        
         *             .build()
         *             .name(String.format("%s/sample:latest", thisAzurermContainerRegistry.loginServer()))
         *             .build());
         * 
         *         var thisInstancePool = new InstancePool("thisInstancePool", InstancePoolArgs.builder()        
         *             .preloadedDockerImages(InstancePoolPreloadedDockerImageArgs.builder()
         *                 .url(this_.name())
         *                 .basicAuth(InstancePoolPreloadedDockerImageBasicAuthArgs.builder()
         *                     .username(thisAzurermContainerRegistry.adminUsername())
         *                     .password(thisAzurermContainerRegistry.adminPassword())
         *                     .build())
         *                 .build())
         *             .build());
         * 
         *     }
         * }
         * }
         * </pre>
         * &lt;!--End PulumiCodeChooser --&gt;
         * 
         * @return builder
         * 
         */
        public Builder basicAuth(InstancePoolPreloadedDockerImageBasicAuthArgs basicAuth) {
            return basicAuth(Output.of(basicAuth));
        }

        /**
         * @param url URL for the Docker image
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL for the Docker image
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public InstancePoolPreloadedDockerImageArgs build() {
            if ($.url == null) {
                throw new MissingRequiredPropertyException("InstancePoolPreloadedDockerImageArgs", "url");
            }
            return $;
        }
    }

}
