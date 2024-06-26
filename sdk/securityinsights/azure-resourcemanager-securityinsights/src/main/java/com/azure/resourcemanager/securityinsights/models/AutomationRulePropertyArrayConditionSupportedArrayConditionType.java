// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AutomationRulePropertyArrayConditionSupportedArrayConditionType. */
public final class AutomationRulePropertyArrayConditionSupportedArrayConditionType
    extends ExpandableStringEnum<AutomationRulePropertyArrayConditionSupportedArrayConditionType> {
    /** Static value AnyItem for AutomationRulePropertyArrayConditionSupportedArrayConditionType. */
    public static final AutomationRulePropertyArrayConditionSupportedArrayConditionType ANY_ITEM =
        fromString("AnyItem");

    /**
     * Creates or finds a AutomationRulePropertyArrayConditionSupportedArrayConditionType from its string
     * representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutomationRulePropertyArrayConditionSupportedArrayConditionType.
     */
    @JsonCreator
    public static AutomationRulePropertyArrayConditionSupportedArrayConditionType fromString(String name) {
        return fromString(name, AutomationRulePropertyArrayConditionSupportedArrayConditionType.class);
    }

    /**
     * Gets known AutomationRulePropertyArrayConditionSupportedArrayConditionType values.
     *
     * @return known AutomationRulePropertyArrayConditionSupportedArrayConditionType values.
     */
    public static Collection<AutomationRulePropertyArrayConditionSupportedArrayConditionType> values() {
        return values(AutomationRulePropertyArrayConditionSupportedArrayConditionType.class);
    }
}
