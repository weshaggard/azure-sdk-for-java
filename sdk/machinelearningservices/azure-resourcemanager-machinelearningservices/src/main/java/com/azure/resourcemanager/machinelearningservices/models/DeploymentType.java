// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeploymentType. */
public final class DeploymentType extends ExpandableStringEnum<DeploymentType> {
    /** Static value GRPCRealtimeEndpoint for DeploymentType. */
    public static final DeploymentType GRPCREALTIME_ENDPOINT = fromString("GRPCRealtimeEndpoint");

    /** Static value HttpRealtimeEndpoint for DeploymentType. */
    public static final DeploymentType HTTP_REALTIME_ENDPOINT = fromString("HttpRealtimeEndpoint");

    /** Static value Batch for DeploymentType. */
    public static final DeploymentType BATCH = fromString("Batch");

    /**
     * Creates or finds a DeploymentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeploymentType.
     */
    @JsonCreator
    public static DeploymentType fromString(String name) {
        return fromString(name, DeploymentType.class);
    }

    /** @return known DeploymentType values. */
    public static Collection<DeploymentType> values() {
        return values(DeploymentType.class);
    }
}
