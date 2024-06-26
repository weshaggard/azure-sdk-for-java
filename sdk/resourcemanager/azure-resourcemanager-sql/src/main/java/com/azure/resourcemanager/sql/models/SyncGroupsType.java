// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SyncGroupsType. */
public final class SyncGroupsType extends ExpandableStringEnum<SyncGroupsType> {
    /** Static value All for SyncGroupsType. */
    public static final SyncGroupsType ALL = fromString("All");

    /** Static value Error for SyncGroupsType. */
    public static final SyncGroupsType ERROR = fromString("Error");

    /** Static value Warning for SyncGroupsType. */
    public static final SyncGroupsType WARNING = fromString("Warning");

    /** Static value Success for SyncGroupsType. */
    public static final SyncGroupsType SUCCESS = fromString("Success");

    /**
     * Creates or finds a SyncGroupsType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SyncGroupsType.
     */
    @JsonCreator
    public static SyncGroupsType fromString(String name) {
        return fromString(name, SyncGroupsType.class);
    }

    /**
     * Gets known SyncGroupsType values.
     *
     * @return known SyncGroupsType values.
     */
    public static Collection<SyncGroupsType> values() {
        return values(SyncGroupsType.class);
    }
}
