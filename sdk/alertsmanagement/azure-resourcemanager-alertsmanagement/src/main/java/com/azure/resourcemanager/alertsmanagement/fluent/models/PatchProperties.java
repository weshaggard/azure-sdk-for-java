// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Alert processing rule properties supported by patch. */
@Fluent
public final class PatchProperties {
    /*
     * Indicates if the given alert processing rule is enabled or disabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the enabled property: Indicates if the given alert processing rule is enabled or disabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates if the given alert processing rule is enabled or disabled.
     *
     * @param enabled the enabled value to set.
     * @return the PatchProperties object itself.
     */
    public PatchProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
