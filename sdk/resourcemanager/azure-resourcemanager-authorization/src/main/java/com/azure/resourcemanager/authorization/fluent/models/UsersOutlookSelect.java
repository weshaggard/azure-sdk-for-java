// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UsersOutlookSelect. */
public final class UsersOutlookSelect extends ExpandableStringEnum<UsersOutlookSelect> {
    /** Static value id for UsersOutlookSelect. */
    public static final UsersOutlookSelect ID = fromString("id");

    /** Static value color for UsersOutlookSelect. */
    public static final UsersOutlookSelect COLOR = fromString("color");

    /** Static value displayName for UsersOutlookSelect. */
    public static final UsersOutlookSelect DISPLAY_NAME = fromString("displayName");

    /**
     * Creates or finds a UsersOutlookSelect from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UsersOutlookSelect.
     */
    @JsonCreator
    public static UsersOutlookSelect fromString(String name) {
        return fromString(name, UsersOutlookSelect.class);
    }

    /** @return known UsersOutlookSelect values. */
    public static Collection<UsersOutlookSelect> values() {
        return values(UsersOutlookSelect.class);
    }
}
