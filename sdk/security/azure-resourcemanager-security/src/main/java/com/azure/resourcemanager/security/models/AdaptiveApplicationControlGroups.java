// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.AdaptiveApplicationControlGroupsInner;
import java.util.List;

/**
 * An immutable client-side representation of AdaptiveApplicationControlGroups.
 */
public interface AdaptiveApplicationControlGroups {
    /**
     * Gets the value property: The value property.
     * 
     * @return the value value.
     */
    List<AdaptiveApplicationControlGroup> value();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.AdaptiveApplicationControlGroupsInner object.
     * 
     * @return the inner object.
     */
    AdaptiveApplicationControlGroupsInner innerModel();
}
