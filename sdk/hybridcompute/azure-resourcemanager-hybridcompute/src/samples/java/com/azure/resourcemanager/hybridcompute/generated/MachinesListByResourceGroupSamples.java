// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for Machines ListByResourceGroup.
 */
public final class MachinesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2025-02-19-preview/examples/machine/
     * Machines_ListByResourceGroup.json
     */
    /**
     * Sample code: List Machines by resource group.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void
        listMachinesByResourceGroup(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.machines().listByResourceGroup("myResourceGroup", null, com.azure.core.util.Context.NONE);
    }
}
