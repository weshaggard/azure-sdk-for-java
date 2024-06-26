// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the properties to be updated for Virtual Instance for SAP.
 */
@Fluent
public final class UpdateSapVirtualInstanceProperties {
    /*
     * Specifies the network access configuration for the resources that will be deployed in the Managed Resource
     * Group. The options to choose from are Public and Private. If 'Private' is chosen, the Storage Account service
     * tag should be enabled on the subnets in which the SAP VMs exist. This is required for establishing connectivity
     * between VM extensions and the managed resource group storage account. This setting is currently applicable only
     * to Storage Account. Learn more here https://go.microsoft.com/fwlink/?linkid=2247228
     */
    @JsonProperty(value = "managedResourcesNetworkAccessType")
    private ManagedResourcesNetworkAccessType managedResourcesNetworkAccessType;

    /**
     * Creates an instance of UpdateSapVirtualInstanceProperties class.
     */
    public UpdateSapVirtualInstanceProperties() {
    }

    /**
     * Get the managedResourcesNetworkAccessType property: Specifies the network access configuration for the resources
     * that will be deployed in the Managed Resource Group. The options to choose from are Public and Private. If
     * 'Private' is chosen, the Storage Account service tag should be enabled on the subnets in which the SAP VMs
     * exist. This is required for establishing connectivity between VM extensions and the managed resource group
     * storage account. This setting is currently applicable only to Storage Account. Learn more here
     * https://go.microsoft.com/fwlink/?linkid=2247228.
     * 
     * @return the managedResourcesNetworkAccessType value.
     */
    public ManagedResourcesNetworkAccessType managedResourcesNetworkAccessType() {
        return this.managedResourcesNetworkAccessType;
    }

    /**
     * Set the managedResourcesNetworkAccessType property: Specifies the network access configuration for the resources
     * that will be deployed in the Managed Resource Group. The options to choose from are Public and Private. If
     * 'Private' is chosen, the Storage Account service tag should be enabled on the subnets in which the SAP VMs
     * exist. This is required for establishing connectivity between VM extensions and the managed resource group
     * storage account. This setting is currently applicable only to Storage Account. Learn more here
     * https://go.microsoft.com/fwlink/?linkid=2247228.
     * 
     * @param managedResourcesNetworkAccessType the managedResourcesNetworkAccessType value to set.
     * @return the UpdateSapVirtualInstanceProperties object itself.
     */
    public UpdateSapVirtualInstanceProperties
        withManagedResourcesNetworkAccessType(ManagedResourcesNetworkAccessType managedResourcesNetworkAccessType) {
        this.managedResourcesNetworkAccessType = managedResourcesNetworkAccessType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
