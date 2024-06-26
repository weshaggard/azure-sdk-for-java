// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.azurestack.models.CloudManifestFileProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cloud specific manifest GET response. */
@Fluent
public final class CloudManifestFileResponseInner extends ProxyResource {
    /*
     * Cloud specific manifest data.
     */
    @JsonProperty(value = "properties")
    private CloudManifestFileProperties properties;

    /*
     * The entity tag used for optimistic concurrency when modifying the resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /** Creates an instance of CloudManifestFileResponseInner class. */
    public CloudManifestFileResponseInner() {
    }

    /**
     * Get the properties property: Cloud specific manifest data.
     *
     * @return the properties value.
     */
    public CloudManifestFileProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Cloud specific manifest data.
     *
     * @param properties the properties value to set.
     * @return the CloudManifestFileResponseInner object itself.
     */
    public CloudManifestFileResponseInner withProperties(CloudManifestFileProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the etag property: The entity tag used for optimistic concurrency when modifying the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The entity tag used for optimistic concurrency when modifying the resource.
     *
     * @param etag the etag value to set.
     * @return the CloudManifestFileResponseInner object itself.
     */
    public CloudManifestFileResponseInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
