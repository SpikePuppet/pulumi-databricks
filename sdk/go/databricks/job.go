// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// # The resource job can be imported using the id of the job bash
//
// ```sh
//
//	$ pulumi import databricks:index/job:Job this <job-id>
//
// ```
type Job struct {
	pulumi.CustomResourceState

	// (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `sparkJarTask` or `sparkSubmitTask` or `sparkPythonTask` or `notebookTask` blocks.
	AlwaysRunning pulumi.BoolPtrOutput   `pulumi:"alwaysRunning"`
	Continuous    JobContinuousPtrOutput `pulumi:"continuous"`
	DbtTask       JobDbtTaskPtrOutput    `pulumi:"dbtTask"`
	// (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
	EmailNotifications JobEmailNotificationsPtrOutput `pulumi:"emailNotifications"`
	ExistingClusterId  pulumi.StringPtrOutput         `pulumi:"existingClusterId"`
	Format             pulumi.StringOutput            `pulumi:"format"`
	GitSource          JobGitSourcePtrOutput          `pulumi:"gitSource"`
	// A list of job Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
	JobClusters JobJobClusterArrayOutput `pulumi:"jobClusters"`
	// (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for Cluster resource.
	Libraries JobLibraryArrayOutput `pulumi:"libraries"`
	// (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
	MaxConcurrentRuns pulumi.IntPtrOutput `pulumi:"maxConcurrentRuns"`
	// (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED or INTERNAL_ERROR lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: PENDING, RUNNING, TERMINATING, TERMINATED, SKIPPED or INTERNAL_ERROR
	MaxRetries pulumi.IntPtrOutput `pulumi:"maxRetries"`
	// (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
	MinRetryIntervalMillis pulumi.IntPtrOutput `pulumi:"minRetryIntervalMillis"`
	// An optional name for the job. The default value is Untitled.
	Name pulumi.StringOutput `pulumi:"name"`
	// Same set of parameters as for Cluster resource.
	NewCluster      JobNewClusterPtrOutput      `pulumi:"newCluster"`
	NotebookTask    JobNotebookTaskPtrOutput    `pulumi:"notebookTask"`
	PipelineTask    JobPipelineTaskPtrOutput    `pulumi:"pipelineTask"`
	PythonWheelTask JobPythonWheelTaskPtrOutput `pulumi:"pythonWheelTask"`
	// (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
	RetryOnTimeout pulumi.BoolPtrOutput `pulumi:"retryOnTimeout"`
	// (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
	Schedule        JobSchedulePtrOutput        `pulumi:"schedule"`
	SparkJarTask    JobSparkJarTaskPtrOutput    `pulumi:"sparkJarTask"`
	SparkPythonTask JobSparkPythonTaskPtrOutput `pulumi:"sparkPythonTask"`
	SparkSubmitTask JobSparkSubmitTaskPtrOutput `pulumi:"sparkSubmitTask"`
	// (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
	Tags  pulumi.MapOutput   `pulumi:"tags"`
	Tasks JobTaskArrayOutput `pulumi:"tasks"`
	// (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
	TimeoutSeconds pulumi.IntPtrOutput `pulumi:"timeoutSeconds"`
	// URL of the Git repository to use.
	Url pulumi.StringOutput `pulumi:"url"`
	// (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes and fails. The default behavior is to not send any notifications. This field is a block and is documented below.
	WebhookNotifications JobWebhookNotificationsPtrOutput `pulumi:"webhookNotifications"`
}

