// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.streamanalytics.fluent.models.PrivateEndpointInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of private endpoints.
 */
@Immutable
public final class PrivateEndpointListResult {
    /*
     * A list of private endpoints.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointInner> value;

    /*
     * The URL to fetch the next set of private endpoints.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of PrivateEndpointListResult class.
     */
    public PrivateEndpointListResult() {
    }

    /**
     * Get the value property: A list of private endpoints.
     * 
     * @return the value value.
     */
    public List<PrivateEndpointInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URL to fetch the next set of private endpoints.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
