// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for Gateways List.
 */
public final class GatewaysListSamples {
    /*
     * x-ms-original-file:
     * specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2025-02-19-preview/examples/gateway/
     * Gateway_ListBySubscription.json
     */
    /**
     * Sample code: List Gateways by Subscription.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void
        listGatewaysBySubscription(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.gateways().list(com.azure.core.util.Context.NONE);
    }
}
