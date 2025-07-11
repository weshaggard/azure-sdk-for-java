// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Identity type that should be used for an operation.
 */
public final class IdentityType extends ExpandableStringEnum<IdentityType> {
    /**
     * Static value SystemAssigned for IdentityType.
     */
    public static final IdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /**
     * Static value UserAssigned for IdentityType.
     */
    public static final IdentityType USER_ASSIGNED = fromString("UserAssigned");

    /**
     * Creates a new instance of IdentityType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IdentityType() {
    }

    /**
     * Creates or finds a IdentityType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IdentityType.
     */
    public static IdentityType fromString(String name) {
        return fromString(name, IdentityType.class);
    }

    /**
     * Gets known IdentityType values.
     * 
     * @return known IdentityType values.
     */
    public static Collection<IdentityType> values() {
        return values(IdentityType.class);
    }
}
