// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.resourcemanager.devtestlabs.models.ImportLabVirtualMachineRequest;

/**
 * Samples for Labs ImportVirtualMachine.
 */
public final class LabsImportVirtualMachineSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/
     * Labs_ImportVirtualMachine.json
     */
    /**
     * Sample code: Labs_ImportVirtualMachine.
     * 
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void labsImportVirtualMachine(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager.labs()
            .importVirtualMachine("resourceGroupName", "{labName}",
                new ImportLabVirtualMachineRequest().withSourceVirtualMachineResourceId(
                    "/subscriptions/{subscriptionId}/resourceGroups/{otherResourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}")
                    .withDestinationVirtualMachineName("{vmName}"),
                com.azure.core.util.Context.NONE);
    }
}
