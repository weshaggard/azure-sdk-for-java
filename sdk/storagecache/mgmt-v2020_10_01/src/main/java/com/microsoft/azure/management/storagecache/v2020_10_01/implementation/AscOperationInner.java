/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020_10_01.implementation;

import com.microsoft.azure.management.storagecache.v2020_10_01.ErrorResponse;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The status of operation.
 */
@JsonFlatten
public class AscOperationInner {
    /**
     * The operation Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The start time of the operation.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /**
     * The end time of the operation.
     */
    @JsonProperty(value = "endTime")
    private String endTime;

    /**
     * The status of the operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The error detail of the operation if any.
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /**
     * Additional Operation Specific Properties.
     */
    @JsonProperty(value = "properties.output")
    private Map<String, Object> output;

    /**
     * Get the operation Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the operation Id.
     *
     * @param id the id value to set
     * @return the AscOperationInner object itself.
     */
    public AscOperationInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the operation name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the operation name.
     *
     * @param name the name value to set
     * @return the AscOperationInner object itself.
     */
    public AscOperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the start time of the operation.
     *
     * @return the startTime value
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the start time of the operation.
     *
     * @param startTime the startTime value to set
     * @return the AscOperationInner object itself.
     */
    public AscOperationInner withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the end time of the operation.
     *
     * @return the endTime value
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Set the end time of the operation.
     *
     * @param endTime the endTime value to set
     * @return the AscOperationInner object itself.
     */
    public AscOperationInner withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the status of the operation.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status of the operation.
     *
     * @param status the status value to set
     * @return the AscOperationInner object itself.
     */
    public AscOperationInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error detail of the operation if any.
     *
     * @return the error value
     */
    public ErrorResponse error() {
        return this.error;
    }

    /**
     * Set the error detail of the operation if any.
     *
     * @param error the error value to set
     * @return the AscOperationInner object itself.
     */
    public AscOperationInner withError(ErrorResponse error) {
        this.error = error;
        return this;
    }

    /**
     * Get additional Operation Specific Properties.
     *
     * @return the output value
     */
    public Map<String, Object> output() {
        return this.output;
    }

    /**
     * Set additional Operation Specific Properties.
     *
     * @param output the output value to set
     * @return the AscOperationInner object itself.
     */
    public AscOperationInner withOutput(Map<String, Object> output) {
        this.output = output;
        return this;
    }

}