// NewJob registers a new resource with the given unique name, arguments, and options.
func NewJob(ctx *pulumi.Context,
	name string, args *JobArgs, opts ...pulumi.ResourceOption) (*Job, error) {
	if args == nil {
		args = &JobArgs{}
	}

	var resource Job
	err := ctx.RegisterResource("databricks:index/job:Job", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetJob gets an existing Job resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetJob(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *JobState, opts ...pulumi.ResourceOption) (*Job, error) {
	var resource Job
	err := ctx.ReadResource("databricks:index/job:Job", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Job resources.
type jobState struct {
	// (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `sparkJarTask` or `sparkSubmitTask` or `sparkPythonTask` or `notebookTask` blocks.
	AlwaysRunning *bool          `pulumi:"alwaysRunning"`
	Continuous    *JobContinuous `pulumi:"continuous"`
	DbtTask       *JobDbtTask    `pulumi:"dbtTask"`
	// (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
	EmailNotifications *JobEmailNotifications `pulumi:"emailNotifications"`
	ExistingClusterId  *string                `pulumi:"existingClusterId"`
	Format             *string                `pulumi:"format"`
	GitSource          *JobGitSource          `pulumi:"gitSource"`
	// A list of job Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
	JobClusters []JobJobCluster `pulumi:"jobClusters"`
	// (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for Cluster resource.
	Libraries []JobLibrary `pulumi:"libraries"`
	// (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
	MaxConcurrentRuns *int `pulumi:"maxConcurrentRuns"`
	// (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED or INTERNAL_ERROR lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: PENDING, RUNNING, TERMINATING, TERMINATED, SKIPPED or INTERNAL_ERROR
	MaxRetries *int `pulumi:"maxRetries"`
	// (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
	MinRetryIntervalMillis *int `pulumi:"minRetryIntervalMillis"`
	// An optional name for the job. The default value is Untitled.
	Name *string `pulumi:"name"`
	// Same set of parameters as for Cluster resource.
	NewCluster      *JobNewCluster      `pulumi:"newCluster"`
	NotebookTask    *JobNotebookTask    `pulumi:"notebookTask"`
	PipelineTask    *JobPipelineTask    `pulumi:"pipelineTask"`
	PythonWheelTask *JobPythonWheelTask `pulumi:"pythonWheelTask"`
	// (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
	RetryOnTimeout *bool `pulumi:"retryOnTimeout"`
	// (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
	Schedule        *JobSchedule        `pulumi:"schedule"`
	SparkJarTask    *JobSparkJarTask    `pulumi:"sparkJarTask"`
	SparkPythonTask *JobSparkPythonTask `pulumi:"sparkPythonTask"`
	SparkSubmitTask *JobSparkSubmitTask `pulumi:"sparkSubmitTask"`
	// (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
	Tags  map[string]interface{} `pulumi:"tags"`
	Tasks []JobTask              `pulumi:"tasks"`
	// (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
	TimeoutSeconds *int `pulumi:"timeoutSeconds"`
	// URL of the Git repository to use.
	Url *string `pulumi:"url"`
	// (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes and fails. The default behavior is to not send any notifications. This field is a block and is documented below.
	WebhookNotifications *JobWebhookNotifications `pulumi:"webhookNotifications"`
}

type JobState struct {
	// (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `sparkJarTask` or `sparkSubmitTask` or `sparkPythonTask` or `notebookTask` blocks.
	AlwaysRunning pulumi.BoolPtrInput
	Continuous    JobContinuousPtrInput
	DbtTask       JobDbtTaskPtrInput
	// (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
	EmailNotifications JobEmailNotificationsPtrInput
	ExistingClusterId  pulumi.StringPtrInput
	Format             pulumi.StringPtrInput
	GitSource          JobGitSourcePtrInput
	// A list of job Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
	JobClusters JobJobClusterArrayInput
	// (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for Cluster resource.
	Libraries JobLibraryArrayInput
	// (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
	MaxConcurrentRuns pulumi.IntPtrInput
	// (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED or INTERNAL_ERROR lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: PENDING, RUNNING, TERMINATING, TERMINATED, SKIPPED or INTERNAL_ERROR
	MaxRetries pulumi.IntPtrInput
	// (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
	MinRetryIntervalMillis pulumi.IntPtrInput
	// An optional name for the job. The default value is Untitled.
	Name pulumi.StringPtrInput
	// Same set of parameters as for Cluster resource.
	NewCluster      JobNewClusterPtrInput
	NotebookTask    JobNotebookTaskPtrInput
	PipelineTask    JobPipelineTaskPtrInput
	PythonWheelTask JobPythonWheelTaskPtrInput
	// (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
	RetryOnTimeout pulumi.BoolPtrInput
	// (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
	Schedule        JobSchedulePtrInput
	SparkJarTask    JobSparkJarTaskPtrInput
	SparkPythonTask JobSparkPythonTaskPtrInput
	SparkSubmitTask JobSparkSubmitTaskPtrInput
	// (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
	Tags  pulumi.MapInput
	Tasks JobTaskArrayInput
	// (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
	TimeoutSeconds pulumi.IntPtrInput
	// URL of the Git repository to use.
	Url pulumi.StringPtrInput
	// (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes and fails. The default behavior is to not send any notifications. This field is a block and is documented below.
	WebhookNotifications JobWebhookNotificationsPtrInput
}

func (JobState) ElementType() reflect.Type {
	return reflect.TypeOf((*jobState)(nil)).Elem()
}

type jobArgs struct {
	// (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `sparkJarTask` or `sparkSubmitTask` or `sparkPythonTask` or `notebookTask` blocks.
	AlwaysRunning *bool          `pulumi:"alwaysRunning"`
	Continuous    *JobContinuous `pulumi:"continuous"`
	DbtTask       *JobDbtTask    `pulumi:"dbtTask"`
	// (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
	EmailNotifications *JobEmailNotifications `pulumi:"emailNotifications"`
	ExistingClusterId  *string                `pulumi:"existingClusterId"`
	Format             *string                `pulumi:"format"`
	GitSource          *JobGitSource          `pulumi:"gitSource"`
	// A list of job Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
	JobClusters []JobJobCluster `pulumi:"jobClusters"`
	// (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for Cluster resource.
	Libraries []JobLibrary `pulumi:"libraries"`
	// (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
	MaxConcurrentRuns *int `pulumi:"maxConcurrentRuns"`
	// (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED or INTERNAL_ERROR lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: PENDING, RUNNING, TERMINATING, TERMINATED, SKIPPED or INTERNAL_ERROR
	MaxRetries *int `pulumi:"maxRetries"`
	// (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
	MinRetryIntervalMillis *int `pulumi:"minRetryIntervalMillis"`
	// An optional name for the job. The default value is Untitled.
	Name *string `pulumi:"name"`
	// Same set of parameters as for Cluster resource.
	NewCluster      *JobNewCluster      `pulumi:"newCluster"`
	NotebookTask    *JobNotebookTask    `pulumi:"notebookTask"`
	PipelineTask    *JobPipelineTask    `pulumi:"pipelineTask"`
	PythonWheelTask *JobPythonWheelTask `pulumi:"pythonWheelTask"`
	// (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
	RetryOnTimeout *bool `pulumi:"retryOnTimeout"`
	// (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
	Schedule        *JobSchedule        `pulumi:"schedule"`
	SparkJarTask    *JobSparkJarTask    `pulumi:"sparkJarTask"`
	SparkPythonTask *JobSparkPythonTask `pulumi:"sparkPythonTask"`
	SparkSubmitTask *JobSparkSubmitTask `pulumi:"sparkSubmitTask"`
	// (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
	Tags  map[string]interface{} `pulumi:"tags"`
	Tasks []JobTask              `pulumi:"tasks"`
	// (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
	TimeoutSeconds *int `pulumi:"timeoutSeconds"`
	// (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes and fails. The default behavior is to not send any notifications. This field is a block and is documented below.
	WebhookNotifications *JobWebhookNotifications `pulumi:"webhookNotifications"`
}

// The set of arguments for constructing a Job resource.
type JobArgs struct {
	// (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `sparkJarTask` or `sparkSubmitTask` or `sparkPythonTask` or `notebookTask` blocks.
	AlwaysRunning pulumi.BoolPtrInput
	Continuous    JobContinuousPtrInput
	DbtTask       JobDbtTaskPtrInput
	// (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
	EmailNotifications JobEmailNotificationsPtrInput
	ExistingClusterId  pulumi.StringPtrInput
	Format             pulumi.StringPtrInput
	GitSource          JobGitSourcePtrInput
	// A list of job Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
	JobClusters JobJobClusterArrayInput
	// (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for Cluster resource.
	Libraries JobLibraryArrayInput
	// (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
	MaxConcurrentRuns pulumi.IntPtrInput
	// (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED or INTERNAL_ERROR lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: PENDING, RUNNING, TERMINATING, TERMINATED, SKIPPED or INTERNAL_ERROR
	MaxRetries pulumi.IntPtrInput
	// (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
	MinRetryIntervalMillis pulumi.IntPtrInput
	// An optional name for the job. The default value is Untitled.
	Name pulumi.StringPtrInput
	// Same set of parameters as for Cluster resource.
	NewCluster      JobNewClusterPtrInput
	NotebookTask    JobNotebookTaskPtrInput
	PipelineTask    JobPipelineTaskPtrInput
	PythonWheelTask JobPythonWheelTaskPtrInput
	// (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
	RetryOnTimeout pulumi.BoolPtrInput
	// (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
	Schedule        JobSchedulePtrInput
	SparkJarTask    JobSparkJarTaskPtrInput
	SparkPythonTask JobSparkPythonTaskPtrInput
	SparkSubmitTask JobSparkSubmitTaskPtrInput
	// (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
	Tags  pulumi.MapInput
	Tasks JobTaskArrayInput
	// (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
	TimeoutSeconds pulumi.IntPtrInput
	// (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes and fails. The default behavior is to not send any notifications. This field is a block and is documented below.
	WebhookNotifications JobWebhookNotificationsPtrInput
}

func (JobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*jobArgs)(nil)).Elem()
}

type JobInput interface {
	pulumi.Input

	ToJobOutput() JobOutput
	ToJobOutputWithContext(ctx context.Context) JobOutput
}

func (*Job) ElementType() reflect.Type {
	return reflect.TypeOf((**Job)(nil)).Elem()
}

func (i *Job) ToJobOutput() JobOutput {
	return i.ToJobOutputWithContext(context.Background())
}

func (i *Job) ToJobOutputWithContext(ctx context.Context) JobOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobOutput)
}

