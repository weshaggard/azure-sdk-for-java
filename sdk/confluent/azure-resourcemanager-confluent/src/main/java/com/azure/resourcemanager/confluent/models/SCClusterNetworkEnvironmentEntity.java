// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The environment or the network to which cluster belongs.
 */
@Fluent
public final class SCClusterNetworkEnvironmentEntity {
    /*
     * ID of the referred resource
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Environment of the referred resource
     */
    @JsonProperty(value = "environment")
    private String environment;

    /*
     * API URL for accessing or modifying the referred object
     */
    @JsonProperty(value = "related")
    private String related;

    /*
     * CRN reference to the referred resource
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /**
     * Creates an instance of SCClusterNetworkEnvironmentEntity class.
     */
    public SCClusterNetworkEnvironmentEntity() {
    }

    /**
     * Get the id property: ID of the referred resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: ID of the referred resource.
     * 
     * @param id the id value to set.
     * @return the SCClusterNetworkEnvironmentEntity object itself.
     */
    public SCClusterNetworkEnvironmentEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the environment property: Environment of the referred resource.
     * 
     * @return the environment value.
     */
    public String environment() {
        return this.environment;
    }

    /**
     * Set the environment property: Environment of the referred resource.
     * 
     * @param environment the environment value to set.
     * @return the SCClusterNetworkEnvironmentEntity object itself.
     */
    public SCClusterNetworkEnvironmentEntity withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get the related property: API URL for accessing or modifying the referred object.
     * 
     * @return the related value.
     */
    public String related() {
        return this.related;
    }

    /**
     * Set the related property: API URL for accessing or modifying the referred object.
     * 
     * @param related the related value to set.
     * @return the SCClusterNetworkEnvironmentEntity object itself.
     */
    public SCClusterNetworkEnvironmentEntity withRelated(String related) {
        this.related = related;
        return this;
    }

    /**
     * Get the resourceName property: CRN reference to the referred resource.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: CRN reference to the referred resource.
     * 
     * @param resourceName the resourceName value to set.
     * @return the SCClusterNetworkEnvironmentEntity object itself.
     */
    public SCClusterNetworkEnvironmentEntity withResourceName(String resourceName) {
        this.resourceName = resourceName;
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
