// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Encryption At Rest Type.
 */
public final class EncryptionAtRestType extends ExpandableStringEnum<EncryptionAtRestType> {
    /**
     * Static value Invalid for EncryptionAtRestType.
     */
    public static final EncryptionAtRestType INVALID = fromString("Invalid");

    /**
     * Static value MicrosoftManaged for EncryptionAtRestType.
     */
    public static final EncryptionAtRestType MICROSOFT_MANAGED = fromString("MicrosoftManaged");

    /**
     * Static value CustomerManaged for EncryptionAtRestType.
     */
    public static final EncryptionAtRestType CUSTOMER_MANAGED = fromString("CustomerManaged");

    /**
     * Creates a new instance of EncryptionAtRestType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EncryptionAtRestType() {
    }

    /**
     * Creates or finds a EncryptionAtRestType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EncryptionAtRestType.
     */
    public static EncryptionAtRestType fromString(String name) {
        return fromString(name, EncryptionAtRestType.class);
    }

    /**
     * Gets known EncryptionAtRestType values.
     * 
     * @return known EncryptionAtRestType values.
     */
    public static Collection<EncryptionAtRestType> values() {
        return values(EncryptionAtRestType.class);
    }
}
