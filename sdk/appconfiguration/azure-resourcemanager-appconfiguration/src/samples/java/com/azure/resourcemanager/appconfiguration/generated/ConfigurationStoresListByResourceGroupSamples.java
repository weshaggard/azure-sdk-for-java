// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

/**
 * Samples for ConfigurationStores ListByResourceGroup.
 */
public final class ConfigurationStoresListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2024-06-01/examples/
     * ConfigurationStoresListByResourceGroup.json
     */
    /**
     * Sample code: ConfigurationStores_ListByResourceGroup.
     * 
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresListByResourceGroup(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.configurationStores().listByResourceGroup("myResourceGroup", null, com.azure.core.util.Context.NONE);
    }
}
