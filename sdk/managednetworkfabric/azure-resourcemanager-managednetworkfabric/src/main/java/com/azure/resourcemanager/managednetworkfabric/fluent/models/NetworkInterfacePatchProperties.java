// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.models.AnnotationResource;

/** Network Interface Patch properties. */
@Fluent
public final class NetworkInterfacePatchProperties extends AnnotationResource {
    /** Creates an instance of NetworkInterfacePatchProperties class. */
    public NetworkInterfacePatchProperties() {
    }

    /** {@inheritDoc} */
    @Override
    public NetworkInterfacePatchProperties withAnnotation(String annotation) {
        super.withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
