// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.elastic.models.MonitoringTagRulesProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Capture logs and metrics of Azure resources based on ARM tags. */
@Fluent
public final class MonitoringTagRulesInner extends ProxyResource {
    /*
     * Properties of the monitoring tag rules.
     */
    @JsonProperty(value = "properties")
    private MonitoringTagRulesProperties properties;

    /*
     * The system metadata relating to this resource
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of MonitoringTagRulesInner class. */
    public MonitoringTagRulesInner() {
    }

    /**
     * Get the properties property: Properties of the monitoring tag rules.
     *
     * @return the properties value.
     */
    public MonitoringTagRulesProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the monitoring tag rules.
     *
     * @param properties the properties value to set.
     * @return the MonitoringTagRulesInner object itself.
     */
    public MonitoringTagRulesInner withProperties(MonitoringTagRulesProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
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