// JobArrayInput is an input type that accepts JobArray and JobArrayOutput values.
// You can construct a concrete instance of `JobArrayInput` via:
//
//	JobArray{ JobArgs{...} }
type JobArrayInput interface {
	pulumi.Input

	ToJobArrayOutput() JobArrayOutput
	ToJobArrayOutputWithContext(context.Context) JobArrayOutput
}

type JobArray []JobInput

func (JobArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Job)(nil)).Elem()
}

func (i JobArray) ToJobArrayOutput() JobArrayOutput {
	return i.ToJobArrayOutputWithContext(context.Background())
}

func (i JobArray) ToJobArrayOutputWithContext(ctx context.Context) JobArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobArrayOutput)
}

// JobMapInput is an input type that accepts JobMap and JobMapOutput values.
// You can construct a concrete instance of `JobMapInput` via:
//
//	JobMap{ "key": JobArgs{...} }
type JobMapInput interface {
	pulumi.Input

	ToJobMapOutput() JobMapOutput
	ToJobMapOutputWithContext(context.Context) JobMapOutput
}

type JobMap map[string]JobInput

func (JobMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Job)(nil)).Elem()
}

func (i JobMap) ToJobMapOutput() JobMapOutput {
	return i.ToJobMapOutputWithContext(context.Background())
}

