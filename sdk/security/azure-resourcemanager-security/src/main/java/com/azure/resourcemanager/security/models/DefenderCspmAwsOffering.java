// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The CSPM P1 for AWS offering.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "offeringType",
    defaultImpl = DefenderCspmAwsOffering.class,
    visible = true)
@JsonTypeName("DefenderCspmAws")
@Fluent
public final class DefenderCspmAwsOffering extends CloudOffering {
    /*
     * The type of the security offering.
     */
    @JsonTypeId
    @JsonProperty(value = "offeringType", required = true)
    private OfferingType offeringType = OfferingType.DEFENDER_CSPM_AWS;

    /*
     * The Microsoft Defender for CSPM offering VM scanning configuration
     */
    @JsonProperty(value = "vmScanners")
    private DefenderCspmAwsOfferingVmScanners vmScanners;

    /*
     * The Microsoft Defender Data Sensitivity discovery configuration
     */
    @JsonProperty(value = "dataSensitivityDiscovery")
    private DefenderCspmAwsOfferingDataSensitivityDiscovery dataSensitivityDiscovery;

    /*
     * The databases DSPM configuration
     */
    @JsonProperty(value = "databasesDspm")
    private DefenderCspmAwsOfferingDatabasesDspm databasesDspm;

    /*
     * Defenders CSPM Permissions Management offering configurations
     */
    @JsonProperty(value = "ciem")
    private DefenderCspmAwsOfferingCiem ciem;

    /*
     * The Microsoft Defender container image assessment configuration
     */
    @JsonProperty(value = "mdcContainersImageAssessment")
    private DefenderCspmAwsOfferingMdcContainersImageAssessment mdcContainersImageAssessment;

    /*
     * The Microsoft Defender container agentless discovery K8s configuration
     */
    @JsonProperty(value = "mdcContainersAgentlessDiscoveryK8s")
    private DefenderCspmAwsOfferingMdcContainersAgentlessDiscoveryK8S mdcContainersAgentlessDiscoveryK8S;

    /**
     * Creates an instance of DefenderCspmAwsOffering class.
     */
    public DefenderCspmAwsOffering() {
    }

    /**
     * Get the offeringType property: The type of the security offering.
     * 
     * @return the offeringType value.
     */
    @Override
    public OfferingType offeringType() {
        return this.offeringType;
    }

    /**
     * Get the vmScanners property: The Microsoft Defender for CSPM offering VM scanning configuration.
     * 
     * @return the vmScanners value.
     */
    public DefenderCspmAwsOfferingVmScanners vmScanners() {
        return this.vmScanners;
    }

    /**
     * Set the vmScanners property: The Microsoft Defender for CSPM offering VM scanning configuration.
     * 
     * @param vmScanners the vmScanners value to set.
     * @return the DefenderCspmAwsOffering object itself.
     */
    public DefenderCspmAwsOffering withVmScanners(DefenderCspmAwsOfferingVmScanners vmScanners) {
        this.vmScanners = vmScanners;
        return this;
    }

    /**
     * Get the dataSensitivityDiscovery property: The Microsoft Defender Data Sensitivity discovery configuration.
     * 
     * @return the dataSensitivityDiscovery value.
     */
    public DefenderCspmAwsOfferingDataSensitivityDiscovery dataSensitivityDiscovery() {
        return this.dataSensitivityDiscovery;
    }

    /**
     * Set the dataSensitivityDiscovery property: The Microsoft Defender Data Sensitivity discovery configuration.
     * 
     * @param dataSensitivityDiscovery the dataSensitivityDiscovery value to set.
     * @return the DefenderCspmAwsOffering object itself.
     */
    public DefenderCspmAwsOffering
        withDataSensitivityDiscovery(DefenderCspmAwsOfferingDataSensitivityDiscovery dataSensitivityDiscovery) {
        this.dataSensitivityDiscovery = dataSensitivityDiscovery;
        return this;
    }

