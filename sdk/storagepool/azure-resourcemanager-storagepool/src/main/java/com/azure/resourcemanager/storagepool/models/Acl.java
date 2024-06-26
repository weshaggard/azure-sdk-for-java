// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Access Control List (ACL) for an iSCSI Target; defines LUN masking policy. */
@Fluent
public final class Acl {
    /*
     * iSCSI initiator IQN (iSCSI Qualified Name); example: "iqn.2005-03.org.iscsi:client".
     */
    @JsonProperty(value = "initiatorIqn", required = true)
    private String initiatorIqn;

    /*
     * List of LUN names mapped to the ACL.
     */
    @JsonProperty(value = "mappedLuns", required = true)
    private List<String> mappedLuns;

    /** Creates an instance of Acl class. */
    public Acl() {
    }

    /**
     * Get the initiatorIqn property: iSCSI initiator IQN (iSCSI Qualified Name); example:
     * "iqn.2005-03.org.iscsi:client".
     *
     * @return the initiatorIqn value.
     */
    public String initiatorIqn() {
        return this.initiatorIqn;
    }

    /**
     * Set the initiatorIqn property: iSCSI initiator IQN (iSCSI Qualified Name); example:
     * "iqn.2005-03.org.iscsi:client".
     *
     * @param initiatorIqn the initiatorIqn value to set.
     * @return the Acl object itself.
     */
    public Acl withInitiatorIqn(String initiatorIqn) {
        this.initiatorIqn = initiatorIqn;
        return this;
    }

    /**
     * Get the mappedLuns property: List of LUN names mapped to the ACL.
     *
     * @return the mappedLuns value.
     */
    public List<String> mappedLuns() {
        return this.mappedLuns;
    }

    /**
     * Set the mappedLuns property: List of LUN names mapped to the ACL.
     *
     * @param mappedLuns the mappedLuns value to set.
     * @return the Acl object itself.
     */
    public Acl withMappedLuns(List<String> mappedLuns) {
        this.mappedLuns = mappedLuns;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (initiatorIqn() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property initiatorIqn in model Acl"));
        }
        if (mappedLuns() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property mappedLuns in model Acl"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Acl.class);
}
