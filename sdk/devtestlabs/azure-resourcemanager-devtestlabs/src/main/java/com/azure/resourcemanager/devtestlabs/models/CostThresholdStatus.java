// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CostThresholdStatus. */
public final class CostThresholdStatus extends ExpandableStringEnum<CostThresholdStatus> {
    /** Static value Enabled for CostThresholdStatus. */
    public static final CostThresholdStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for CostThresholdStatus. */
    public static final CostThresholdStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a CostThresholdStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CostThresholdStatus.
     */
    @JsonCreator
    public static CostThresholdStatus fromString(String name) {
        return fromString(name, CostThresholdStatus.class);
    }

    /** @return known CostThresholdStatus values. */
    public static Collection<CostThresholdStatus> values() {
        return values(CostThresholdStatus.class);
    }
}
