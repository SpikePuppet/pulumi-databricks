// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobRunAs {
    /**
     * @return The application ID of an active service principal. Setting this field requires the `servicePrincipal/user` role.
     * 
     * Example:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.databricks.Job;
     * import com.pulumi.databricks.JobArgs;
     * import com.pulumi.databricks.inputs.JobRunAsArgs;
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
     *         var this_ = new Job("this", JobArgs.builder()        
     *             .runAs(JobRunAsArgs.builder()
     *                 .servicePrincipalName("8d23ae77-912e-4a19-81e4-b9c3f5cc9349")
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
    private @Nullable String servicePrincipalName;
    /**
     * @return The email of an active workspace user. Non-admin users can only set this field to their own email.
     * 
     */
    private @Nullable String userName;

    private JobRunAs() {}
    /**
     * @return The application ID of an active service principal. Setting this field requires the `servicePrincipal/user` role.
     * 
     * Example:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.databricks.Job;
     * import com.pulumi.databricks.JobArgs;
     * import com.pulumi.databricks.inputs.JobRunAsArgs;
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
     *         var this_ = new Job("this", JobArgs.builder()        
     *             .runAs(JobRunAsArgs.builder()
     *                 .servicePrincipalName("8d23ae77-912e-4a19-81e4-b9c3f5cc9349")
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
    public Optional<String> servicePrincipalName() {
        return Optional.ofNullable(this.servicePrincipalName);
    }
    /**
     * @return The email of an active workspace user. Non-admin users can only set this field to their own email.
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRunAs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String servicePrincipalName;
        private @Nullable String userName;
        public Builder() {}
        public Builder(JobRunAs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.servicePrincipalName = defaults.servicePrincipalName;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder servicePrincipalName(@Nullable String servicePrincipalName) {

            this.servicePrincipalName = servicePrincipalName;
            return this;
        }
        @CustomType.Setter
        public Builder userName(@Nullable String userName) {

            this.userName = userName;
            return this;
        }
        public JobRunAs build() {
            final var _resultValue = new JobRunAs();
            _resultValue.servicePrincipalName = servicePrincipalName;
            _resultValue.userName = userName;
            return _resultValue;
        }
    }
}
