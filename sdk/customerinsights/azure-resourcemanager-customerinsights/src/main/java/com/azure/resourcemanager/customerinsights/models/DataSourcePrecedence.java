// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.customerinsights.fluent.models.DataSource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The data source precedence is a way to know the precedence of each data source. */
@Fluent
public final class DataSourcePrecedence {
    /*
     * Data Source is a way for us to know the source of instances. A single type can have data coming in from multiple
     * places. In activities we use this to determine precedence rules.
     */
    @JsonProperty(value = "dataSource")
    private DataSource innerDataSource;

    /*
     * the precedence value.
     */
    @JsonProperty(value = "precedence")
    private Integer precedence;

    /** Creates an instance of DataSourcePrecedence class. */
    public DataSourcePrecedence() {
    }

    /**
     * Get the innerDataSource property: Data Source is a way for us to know the source of instances. A single type can
     * have data coming in from multiple places. In activities we use this to determine precedence rules.
     *
     * @return the innerDataSource value.
     */
    private DataSource innerDataSource() {
        return this.innerDataSource;
    }

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
        return this.innerDataSource() == null ? null : this.innerDataSource().name();
    }

    /**
     * Get the dataSourceType property: The data source type.
     *
     * @return the dataSourceType value.
     */
    public DataSourceType dataSourceType() {
        return this.innerDataSource() == null ? null : this.innerDataSource().dataSourceType();
    }

    /**
     * Get the status property: The data source status.
     *
     * @return the status value.
     */
    public Status status() {
        return this.innerDataSource() == null ? null : this.innerDataSource().status();
    }

    /**
     * Get the id property: The data source ID.
     *
     * @return the id value.
     */
    public Integer id() {
        return this.innerDataSource() == null ? null : this.innerDataSource().id();
    }

    /**
     * Get the dataSourceReferenceId property: The data source reference id.
     *
     * @return the dataSourceReferenceId value.
     */
    public String dataSourceReferenceId() {
        return this.innerDataSource() == null ? null : this.innerDataSource().dataSourceReferenceId();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerDataSource() != null) {
            innerDataSource().validate();
        }
    }
}
