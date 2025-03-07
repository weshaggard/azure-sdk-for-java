// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Value indicating whether this adapter is valid.
 */
public final class NetworkAdapterStatus extends ExpandableStringEnum<NetworkAdapterStatus> {
    /**
     * Static value Inactive for NetworkAdapterStatus.
     */
    public static final NetworkAdapterStatus INACTIVE = fromString("Inactive");

    /**
     * Static value Active for NetworkAdapterStatus.
     */
    public static final NetworkAdapterStatus ACTIVE = fromString("Active");

    /**
     * Creates a new instance of NetworkAdapterStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NetworkAdapterStatus() {
    }

    /**
     * Creates or finds a NetworkAdapterStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NetworkAdapterStatus.
     */
    public static NetworkAdapterStatus fromString(String name) {
        return fromString(name, NetworkAdapterStatus.class);
    }

    /**
     * Gets known NetworkAdapterStatus values.
     * 
     * @return known NetworkAdapterStatus values.
     */
    public static Collection<NetworkAdapterStatus> values() {
        return values(NetworkAdapterStatus.class);
    }
}
