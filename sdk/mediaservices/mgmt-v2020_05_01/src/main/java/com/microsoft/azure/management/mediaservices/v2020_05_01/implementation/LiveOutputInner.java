/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01.implementation;

import org.joda.time.Period;
import com.microsoft.azure.management.mediaservices.v2020_05_01.Hls;
import org.joda.time.DateTime;
import com.microsoft.azure.management.mediaservices.v2020_05_01.LiveOutputResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The Live Output.
 */
@JsonFlatten
public class LiveOutputInner extends ProxyResource {
    /**
     * The description of the live output.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The asset that the live output will write to.
     */
    @JsonProperty(value = "properties.assetName", required = true)
    private String assetName;

    /**
     * ISO 8601 time between 1 minute to 25 hours to indicate the maximum
     * content length that can be archived in the asset for this live output.
     * This also sets the maximum content length for the rewind window. For
     * example, use PT1H30M to indicate 1 hour and 30 minutes of archive
     * window.
     */
    @JsonProperty(value = "properties.archiveWindowLength", required = true)
    private Period archiveWindowLength;

    /**
     * The manifest file name. If not provided, the service will generate one
     * automatically.
     */
    @JsonProperty(value = "properties.manifestName")
    private String manifestName;

    /**
     * HTTP Live Streaming (HLS) packing setting for the live output.
     */
    @JsonProperty(value = "properties.hls")
    private Hls hls;

    /**
     * The initial timestamp that the live output will start at, any content
     * before this value will not be archived.
     */
    @JsonProperty(value = "properties.outputSnapTime")
    private Long outputSnapTime;

    /**
     * The creation time the live output.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * The time the live output was last modified.
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModified;

    /**
     * The provisioning state of the live output.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The resource state of the live output. Possible values include:
     * 'Creating', 'Running', 'Deleting'.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private LiveOutputResourceState resourceState;

    /**
     * Get the description of the live output.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the live output.
     *
     * @param description the description value to set
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the asset that the live output will write to.
     *
     * @return the assetName value
     */
    public String assetName() {
        return this.assetName;
    }

    /**
     * Set the asset that the live output will write to.
     *
     * @param assetName the assetName value to set
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * Get iSO 8601 time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     *
     * @return the archiveWindowLength value
     */
    public Period archiveWindowLength() {
        return this.archiveWindowLength;
    }

    /**
     * Set iSO 8601 time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     *
     * @param archiveWindowLength the archiveWindowLength value to set
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withArchiveWindowLength(Period archiveWindowLength) {
        this.archiveWindowLength = archiveWindowLength;
        return this;
    }

    /**
     * Get the manifest file name. If not provided, the service will generate one automatically.
     *
     * @return the manifestName value
     */
    public String manifestName() {
        return this.manifestName;
    }

    /**
     * Set the manifest file name. If not provided, the service will generate one automatically.
     *
     * @param manifestName the manifestName value to set
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }

    /**
     * Get hTTP Live Streaming (HLS) packing setting for the live output.
     *
     * @return the hls value
     */
    public Hls hls() {
        return this.hls;
    }

    /**
     * Set hTTP Live Streaming (HLS) packing setting for the live output.
     *
     * @param hls the hls value to set
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withHls(Hls hls) {
        this.hls = hls;
        return this;
    }

    /**
     * Get the initial timestamp that the live output will start at, any content before this value will not be archived.
     *
     * @return the outputSnapTime value
     */
    public Long outputSnapTime() {
        return this.outputSnapTime;
    }

    /**
     * Set the initial timestamp that the live output will start at, any content before this value will not be archived.
     *
     * @param outputSnapTime the outputSnapTime value to set
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withOutputSnapTime(Long outputSnapTime) {
        this.outputSnapTime = outputSnapTime;
        return this;
    }

    /**
     * Get the creation time the live output.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get the time the live output was last modified.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the provisioning state of the live output.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resource state of the live output. Possible values include: 'Creating', 'Running', 'Deleting'.
     *
     * @return the resourceState value
     */
    public LiveOutputResourceState resourceState() {
        return this.resourceState;
    }

}
