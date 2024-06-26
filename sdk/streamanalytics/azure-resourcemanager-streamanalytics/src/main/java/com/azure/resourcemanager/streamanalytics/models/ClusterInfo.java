// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties associated with a Stream Analytics cluster.
 */
@Fluent
public final class ClusterInfo {
    /*
     * The resource id of cluster.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of ClusterInfo class.
     */
    public ClusterInfo() {
    }

    /**
     * Get the id property: The resource id of cluster.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The resource id of cluster.
     * 
     * @param id the id value to set.
     * @return the ClusterInfo object itself.
     */
    public ClusterInfo withId(String id) {
        this.id = id;
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
