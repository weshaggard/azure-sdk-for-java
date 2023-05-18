// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HybridAksClusterRestartNodeParameters represents the body of the request to restart the node of a Hybrid AKS cluster.
 */
@Fluent
public final class HybridAksClusterRestartNodeParameters {
    /*
     * The name of the node to restart.
     */
    @JsonProperty(value = "nodeName", required = true)
    private String nodeName;

    /** Creates an instance of HybridAksClusterRestartNodeParameters class. */
    public HybridAksClusterRestartNodeParameters() {
    }

    /**
     * Get the nodeName property: The name of the node to restart.
     *
     * @return the nodeName value.
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: The name of the node to restart.
     *
     * @param nodeName the nodeName value to set.
     * @return the HybridAksClusterRestartNodeParameters object itself.
     */
    public HybridAksClusterRestartNodeParameters withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nodeName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property nodeName in model HybridAksClusterRestartNodeParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HybridAksClusterRestartNodeParameters.class);
}