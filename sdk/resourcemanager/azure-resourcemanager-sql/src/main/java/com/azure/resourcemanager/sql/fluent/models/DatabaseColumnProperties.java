// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.ColumnDataType;
import com.azure.resourcemanager.sql.models.TableTemporalType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Database column properties. */
@Fluent
public final class DatabaseColumnProperties {
    /*
     * The column data type.
     */
    @JsonProperty(value = "columnType")
    private ColumnDataType columnType;

    /*
     * The table temporal type.
     */
    @JsonProperty(value = "temporalType")
    private TableTemporalType temporalType;

    /*
     * Whether or not the column belongs to a memory optimized table.
     */
    @JsonProperty(value = "memoryOptimized")
    private Boolean memoryOptimized;

    /*
     * Whether or not the column is computed.
     */
    @JsonProperty(value = "isComputed")
    private Boolean isComputed;

    /** Creates an instance of DatabaseColumnProperties class. */
    public DatabaseColumnProperties() {
    }

    /**
     * Get the columnType property: The column data type.
     *
     * @return the columnType value.
     */
    public ColumnDataType columnType() {
        return this.columnType;
    }

    /**
     * Set the columnType property: The column data type.
     *
     * @param columnType the columnType value to set.
     * @return the DatabaseColumnProperties object itself.
     */
    public DatabaseColumnProperties withColumnType(ColumnDataType columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * Get the temporalType property: The table temporal type.
     *
     * @return the temporalType value.
     */
    public TableTemporalType temporalType() {
        return this.temporalType;
    }

    /**
     * Set the temporalType property: The table temporal type.
     *
     * @param temporalType the temporalType value to set.
     * @return the DatabaseColumnProperties object itself.
     */
    public DatabaseColumnProperties withTemporalType(TableTemporalType temporalType) {
        this.temporalType = temporalType;
        return this;
    }

    /**
     * Get the memoryOptimized property: Whether or not the column belongs to a memory optimized table.
     *
     * @return the memoryOptimized value.
     */
    public Boolean memoryOptimized() {
        return this.memoryOptimized;
    }

    /**
     * Set the memoryOptimized property: Whether or not the column belongs to a memory optimized table.
     *
     * @param memoryOptimized the memoryOptimized value to set.
     * @return the DatabaseColumnProperties object itself.
     */
    public DatabaseColumnProperties withMemoryOptimized(Boolean memoryOptimized) {
        this.memoryOptimized = memoryOptimized;
        return this;
    }

    /**
     * Get the isComputed property: Whether or not the column is computed.
     *
     * @return the isComputed value.
     */
    public Boolean isComputed() {
        return this.isComputed;
    }

    /**
     * Set the isComputed property: Whether or not the column is computed.
     *
     * @param isComputed the isComputed value to set.
     * @return the DatabaseColumnProperties object itself.
     */
    public DatabaseColumnProperties withIsComputed(Boolean isComputed) {
        this.isComputed = isComputed;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
