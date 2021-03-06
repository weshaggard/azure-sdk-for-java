/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Managed integration runtime status.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ManagedIntegrationRuntimeStatus.class)
@JsonTypeName("Managed")
@JsonFlatten
public class ManagedIntegrationRuntimeStatus extends IntegrationRuntimeStatus {
    /**
     * The time at which the integration runtime was created, in ISO8601
     * format.
     */
    @JsonProperty(value = "typeProperties.createTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createTime;

    /**
     * The list of nodes for managed integration runtime.
     */
    @JsonProperty(value = "typeProperties.nodes", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedIntegrationRuntimeNode> nodes;

    /**
     * The errors that occurred on this integration runtime.
     */
    @JsonProperty(value = "typeProperties.otherErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedIntegrationRuntimeError> otherErrors;

    /**
     * The last operation result that occurred on this integration runtime.
     */
    @JsonProperty(value = "typeProperties.lastOperation", access = JsonProperty.Access.WRITE_ONLY)
    private ManagedIntegrationRuntimeOperationResult lastOperation;

    /**
     * Get the time at which the integration runtime was created, in ISO8601 format.
     *
     * @return the createTime value
     */
    public DateTime createTime() {
        return this.createTime;
    }

    /**
     * Get the list of nodes for managed integration runtime.
     *
     * @return the nodes value
     */
    public List<ManagedIntegrationRuntimeNode> nodes() {
        return this.nodes;
    }

    /**
     * Get the errors that occurred on this integration runtime.
     *
     * @return the otherErrors value
     */
    public List<ManagedIntegrationRuntimeError> otherErrors() {
        return this.otherErrors;
    }

    /**
     * Get the last operation result that occurred on this integration runtime.
     *
     * @return the lastOperation value
     */
    public ManagedIntegrationRuntimeOperationResult lastOperation() {
        return this.lastOperation;
    }

}
