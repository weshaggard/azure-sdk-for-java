// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridconnectivity.fluent.models.ServiceConfigurationPropertiesPatch;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The service details under service configuration for the target endpoint resource. */
@Fluent
public final class ServiceConfigurationResourcePatch {
    /*
     * The service configuration properties.
     */
    @JsonProperty(value = "properties")
    private ServiceConfigurationPropertiesPatch innerProperties;

    /** Creates an instance of ServiceConfigurationResourcePatch class. */
    public ServiceConfigurationResourcePatch() {
    }

    /**
     * Get the innerProperties property: The service configuration properties.
     *
     * @return the innerProperties value.
     */
    private ServiceConfigurationPropertiesPatch innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the port property: The port on which service is enabled.
     *
     * @return the port value.
     */
    public Long port() {
        return this.innerProperties() == null ? null : this.innerProperties().port();
    }

    /**
     * Set the port property: The port on which service is enabled.
     *
     * @param port the port value to set.
     * @return the ServiceConfigurationResourcePatch object itself.
     */
    public ServiceConfigurationResourcePatch withPort(Long port) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceConfigurationPropertiesPatch();
        }
        this.innerProperties().withPort(port);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