func (i JobMap) ToJobMapOutputWithContext(ctx context.Context) JobMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobMapOutput)
}

type JobOutput struct{ *pulumi.OutputState }

func (JobOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Job)(nil)).Elem()
}

func (o JobOutput) ToJobOutput() JobOutput {
	return o
}

func (o JobOutput) ToJobOutputWithContext(ctx context.Context) JobOutput {
	return o
}

// (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `sparkJarTask` or `sparkSubmitTask` or `sparkPythonTask` or `notebookTask` blocks.
func (o JobOutput) AlwaysRunning() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.BoolPtrOutput { return v.AlwaysRunning }).(pulumi.BoolPtrOutput)
}

func (o JobOutput) Continuous() JobContinuousPtrOutput {
	return o.ApplyT(func(v *Job) JobContinuousPtrOutput { return v.Continuous }).(JobContinuousPtrOutput)
}

func (o JobOutput) DbtTask() JobDbtTaskPtrOutput {
	return o.ApplyT(func(v *Job) JobDbtTaskPtrOutput { return v.DbtTask }).(JobDbtTaskPtrOutput)
}

// (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
func (o JobOutput) EmailNotifications() JobEmailNotificationsPtrOutput {
	return o.ApplyT(func(v *Job) JobEmailNotificationsPtrOutput { return v.EmailNotifications }).(JobEmailNotificationsPtrOutput)
}

func (o JobOutput) ExistingClusterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.StringPtrOutput { return v.ExistingClusterId }).(pulumi.StringPtrOutput)
}

func (o JobOutput) Format() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.Format }).(pulumi.StringOutput)
}

func (o JobOutput) GitSource() JobGitSourcePtrOutput {
	return o.ApplyT(func(v *Job) JobGitSourcePtrOutput { return v.GitSource }).(JobGitSourcePtrOutput)
}

// A list of job Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
func (o JobOutput) JobClusters() JobJobClusterArrayOutput {
	return o.ApplyT(func(v *Job) JobJobClusterArrayOutput { return v.JobClusters }).(JobJobClusterArrayOutput)
}

// (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for Cluster resource.
func (o JobOutput) Libraries() JobLibraryArrayOutput {
	return o.ApplyT(func(v *Job) JobLibraryArrayOutput { return v.Libraries }).(JobLibraryArrayOutput)
}

// (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
func (o JobOutput) MaxConcurrentRuns() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.IntPtrOutput { return v.MaxConcurrentRuns }).(pulumi.IntPtrOutput)
}

// (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED or INTERNAL_ERROR lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: PENDING, RUNNING, TERMINATING, TERMINATED, SKIPPED or INTERNAL_ERROR
func (o JobOutput) MaxRetries() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.IntPtrOutput { return v.MaxRetries }).(pulumi.IntPtrOutput)
}

