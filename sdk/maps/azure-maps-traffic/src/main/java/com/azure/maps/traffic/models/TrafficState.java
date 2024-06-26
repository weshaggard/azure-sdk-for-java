// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.traffic.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Traffic State information. */
@Immutable
public final class TrafficState {
    /*
     * The elapsed time (in seconds) from the Traffic Model ID creation.
     */
    @JsonProperty(value = "@trafficAge", access = JsonProperty.Access.WRITE_ONLY)
    private Integer trafficAge;

    /*
     * The unique ID called Traffic Model ID is used in calls to Traffic
     * Incident services. It allows to obtain information from particular
     * traffic updates. Traffic Model ID is updated every minute, and is valid
     * for two minutes before it times out.
     */
    @JsonProperty(value = "@trafficModelId", access = JsonProperty.Access.WRITE_ONLY)
    private String trafficModelId;

    /** Set default constructor to private */
    private TrafficState() {}

    /**
     * Get the trafficAge property: The elapsed time (in seconds) from the Traffic Model ID creation.
     *
     * @return the trafficAge value.
     */
    public Integer getTrafficAge() {
        return this.trafficAge;
    }

    /**
     * Get the trafficModelId property: The unique ID called Traffic Model ID is used in calls to Traffic Incident
     * services. It allows to obtain information from particular traffic updates. Traffic Model ID is updated every
     * minute, and is valid for two minutes before it times out.
     *
     * @return the trafficModelId value.
     */
    public String getTrafficModelId() {
        return this.trafficModelId;
    }
}
