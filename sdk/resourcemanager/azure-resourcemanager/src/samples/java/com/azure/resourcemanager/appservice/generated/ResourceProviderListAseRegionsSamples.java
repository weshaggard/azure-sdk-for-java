// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for ResourceProvider ListAseRegions.
 */
public final class ResourceProviderListAseRegionsSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2024-11-01/examples/ListAseRegions.json
     */
    /**
     * Sample code: List aseregions.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAseregions(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getResourceProviders()
            .listAseRegions(com.azure.core.util.Context.NONE);
    }
}
