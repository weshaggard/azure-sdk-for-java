// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Workload specific recovery point, specifically encapsulates full/diff recovery point. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = AzureWorkloadRecoveryPointAutoGenerated.class)
@JsonTypeName("AzureWorkloadRecoveryPoint")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "AzureWorkloadPointInTimeRecoveryPoint",
        value = AzureWorkloadPointInTimeRecoveryPointAutoGenerated.class),
    @JsonSubTypes.Type(
        name = "AzureWorkloadSAPHanaRecoveryPoint",
        value = AzureWorkloadSapHanaRecoveryPointAutoGenerated.class),
    @JsonSubTypes.Type(name = "AzureWorkloadSQLRecoveryPoint", value = AzureWorkloadSqlRecoveryPointAutoGenerated.class)
})
@Fluent
public class AzureWorkloadRecoveryPointAutoGenerated extends RecoveryPoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureWorkloadRecoveryPointAutoGenerated.class);

    /*
     * UTC time at which recovery point was created
     */
    @JsonProperty(value = "recoveryPointTimeInUTC", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime recoveryPointTimeInUtc;

    /*
     * Type of restore point
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private RestorePointType type;

    /*
     * Recovery point tier information.
     */
    @JsonProperty(value = "recoveryPointTierDetails")
    private List<RecoveryPointTierInformation> recoveryPointTierDetails;

    /*
     * Eligibility of RP to be moved to another tier
     */
    @JsonProperty(value = "recoveryPointMoveReadinessInfo")
    private Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo;

    /**
     * Get the recoveryPointTimeInUtc property: UTC time at which recovery point was created.
     *
     * @return the recoveryPointTimeInUtc value.
     */
    public OffsetDateTime recoveryPointTimeInUtc() {
        return this.recoveryPointTimeInUtc;
    }

    /**
     * Get the type property: Type of restore point.
     *
     * @return the type value.
     */
    public RestorePointType type() {
        return this.type;
    }

    /**
     * Get the recoveryPointTierDetails property: Recovery point tier information.
     *
     * @return the recoveryPointTierDetails value.
     */
    public List<RecoveryPointTierInformation> recoveryPointTierDetails() {
        return this.recoveryPointTierDetails;
    }

    /**
     * Set the recoveryPointTierDetails property: Recovery point tier information.
     *
     * @param recoveryPointTierDetails the recoveryPointTierDetails value to set.
     * @return the AzureWorkloadRecoveryPointAutoGenerated object itself.
     */
    public AzureWorkloadRecoveryPointAutoGenerated withRecoveryPointTierDetails(
        List<RecoveryPointTierInformation> recoveryPointTierDetails) {
        this.recoveryPointTierDetails = recoveryPointTierDetails;
        return this;
    }

    /**
     * Get the recoveryPointMoveReadinessInfo property: Eligibility of RP to be moved to another tier.
     *
     * @return the recoveryPointMoveReadinessInfo value.
     */
    public Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo() {
        return this.recoveryPointMoveReadinessInfo;
    }

    /**
     * Set the recoveryPointMoveReadinessInfo property: Eligibility of RP to be moved to another tier.
     *
     * @param recoveryPointMoveReadinessInfo the recoveryPointMoveReadinessInfo value to set.
     * @return the AzureWorkloadRecoveryPointAutoGenerated object itself.
     */
    public AzureWorkloadRecoveryPointAutoGenerated withRecoveryPointMoveReadinessInfo(
        Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo) {
        this.recoveryPointMoveReadinessInfo = recoveryPointMoveReadinessInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (recoveryPointTierDetails() != null) {
            recoveryPointTierDetails().forEach(e -> e.validate());
        }
        if (recoveryPointMoveReadinessInfo() != null) {
            recoveryPointMoveReadinessInfo()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
