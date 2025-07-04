// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/**
 * Samples for BareMetalMachines Start.
 */
public final class BareMetalMachinesStartSamples {
    /*
     * x-ms-original-file:
     * specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2025-02-01/examples/
     * BareMetalMachines_Start.json
     */
    /**
     * Sample code: Start bare metal machine.
     * 
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void startBareMetalMachine(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.bareMetalMachines()
            .start("resourceGroupName", "bareMetalMachineName", com.azure.core.util.Context.NONE);
    }
}
