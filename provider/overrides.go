// Copyright 2016-2022, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package databricks

import _ "embed" //nolint:golint

// Drop example which seems to trigger example translation non-determinism:
// https://github.com/pulumi/pulumi-databricks/issues/19#issuecomment-1276437126
//
// Original copied from
// https://github.com/databricks/terraform-provider-databricks/blob/dc7238fc43025d4ec267b8c61e4f57557fa0e3c3/docs/resources/group_member.md
//
//go:embed group_member.md
var docGroupMember []byte
