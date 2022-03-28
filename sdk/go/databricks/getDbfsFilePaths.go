// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := databricks.GetDbfsFilePaths(ctx, &GetDbfsFilePathsArgs{
// 			Path:      "dbfs:/user/hive/default.db/table",
// 			Recursive: false,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Related Resources
//
// The following resources are used in the same context:
//
// * End to end workspace management guide
// * DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
// * getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
// * DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
// * Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
// * Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
func GetDbfsFilePaths(ctx *pulumi.Context, args *GetDbfsFilePathsArgs, opts ...pulumi.InvokeOption) (*GetDbfsFilePathsResult, error) {
	var rv GetDbfsFilePathsResult
	err := ctx.Invoke("databricks:index/getDbfsFilePaths:getDbfsFilePaths", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDbfsFilePaths.
type GetDbfsFilePathsArgs struct {
	// Path on DBFS for the file to perform listing
	Path string `pulumi:"path"`
	// Either or not recursively list all files
	Recursive bool `pulumi:"recursive"`
}

// A collection of values returned by getDbfsFilePaths.
type GetDbfsFilePathsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Path string `pulumi:"path"`
	// returns list of objects with `path` and `fileSize` attributes in each
	PathLists []GetDbfsFilePathsPathList `pulumi:"pathLists"`
	Recursive bool                       `pulumi:"recursive"`
}

func GetDbfsFilePathsOutput(ctx *pulumi.Context, args GetDbfsFilePathsOutputArgs, opts ...pulumi.InvokeOption) GetDbfsFilePathsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDbfsFilePathsResult, error) {
			args := v.(GetDbfsFilePathsArgs)
			r, err := GetDbfsFilePaths(ctx, &args, opts...)
			return *r, err
		}).(GetDbfsFilePathsResultOutput)
}

// A collection of arguments for invoking getDbfsFilePaths.
type GetDbfsFilePathsOutputArgs struct {
	// Path on DBFS for the file to perform listing
	Path pulumi.StringInput `pulumi:"path"`
	// Either or not recursively list all files
	Recursive pulumi.BoolInput `pulumi:"recursive"`
}

func (GetDbfsFilePathsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDbfsFilePathsArgs)(nil)).Elem()
}

// A collection of values returned by getDbfsFilePaths.
type GetDbfsFilePathsResultOutput struct{ *pulumi.OutputState }

func (GetDbfsFilePathsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDbfsFilePathsResult)(nil)).Elem()
}

func (o GetDbfsFilePathsResultOutput) ToGetDbfsFilePathsResultOutput() GetDbfsFilePathsResultOutput {
	return o
}

func (o GetDbfsFilePathsResultOutput) ToGetDbfsFilePathsResultOutputWithContext(ctx context.Context) GetDbfsFilePathsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetDbfsFilePathsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbfsFilePathsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDbfsFilePathsResultOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbfsFilePathsResult) string { return v.Path }).(pulumi.StringOutput)
}

// returns list of objects with `path` and `fileSize` attributes in each
func (o GetDbfsFilePathsResultOutput) PathLists() GetDbfsFilePathsPathListArrayOutput {
	return o.ApplyT(func(v GetDbfsFilePathsResult) []GetDbfsFilePathsPathList { return v.PathLists }).(GetDbfsFilePathsPathListArrayOutput)
}

func (o GetDbfsFilePathsResultOutput) Recursive() pulumi.BoolOutput {
	return o.ApplyT(func(v GetDbfsFilePathsResult) bool { return v.Recursive }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDbfsFilePathsResultOutput{})
}
