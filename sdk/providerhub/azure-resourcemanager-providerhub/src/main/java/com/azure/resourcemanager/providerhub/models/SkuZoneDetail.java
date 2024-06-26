// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SkuZoneDetail model. */
@Fluent
public final class SkuZoneDetail {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private List<String> name;

    /*
     * The capabilities property.
     */
    @JsonProperty(value = "capabilities")
    private List<SkuCapability> capabilities;

    /** Creates an instance of SkuZoneDetail class. */
    public SkuZoneDetail() {
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public List<String> name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the SkuZoneDetail object itself.
     */
    public SkuZoneDetail withName(List<String> name) {
        this.name = name;
        return this;
    }

    /**
     * Get the capabilities property: The capabilities property.
     *
     * @return the capabilities value.
     */
    public List<SkuCapability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: The capabilities property.
     *
     * @param capabilities the capabilities value to set.
     * @return the SkuZoneDetail object itself.
     */
    public SkuZoneDetail withCapabilities(List<SkuCapability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
    }
}
