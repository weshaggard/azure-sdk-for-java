// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.http;

import com.azure.cosmos.implementation.RequestTimeline;
import reactor.netty.http.client.HttpClientState;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

import static com.azure.cosmos.implementation.RequestTimeline.EventName.CONNECTION_ACQUIRED;
import static com.azure.cosmos.implementation.RequestTimeline.EventName.CONNECTION_CONFIGURED;
import static com.azure.cosmos.implementation.RequestTimeline.EventName.CONNECTION_CREATED;
import static com.azure.cosmos.implementation.RequestTimeline.EventName.RECEIVED;
import static com.azure.cosmos.implementation.RequestTimeline.EventName.REQUEST_SENT;
import static com.azure.cosmos.implementation.RequestTimeline.EventName.TRANSIT_TIME;

/**
 * Represents the timeline of various events in the lifetime of a reactor netty request response.
 * <p>
 * A {@link ReactorNettyRequestRecord} create a snapshot of {@link RequestTimeline} based on various {@link HttpClientState}.
 * Below are the states which are used to capture {@link RequestTimeline} snapshot.
 * <p><ul>
 * <li>{@link HttpClientState#CONNECTED},
 * <li>{@link HttpClientState#ACQUIRED},
 * <li>{@link HttpClientState#CONFIGURED},
 * <li>{@link HttpClientState#REQUEST_SENT},
 * <li>{@link HttpClientState#RESPONSE_RECEIVED},
 * </ul></p>
 */
public final class ReactorNettyRequestRecord {
    private static final AtomicLong instanceCount = new AtomicLong();

    private volatile Instant timeCreated;
    private volatile Instant timeConnected;
    private volatile Instant timeAcquired;
    private volatile Instant timeConfigured;
    private volatile Instant timeSent;
    private volatile Instant timeReceived;
    private volatile Instant timeCompleted;
    private final long transportRequestId;

    public ReactorNettyRequestRecord() {
        this.transportRequestId = instanceCount.incrementAndGet();
    }

    /**
     * Gets request created instant.
     * @return
     */
    public Instant timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get connection established instant.
     * @return timeConnected
     */
    public Instant timeConnected() {
        return this.timeConnected;
    }

    /**
     * Gets connection acquired  instant.
     * @return timeAcquired
     */
    public Instant timeAcquired() {
        return timeAcquired;
    }

    /**
     * Get connection configured instant.
     * @return timeConfigured
     */
    public Instant timeConfigured() {
        return this.timeConfigured;
    }

    /**
     * Gets request sent instant.
     * @return timeSent
     */
    public Instant timeSent() {
        return this.timeSent;
    }

    /**
     * Gets response received instant.
     * @return timeReceived
     */
    public Instant timeReceived() {
        return this.timeReceived;
    }

    /**
     * Gets request completed  instant.
     * @return timeCompleted
     */
    public Instant timeCompleted() {
        return this.timeCompleted;
    }

    /**
     * Sets request created instant.
     * @param timeCreated
     */
    public void setTimeCreated(Instant timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * Sets connection established instant.
     * @param timeConnected
     */
    public void setTimeConnected(Instant timeConnected) {
        this.timeConnected = timeConnected;
    }

    /**
     * Sets connection acquired instant.
     * @param timeAcquired
     */
    public void setTimeAcquired(Instant timeAcquired) {
        this.timeAcquired = timeAcquired;
    }

    /**
     * Sets connection configured instant.
     * @param timeConfigured
     */
    public void setTimeConfigured(Instant timeConfigured) {
        this.timeConfigured = timeConfigured;
    }

    /**
     * Sets request sent instant.
     * @param timeSent
     */
    public void setTimeSent(Instant timeSent) {
        this.timeSent = timeSent;
    }

    /**
     * Sets response received instant.
     * @param timeReceived
     */
    public void setTimeReceived(Instant timeReceived) {
        this.timeReceived = timeReceived;
    }

    /**
     * Sets request completed instant.
     * @param timeCompleted
     */
    public void setTimeCompleted(Instant timeCompleted) {
        this.timeCompleted = timeCompleted;
    }

    /**
     * Creates the RequestTimeline snapshot.
     * @return requestTimeline
     */
    public RequestTimeline takeTimelineSnapshot() {

        Instant now = Instant.now();

        Instant timeCreated = this.timeCreated();
        Instant timeAcquired = this.timeAcquired();
        Instant timeConnected = this.timeConnected();
        Instant timeConfigured = this.timeConfigured();
        Instant timeSent = this.timeSent();
        Instant timeReceived = this.timeReceived();
        Instant timeCompleted = this.timeCompleted();
        Instant timeCompletedOrNow = timeCompleted == null ? now : timeCompleted;

        if (timeConnected != null) {
            return RequestTimeline.of(
                new RequestTimeline.Event(CONNECTION_CREATED,
                    timeCreated, timeConnected),
                new RequestTimeline.Event(CONNECTION_CONFIGURED,
                    timeConnected, timeConfigured == null ? timeCompletedOrNow : timeConfigured),
                new RequestTimeline.Event(REQUEST_SENT,
                    timeConfigured, timeSent == null ? timeCompletedOrNow : timeSent),
                new RequestTimeline.Event(TRANSIT_TIME,
                    timeSent, timeReceived == null ? timeCompletedOrNow : timeReceived),
                new RequestTimeline.Event(RECEIVED,
                    timeReceived, timeCompletedOrNow));
        } else {
            return RequestTimeline.of(
                new RequestTimeline.Event(CONNECTION_ACQUIRED,
                    timeCreated, timeAcquired == null ? timeCompletedOrNow : timeAcquired),
                new RequestTimeline.Event(CONNECTION_CONFIGURED,
                    timeAcquired, timeConfigured == null ? timeCompletedOrNow : timeConfigured),
                new RequestTimeline.Event(REQUEST_SENT,
                    timeConfigured, timeSent == null ? timeCompletedOrNow : timeSent),
                new RequestTimeline.Event(TRANSIT_TIME,
                    timeSent, timeReceived == null ? timeCompletedOrNow : timeReceived),
                new RequestTimeline.Event(RECEIVED,
                    timeReceived, timeCompletedOrNow));
        }
    }

    public long getTransportRequestId() {
        return transportRequestId;
    }
}
