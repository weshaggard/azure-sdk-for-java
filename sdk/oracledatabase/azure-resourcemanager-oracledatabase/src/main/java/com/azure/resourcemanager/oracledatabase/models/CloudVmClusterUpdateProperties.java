// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The updatable properties of the CloudVmCluster.
 */
@Fluent
public final class CloudVmClusterUpdateProperties {
    /*
     * The data disk group size to be allocated in GBs per VM.
     */
    @JsonProperty(value = "storageSizeInGbs")
    private Integer storageSizeInGbs;

    /*
     * The data disk group size to be allocated in TBs.
     */
    @JsonProperty(value = "dataStorageSizeInTbs")
    private Double dataStorageSizeInTbs;

    /*
     * The local node storage to be allocated in GBs.
     */
    @JsonProperty(value = "dbNodeStorageSizeInGbs")
    private Integer dbNodeStorageSizeInGbs;

    /*
     * The memory to be allocated in GBs.
     */
    @JsonProperty(value = "memorySizeInGbs")
    private Integer memorySizeInGbs;

    /*
     * The number of CPU cores enabled on the cloud VM cluster.
     */
    @JsonProperty(value = "cpuCoreCount")
    private Integer cpuCoreCount;

    /*
     * The number of OCPU cores to enable on the cloud VM cluster. Only 1 decimal place is allowed for the fractional part.
     */
    @JsonProperty(value = "ocpuCount")
    private Float ocpuCount;

    /*
     * The public key portion of one or more key pairs used for SSH access to the cloud VM cluster.
     */
    @JsonProperty(value = "sshPublicKeys")
    private List<String> sshPublicKeys;

    /*
     * The Oracle license model that applies to the cloud VM cluster. The default is LICENSE_INCLUDED. 
     */
    @JsonProperty(value = "licenseModel")
    private LicenseModel licenseModel;

    /*
     * Indicates user preferences for the various diagnostic collection options for the VM cluster/Cloud VM cluster/VMBM DBCS.
     */
    @JsonProperty(value = "dataCollectionOptions")
    private DataCollectionOptions dataCollectionOptions;

    /*
     * Display Name
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The list of compute servers to be added to the cloud VM cluster.
     */
    @JsonProperty(value = "computeNodes")
    private List<String> computeNodes;

    /**
     * Creates an instance of CloudVmClusterUpdateProperties class.
     */
    public CloudVmClusterUpdateProperties() {
    }

    /**
     * Get the storageSizeInGbs property: The data disk group size to be allocated in GBs per VM.
     * 
     * @return the storageSizeInGbs value.
     */
    public Integer storageSizeInGbs() {
        return this.storageSizeInGbs;
    }

    /**
     * Set the storageSizeInGbs property: The data disk group size to be allocated in GBs per VM.
     * 
     * @param storageSizeInGbs the storageSizeInGbs value to set.
     * @return the CloudVmClusterUpdateProperties object itself.
     */
    public CloudVmClusterUpdateProperties withStorageSizeInGbs(Integer storageSizeInGbs) {
        this.storageSizeInGbs = storageSizeInGbs;
        return this;
    }

    /**
     * Get the dataStorageSizeInTbs property: The data disk group size to be allocated in TBs.
     * 
     * @return the dataStorageSizeInTbs value.
     */
    public Double dataStorageSizeInTbs() {
        return this.dataStorageSizeInTbs;
    }

    /**
     * Set the dataStorageSizeInTbs property: The data disk group size to be allocated in TBs.
     * 
     * @param dataStorageSizeInTbs the dataStorageSizeInTbs value to set.
     * @return the CloudVmClusterUpdateProperties object itself.
     */
    public CloudVmClusterUpdateProperties withDataStorageSizeInTbs(Double dataStorageSizeInTbs) {
        this.dataStorageSizeInTbs = dataStorageSizeInTbs;
        return this;
    }

    /**
     * Get the dbNodeStorageSizeInGbs property: The local node storage to be allocated in GBs.
     * 
     * @return the dbNodeStorageSizeInGbs value.
     */
    public Integer dbNodeStorageSizeInGbs() {
        return this.dbNodeStorageSizeInGbs;
    }

    /**
     * Set the dbNodeStorageSizeInGbs property: The local node storage to be allocated in GBs.
     * 
     * @param dbNodeStorageSizeInGbs the dbNodeStorageSizeInGbs value to set.
     * @return the CloudVmClusterUpdateProperties object itself.
     */
    public CloudVmClusterUpdateProperties withDbNodeStorageSizeInGbs(Integer dbNodeStorageSizeInGbs) {
        this.dbNodeStorageSizeInGbs = dbNodeStorageSizeInGbs;
        return this;
    }

    /**
     * Get the memorySizeInGbs property: The memory to be allocated in GBs.
     * 
     * @return the memorySizeInGbs value.
     */
    public Integer memorySizeInGbs() {
        return this.memorySizeInGbs;
    }