// (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
func (o JobOutput) MinRetryIntervalMillis() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.IntPtrOutput { return v.MinRetryIntervalMillis }).(pulumi.IntPtrOutput)
}

// An optional name for the job. The default value is Untitled.
func (o JobOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Same set of parameters as for Cluster resource.
func (o JobOutput) NewCluster() JobNewClusterPtrOutput {
	return o.ApplyT(func(v *Job) JobNewClusterPtrOutput { return v.NewCluster }).(JobNewClusterPtrOutput)
}

func (o JobOutput) NotebookTask() JobNotebookTaskPtrOutput {
	return o.ApplyT(func(v *Job) JobNotebookTaskPtrOutput { return v.NotebookTask }).(JobNotebookTaskPtrOutput)
}

func (o JobOutput) PipelineTask() JobPipelineTaskPtrOutput {
	return o.ApplyT(func(v *Job) JobPipelineTaskPtrOutput { return v.PipelineTask }).(JobPipelineTaskPtrOutput)
}

func (o JobOutput) PythonWheelTask() JobPythonWheelTaskPtrOutput {
	return o.ApplyT(func(v *Job) JobPythonWheelTaskPtrOutput { return v.PythonWheelTask }).(JobPythonWheelTaskPtrOutput)
}

// (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
func (o JobOutput) RetryOnTimeout() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.BoolPtrOutput { return v.RetryOnTimeout }).(pulumi.BoolPtrOutput)
}

// (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
func (o JobOutput) Schedule() JobSchedulePtrOutput {
	return o.ApplyT(func(v *Job) JobSchedulePtrOutput { return v.Schedule }).(JobSchedulePtrOutput)
}

func (o JobOutput) SparkJarTask() JobSparkJarTaskPtrOutput {
	return o.ApplyT(func(v *Job) JobSparkJarTaskPtrOutput { return v.SparkJarTask }).(JobSparkJarTaskPtrOutput)
}

func (o JobOutput) SparkPythonTask() JobSparkPythonTaskPtrOutput {
	return o.ApplyT(func(v *Job) JobSparkPythonTaskPtrOutput { return v.SparkPythonTask }).(JobSparkPythonTaskPtrOutput)
}

func (o JobOutput) SparkSubmitTask() JobSparkSubmitTaskPtrOutput {
	return o.ApplyT(func(v *Job) JobSparkSubmitTaskPtrOutput { return v.SparkSubmitTask }).(JobSparkSubmitTaskPtrOutput)
}

// (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
func (o JobOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *Job) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

func (o JobOutput) Tasks() JobTaskArrayOutput {
	return o.ApplyT(func(v *Job) JobTaskArrayOutput { return v.Tasks }).(JobTaskArrayOutput)
}

// (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
func (o JobOutput) TimeoutSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.IntPtrOutput { return v.TimeoutSeconds }).(pulumi.IntPtrOutput)
}

// URL of the Git repository to use.
func (o JobOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes and fails. The default behavior is to not send any notifications. This field is a block and is documented below.
func (o JobOutput) WebhookNotifications() JobWebhookNotificationsPtrOutput {
	return o.ApplyT(func(v *Job) JobWebhookNotificationsPtrOutput { return v.WebhookNotifications }).(JobWebhookNotificationsPtrOutput)
}

type JobArrayOutput struct{ *pulumi.OutputState }

func (JobArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Job)(nil)).Elem()
}

func (o JobArrayOutput) ToJobArrayOutput() JobArrayOutput {
	return o
}

func (o JobArrayOutput) ToJobArrayOutputWithContext(ctx context.Context) JobArrayOutput {
	return o
}

func (o JobArrayOutput) Index(i pulumi.IntInput) JobOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Job {
		return vs[0].([]*Job)[vs[1].(int)]
	}).(JobOutput)
}

type JobMapOutput struct{ *pulumi.OutputState }

func (JobMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Job)(nil)).Elem()
}

func (o JobMapOutput) ToJobMapOutput() JobMapOutput {
	return o
}

func (o JobMapOutput) ToJobMapOutputWithContext(ctx context.Context) JobMapOutput {
	return o
}

func (o JobMapOutput) MapIndex(k pulumi.StringInput) JobOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Job {
		return vs[0].(map[string]*Job)[vs[1].(string)]
	}).(JobOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*JobInput)(nil)).Elem(), &Job{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobArrayInput)(nil)).Elem(), JobArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobMapInput)(nil)).Elem(), JobMap{})
	pulumi.RegisterOutputType(JobOutput{})
	pulumi.RegisterOutputType(JobArrayOutput{})
	pulumi.RegisterOutputType(JobMapOutput{})
}
