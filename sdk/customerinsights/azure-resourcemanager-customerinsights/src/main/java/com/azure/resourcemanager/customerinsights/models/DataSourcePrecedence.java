// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The data source precedence is a way to know the precedence of each data source. */
@JsonFlatten
@Fluent
public class DataSourcePrecedence {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataSourcePrecedence.class);

    /*
     * the precedence value.
     */
    @JsonProperty(value = "precedence")
    private Integer precedence;

    /*
     * The data source name
     */
    @JsonProperty(value = "dataSource.name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The data source type.
     */
    @JsonProperty(value = "dataSource.dataSourceType", access = JsonProperty.Access.WRITE_ONLY)
    private DataSourceType dataSourceType;

    /*
     * The data source status.
     */
    @JsonProperty(value = "dataSource.status", access = JsonProperty.Access.WRITE_ONLY)
    private Status status;

    /*
     * The data source ID.
     */
    @JsonProperty(value = "dataSource.id", access = JsonProperty.Access.WRITE_ONLY)
    private Integer id;

    /*
     * The data source reference id.
     */
    @JsonProperty(value = "dataSource.dataSourceReferenceId", access = JsonProperty.Access.WRITE_ONLY)
    private String dataSourceReferenceId;

    /**
     * Get the precedence property: the precedence value.
     *
     * @return the precedence value.
     */
    public Integer precedence() {
        return this.precedence;
    }

    /**
     * Set the precedence property: the precedence value.
     *
     * @param precedence the precedence value to set.
     * @return the DataSourcePrecedence object itself.
     */
    public DataSourcePrecedence withPrecedence(Integer precedence) {
        this.precedence = precedence;
        return this;
    }

    /**
     * Get the name property: The data source name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the dataSourceType property: The data source type.
     *
     * @return the dataSourceType value.
     */
    public DataSourceType dataSourceType() {
        return this.dataSourceType;
    }

    /**
     * Get the status property: The data source status.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Get the id property: The data source ID.
     *
     * @return the id value.
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Get the dataSourceReferenceId property: The data source reference id.
     *
     * @return the dataSourceReferenceId value.
     */
    public String dataSourceReferenceId() {
        return this.dataSourceReferenceId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