    /**
     * Set the memorySizeInGbs property: The memory to be allocated in GBs.
     * 
     * @param memorySizeInGbs the memorySizeInGbs value to set.
     * @return the CloudVmClusterUpdateProperties object itself.
     */
    public CloudVmClusterUpdateProperties withMemorySizeInGbs(Integer memorySizeInGbs) {
        this.memorySizeInGbs = memorySizeInGbs;
        return this;
    }

    /**
     * Get the cpuCoreCount property: The number of CPU cores enabled on the cloud VM cluster.
     * 
     * @return the cpuCoreCount value.
     */
    public Integer cpuCoreCount() {
        return this.cpuCoreCount;
    }

    /**
     * Set the cpuCoreCount property: The number of CPU cores enabled on the cloud VM cluster.
     * 
     * @param cpuCoreCount the cpuCoreCount value to set.
     * @return the CloudVmClusterUpdateProperties object itself.
     */
    public CloudVmClusterUpdateProperties withCpuCoreCount(Integer cpuCoreCount) {
        this.cpuCoreCount = cpuCoreCount;
        return this;
    }

    /**
     * Get the ocpuCount property: The number of OCPU cores to enable on the cloud VM cluster. Only 1 decimal place is
     * allowed for the fractional part.
     * 
     * @return the ocpuCount value.
     */
    public Float ocpuCount() {
        return this.ocpuCount;
    }

    /**
     * Set the ocpuCount property: The number of OCPU cores to enable on the cloud VM cluster. Only 1 decimal place is
     * allowed for the fractional part.
     * 
     * @param ocpuCount the ocpuCount value to set.
     * @return the CloudVmClusterUpdateProperties object itself.
     */
    public CloudVmClusterUpdateProperties withOcpuCount(Float ocpuCount) {
        this.ocpuCount = ocpuCount;
        return this;
    }

    /**
     * Get the sshPublicKeys property: The public key portion of one or more key pairs used for SSH access to the cloud
     * VM cluster.
     * 
     * @return the sshPublicKeys value.
     */
    public List<String> sshPublicKeys() {
        return this.sshPublicKeys;
    }

    /**
     * Set the sshPublicKeys property: The public key portion of one or more key pairs used for SSH access to the cloud
     * VM cluster.
     * 
     * @param sshPublicKeys the sshPublicKeys value to set.
     * @return the CloudVmClusterUpdateProperties object itself.
     */
    public CloudVmClusterUpdateProperties withSshPublicKeys(List<String> sshPublicKeys) {
        this.sshPublicKeys = sshPublicKeys;
        return this;
    }

    /**
     * Get the licenseModel property: The Oracle license model that applies to the cloud VM cluster. The default is
     * LICENSE_INCLUDED.
     * 
     * @return the licenseModel value.
     */
    public LicenseModel licenseModel() {
        return this.licenseModel;
    }

    /**
     * Set the licenseModel property: The Oracle license model that applies to the cloud VM cluster. The default is
     * LICENSE_INCLUDED.
     * 
     * @param licenseModel the licenseModel value to set.
     * @return the CloudVmClusterUpdateProperties object itself.
     */
    public CloudVmClusterUpdateProperties withLicenseModel(LicenseModel licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * Get the dataCollectionOptions property: Indicates user preferences for the various diagnostic collection options
     * for the VM cluster/Cloud VM cluster/VMBM DBCS.
     * 
     * @return the dataCollectionOptions value.
     */
    public DataCollectionOptions dataCollectionOptions() {
        return this.dataCollectionOptions;
    }

    /**
     * Set the dataCollectionOptions property: Indicates user preferences for the various diagnostic collection options
     * for the VM cluster/Cloud VM cluster/VMBM DBCS.
     * 
     * @param dataCollectionOptions the dataCollectionOptions value to set.
     * @return the CloudVmClusterUpdateProperties object itself.
     */
    public CloudVmClusterUpdateProperties withDataCollectionOptions(DataCollectionOptions dataCollectionOptions) {
        this.dataCollectionOptions = dataCollectionOptions;
        return this;
    }

    /**
     * Get the displayName property: Display Name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display Name.
     * 
     * @param displayName the displayName value to set.
     * @return the CloudVmClusterUpdateProperties object itself.
     */
    public CloudVmClusterUpdateProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the computeNodes property: The list of compute servers to be added to the cloud VM cluster.
     * 
     * @return the computeNodes value.
     */
    public List<String> computeNodes() {
        return this.computeNodes;
    }

    /**
     * Set the computeNodes property: The list of compute servers to be added to the cloud VM cluster.
     * 
     * @param computeNodes the computeNodes value to set.
     * @return the CloudVmClusterUpdateProperties object itself.
     */
    public CloudVmClusterUpdateProperties withComputeNodes(List<String> computeNodes) {
        this.computeNodes = computeNodes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataCollectionOptions() != null) {
            dataCollectionOptions().validate();
        }
    }
}
