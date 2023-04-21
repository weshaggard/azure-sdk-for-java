// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.ListAppIdResponseInner;
import java.util.List;

/** An immutable client-side representation of ListAppIdResponse. */
public interface ListAppIdResponse {
    /**
     * Gets the value property: List of AppIds.
     *
     * @return the value value.
     */
    List<String> value();

    /**
     * Gets the nextLink property: next Link.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.ListAppIdResponseInner object.
     *
     * @return the inner object.
     */
    ListAppIdResponseInner innerModel();
}