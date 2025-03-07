// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for ThreatProtectionName.
 */
public final class ThreatProtectionName extends ExpandableStringEnum<ThreatProtectionName> {
    /**
     * Static value Default for ThreatProtectionName.
     */
    public static final ThreatProtectionName DEFAULT = fromString("Default");

    /**
     * Creates a new instance of ThreatProtectionName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ThreatProtectionName() {
    }

    /**
     * Creates or finds a ThreatProtectionName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ThreatProtectionName.
     */
    public static ThreatProtectionName fromString(String name) {
        return fromString(name, ThreatProtectionName.class);
    }

    /**
     * Gets known ThreatProtectionName values.
     * 
     * @return known ThreatProtectionName values.
     */
    public static Collection<ThreatProtectionName> values() {
        return values(ThreatProtectionName.class);
    }
}
