// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs.models;

import com.azure.core.annotation.Fluent;
import java.util.Objects;

/**
 * A model class to hold partition ownership information.
 */
@Fluent
public class PartitionOwnership {

    private String fullyQualifiedNamespace;
    private String eventHubName;
    private String consumerGroup;
    private String partitionId;
    private String ownerId;
    private Long lastModifiedTime;
    private String eTag;

    /**
     * Creates a new instance.
     */
    public PartitionOwnership() {
    }

    /**
     * Returns the fully qualified namespace of the Event Hub.
     *
     * @return the fully qualified namespace of the Event Hub.
     */
    public String getFullyQualifiedNamespace() {
        return fullyQualifiedNamespace;
    }

    /**
     * Sets the fully qualified namespace of the Event Hub.
     *
     * @param fullyQualifiedNamespace the fully qualified namespace of the Event Hub.
     * @return The updated {@link PartitionOwnership} instance.
     */
    public PartitionOwnership setFullyQualifiedNamespace(final String fullyQualifiedNamespace) {
        this.fullyQualifiedNamespace = fullyQualifiedNamespace;
        return this;
    }

    /**
     * Gets the Event Hub name associated with this ownership record.
     *
     * @return The Event Hub name associated with this ownership record.
     */
    public String getEventHubName() {
        return eventHubName;
    }

    /**
     * Sets the Event Hub name associated with this ownership record.
     *
     * @param eventHubName The Event Hub name associated with this ownership record.
     * @return The updated {@link PartitionOwnership} instance.
     */
    public PartitionOwnership setEventHubName(String eventHubName) {
        this.eventHubName = Objects.requireNonNull(eventHubName, "eventHubName cannot be null.");
        return this;
    }

    /**
     * Gets the consumer group name associated with this ownership record.
     *
     * @return The consumer group name associated with this ownership record.
     */
    public String getConsumerGroup() {
        return consumerGroup;
    }

    /**
     * Sets the consumer group name associated with this ownership record.
     *
     * @param consumerGroup The consumer group name associated with this ownership record.
     * @return The updated {@link PartitionOwnership} instance.
     */
    public PartitionOwnership setConsumerGroup(String consumerGroup) {
        this.consumerGroup = Objects.requireNonNull(consumerGroup, "consumerGroup cannot be null.");
        return this;
    }

    /**
     * Gets the partition id associated with this ownership record.
     *
     * @return The partition id associated with this ownership record.
     */
    public String getPartitionId() {
        return partitionId;
    }

    /**
     * Sets the partition id associated with this ownership record.
     *
     * @param partitionId The partition id associated with this ownership record.
     * @return The updated {@link PartitionOwnership} instance.
     */
    public PartitionOwnership setPartitionId(String partitionId) {
        this.partitionId = Objects.requireNonNull(partitionId, "partitionId cannot be null.");
        return this;
    }

    /**
     * Sets the unique event processor identifier as the owner of the partition id in this ownership record.
     *
     * @return The unique event processor identifier as the owner of the partition id in this ownership record.
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Returns the unique event processor identifier that owns the partition id in this ownership record.
     *
     * @param ownerId The unique event processor identifier that owns the partition id in this ownership record.
     * @return The updated {@link PartitionOwnership} instance.
     */
    public PartitionOwnership setOwnerId(String ownerId) {
        this.ownerId = Objects.requireNonNull(ownerId, "ownerId cannot be null.");
        return this;
    }

    /**
     * Gets the last modified time of this ownership record as epoch millis.
     *
     * @return The last modified time of this ownership record as epoch millis.
     */
    public Long getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the last modified time of this ownership record as epoch millis.
     *
     * @param lastModifiedTime The last modified time of this ownership record as epoch millis.
     * @return The updated {@link PartitionOwnership} instance.
     */
    public PartitionOwnership setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Gets the ETag that was generated by the last known successful update to the partition ownership record. An ETag
     * is a unique identifier * that is generated when a data record is successfully created/updated. The ETag is used
     * to achieve optimistic concurrency in a distributed event processor setup. When multiple instances of event
     * processor try to update the same partition ownership record, ETag is used to verify that the last values read by
     * the instance requesting the update is still the latest ETag for this record. If the ETag in the store does not
     * match the ETag in the update request, then the update is expected to fail as there was an update since the last
     * time an event processor read this record.
     *
     * @return The eTag for this ownership record.
     */
    public String getETag() {
        return eTag;
    }

    /**
     * Sets the ETag with the last known successful update to partition ownership record. An ETag is a unique identifier
     * that is generated when a data record is successfully created/updated. This ETag is used to achieve optimistic
     * concurrency in a distributed event processor setup. When multiple instances of event processor try to update the
     * same partition ownership record, ETag is used to verify that the last values read by the instance requesting the
     * update is still the latest ETag for this record. If the ETag in the store does not match the ETag in the update
     * request, then the update is expected to fail as there was an update since the last time an event processor read
     * this record.
     *
     * @param eTag The eTag for this ownership record.
     * @return The updated {@link PartitionOwnership} instance.
     */
    public PartitionOwnership setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }
}
