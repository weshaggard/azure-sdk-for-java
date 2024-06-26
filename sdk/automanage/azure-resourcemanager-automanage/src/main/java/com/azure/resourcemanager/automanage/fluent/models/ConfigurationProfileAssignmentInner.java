// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.automanage.models.ConfigurationProfileAssignmentProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration profile assignment is an association between a VM and automanage profile configuration. */
@Fluent
public final class ConfigurationProfileAssignmentInner extends ProxyResource {
    /*
     * Properties of the configuration profile assignment.
     */
    @JsonProperty(value = "properties")
    private ConfigurationProfileAssignmentProperties properties;

    /*
     * Azure resource id. Indicates if this resource is managed by another Azure resource.
     */
    @JsonProperty(value = "managedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String managedBy;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: Properties of the configuration profile assignment.
     *
     * @return the properties value.
     */
    public ConfigurationProfileAssignmentProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the configuration profile assignment.
     *
     * @param properties the properties value to set.
     * @return the ConfigurationProfileAssignmentInner object itself.
     */
    public ConfigurationProfileAssignmentInner withProperties(ConfigurationProfileAssignmentProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the managedBy property: Azure resource id. Indicates if this resource is managed by another Azure resource.
     *
     * @return the managedBy value.
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
