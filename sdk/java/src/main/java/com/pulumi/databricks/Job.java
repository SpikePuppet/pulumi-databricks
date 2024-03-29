// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.JobArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.JobState;
import com.pulumi.databricks.outputs.JobCompute;
import com.pulumi.databricks.outputs.JobContinuous;
import com.pulumi.databricks.outputs.JobDbtTask;
import com.pulumi.databricks.outputs.JobDeployment;
import com.pulumi.databricks.outputs.JobEmailNotifications;
import com.pulumi.databricks.outputs.JobGitSource;
import com.pulumi.databricks.outputs.JobHealth;
import com.pulumi.databricks.outputs.JobJobCluster;
import com.pulumi.databricks.outputs.JobLibrary;
import com.pulumi.databricks.outputs.JobNewCluster;
import com.pulumi.databricks.outputs.JobNotebookTask;
import com.pulumi.databricks.outputs.JobNotificationSettings;
import com.pulumi.databricks.outputs.JobParameter;
import com.pulumi.databricks.outputs.JobPipelineTask;
import com.pulumi.databricks.outputs.JobPythonWheelTask;
import com.pulumi.databricks.outputs.JobQueue;
import com.pulumi.databricks.outputs.JobRunAs;
import com.pulumi.databricks.outputs.JobRunJobTask;
import com.pulumi.databricks.outputs.JobSchedule;
import com.pulumi.databricks.outputs.JobSparkJarTask;
import com.pulumi.databricks.outputs.JobSparkPythonTask;
import com.pulumi.databricks.outputs.JobSparkSubmitTask;
import com.pulumi.databricks.outputs.JobTask;
import com.pulumi.databricks.outputs.JobTrigger;
import com.pulumi.databricks.outputs.JobWebhookNotifications;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * The resource job can be imported using the id of the job
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/job:Job this &lt;job-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/job:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `spark_jar_task` or `spark_submit_task` or `spark_python_task` or `notebook_task` blocks.
     * 
     * @deprecated
     * always_running will be replaced by control_run_state in the next major release.
     * 
     */
    @Deprecated /* always_running will be replaced by control_run_state in the next major release. */
    @Export(name="alwaysRunning", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> alwaysRunning;

    /**
     * @return (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `spark_jar_task` or `spark_submit_task` or `spark_python_task` or `notebook_task` blocks.
     * 
     */
    public Output<Optional<Boolean>> alwaysRunning() {
        return Codegen.optional(this.alwaysRunning);
    }
    @Export(name="computes", refs={List.class,JobCompute.class}, tree="[0,1]")
    private Output</* @Nullable */ List<JobCompute>> computes;

    public Output<Optional<List<JobCompute>>> computes() {
        return Codegen.optional(this.computes);
    }
    @Export(name="continuous", refs={JobContinuous.class}, tree="[0]")
    private Output</* @Nullable */ JobContinuous> continuous;

    public Output<Optional<JobContinuous>> continuous() {
        return Codegen.optional(this.continuous);
    }
    /**
     * (Bool) If true, the Databricks provider will stop and start the job as needed to ensure that the active run for the job reflects the deployed configuration. For continuous jobs, the provider respects the `pause_status` by stopping the current active run. This flag cannot be set for non-continuous jobs.
     * 
     * When migrating from `always_running` to `control_run_state`, set `continuous` as follows:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
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
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    @Export(name="controlRunState", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> controlRunState;

    /**
     * @return (Bool) If true, the Databricks provider will stop and start the job as needed to ensure that the active run for the job reflects the deployed configuration. For continuous jobs, the provider respects the `pause_status` by stopping the current active run. This flag cannot be set for non-continuous jobs.
     * 
     * When migrating from `always_running` to `control_run_state`, set `continuous` as follows:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
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
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public Output<Optional<Boolean>> controlRunState() {
        return Codegen.optional(this.controlRunState);
    }
    /**
     * @deprecated
     * should be used inside a task block and not inside a job block
     * 
     */
    @Deprecated /* should be used inside a task block and not inside a job block */
    @Export(name="dbtTask", refs={JobDbtTask.class}, tree="[0]")
    private Output</* @Nullable */ JobDbtTask> dbtTask;

    public Output<Optional<JobDbtTask>> dbtTask() {
        return Codegen.optional(this.dbtTask);
    }
    @Export(name="deployment", refs={JobDeployment.class}, tree="[0]")
    private Output</* @Nullable */ JobDeployment> deployment;

    public Output<Optional<JobDeployment>> deployment() {
        return Codegen.optional(this.deployment);
    }
    /**
     * An optional description for the job. The maximum length is 1024 characters in UTF-8 encoding.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description for the job. The maximum length is 1024 characters in UTF-8 encoding.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="editMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> editMode;

    public Output<Optional<String>> editMode() {
        return Codegen.optional(this.editMode);
    }
    /**
     * (List) An optional set of email addresses notified when runs of this job begins, completes or fails. The default behavior is to not send any emails. This field is a block and is documented below.
     * 
     */
    @Export(name="emailNotifications", refs={JobEmailNotifications.class}, tree="[0]")
    private Output</* @Nullable */ JobEmailNotifications> emailNotifications;

    /**
     * @return (List) An optional set of email addresses notified when runs of this job begins, completes or fails. The default behavior is to not send any emails. This field is a block and is documented below.
     * 
     */
    public Output<Optional<JobEmailNotifications>> emailNotifications() {
        return Codegen.optional(this.emailNotifications);
    }
    @Export(name="existingClusterId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> existingClusterId;

    public Output<Optional<String>> existingClusterId() {
        return Codegen.optional(this.existingClusterId);
    }
    @Export(name="format", refs={String.class}, tree="[0]")
    private Output<String> format;

    public Output<String> format() {
        return this.format;
    }
    @Export(name="gitSource", refs={JobGitSource.class}, tree="[0]")
    private Output</* @Nullable */ JobGitSource> gitSource;

    public Output<Optional<JobGitSource>> gitSource() {
        return Codegen.optional(this.gitSource);
    }
    /**
     * An optional block that specifies the health conditions for the job (described below).
     * 
     */
    @Export(name="health", refs={JobHealth.class}, tree="[0]")
    private Output</* @Nullable */ JobHealth> health;

    /**
     * @return An optional block that specifies the health conditions for the job (described below).
     * 
     */
    public Output<Optional<JobHealth>> health() {
        return Codegen.optional(this.health);
    }
    /**
     * A list of job databricks.Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
     * 
     */
    @Export(name="jobClusters", refs={List.class,JobJobCluster.class}, tree="[0,1]")
    private Output</* @Nullable */ List<JobJobCluster>> jobClusters;

    /**
     * @return A list of job databricks.Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
     * 
     */
    public Output<Optional<List<JobJobCluster>>> jobClusters() {
        return Codegen.optional(this.jobClusters);
    }
    /**
     * (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section of the databricks.Cluster resource for more information.
     * 
     */
    @Export(name="libraries", refs={List.class,JobLibrary.class}, tree="[0,1]")
    private Output</* @Nullable */ List<JobLibrary>> libraries;

    /**
     * @return (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section of the databricks.Cluster resource for more information.
     * 
     */
    public Output<Optional<List<JobLibrary>>> libraries() {
        return Codegen.optional(this.libraries);
    }
    /**
     * (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
     * 
     */
    @Export(name="maxConcurrentRuns", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxConcurrentRuns;

    /**
     * @return (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
     * 
     */
    public Output<Optional<Integer>> maxConcurrentRuns() {
        return Codegen.optional(this.maxConcurrentRuns);
    }
    /**
     * (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
     * 
     * @deprecated
     * should be used inside a task block and not inside a job block
     * 
     */
    @Deprecated /* should be used inside a task block and not inside a job block */
    @Export(name="maxRetries", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxRetries;

    /**
     * @return (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
     * 
     */
    public Output<Optional<Integer>> maxRetries() {
        return Codegen.optional(this.maxRetries);
    }
    /**
     * (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     * 
     * @deprecated
     * should be used inside a task block and not inside a job block
     * 
     */
    @Deprecated /* should be used inside a task block and not inside a job block */
    @Export(name="minRetryIntervalMillis", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minRetryIntervalMillis;

    /**
     * @return (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     * 
     */
    public Output<Optional<Integer>> minRetryIntervalMillis() {
        return Codegen.optional(this.minRetryIntervalMillis);
    }
    /**
     * An optional name for the job. The default value is Untitled.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return An optional name for the job. The default value is Untitled.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Same set of parameters as for databricks.Cluster resource.
     * 
     */
    @Export(name="newCluster", refs={JobNewCluster.class}, tree="[0]")
    private Output</* @Nullable */ JobNewCluster> newCluster;

    /**
     * @return Same set of parameters as for databricks.Cluster resource.
     * 
     */
    public Output<Optional<JobNewCluster>> newCluster() {
        return Codegen.optional(this.newCluster);
    }
    /**
     * @deprecated
     * should be used inside a task block and not inside a job block
     * 
     */
    @Deprecated /* should be used inside a task block and not inside a job block */
    @Export(name="notebookTask", refs={JobNotebookTask.class}, tree="[0]")
    private Output</* @Nullable */ JobNotebookTask> notebookTask;

    public Output<Optional<JobNotebookTask>> notebookTask() {
        return Codegen.optional(this.notebookTask);
    }
    /**
     * An optional block controlling the notification settings on the job level (described below).
     * 
     */
    @Export(name="notificationSettings", refs={JobNotificationSettings.class}, tree="[0]")
    private Output</* @Nullable */ JobNotificationSettings> notificationSettings;

    /**
     * @return An optional block controlling the notification settings on the job level (described below).
     * 
     */
    public Output<Optional<JobNotificationSettings>> notificationSettings() {
        return Codegen.optional(this.notificationSettings);
    }
    @Export(name="parameters", refs={List.class,JobParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<JobParameter>> parameters;

    public Output<Optional<List<JobParameter>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * @deprecated
     * should be used inside a task block and not inside a job block
     * 
     */
    @Deprecated /* should be used inside a task block and not inside a job block */
    @Export(name="pipelineTask", refs={JobPipelineTask.class}, tree="[0]")
    private Output</* @Nullable */ JobPipelineTask> pipelineTask;

    public Output<Optional<JobPipelineTask>> pipelineTask() {
        return Codegen.optional(this.pipelineTask);
    }
    /**
     * @deprecated
     * should be used inside a task block and not inside a job block
     * 
     */
    @Deprecated /* should be used inside a task block and not inside a job block */
    @Export(name="pythonWheelTask", refs={JobPythonWheelTask.class}, tree="[0]")
    private Output</* @Nullable */ JobPythonWheelTask> pythonWheelTask;

    public Output<Optional<JobPythonWheelTask>> pythonWheelTask() {
        return Codegen.optional(this.pythonWheelTask);
    }
    @Export(name="queue", refs={JobQueue.class}, tree="[0]")
    private Output</* @Nullable */ JobQueue> queue;

    public Output<Optional<JobQueue>> queue() {
        return Codegen.optional(this.queue);
    }
    /**
     * (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     * 
     * @deprecated
     * should be used inside a task block and not inside a job block
     * 
     */
    @Deprecated /* should be used inside a task block and not inside a job block */
    @Export(name="retryOnTimeout", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> retryOnTimeout;

    /**
     * @return (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     * 
     */
    public Output<Optional<Boolean>> retryOnTimeout() {
        return Codegen.optional(this.retryOnTimeout);
    }
    @Export(name="runAs", refs={JobRunAs.class}, tree="[0]")
    private Output<JobRunAs> runAs;

    public Output<JobRunAs> runAs() {
        return this.runAs;
    }
    /**
     * @deprecated
     * should be used inside a task block and not inside a job block
     * 
     */
    @Deprecated /* should be used inside a task block and not inside a job block */
    @Export(name="runJobTask", refs={JobRunJobTask.class}, tree="[0]")
    private Output</* @Nullable */ JobRunJobTask> runJobTask;

    public Output<Optional<JobRunJobTask>> runJobTask() {
        return Codegen.optional(this.runJobTask);
    }
    /**
     * (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
     * 
     */
    @Export(name="schedule", refs={JobSchedule.class}, tree="[0]")
    private Output</* @Nullable */ JobSchedule> schedule;

    /**
     * @return (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
     * 
     */
    public Output<Optional<JobSchedule>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * @deprecated
     * should be used inside a task block and not inside a job block
     * 
     */
    @Deprecated /* should be used inside a task block and not inside a job block */
    @Export(name="sparkJarTask", refs={JobSparkJarTask.class}, tree="[0]")
    private Output</* @Nullable */ JobSparkJarTask> sparkJarTask;

    public Output<Optional<JobSparkJarTask>> sparkJarTask() {
        return Codegen.optional(this.sparkJarTask);
    }
    /**
     * @deprecated
     * should be used inside a task block and not inside a job block
     * 
     */
    @Deprecated /* should be used inside a task block and not inside a job block */
    @Export(name="sparkPythonTask", refs={JobSparkPythonTask.class}, tree="[0]")
    private Output</* @Nullable */ JobSparkPythonTask> sparkPythonTask;

    public Output<Optional<JobSparkPythonTask>> sparkPythonTask() {
        return Codegen.optional(this.sparkPythonTask);
    }
    /**
     * @deprecated
     * should be used inside a task block and not inside a job block
     * 
     */
    @Deprecated /* should be used inside a task block and not inside a job block */
    @Export(name="sparkSubmitTask", refs={JobSparkSubmitTask.class}, tree="[0]")
    private Output</* @Nullable */ JobSparkSubmitTask> sparkSubmitTask;

    public Output<Optional<JobSparkSubmitTask>> sparkSubmitTask() {
        return Codegen.optional(this.sparkSubmitTask);
    }
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Task to run against the `inputs` list.
     * 
     */
    @Export(name="tasks", refs={List.class,JobTask.class}, tree="[0,1]")
    private Output</* @Nullable */ List<JobTask>> tasks;

    /**
     * @return Task to run against the `inputs` list.
     * 
     */
    public Output<Optional<List<JobTask>>> tasks() {
        return Codegen.optional(this.tasks);
    }
    /**
     * (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     * 
     */
    @Export(name="timeoutSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeoutSeconds;

    /**
     * @return (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     * 
     */
    public Output<Optional<Integer>> timeoutSeconds() {
        return Codegen.optional(this.timeoutSeconds);
    }
    @Export(name="trigger", refs={JobTrigger.class}, tree="[0]")
    private Output</* @Nullable */ JobTrigger> trigger;

    public Output<Optional<JobTrigger>> trigger() {
        return Codegen.optional(this.trigger);
    }
    /**
     * URL of the Git repository to use.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return URL of the Git repository to use.
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes or fails. The default behavior is to not send any notifications. This field is a block and is documented below.
     * 
     */
    @Export(name="webhookNotifications", refs={JobWebhookNotifications.class}, tree="[0]")
    private Output</* @Nullable */ JobWebhookNotifications> webhookNotifications;

    /**
     * @return (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes or fails. The default behavior is to not send any notifications. This field is a block and is documented below.
     * 
     */
    public Output<Optional<JobWebhookNotifications>> webhookNotifications() {
        return Codegen.optional(this.webhookNotifications);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, @Nullable JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, @Nullable JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/job:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/job:Job", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Job get(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, state, options);
    }
}
