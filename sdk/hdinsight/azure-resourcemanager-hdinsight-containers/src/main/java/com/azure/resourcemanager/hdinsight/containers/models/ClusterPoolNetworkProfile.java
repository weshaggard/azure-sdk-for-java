// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Cluster pool networking configuration.
 */
@Fluent
public class ClusterPoolNetworkProfile {
    /*
     * Cluster pool subnet resource id.
     */
    @JsonProperty(value = "subnetId", required = true)
    private String subnetId;

    /*
     * The outbound (egress) routing method.
     * 
     * This can only be set at cluster pool creation time and cannot be changed later.
     */
    @JsonProperty(value = "outboundType")
    private OutboundType outboundType;

    /*
     * ClusterPool is based on AKS cluster. AKS cluster exposes the API server to public internet by default. If you
     * set this property to true, a private AKS cluster will be created, and it will use private apiserver, which is
     * not exposed to public internet.
     */
    @JsonProperty(value = "enablePrivateApiServer")
    private Boolean enablePrivateApiServer;

    /*
     * The IP ranges authorized to access the AKS API server.
     * 
     * IP ranges are specified in CIDR format, e.g. 137.117.106.88/29. This feature is not compatible with private AKS
     * clusters. So you cannot set enablePrivateApiServer to true and apiServerAuthorizedIpRanges at the same time.
     */
    @JsonProperty(value = "apiServerAuthorizedIpRanges")
    private List<String> apiServerAuthorizedIpRanges;

    /**
     * Creates an instance of ClusterPoolNetworkProfile class.
     */
    public ClusterPoolNetworkProfile() {
    }

    /**
     * Get the subnetId property: Cluster pool subnet resource id.
     * 
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: Cluster pool subnet resource id.
     * 
     * @param subnetId the subnetId value to set.
     * @return the ClusterPoolNetworkProfile object itself.
     */
    public ClusterPoolNetworkProfile withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the outboundType property: The outbound (egress) routing method.
     * 
     * This can only be set at cluster pool creation time and cannot be changed later.
     * 
     * @return the outboundType value.
     */
    public OutboundType outboundType() {
        return this.outboundType;
    }

    /**
     * Set the outboundType property: The outbound (egress) routing method.
     * 
     * This can only be set at cluster pool creation time and cannot be changed later.
     * 
     * @param outboundType the outboundType value to set.
     * @return the ClusterPoolNetworkProfile object itself.
     */
    public ClusterPoolNetworkProfile withOutboundType(OutboundType outboundType) {
        this.outboundType = outboundType;
        return this;
    }

    /**
     * Get the enablePrivateApiServer property: ClusterPool is based on AKS cluster. AKS cluster exposes the API server
     * to public internet by default. If you set this property to true, a private AKS cluster will be created, and it
     * will use private apiserver, which is not exposed to public internet.
     * 
     * @return the enablePrivateApiServer value.
     */
    public Boolean enablePrivateApiServer() {
        return this.enablePrivateApiServer;
    }

    /**
     * Set the enablePrivateApiServer property: ClusterPool is based on AKS cluster. AKS cluster exposes the API server
     * to public internet by default. If you set this property to true, a private AKS cluster will be created, and it
     * will use private apiserver, which is not exposed to public internet.
     * 
     * @param enablePrivateApiServer the enablePrivateApiServer value to set.
     * @return the ClusterPoolNetworkProfile object itself.
     */
    public ClusterPoolNetworkProfile withEnablePrivateApiServer(Boolean enablePrivateApiServer) {
        this.enablePrivateApiServer = enablePrivateApiServer;
        return this;
    }

    /**
     * Get the apiServerAuthorizedIpRanges property: The IP ranges authorized to access the AKS API server.
     * 
     * IP ranges are specified in CIDR format, e.g. 137.117.106.88/29. This feature is not compatible with private AKS
     * clusters. So you cannot set enablePrivateApiServer to true and apiServerAuthorizedIpRanges at the same time.
     * 
     * @return the apiServerAuthorizedIpRanges value.
     */
    public List<String> apiServerAuthorizedIpRanges() {
        return this.apiServerAuthorizedIpRanges;
    }

    /**
     * Set the apiServerAuthorizedIpRanges property: The IP ranges authorized to access the AKS API server.
     * 
     * IP ranges are specified in CIDR format, e.g. 137.117.106.88/29. This feature is not compatible with private AKS
     * clusters. So you cannot set enablePrivateApiServer to true and apiServerAuthorizedIpRanges at the same time.
     * 
     * @param apiServerAuthorizedIpRanges the apiServerAuthorizedIpRanges value to set.
     * @return the ClusterPoolNetworkProfile object itself.
     */
    public ClusterPoolNetworkProfile withApiServerAuthorizedIpRanges(List<String> apiServerAuthorizedIpRanges) {
        this.apiServerAuthorizedIpRanges = apiServerAuthorizedIpRanges;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnetId() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property subnetId in model ClusterPoolNetworkProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterPoolNetworkProfile.class);
}
