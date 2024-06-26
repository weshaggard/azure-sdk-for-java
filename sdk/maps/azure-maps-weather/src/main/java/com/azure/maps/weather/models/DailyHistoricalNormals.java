// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The DailyHistoricalNormals model. */
@Fluent
public final class DailyHistoricalNormals {
    /*
     * Date and time of the current observation displayed in ISO 8601 format, for example, 2019-10-27T19:39:57-08:00.
     */
    @JsonProperty(value = "date")
    private OffsetDateTime timestamp;

    /*
     * Temperature values.
     */
    @JsonProperty(value = "temperature")
    private WeatherValueMaxMinAvg temperature;

    /*
     * Summary of heating or cooling degree day information
     */
    @JsonProperty(value = "degreeDaySummary")
    private DegreeDaySummary degreeDaySummary;

    /*
     * The amount of precipitation (liquid equivalent) that has fallen.
     */
    @JsonProperty(value = "precipitation")
    private WeatherUnitDetails precipitation;

    /** Set default DailyHistoricalNormals constructor to private */
    private DailyHistoricalNormals() {}

    /**
     * Get the timestamp property: Date and time of the current observation displayed in ISO 8601 format, for example,
     * 2019-10-27T19:39:57-08:00.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the temperature property: Temperature values.
     *
     * @return the temperature value.
     */
    public WeatherValueMaxMinAvg getTemperature() {
        return this.temperature;
    }

    /**
     * Get the degreeDaySummary property: Summary of heating or cooling degree day information.
     *
     * @return the degreeDaySummary value.
     */
    public DegreeDaySummary getDegreeDaySummary() {
        return this.degreeDaySummary;
    }

    /**
     * Get the precipitation property: The amount of precipitation (liquid equivalent) that has fallen.
     *
     * @return the precipitation value.
     */
    public WeatherUnitDetails getPrecipitation() {
        return this.precipitation;
    }
}
