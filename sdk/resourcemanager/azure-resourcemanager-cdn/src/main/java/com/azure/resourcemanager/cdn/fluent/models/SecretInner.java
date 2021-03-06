// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.models.SecretParameters;
import com.azure.resourcemanager.cdn.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Friendly Secret name mapping to the any Secret or secret related information. */
@JsonFlatten
@Fluent
public class SecretInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecretInner.class);

    /*
     * Provisioning status
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    @JsonProperty(value = "properties.deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentStatus deploymentStatus;

    /*
     * object which contains secret parameters
     */
    @JsonProperty(value = "properties.parameters")
    private SecretParameters parameters;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Get the parameters property: object which contains secret parameters.
     *
     * @return the parameters value.
     */
    public SecretParameters parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: object which contains secret parameters.
     *
     * @param parameters the parameters value to set.
     * @return the SecretInner object itself.
     */
    public SecretInner withParameters(SecretParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the systemData property: Read only system data.
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
        if (parameters() != null) {
            parameters().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