    /**
     * Get the databasesDspm property: The databases DSPM configuration.
     * 
     * @return the databasesDspm value.
     */
    public DefenderCspmAwsOfferingDatabasesDspm databasesDspm() {
        return this.databasesDspm;
    }

    /**
     * Set the databasesDspm property: The databases DSPM configuration.
     * 
     * @param databasesDspm the databasesDspm value to set.
     * @return the DefenderCspmAwsOffering object itself.
     */
    public DefenderCspmAwsOffering withDatabasesDspm(DefenderCspmAwsOfferingDatabasesDspm databasesDspm) {
        this.databasesDspm = databasesDspm;
        return this;
    }

    /**
     * Get the ciem property: Defenders CSPM Permissions Management offering configurations.
     * 
     * @return the ciem value.
     */
    public DefenderCspmAwsOfferingCiem ciem() {
        return this.ciem;
    }

    /**
     * Set the ciem property: Defenders CSPM Permissions Management offering configurations.
     * 
     * @param ciem the ciem value to set.
     * @return the DefenderCspmAwsOffering object itself.
     */
    public DefenderCspmAwsOffering withCiem(DefenderCspmAwsOfferingCiem ciem) {
        this.ciem = ciem;
        return this;
    }

    /**
     * Get the mdcContainersImageAssessment property: The Microsoft Defender container image assessment configuration.
     * 
     * @return the mdcContainersImageAssessment value.
     */
    public DefenderCspmAwsOfferingMdcContainersImageAssessment mdcContainersImageAssessment() {
        return this.mdcContainersImageAssessment;
    }

    /**
     * Set the mdcContainersImageAssessment property: The Microsoft Defender container image assessment configuration.
     * 
     * @param mdcContainersImageAssessment the mdcContainersImageAssessment value to set.
     * @return the DefenderCspmAwsOffering object itself.
     */
    public DefenderCspmAwsOffering withMdcContainersImageAssessment(
        DefenderCspmAwsOfferingMdcContainersImageAssessment mdcContainersImageAssessment) {
        this.mdcContainersImageAssessment = mdcContainersImageAssessment;
        return this;
    }

    /**
     * Get the mdcContainersAgentlessDiscoveryK8S property: The Microsoft Defender container agentless discovery K8s
     * configuration.
     * 
     * @return the mdcContainersAgentlessDiscoveryK8S value.
     */
    public DefenderCspmAwsOfferingMdcContainersAgentlessDiscoveryK8S mdcContainersAgentlessDiscoveryK8S() {
        return this.mdcContainersAgentlessDiscoveryK8S;
    }

    /**
     * Set the mdcContainersAgentlessDiscoveryK8S property: The Microsoft Defender container agentless discovery K8s
     * configuration.
     * 
     * @param mdcContainersAgentlessDiscoveryK8S the mdcContainersAgentlessDiscoveryK8S value to set.
     * @return the DefenderCspmAwsOffering object itself.
     */
    public DefenderCspmAwsOffering withMdcContainersAgentlessDiscoveryK8S(
        DefenderCspmAwsOfferingMdcContainersAgentlessDiscoveryK8S mdcContainersAgentlessDiscoveryK8S) {
        this.mdcContainersAgentlessDiscoveryK8S = mdcContainersAgentlessDiscoveryK8S;
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
        if (vmScanners() != null) {
            vmScanners().validate();
        }
        if (dataSensitivityDiscovery() != null) {
            dataSensitivityDiscovery().validate();
        }
        if (databasesDspm() != null) {
            databasesDspm().validate();
        }
        if (ciem() != null) {
            ciem().validate();
        }
        if (mdcContainersImageAssessment() != null) {
            mdcContainersImageAssessment().validate();
        }
        if (mdcContainersAgentlessDiscoveryK8S() != null) {
            mdcContainersAgentlessDiscoveryK8S().validate();
        }
    }
}
