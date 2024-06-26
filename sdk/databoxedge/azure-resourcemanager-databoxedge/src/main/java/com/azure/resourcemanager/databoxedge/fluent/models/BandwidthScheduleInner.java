// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.models.DayOfWeek;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The bandwidth schedule details. */
@Fluent
public final class BandwidthScheduleInner extends ArmBaseModel {
    /*
     * The properties of the bandwidth schedule.
     */
    @JsonProperty(value = "properties", required = true)
    private BandwidthScheduleProperties innerProperties = new BandwidthScheduleProperties();

    /** Creates an instance of BandwidthScheduleInner class. */
    public BandwidthScheduleInner() {
    }

    /**
     * Get the innerProperties property: The properties of the bandwidth schedule.
     *
     * @return the innerProperties value.
     */
    private BandwidthScheduleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the start property: The start time of the schedule in UTC.
     *
     * @return the start value.
     */
    public String start() {
        return this.innerProperties() == null ? null : this.innerProperties().start();
    }

    /**
     * Set the start property: The start time of the schedule in UTC.
     *
     * @param start the start value to set.
     * @return the BandwidthScheduleInner object itself.
     */
    public BandwidthScheduleInner withStart(String start) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BandwidthScheduleProperties();
        }
        this.innerProperties().withStart(start);
        return this;
    }

    /**
     * Get the stop property: The stop time of the schedule in UTC.
     *
     * @return the stop value.
     */
    public String stop() {
        return this.innerProperties() == null ? null : this.innerProperties().stop();
    }

    /**
     * Set the stop property: The stop time of the schedule in UTC.
     *
     * @param stop the stop value to set.
     * @return the BandwidthScheduleInner object itself.
     */
    public BandwidthScheduleInner withStop(String stop) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BandwidthScheduleProperties();
        }
        this.innerProperties().withStop(stop);
        return this;
    }

    /**
     * Get the rateInMbps property: The bandwidth rate in Mbps.
     *
     * @return the rateInMbps value.
     */
    public int rateInMbps() {
        return this.innerProperties() == null ? 0 : this.innerProperties().rateInMbps();
    }

    /**
     * Set the rateInMbps property: The bandwidth rate in Mbps.
     *
     * @param rateInMbps the rateInMbps value to set.
     * @return the BandwidthScheduleInner object itself.
     */
    public BandwidthScheduleInner withRateInMbps(int rateInMbps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BandwidthScheduleProperties();
        }
        this.innerProperties().withRateInMbps(rateInMbps);
        return this;
    }

    /**
     * Get the days property: The days of the week when this schedule is applicable.
     *
     * @return the days value.
     */
    public List<DayOfWeek> days() {
        return this.innerProperties() == null ? null : this.innerProperties().days();
    }

    /**
     * Set the days property: The days of the week when this schedule is applicable.
     *
     * @param days the days value to set.
     * @return the BandwidthScheduleInner object itself.
     */
    public BandwidthScheduleInner withDays(List<DayOfWeek> days) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BandwidthScheduleProperties();
        }
        this.innerProperties().withDays(days);
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
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model BandwidthScheduleInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BandwidthScheduleInner.class);
}
