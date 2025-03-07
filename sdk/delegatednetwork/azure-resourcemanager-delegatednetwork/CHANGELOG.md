# Release History

## 1.0.0-beta.4 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.0.0-beta.3 (2024-10-17)

- Azure Resource Manager DelegatedNetwork client library for Java. This package contains Microsoft Azure SDK for DelegatedNetwork Management SDK. DNC web api provides way to create, get and delete dnc controller. Package tag package-2021-03-15. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.OrchestratorResourceUpdateParameters` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DelegatedControllerProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationDisplay` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DelegatedSubnetResource` was modified

* `name()` was added
* `type()` was added
* `id()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ControllerResourceUpdateParameters` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OrchestratorResourceProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ControllerDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SubnetDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Orchestrators` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DelegatedControllers` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DelegatedSubnets` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OrchestratorResource` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `id()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added
* `name()` was added

#### `models.ControllerResource` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `id()` was added
* `name()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added

#### `models.ResourceUpdateParameters` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OrchestratorIdentity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.0.0-beta.2 (2023-01-16)

- Azure Resource Manager DelegatedNetwork client library for Java. This package contains Microsoft Azure SDK for DelegatedNetwork Management SDK. DNC web api provides way to create, get and delete dnc controller. Package tag package-2021-03-15. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.ErrorAdditionalInfo` was removed

#### `models.OrchestratorInstanceServices` was modified

* `delete(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteByResourceGroup(java.lang.String,java.lang.String)` was removed
* `deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed

#### `models.Orchestrator$Definition` was modified

* `withClusterRootCA(java.lang.String)` was removed
* `withControllerDetails(models.ControllerDetails)` was removed
* `withApiServerEndpoint(java.lang.String)` was removed
* `withOrchestratorAppId(java.lang.String)` was removed
* `withOrchestratorTenantId(java.lang.String)` was removed
* `withPrivateLinkResourceId(java.lang.String)` was removed

#### `models.Orchestrator` was modified

* `apiServerEndpoint()` was removed
* `clusterRootCA()` was removed
* `resourceGuid()` was removed
* `orchestratorTenantId()` was removed
* `controllerDetails()` was removed
* `privateLinkResourceId()` was removed
* `orchestratorAppId()` was removed
* `provisioningState()` was removed

#### `models.DelegatedSubnetServices` was modified

* `delete(java.lang.String,java.lang.String,java.lang.Boolean)` was removed

#### `models.DelegatedController` was modified

* `dncAppId()` was removed
* `resourceGuid()` was removed
* `provisioningState()` was removed
* `dncEndpoint()` was removed
* `dncTenantId()` was removed

### Features Added

* `models.DelegatedControllerProperties` was added

* `models.OrchestratorResourceProperties` was added

#### `models.DelegatedSubnet` was modified

* `resourceGroupName()` was added

#### `models.OrchestratorInstanceServices` was modified

* `delete(java.lang.String,java.lang.String,java.lang.Boolean,com.azure.core.util.Context)` was added
* `delete(java.lang.String,java.lang.String)` was added
* `deleteByIdWithResponse(java.lang.String,java.lang.Boolean,com.azure.core.util.Context)` was added

#### `models.Orchestrator$Definition` was modified

* `withProperties(models.OrchestratorResourceProperties)` was added

#### `models.Orchestrator` was modified

* `properties()` was added
* `resourceGroupName()` was added

#### `models.DelegatedController` was modified

* `resourceGroupName()` was added
* `properties()` was added

#### `DelegatedNetworkManager$Configurable` was modified

* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added
* `withScope(java.lang.String)` was added

#### `DelegatedNetworkManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

## 1.0.0-beta.1 (2021-03-26)

- Azure Resource Manager DelegatedNetwork client library for Java. This package contains Microsoft Azure SDK for DelegatedNetwork Management SDK. DNC web api provides way to create, get and delete dnc controller. Package tag package-2021-03-15. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
