// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * The resource job can be imported using the id of the job
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/job:Job this <job-id>
 * ```
 */
export class Job extends pulumi.CustomResource {
    /**
     * Get an existing Job resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: JobState, opts?: pulumi.CustomResourceOptions): Job {
        return new Job(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/job:Job';

    /**
     * Returns true if the given object is an instance of Job.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Job {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Job.__pulumiType;
    }

    /**
     * (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `sparkJarTask` or `sparkSubmitTask` or `sparkPythonTask` or `notebookTask` blocks.
     *
     * @deprecated always_running will be replaced by controlRunState in the next major release.
     */
    public readonly alwaysRunning!: pulumi.Output<boolean | undefined>;
    public readonly continuous!: pulumi.Output<outputs.JobContinuous | undefined>;
    /**
     * (Bool) If true, the Databricks provider will stop and start the job as needed to ensure that the active run for the job reflects the deployed configuration. For continuous jobs, the provider respects the `pauseStatus` by stopping the current active run. This flag cannot be set for non-continuous jobs.
     *
     * When migrating from `alwaysRunning` to `controlRunState`, set `continuous` as follows:
     */
    public readonly controlRunState!: pulumi.Output<boolean | undefined>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    public readonly dbtTask!: pulumi.Output<outputs.JobDbtTask | undefined>;
    public readonly deployment!: pulumi.Output<outputs.JobDeployment | undefined>;
    /**
     * An optional description for the job. The maximum length is 1024 characters in UTF-8 encoding.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly editMode!: pulumi.Output<string | undefined>;
    /**
     * (List) An optional set of email addresses notified when runs of this job begins, completes or fails. The default behavior is to not send any emails. This field is a block and is documented below.
     */
    public readonly emailNotifications!: pulumi.Output<outputs.JobEmailNotifications | undefined>;
    public readonly environments!: pulumi.Output<outputs.JobEnvironment[] | undefined>;
    public readonly existingClusterId!: pulumi.Output<string | undefined>;
    public readonly format!: pulumi.Output<string>;
    public readonly gitSource!: pulumi.Output<outputs.JobGitSource | undefined>;
    /**
     * An optional block that specifies the health conditions for the job (described below).
     */
    public readonly health!: pulumi.Output<outputs.JobHealth | undefined>;
    /**
     * A list of job databricks.Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
     */
    public readonly jobClusters!: pulumi.Output<outputs.JobJobCluster[] | undefined>;
    /**
     * (List) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section of the databricks.Cluster resource for more information.
     */
    public readonly libraries!: pulumi.Output<outputs.JobLibrary[] | undefined>;
    /**
     * (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
     */
    public readonly maxConcurrentRuns!: pulumi.Output<number | undefined>;
    /**
     * (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
     *
     * @deprecated should be used inside a task block and not inside a job block
     */
    public readonly maxRetries!: pulumi.Output<number | undefined>;
    /**
     * (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     *
     * @deprecated should be used inside a task block and not inside a job block
     */
    public readonly minRetryIntervalMillis!: pulumi.Output<number | undefined>;
    /**
     * An optional name for the job. The default value is Untitled.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Same set of parameters as for databricks.Cluster resource.
     */
    public readonly newCluster!: pulumi.Output<outputs.JobNewCluster | undefined>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    public readonly notebookTask!: pulumi.Output<outputs.JobNotebookTask | undefined>;
    /**
     * An optional block controlling the notification settings on the job level (described below).
     */
    public readonly notificationSettings!: pulumi.Output<outputs.JobNotificationSettings | undefined>;
    public readonly parameters!: pulumi.Output<outputs.JobParameter[] | undefined>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    public readonly pipelineTask!: pulumi.Output<outputs.JobPipelineTask | undefined>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    public readonly pythonWheelTask!: pulumi.Output<outputs.JobPythonWheelTask | undefined>;
    public readonly queue!: pulumi.Output<outputs.JobQueue | undefined>;
    /**
     * (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     *
     * @deprecated should be used inside a task block and not inside a job block
     */
    public readonly retryOnTimeout!: pulumi.Output<boolean | undefined>;
    public readonly runAs!: pulumi.Output<outputs.JobRunAs>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    public readonly runJobTask!: pulumi.Output<outputs.JobRunJobTask | undefined>;
    /**
     * (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
     */
    public readonly schedule!: pulumi.Output<outputs.JobSchedule | undefined>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    public readonly sparkJarTask!: pulumi.Output<outputs.JobSparkJarTask | undefined>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    public readonly sparkPythonTask!: pulumi.Output<outputs.JobSparkPythonTask | undefined>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    public readonly sparkSubmitTask!: pulumi.Output<outputs.JobSparkSubmitTask | undefined>;
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Task to run against the `inputs` list.
     */
    public readonly tasks!: pulumi.Output<outputs.JobTask[] | undefined>;
    /**
     * (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     */
    public readonly timeoutSeconds!: pulumi.Output<number | undefined>;
    public readonly trigger!: pulumi.Output<outputs.JobTrigger | undefined>;
    /**
     * URL of the Git repository to use.
     */
    public /*out*/ readonly url!: pulumi.Output<string>;
    /**
     * (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes or fails. The default behavior is to not send any notifications. This field is a block and is documented below.
     */
    public readonly webhookNotifications!: pulumi.Output<outputs.JobWebhookNotifications | undefined>;

    /**
     * Create a Job resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: JobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: JobArgs | JobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as JobState | undefined;
            resourceInputs["alwaysRunning"] = state ? state.alwaysRunning : undefined;
            resourceInputs["continuous"] = state ? state.continuous : undefined;
            resourceInputs["controlRunState"] = state ? state.controlRunState : undefined;
            resourceInputs["dbtTask"] = state ? state.dbtTask : undefined;
            resourceInputs["deployment"] = state ? state.deployment : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["editMode"] = state ? state.editMode : undefined;
            resourceInputs["emailNotifications"] = state ? state.emailNotifications : undefined;
            resourceInputs["environments"] = state ? state.environments : undefined;
            resourceInputs["existingClusterId"] = state ? state.existingClusterId : undefined;
            resourceInputs["format"] = state ? state.format : undefined;
            resourceInputs["gitSource"] = state ? state.gitSource : undefined;
            resourceInputs["health"] = state ? state.health : undefined;
            resourceInputs["jobClusters"] = state ? state.jobClusters : undefined;
            resourceInputs["libraries"] = state ? state.libraries : undefined;
            resourceInputs["maxConcurrentRuns"] = state ? state.maxConcurrentRuns : undefined;
            resourceInputs["maxRetries"] = state ? state.maxRetries : undefined;
            resourceInputs["minRetryIntervalMillis"] = state ? state.minRetryIntervalMillis : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["newCluster"] = state ? state.newCluster : undefined;
            resourceInputs["notebookTask"] = state ? state.notebookTask : undefined;
            resourceInputs["notificationSettings"] = state ? state.notificationSettings : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["pipelineTask"] = state ? state.pipelineTask : undefined;
            resourceInputs["pythonWheelTask"] = state ? state.pythonWheelTask : undefined;
            resourceInputs["queue"] = state ? state.queue : undefined;
            resourceInputs["retryOnTimeout"] = state ? state.retryOnTimeout : undefined;
            resourceInputs["runAs"] = state ? state.runAs : undefined;
            resourceInputs["runJobTask"] = state ? state.runJobTask : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["sparkJarTask"] = state ? state.sparkJarTask : undefined;
            resourceInputs["sparkPythonTask"] = state ? state.sparkPythonTask : undefined;
            resourceInputs["sparkSubmitTask"] = state ? state.sparkSubmitTask : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tasks"] = state ? state.tasks : undefined;
            resourceInputs["timeoutSeconds"] = state ? state.timeoutSeconds : undefined;
            resourceInputs["trigger"] = state ? state.trigger : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["webhookNotifications"] = state ? state.webhookNotifications : undefined;
        } else {
            const args = argsOrState as JobArgs | undefined;
            resourceInputs["alwaysRunning"] = args ? args.alwaysRunning : undefined;
            resourceInputs["continuous"] = args ? args.continuous : undefined;
            resourceInputs["controlRunState"] = args ? args.controlRunState : undefined;
            resourceInputs["dbtTask"] = args ? args.dbtTask : undefined;
            resourceInputs["deployment"] = args ? args.deployment : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["editMode"] = args ? args.editMode : undefined;
            resourceInputs["emailNotifications"] = args ? args.emailNotifications : undefined;
            resourceInputs["environments"] = args ? args.environments : undefined;
            resourceInputs["existingClusterId"] = args ? args.existingClusterId : undefined;
            resourceInputs["format"] = args ? args.format : undefined;
            resourceInputs["gitSource"] = args ? args.gitSource : undefined;
            resourceInputs["health"] = args ? args.health : undefined;
            resourceInputs["jobClusters"] = args ? args.jobClusters : undefined;
            resourceInputs["libraries"] = args ? args.libraries : undefined;
            resourceInputs["maxConcurrentRuns"] = args ? args.maxConcurrentRuns : undefined;
            resourceInputs["maxRetries"] = args ? args.maxRetries : undefined;
            resourceInputs["minRetryIntervalMillis"] = args ? args.minRetryIntervalMillis : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["newCluster"] = args ? args.newCluster : undefined;
            resourceInputs["notebookTask"] = args ? args.notebookTask : undefined;
            resourceInputs["notificationSettings"] = args ? args.notificationSettings : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["pipelineTask"] = args ? args.pipelineTask : undefined;
            resourceInputs["pythonWheelTask"] = args ? args.pythonWheelTask : undefined;
            resourceInputs["queue"] = args ? args.queue : undefined;
            resourceInputs["retryOnTimeout"] = args ? args.retryOnTimeout : undefined;
            resourceInputs["runAs"] = args ? args.runAs : undefined;
            resourceInputs["runJobTask"] = args ? args.runJobTask : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["sparkJarTask"] = args ? args.sparkJarTask : undefined;
            resourceInputs["sparkPythonTask"] = args ? args.sparkPythonTask : undefined;
            resourceInputs["sparkSubmitTask"] = args ? args.sparkSubmitTask : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["tasks"] = args ? args.tasks : undefined;
            resourceInputs["timeoutSeconds"] = args ? args.timeoutSeconds : undefined;
            resourceInputs["trigger"] = args ? args.trigger : undefined;
            resourceInputs["webhookNotifications"] = args ? args.webhookNotifications : undefined;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Job.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Job resources.
 */
export interface JobState {
    /**
     * (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `sparkJarTask` or `sparkSubmitTask` or `sparkPythonTask` or `notebookTask` blocks.
     *
     * @deprecated always_running will be replaced by controlRunState in the next major release.
     */
    alwaysRunning?: pulumi.Input<boolean>;
    continuous?: pulumi.Input<inputs.JobContinuous>;
    /**
     * (Bool) If true, the Databricks provider will stop and start the job as needed to ensure that the active run for the job reflects the deployed configuration. For continuous jobs, the provider respects the `pauseStatus` by stopping the current active run. This flag cannot be set for non-continuous jobs.
     *
     * When migrating from `alwaysRunning` to `controlRunState`, set `continuous` as follows:
     */
    controlRunState?: pulumi.Input<boolean>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    dbtTask?: pulumi.Input<inputs.JobDbtTask>;
    deployment?: pulumi.Input<inputs.JobDeployment>;
    /**
     * An optional description for the job. The maximum length is 1024 characters in UTF-8 encoding.
     */
    description?: pulumi.Input<string>;
    editMode?: pulumi.Input<string>;
    /**
     * (List) An optional set of email addresses notified when runs of this job begins, completes or fails. The default behavior is to not send any emails. This field is a block and is documented below.
     */
    emailNotifications?: pulumi.Input<inputs.JobEmailNotifications>;
    environments?: pulumi.Input<pulumi.Input<inputs.JobEnvironment>[]>;
    existingClusterId?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    gitSource?: pulumi.Input<inputs.JobGitSource>;
    /**
     * An optional block that specifies the health conditions for the job (described below).
     */
    health?: pulumi.Input<inputs.JobHealth>;
    /**
     * A list of job databricks.Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
     */
    jobClusters?: pulumi.Input<pulumi.Input<inputs.JobJobCluster>[]>;
    /**
     * (List) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section of the databricks.Cluster resource for more information.
     */
    libraries?: pulumi.Input<pulumi.Input<inputs.JobLibrary>[]>;
    /**
     * (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
     */
    maxConcurrentRuns?: pulumi.Input<number>;
    /**
     * (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
     *
     * @deprecated should be used inside a task block and not inside a job block
     */
    maxRetries?: pulumi.Input<number>;
    /**
     * (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     *
     * @deprecated should be used inside a task block and not inside a job block
     */
    minRetryIntervalMillis?: pulumi.Input<number>;
    /**
     * An optional name for the job. The default value is Untitled.
     */
    name?: pulumi.Input<string>;
    /**
     * Same set of parameters as for databricks.Cluster resource.
     */
    newCluster?: pulumi.Input<inputs.JobNewCluster>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    notebookTask?: pulumi.Input<inputs.JobNotebookTask>;
    /**
     * An optional block controlling the notification settings on the job level (described below).
     */
    notificationSettings?: pulumi.Input<inputs.JobNotificationSettings>;
    parameters?: pulumi.Input<pulumi.Input<inputs.JobParameter>[]>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    pipelineTask?: pulumi.Input<inputs.JobPipelineTask>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    pythonWheelTask?: pulumi.Input<inputs.JobPythonWheelTask>;
    queue?: pulumi.Input<inputs.JobQueue>;
    /**
     * (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     *
     * @deprecated should be used inside a task block and not inside a job block
     */
    retryOnTimeout?: pulumi.Input<boolean>;
    runAs?: pulumi.Input<inputs.JobRunAs>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    runJobTask?: pulumi.Input<inputs.JobRunJobTask>;
    /**
     * (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
     */
    schedule?: pulumi.Input<inputs.JobSchedule>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    sparkJarTask?: pulumi.Input<inputs.JobSparkJarTask>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    sparkPythonTask?: pulumi.Input<inputs.JobSparkPythonTask>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    sparkSubmitTask?: pulumi.Input<inputs.JobSparkSubmitTask>;
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * Task to run against the `inputs` list.
     */
    tasks?: pulumi.Input<pulumi.Input<inputs.JobTask>[]>;
    /**
     * (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     */
    timeoutSeconds?: pulumi.Input<number>;
    trigger?: pulumi.Input<inputs.JobTrigger>;
    /**
     * URL of the Git repository to use.
     */
    url?: pulumi.Input<string>;
    /**
     * (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes or fails. The default behavior is to not send any notifications. This field is a block and is documented below.
     */
    webhookNotifications?: pulumi.Input<inputs.JobWebhookNotifications>;
}

/**
 * The set of arguments for constructing a Job resource.
 */
export interface JobArgs {
    /**
     * (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `sparkJarTask` or `sparkSubmitTask` or `sparkPythonTask` or `notebookTask` blocks.
     *
     * @deprecated always_running will be replaced by controlRunState in the next major release.
     */
    alwaysRunning?: pulumi.Input<boolean>;
    continuous?: pulumi.Input<inputs.JobContinuous>;
    /**
     * (Bool) If true, the Databricks provider will stop and start the job as needed to ensure that the active run for the job reflects the deployed configuration. For continuous jobs, the provider respects the `pauseStatus` by stopping the current active run. This flag cannot be set for non-continuous jobs.
     *
     * When migrating from `alwaysRunning` to `controlRunState`, set `continuous` as follows:
     */
    controlRunState?: pulumi.Input<boolean>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    dbtTask?: pulumi.Input<inputs.JobDbtTask>;
    deployment?: pulumi.Input<inputs.JobDeployment>;
    /**
     * An optional description for the job. The maximum length is 1024 characters in UTF-8 encoding.
     */
    description?: pulumi.Input<string>;
    editMode?: pulumi.Input<string>;
    /**
     * (List) An optional set of email addresses notified when runs of this job begins, completes or fails. The default behavior is to not send any emails. This field is a block and is documented below.
     */
    emailNotifications?: pulumi.Input<inputs.JobEmailNotifications>;
    environments?: pulumi.Input<pulumi.Input<inputs.JobEnvironment>[]>;
    existingClusterId?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    gitSource?: pulumi.Input<inputs.JobGitSource>;
    /**
     * An optional block that specifies the health conditions for the job (described below).
     */
    health?: pulumi.Input<inputs.JobHealth>;
    /**
     * A list of job databricks.Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
     */
    jobClusters?: pulumi.Input<pulumi.Input<inputs.JobJobCluster>[]>;
    /**
     * (List) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section of the databricks.Cluster resource for more information.
     */
    libraries?: pulumi.Input<pulumi.Input<inputs.JobLibrary>[]>;
    /**
     * (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
     */
    maxConcurrentRuns?: pulumi.Input<number>;
    /**
     * (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
     *
     * @deprecated should be used inside a task block and not inside a job block
     */
    maxRetries?: pulumi.Input<number>;
    /**
     * (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     *
     * @deprecated should be used inside a task block and not inside a job block
     */
    minRetryIntervalMillis?: pulumi.Input<number>;
    /**
     * An optional name for the job. The default value is Untitled.
     */
    name?: pulumi.Input<string>;
    /**
     * Same set of parameters as for databricks.Cluster resource.
     */
    newCluster?: pulumi.Input<inputs.JobNewCluster>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    notebookTask?: pulumi.Input<inputs.JobNotebookTask>;
    /**
     * An optional block controlling the notification settings on the job level (described below).
     */
    notificationSettings?: pulumi.Input<inputs.JobNotificationSettings>;
    parameters?: pulumi.Input<pulumi.Input<inputs.JobParameter>[]>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    pipelineTask?: pulumi.Input<inputs.JobPipelineTask>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    pythonWheelTask?: pulumi.Input<inputs.JobPythonWheelTask>;
    queue?: pulumi.Input<inputs.JobQueue>;
    /**
     * (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     *
     * @deprecated should be used inside a task block and not inside a job block
     */
    retryOnTimeout?: pulumi.Input<boolean>;
    runAs?: pulumi.Input<inputs.JobRunAs>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    runJobTask?: pulumi.Input<inputs.JobRunJobTask>;
    /**
     * (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
     */
    schedule?: pulumi.Input<inputs.JobSchedule>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    sparkJarTask?: pulumi.Input<inputs.JobSparkJarTask>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    sparkPythonTask?: pulumi.Input<inputs.JobSparkPythonTask>;
    /**
     * @deprecated should be used inside a task block and not inside a job block
     */
    sparkSubmitTask?: pulumi.Input<inputs.JobSparkSubmitTask>;
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * Task to run against the `inputs` list.
     */
    tasks?: pulumi.Input<pulumi.Input<inputs.JobTask>[]>;
    /**
     * (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     */
    timeoutSeconds?: pulumi.Input<number>;
    trigger?: pulumi.Input<inputs.JobTrigger>;
    /**
     * (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes or fails. The default behavior is to not send any notifications. This field is a block and is documented below.
     */
    webhookNotifications?: pulumi.Input<inputs.JobWebhookNotifications>;
}
